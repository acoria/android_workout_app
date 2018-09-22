package com.example.sixminutesofhell.Workouts.TimsWorkouts;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitProvider;
import com.example.sixminutesofhell.FRM.Units.Break;
import com.example.sixminutesofhell.FRM.Units.Exercise;

public class TimsUnitProviderStretch extends UnitProvider {
    @Override
    protected void initialize() {
        addUnitToStack(new Exercise("Get ready!", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
        addUnitToStack(new Exercise("Stretch!", IUnitConfig.UnitLengthType.UNIT_LENGTH_MIDDLE));
        addUnitToStack(new Exercise("Stretch!", IUnitConfig.UnitLengthType.UNIT_LENGTH_MIDDLE));
    }
}
