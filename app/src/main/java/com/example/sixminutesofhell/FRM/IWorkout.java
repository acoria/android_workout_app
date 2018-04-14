package com.example.sixminutesofhell.FRM;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;

/**
 * Created by vtewes on 07.01.2018.
 */

public interface IWorkout {

    IUnitConfig getUnitConfig();
    IUnitProvider getUnitProvider();
    int getTotalWorkoutLength();
    int getLengthByType(IUnitConfig.UnitLengthType unitLengthType);
}
