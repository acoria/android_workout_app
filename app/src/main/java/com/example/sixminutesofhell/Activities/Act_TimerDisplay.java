package com.example.sixminutesofhell.Activities;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.sixminutesofhell.Timer.ITimerObserver;
import com.example.sixminutesofhell.FRM.Units.ITrainingUnit;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.IWorkout;
import com.example.sixminutesofhell.FRM.Units.MainUnit;
import com.example.sixminutesofhell.R;
import com.example.sixminutesofhell.RuntimeObjectStorage;
import com.example.sixminutesofhell.Timer.SoundPlayer;
import com.example.sixminutesofhell.Timer.TrainingTimer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Verena on 08.05.2016.
 */
public class Act_TimerDisplay extends AppCompatActivity implements ITimerObserver, IActivityScreen {

    static final String TAG = "Act_TimerDisplay";
    static final String UNIT_ID = "UnitId";
    static final String REMAINING_TIME = "RemainingTime";
    static final String ACTIVITY_STATE = "ActivityStateForRestore";
    static final String TIMER_STATE = "TimerStateForRestore";

    static final CharSequence STATE_INITIAL = "INITIAL";
    static final CharSequence STATE_RUNNING = "RUNNING";
    static final CharSequence STATE_COMPLETED = "COMPLETED";

    SoundPlayer soundPlayer;
    IUnitProvider unitProvider;
    TrainingTimer timer;
    ITrainingUnit currentTrainingUnit;
    boolean initialCallOfUnit;
    int remainingTime, lastId;
    private RelativeLayout infoDialogLayout;
    private AlertDialog infoDialog;

    @BindView(R.id.exercise_display) TextView exerciseDisplay;
    @BindView(R.id.next_exercise_display) TextView nextExerciseDisplay;
    @BindView(R.id.time_remaining) TextView timerDisplay;

    @BindView(R.id.timer_layout) ConstraintLayout layout;

    @BindView(R.id.button_start_timer) Button btnStartTimer;
    @BindView(R.id.button_unit_skip) Button btnUnitSkip;
    @BindView(R.id.button_unit_back) Button btnUnitBack;
    @BindView(R.id.fab_repeat) FloatingActionButton fabRepeat;
    @BindView(R.id.image_info) ImageView imageInfo;
    @BindView(R.id.exercise_image) ImageView exerciseImage;


    //state of the activity
    CharSequence activityStateForRestore = STATE_INITIAL;
    CharSequence timerState;

    @OnClick(R.id.button_start_timer) void onStartTimer() {
        timerState = timer.getState();
        if (timerState == TrainingTimer.STATE_RUNNING) {
            timer.pauseTimer();
        } else if (timerState == TrainingTimer.STATE_PAUSED) {
            soundPlayer.setVolumeForTimerActivity();
            timer.resumeTimer();
        } else if (timerState == TrainingTimer.STATE_INITIAL || timerState == TrainingTimer.STATE_STOPPED) {
            soundPlayer.setVolumeForTimerActivity();
            timer.startTimer();
        } else {
            Log.e(TAG, "onResume: unexpected timer stated");
        }
    }
    @OnClick(R.id.button_unit_skip) void onButtonSkipUnit(){
        skipUnit();
    }
    @OnClick(R.id.button_unit_back) void onButtonBack(){
        backOneUnit();
    }
    @OnClick(R.id.fab_repeat) void onFabRepeat(){
        //restarts the current activity
        Intent intent = new Intent(this, Act_TimerDisplay.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public Act_TimerDisplay(){
        MainUnit.setTestMode(false);
        IWorkout workout = RuntimeObjectStorage.getWorkout();
        //this.setTitle("");
        this.unitProvider = workout.getUnitProvider();
        this.timer = new TrainingTimer(1000); //once every second
        this.timer.registerObserver(this);
        this.currentTrainingUnit = unitProvider.getFirst();
    }


    /***************************** Timer *****************************/
    public void  onNextImpulse(){
        activityStateForRestore = STATE_RUNNING;

        if(initialCallOfUnit){
            initialCallOfUnit = false;
            initializeFromNewUnit();

            remainingTime -= 1000;
        }else if(remainingTime >= 1000){

            setTimerDisplay(remainingTime);

            //do not play first 2 beeps (for 2, 1 second remaining) when "exercise" == change
            if(currentTrainingUnit.getLength() > 3000 && (remainingTime == 2000 || remainingTime == 1000)){
                soundPlayer.playSound(SoundPlayer.S1);
            }
            remainingTime -= 1000;

        }else if(remainingTime < 1000){
            soundPlayer.playSound(SoundPlayer.S2);
            setTimerDisplay(0);

            //get next exercise
            if(currentTrainingUnit.hasSuccessor()){
                //while there is another unit
                currentTrainingUnit = unitProvider.getSuccessor(currentTrainingUnit);
                initialCallOfUnit = true;
            }else{
                //timer finished
                activityStateForRestore = STATE_COMPLETED;
                timer.stopTimer();
                soundPlayer.resetVolume();
            }

        }
    }
    public void onTimerStopped(){
        if(activityStateForRestore == STATE_COMPLETED){
            setActivityDisplayToCompleted();
        }
    }
    public void onTimerPaused(){
        setActivityDisplayToPaused();
    }
    public void onTimerResumed(){
        setActivityDisplayToStarted();
    }
    public void onTimerStarted(){
        activityStateForRestore = STATE_RUNNING; // Button pressed -> change activity state to be saved for restoring bundle
        initialCallOfUnit = true;

        setActivityDisplayToStarted();
        turnScreenIntoButton();
    }

    private void turnScreenIntoButton() {
        //makes the entire screen Act_SnowboardStretches button
        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                timer.pauseTimer();
                return false;
            }
        });
    }

    private void backOneUnit(){
        timer.stopTimer();
        if(currentTrainingUnit.hasPredecessor()){
            currentTrainingUnit = unitProvider.getPredecessor(currentTrainingUnit);
            initializeFromNewUnit();
            setActivityDisplayToPaused();
        }else{
            Log.e(TAG, "btn back: predecessor unexpectedly empty");
        }

    }
    private void skipUnit(){
        timer.stopTimer();
        if(currentTrainingUnit.hasSuccessor()){
            //while there is another exercise
            currentTrainingUnit = unitProvider.getSuccessor(currentTrainingUnit);
            initializeFromNewUnit();
            setActivityDisplayToPaused();
        }else{
            setActivityDisplayToCompleted();
        }
    }
    private void initializeFromNewUnit() {
        remainingTime = currentTrainingUnit.getLength();
        setUnitDisplaysFromCurrentUnit();

        btnStartTimer.setVisibility(View.VISIBLE); //show button

        //check if back/skip button should be hidden
        if (!currentTrainingUnit.hasPredecessor()) {
            btnUnitBack.setVisibility(View.INVISIBLE);
        } else {
            btnUnitBack.setVisibility(View.VISIBLE);
        }
        if (!currentTrainingUnit.hasSuccessor()) {
            btnUnitSkip.setVisibility(View.INVISIBLE);
            nextExerciseDisplay.setVisibility(View.INVISIBLE);
        } else {
            btnUnitSkip.setVisibility(View.VISIBLE);
            nextExerciseDisplay.setVisibility(View.VISIBLE);
        }
        if (activityStateForRestore == STATE_COMPLETED) {
            fabRepeat.show();
        } else {
            fabRepeat.hide();
        }
        if (currentTrainingUnit.getInfoImage() == 0) {
            imageInfo.setVisibility(View.INVISIBLE);
            exerciseImage.setOnClickListener(null);
        } else {
            imageInfo.setVisibility(View.VISIBLE);

            if (infoDialog == null) {
                infoDialogLayout = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.layout_image_info, null);
                infoDialog = new AlertDialog.Builder(this)
                        .setView(infoDialogLayout)
                        .create();
            }
            exerciseImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    infoDialog.show();
                }
            });

            ImageView image = infoDialogLayout.findViewById(R.id.image_info);
            image.setImageDrawable(ContextCompat.getDrawable(getActivity(), currentTrainingUnit.getInfoImage()));
        }
    }

    private void setActivityDisplayToInitial(){
        btnStartTimer.setVisibility(View.VISIBLE); //show button
        fabRepeat.hide();
        btnStartTimer.setText("Start");
    }
    private void setActivityDisplayToCompleted(){
        btnStartTimer.setVisibility(View.INVISIBLE); //hide button
        fabRepeat.show();
        setTextfield("Done", exerciseDisplay);
        timerDisplay.setText("0:00");
    }
    private void setActivityDisplayToPaused(){
        btnStartTimer.setVisibility(View.VISIBLE); //show button
        btnStartTimer.setText("Resume");
    }
    private void setActivityDisplayToStarted(){
        btnStartTimer.setVisibility(View.VISIBLE); //show button
        btnStartTimer.setText("Pause");
    }

    private void setTextfield(String text, TextView textfield){
        textfield.setText(text);
    }
    private void setUnitDisplaysFromCurrentUnit(){

        //set unit
        setTextfield(currentTrainingUnit.getTitle(), exerciseDisplay);

        //set preview
        if(currentTrainingUnit.hasSuccessor()){
            ITrainingUnit trainingUnit = unitProvider.getSuccessor(currentTrainingUnit);
            setTextfield(trainingUnit.getTitle(), nextExerciseDisplay);
        }
        //set time
        if(remainingTime < 1000){
            //to avoid showing -1sec when screen was turned at 0:00
            timerDisplay.setText("0:00");
        }else{
            setTimerDisplay(remainingTime);
        }
    }
    private void setTimerDisplay(int remainingTime){

        int seconds = (int) (remainingTime / 1000);
        int minutes = seconds / 60;
        seconds     = seconds % 60;

         timerDisplay.setText(String.format("%d:%02d", minutes, seconds));

    }
    private void setVolumeControls(){
        setVolumeControlStream(AudioManager.STREAM_NOTIFICATION);
        AudioManager am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        soundPlayer = SoundPlayer.getInstance(this,am);
    }

    /************************ Activity states *************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_display);
        ButterKnife.bind(this);

		/*set button to resume when recreated
		if (savedInstanceState != null) {...}*/
        setVolumeControls();
        initializeFromNewUnit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.timer_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch(item.getItemId()){
           case R.id.action_navigate_home:
               returnToHomeScreen();
               break;
               default: Log.e(TAG, "Menu item not handled");
       }
       return true;
    }

    private void returnToHomeScreen() {
        final Intent intent = new Intent(this, Act_InitialScreen.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    //called before onStop()
    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        soundPlayer.resetVolume();
        outState.putInt(UNIT_ID, currentTrainingUnit.getId());
        outState.putInt(REMAINING_TIME, remainingTime);
        outState.putCharSequence(ACTIVITY_STATE, activityStateForRestore);
        timerState = timer.getState();
        outState.putCharSequence(TIMER_STATE, timerState);
        if(timerState == TrainingTimer.STATE_RUNNING){ //if timer was started
            timer.pauseTimer();
        }

    }

    //called before onStart()
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        setVolumeControls();
        // Restore state members from saved instance
        lastId = inState.getInt(UNIT_ID);
        remainingTime = inState.getInt(REMAINING_TIME);
        activityStateForRestore = inState.getCharSequence(ACTIVITY_STATE);
        timerState = inState.getCharSequence(TIMER_STATE);


        if(timerState == TrainingTimer.STATE_RUNNING){  //timer was running

            //set iterator to stored key
            currentTrainingUnit = unitProvider.getUnitById(lastId);

            setActivityDisplayToPaused();
            setUnitDisplaysFromCurrentUnit();

        }else if(activityStateForRestore == STATE_COMPLETED){ //activity was finished
            setActivityDisplayToCompleted();

        }else if(activityStateForRestore == STATE_INITIAL){ //timer was not started
            setActivityDisplayToInitial();
        }else{
            Log.e(TAG,"restore:unexpected state");
        }
    }
    protected void onPause() {
        super.onPause();
        soundPlayer.resetVolume();
        if(activityStateForRestore == TrainingTimer.STATE_RUNNING){ //if timer was started
            timer.pauseTimer();
        }

    }
    @Override
    //called when the device is turned, see also manifest -> android:configChanges="orientation"
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        //if e.g. images are used, which have to be turned, this has to be done manually here
        //since the configuration "orientation" is now handled manually
    }
    @Override
    protected void onResume() {
        super.onResume();
        setVolumeControls();
    }

    @Override
    public AppCompatActivity getActivity(){
        return this;
    }

}
