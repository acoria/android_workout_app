package com.example.sixminutesofhell.Activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sixminutesofhell.FRM.IWorkout;
import com.example.sixminutesofhell.R;
import com.example.sixminutesofhell.RuntimeObjectStorage;
import com.example.sixminutesofhell.Workouts.WorkoutFactory;

public class Act_InitialScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_screen);


        Button btnMinOfHellWorkout = (Button)findViewById(R.id.button_minOfHellWorkout);
        Button btnSnowboardWorkout = (Button)findViewById(R.id.button_snowboardWorkout);
        Button btnSnowboardStretches = (Button)findViewById(R.id.button_snowboardStretches);
        btnMinOfHellWorkout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onWorkoutPick(WorkoutFactory.minOfHellWorkout);
            }
        });
        btnSnowboardWorkout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onWorkoutPick(WorkoutFactory.snowboardWorkout);
            }
        });
        btnSnowboardStretches.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onWorkoutPick(WorkoutFactory.snowboardStretches);
            }
        });

    }
    private void onWorkoutPick(char workoutType){
        IWorkout workout = WorkoutFactory.createWorkout(workoutType);
        RuntimeObjectStorage.setWorkout(workout);
        showConfigureExercise();
    }
    private void showConfigureExercise(){
        startActivity(new Intent(this, Act_ConfigureExercises.class));
    }
}
