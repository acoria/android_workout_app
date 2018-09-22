package com.example.sixminutesofhell.Workouts;

import com.example.sixminutesofhell.FRM.Workout;
import com.example.sixminutesofhell.R;
import com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsUnitConfigXTrainer10min;
import com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsUnitConfigXTrainer15min;
import com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsUnitConfigXTrainer20min;
import com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsWorkoutCore;
import com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsWorkoutStretch;
import com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsWorkoutXTrainer;

import static com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsWorkoutCore.core;
import static com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsWorkoutStretch.stretch;
import static com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsWorkoutXTrainer.xtrainerWorkout10min;
import static com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsWorkoutXTrainer.xtrainerWorkout15min;
import static com.example.sixminutesofhell.Workouts.TimsWorkouts.TimsWorkoutXTrainer.xtrainerWorkout20min;

/**
 * Created by vtewes on 07.01.2018.
 */

public class TimsWorkoutFactory implements IWorkoutFactory{

    TimsWorkoutXTrainer xtrainerWorkout;

    @Override
    public Workout createWorkoutByType(char type){
        Workout workout = null;

        switch(type){
            case core:
                workout = new TimsWorkoutCore();
                break;
            case stretch:
                workout = new TimsWorkoutStretch();
                break;
            case xtrainerWorkout10min:
                xtrainerWorkout = new TimsWorkoutXTrainer(xtrainerWorkout10min);
                xtrainerWorkout.setName(R.string.workout10min);
                xtrainerWorkout.setUnitConfig(new TimsUnitConfigXTrainer10min());
                workout = xtrainerWorkout;
                break;
            case xtrainerWorkout15min:
                xtrainerWorkout = new TimsWorkoutXTrainer(xtrainerWorkout15min);
                xtrainerWorkout.setName(R.string.workout15min);
                xtrainerWorkout.setUnitConfig(new TimsUnitConfigXTrainer15min());
                workout = xtrainerWorkout;
                break;
            case xtrainerWorkout20min:
                xtrainerWorkout = new TimsWorkoutXTrainer(xtrainerWorkout20min);
                xtrainerWorkout.setName(R.string.workout20min);
                xtrainerWorkout.setUnitConfig(new TimsUnitConfigXTrainer20min());
                workout = xtrainerWorkout;
                break;
        }
        return workout;
    }
}
