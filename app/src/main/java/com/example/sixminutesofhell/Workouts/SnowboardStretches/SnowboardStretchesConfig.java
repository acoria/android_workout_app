package com.example.sixminutesofhell.Workouts.SnowboardStretches;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitConfig;

/**
 * Created by vtewes on 07.01.2018.
 */

public class SnowboardStretchesConfig extends UnitConfig {

    SnowboardStretchesConfig(){
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT, 10);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_MIDDLE, 30);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG, 60);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_SWAP_SIDE, 2);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK, 2);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP, 3);
    }
}
