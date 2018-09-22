package com.example.sixminutesofhell.Workouts.TimsWorkouts;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitProvider;
import com.example.sixminutesofhell.FRM.Units.Exercise;

public class TimsUnitProviderXTrainer extends UnitProvider {
    @Override
    protected void initialize() {
        addUnitToStack(new Exercise("Get ready!", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
        addUnitToStack(new Exercise("Crosstrainer as fast as you want"));
    }
}
