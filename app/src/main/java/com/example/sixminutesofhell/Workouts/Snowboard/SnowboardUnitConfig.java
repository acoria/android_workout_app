package com.example.sixminutesofhell.Workouts.Snowboard;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitConfig;

/**
 * Created by vtewes on 07.01.2018.
 */

public class SnowboardUnitConfig extends UnitConfig {

    SnowboardUnitConfig(){
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_MIDDLE, 60);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK, 20);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP, 3);
    }
}
