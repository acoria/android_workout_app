package com.example.sixminutesofhell.Workouts.TimsWorkouts;

import com.example.sixminutesofhell.FRM.IWorkout;
import com.example.sixminutesofhell.FRM.IWorkoutProvider;
import com.example.sixminutesofhell.Workouts.IWorkoutFactory;

import java.util.ArrayList;
import java.util.List;

public class TimsWorkoutProvider implements IWorkoutProvider {

    List<IWorkout> workouts;


    public TimsWorkoutProvider(IWorkoutFactory factory){
        workouts = new ArrayList<>();
        workouts.add(factory.createWorkoutByType(TimsWorkoutXTrainer.xtrainerWorkout10min));
        workouts.add(factory.createWorkoutByType(TimsWorkoutXTrainer.xtrainerWorkout15min));
        workouts.add(factory.createWorkoutByType(TimsWorkoutXTrainer.xtrainerWorkout20min));
        workouts.add(factory.createWorkoutByType(TimsWorkoutCore.core));
        workouts.add(factory.createWorkoutByType(TimsWorkoutStretch.stretch));
    }

    @Override
    public List<IWorkout> getWorkouts() {
        return workouts;
    }
}
