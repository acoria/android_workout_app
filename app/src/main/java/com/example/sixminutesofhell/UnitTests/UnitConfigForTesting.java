package com.example.sixminutesofhell.UnitTests;

import com.example.sixminutesofhell.FRM.UnitConfig;

/**
 * Created by vtewes on 21.01.2018.
 */

class UnitConfigForTesting extends UnitConfig {

    static final int LENGTH_BREAK = 10;
    static final int LENGTH_SWAP_SIDE = 20;
    static final int LENGTH_PREP = 30;
    static final int LENGTH_MIDDLE = 50;
    static final int LENGTH_LONG = 60;
    static final int LENGTH_SHORT = 40;

    UnitConfigForTesting(){
        addUnitLength(UnitLengthType.UNIT_LENGTH_BREAK, LENGTH_BREAK);
        addUnitLength(UnitLengthType.UNIT_LENGTH_SWAP_SIDE, LENGTH_SWAP_SIDE);
        addUnitLength(UnitLengthType.UNIT_LENGTH_PREP, LENGTH_PREP);
        addUnitLength(UnitLengthType.UNIT_LENGTH_SHORT, LENGTH_SHORT);
        addUnitLength(UnitLengthType.UNIT_LENGTH_MIDDLE, LENGTH_MIDDLE);
        addUnitLength(UnitLengthType.UNIT_LENGTH_LONG, LENGTH_LONG);

    }
}
