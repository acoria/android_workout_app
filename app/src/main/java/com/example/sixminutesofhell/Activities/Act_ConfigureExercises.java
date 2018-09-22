package com.example.sixminutesofhell.Activities;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.IWorkout;
import com.example.sixminutesofhell.FRM.Units.Exercise;
import com.example.sixminutesofhell.FRM.Units.ITrainingUnit;
import com.example.sixminutesofhell.R;
import com.example.sixminutesofhell.RuntimeObjectStorage;

public class Act_ConfigureExercises extends AppCompatActivity implements IActivityScreen {

	static final String TAG = "Act_ConfigureExercises";

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_configure_exercises);
		//pressing the volume keys on the device will affect the audio stream
		setVolumeControlStream(AudioManager.STREAM_NOTIFICATION);

		//makes the entire screen Act_SnowboardStretches button
		LinearLayout layout = (LinearLayout) findViewById(R.id.exercise_layout);
		layout.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				showTimer();
				return false;
			}
		});

		addExerciseList();
	}

	//set the list of exercises
	public void addExerciseList(){
		int textColour = getResources().getColor(R.color.black);
		LinearLayout linearLayout = findViewById(R.id.exercise_list);
		IWorkout workout = RuntimeObjectStorage.getWorkout();
		IUnitProvider unitProvider = workout.getUnitProvider();
		ITrainingUnit trainingUnit = unitProvider.getFirst();
		do{
			trainingUnit = unitProvider.getSuccessor(trainingUnit);
			if(trainingUnit != null){
				try {
					Exercise exercise = (Exercise) trainingUnit;
					TextView textView = new TextView(this);
					textView.setTextColor(textColour);
					textView.setText(trainingUnit.getTitle());
					textView.setPaddingRelative(0,0,0,10);
					linearLayout.addView(textView);
				}catch (ClassCastException exc){
					//only show Exercises and skip Breaks etc.
				}
			}
		}while(trainingUnit != null);
		int length = workout.getTotalWorkoutLength();
		double calcLengthInMinutes = (length/1000)/60 +0.5;
		length = (int) calcLengthInMinutes;

		TextView textView = new TextView(this);
		textView.setTextSize(15);
		textView.setTextColor(getResources().getColor(R.color.gray));
		textView.setText(getResources().getString(R.string.totalLength)+ " " + length + " " + getResources().getString(R.string.minutes));
		textView.setPaddingRelative(0,20,0,0);
		linearLayout.addView(textView);
	}


	//is called when the button is clicked
	//public void startTimer(View view) {
	public void showTimer() {
		Intent startExercise = new Intent(this, Act_TimerDisplay.class);
		startActivity(startExercise);
	}

	@Override
	public AppCompatActivity getActivity(){
		return this;
	}
}