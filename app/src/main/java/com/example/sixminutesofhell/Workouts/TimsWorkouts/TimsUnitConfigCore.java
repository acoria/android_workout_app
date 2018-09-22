package com.example.sixminutesofhell.Workouts.TimsWorkouts;

import com.example.sixminutesofhell.FRM.UnitConfig;

public class TimsUnitConfigCore extends UnitConfig {

    public TimsUnitConfigCore(){
        addUnitLength(UnitLengthType.UNIT_LENGTH_MIDDLE, 30);
        addUnitLength(UnitLengthType.UNIT_LENGTH_BREAK, 30);
        addUnitLength(UnitLengthType.UNIT_LENGTH_PREP, 3);
    }
}
