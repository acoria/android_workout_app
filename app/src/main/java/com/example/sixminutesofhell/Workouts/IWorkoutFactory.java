package com.example.sixminutesofhell.Workouts;

import com.example.sixminutesofhell.FRM.Workout;

public interface IWorkoutFactory {
    Workout createWorkoutByType(char type);
}
