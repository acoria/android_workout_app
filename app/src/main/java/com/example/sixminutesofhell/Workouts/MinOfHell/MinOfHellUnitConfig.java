package com.example.sixminutesofhell.Workouts.MinOfHell;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitConfig;

/**
 * Created by vtewes on 09.01.2018.
 */

public class MinOfHellUnitConfig extends UnitConfig {

    MinOfHellUnitConfig(){
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT, 15);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_MIDDLE, 30);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG, 40);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_SWAP_SIDE, 2);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK, 15);
        addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP, 3);
    }
}
