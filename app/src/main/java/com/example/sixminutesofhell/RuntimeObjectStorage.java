package com.example.sixminutesofhell;

import com.example.sixminutesofhell.FRM.IWorkout;

/**
 * Created by vtewes on 07.01.2018.
 */

public class RuntimeObjectStorage {
    private static IWorkout workout;

    public static IWorkout getWorkout() {
        return workout;
    }
    public static void setWorkout(IWorkout workout) {
        RuntimeObjectStorage.workout = workout;
    }
}
