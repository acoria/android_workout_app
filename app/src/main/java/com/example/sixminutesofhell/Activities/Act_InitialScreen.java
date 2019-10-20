package com.example.sixminutesofhell.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.sixminutesofhell.FRM.IWorkout;
import com.example.sixminutesofhell.FRM.IWorkoutIterator;
import com.example.sixminutesofhell.FRM.IWorkoutProvider;
import com.example.sixminutesofhell.FRM.WorkoutIterator;
import com.example.sixminutesofhell.R;
import com.example.sixminutesofhell.RuntimeObjectStorage;
import com.example.sixminutesofhell.Workouts.IWorkoutFactory;
import com.example.sixminutesofhell.Workouts.TimsWorkoutFactory;
import com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsWorkoutProvider;
import com.example.sixminutesofhell.Workouts.WorkoutFactory;
import com.example.sixminutesofhell.Workouts.WorkoutProvider;
import com.example.sixminutesofhell.YoutubeConfig;

public class Act_InitialScreen extends AppCompatActivity {

    private boolean myWorkout = true;
//    private boolean myWorkout = false

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_screen);
        addWorkoutButtons((LinearLayout) findViewById(R.id.lay_workout_buttons));
        setupYouTubeButtons();
    }

    private void setupYouTubeButtons() {
        findViewById(R.id.button_youtube).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYouTubeApp();
            }
        });
        findViewById(R.id.button_youtube_workout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openYouTubeWorkoutMusic();
            }
        });
    }

    private void openYouTubeWorkoutMusic() {
        Intent openWorkoutMusicIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(YoutubeConfig.URL_YOUTUBE_WORKOUT_MUSIC));
        startActivity(openWorkoutMusicIntent);
    }

    private void openYouTubeApp() {
        Intent openYouTubeAppIntent = getPackageManager().getLaunchIntentForPackage(YoutubeConfig.PACKAGE_NAME_YOUTUBE_MUSIC);
        if(openYouTubeAppIntent != null){
            startActivity(openYouTubeAppIntent);
        }else{
            Toast.makeText(this, "Error when trying to open YouTube-Music app", Toast.LENGTH_SHORT).show();
        }
    }

    private void addWorkoutButtons(LinearLayout layout) {
        IWorkoutFactory workoutFactory;
        IWorkoutProvider workoutProvider;
        int index = 0;

        if(myWorkout) {
            workoutFactory = new WorkoutFactory();
            workoutProvider = new WorkoutProvider(workoutFactory);
        }else {
            workoutFactory = new TimsWorkoutFactory();
            workoutProvider = new TimsWorkoutProvider(workoutFactory);
        }
        IWorkoutIterator workoutIterator = new WorkoutIterator(workoutProvider);

        while(workoutIterator.hasNext()){
            final IWorkout workout = workoutIterator.getNext();
            MaterialButton button = new MaterialButton(this);
            button.setText(workout.getName());
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    onWorkoutPick(workout);
                }
            });
            layout.addView(button, index++);
        }
    }

    private void onWorkoutPick(IWorkout workout){
        RuntimeObjectStorage.setWorkout(workout);
        showConfigureExercise();
    }
    private void showConfigureExercise(){
        startActivity(new Intent(this, Act_ConfigureExercises.class));
    }
}
