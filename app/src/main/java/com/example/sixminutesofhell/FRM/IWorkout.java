package com.example.sixminutesofhell.FRM;

/**
 * Created by vtewes on 07.01.2018.
 */

public interface IWorkout {

    IUnitConfig getUnitConfig();
    IUnitProvider getUnitProvider();
    Character getId();
    int getName();
    int getTotalWorkoutLength();
    int getLengthByType(IUnitConfig.UnitLengthType unitLengthType);
}
