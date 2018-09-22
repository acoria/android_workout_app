package com.example.sixminutesofhell.FRM;

import java.util.List;

public class WorkoutIterator implements IWorkoutIterator{

    List<IWorkout> workouts;


    public WorkoutIterator(IWorkoutProvider workoutProvider){
        workouts = workoutProvider.getWorkouts();
    }

    @Override
    public IWorkout getNext() {
        IWorkout workout = workouts.get(0);
        workouts.remove(0);
        return workout;
    }

    @Override
    public boolean hasNext() {
        return workouts.size() > 0;
    }
}
