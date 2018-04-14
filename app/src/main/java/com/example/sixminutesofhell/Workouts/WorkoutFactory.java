package com.example.sixminutesofhell.Workouts;

import com.example.sixminutesofhell.FRM.Workout;
import com.example.sixminutesofhell.Workouts.MinOfHell.MinOfHellWorkout;
import com.example.sixminutesofhell.Workouts.MinOfHellCustomWorkout.MinOfHellCustomWorkout;
import com.example.sixminutesofhell.Workouts.Snowboard.SnowboardWorkout;
import com.example.sixminutesofhell.Workouts.SnowboardStretches.SnowboardStretchesWorkout;

/**
 * Created by vtewes on 07.01.2018.
 */

public class WorkoutFactory implements IWorkoutFactory{

    public final static char minOfHellWorkout = '1';
    public final static char snowboardWorkout = '2';
    public final static char snowboardStretches = '3';
    public final static char minOfHellCustomWorkout = '4';

    @Override
    public Workout createWorkoutByType(char type){
        Workout workout = null;

        switch(type){
            case minOfHellWorkout:
                workout = new MinOfHellWorkout();
                break;
            case minOfHellCustomWorkout:
                workout = new MinOfHellCustomWorkout();
                break;
            case snowboardWorkout:
                workout = new SnowboardWorkout();
                break;
            case snowboardStretches:
                workout = new SnowboardStretchesWorkout();
                break;
        }
        return workout;
    }
}
