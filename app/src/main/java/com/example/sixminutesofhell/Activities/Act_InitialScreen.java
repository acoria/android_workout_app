package com.example.sixminutesofhell.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

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

public class Act_InitialScreen extends AppCompatActivity {

    private boolean myWorkout = true;
//    private boolean myWorkout = false

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_screen);
        addWorkoutButtons((LinearLayout) findViewById(R.id.lay_workout_buttons));
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
