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

import static com.example.sixminutesofhell.Workouts.MinOfHell.MinOfHellWorkout.minOfHellWorkout;
import static com.example.sixminutesofhell.Workouts.MinOfHellCustomWorkout.MinOfHellCustomWorkout.minOfHellCustomWorkout;
import static com.example.sixminutesofhell.Workouts.Snowboard.SnowboardWorkout.snowboardWorkout;
import static com.example.sixminutesofhell.Workouts.SnowboardStretches.SnowboardStretchesWorkout.snowboardStretches;

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
        workout = workoutFactory.createWorkoutByType(minOfHellWorkout);

        try {
            MinOfHellWorkout minOfHellWorkout = (MinOfHellWorkout) workout;
        }catch (ClassCastException e){
            setPointOfTestFailure("getMinOfHellWorkout");
            return false;
        }

        workout = workoutFactory.createWorkoutByType(minOfHellCustomWorkout);
        try {
            MinOfHellCustomWorkout minOfHellCustomWorkout = (MinOfHellCustomWorkout) workout;
        }catch (ClassCastException e){
            setPointOfTestFailure("getMinOfHellCustomWorkout");
            return false;
        }
        workout = workoutFactory.createWorkoutByType(snowboardWorkout);
        try {
            SnowboardWorkout snowboardWorkout = (SnowboardWorkout) workout;
        }catch (ClassCastException e){
            setPointOfTestFailure("SnowboardWorkout");
            return false;
        }
        workout = workoutFactory.createWorkoutByType(snowboardStretches);
        try {
            SnowboardStretchesWorkout snowboardStretchesWorkout = (SnowboardStretchesWorkout) workout;
        }catch (ClassCastException e){
            setPointOfTestFailure("SnowboardStretchesWorkout");
            return false;
        }


        return true;
    }

}
