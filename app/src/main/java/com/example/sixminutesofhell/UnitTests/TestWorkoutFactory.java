package com.example.sixminutesofhell.UnitTests;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IWorkout;
import com.example.sixminutesofhell.FRM.Units.Exercise;
import com.example.sixminutesofhell.Workouts.IWorkoutFactory;
import com.example.sixminutesofhell.Workouts.MinOfHell.MinOfHellWorkout;
import com.example.sixminutesofhell.Workouts.MinOfHellCustomWorkout.MinOfHellCustomWorkout;
import com.example.sixminutesofhell.Workouts.Snowboard.SnowboardWorkout;
import com.example.sixminutesofhell.Workouts.SnowboardStretches.SnowboardStretchesConfig;
import com.example.sixminutesofhell.Workouts.SnowboardStretches.SnowboardStretchesWorkout;
import com.example.sixminutesofhell.Workouts.WorkoutFactory;

/**
 * Created by vtewes on 07.05.2016.
 */
class TestWorkoutFactory extends Test{

    @Override
    public String getTestname(){
        return "WorkoutFactory";
    }

    @Override
    public boolean test() {

        IWorkout workout;

        IWorkoutFactory workoutFactory = new WorkoutFactory();
        workout = workoutFactory.createWorkoutByType(WorkoutFactory.minOfHellWorkout);

        try {
            MinOfHellWorkout minOfHellWorkout = (MinOfHellWorkout) workout;
        }catch (ClassCastException e){
            setPointOfTestFailure("getMinOfHellWorkout");
            return false;
        }

        workout = workoutFactory.createWorkoutByType(WorkoutFactory.minOfHellCustomWorkout);
        try {
            MinOfHellCustomWorkout minOfHellCustomWorkout = (MinOfHellCustomWorkout) workout;
        }catch (ClassCastException e){
            setPointOfTestFailure("getMinOfHellCustomWorkout");
            return false;
        }
        workout = workoutFactory.createWorkoutByType(WorkoutFactory.snowboardWorkout);
        try {
            SnowboardWorkout snowboardWorkout = (SnowboardWorkout) workout;
        }catch (ClassCastException e){
            setPointOfTestFailure("SnowboardWorkout");
            return false;
        }
        workout = workoutFactory.createWorkoutByType(WorkoutFactory.snowboardStretches);
        try {
            SnowboardStretchesWorkout snowboardStretchesWorkout = (SnowboardStretchesWorkout) workout;
        }catch (ClassCastException e){
            setPointOfTestFailure("SnowboardStretchesWorkout");
            return false;
        }


        return true;
    }

}
