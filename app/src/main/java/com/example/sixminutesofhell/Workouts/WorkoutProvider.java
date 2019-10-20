package com.example.sixminutesofhell.Workouts;

import com.example.sixminutesofhell.FRM.IWorkout;
import com.example.sixminutesofhell.FRM.IWorkoutProvider;

import java.util.ArrayList;
import java.util.List;

import static com.example.sixminutesofhell.Workouts.MinOfHell.MinOfHellWorkout.minOfHellWorkout;
import static com.example.sixminutesofhell.Workouts.MinOfHellCustomWorkout.MinOfHellCustomWorkout.minOfHellCustomWorkout;
import static com.example.sixminutesofhell.Workouts.Snowboard.SnowboardWorkout.snowboardWorkout;
import static com.example.sixminutesofhell.Workouts.SnowboardStretches.SnowboardStretchesWorkout.snowboardStretches;

public class WorkoutProvider implements IWorkoutProvider {

    List<IWorkout> workouts;

    public WorkoutProvider(IWorkoutFactory factory){
        workouts = new ArrayList<>();
        workouts.add(factory.createWorkoutByType(minOfHellWorkout));
        workouts.add(factory.createWorkoutByType(minOfHellCustomWorkout));
        workouts.add(factory.createWorkoutByType(snowboardWorkout));
        workouts.add(factory.createWorkoutByType(snowboardStretches));
    }

    @Override
    public List<IWorkout> getWorkouts() {
        return workouts;
    }
}
