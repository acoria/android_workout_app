package com.example.sixminutesofhell.Workouts.TimsWorkouts;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitProvider;
import com.example.sixminutesofhell.FRM.Units.Exercise;

public class TimsUnitProviderCore extends UnitProvider {
    @Override
    protected void initialize() {
        addUnitToStack(new Exercise("Get ready!", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
        addUnitToStack(new Exercise("Wall sit", IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK));
        addUnitToStack(new Exercise("Break", IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK));
        addUnitToStack(new Exercise("Plank", IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK));
        addUnitToStack(new Exercise("Break", IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK));
        addUnitToStack(new Exercise("Sit ups", IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK));
    }
}
