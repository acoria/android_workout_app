package com.example.sixminutesofhell.Workouts.SnowboardStretches;

import com.example.sixminutesofhell.FRM.Units.Break;
import com.example.sixminutesofhell.FRM.Units.Exercise;
import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitProvider;

/**
 * Created by vtewes on 07.01.2018.
 */

public class SnowboardStretchesUnitProvider extends UnitProvider {

    @Override
    protected void initialize() {

        final String textSwapSides = "Swap Sides";

        addUnitToStack(new Exercise("Get ready!", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
        addUnitToStack(new Exercise("Quad Stretch left"));
        addUnitToStack(new Break(textSwapSides));
        addUnitToStack(new Exercise("Quad Stretch right"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Hamstring Stretch left"));
        addUnitToStack(new Break(textSwapSides));
        addUnitToStack(new Exercise("Hamstring Stretch right"));
        addUnitToStack(new Break(textSwapSides));
        addUnitToStack(new Exercise("Groin Stretch"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Gluteus Stretch left"));
        addUnitToStack(new Break(textSwapSides));
        addUnitToStack(new Exercise("Gluteus Stretch right"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Shoulder Stretch left"));
        addUnitToStack(new Break(textSwapSides));
        addUnitToStack(new Exercise("Shoulder Stretch right"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Overhead Shoulder Stretch left"));
        addUnitToStack(new Break(textSwapSides));
        addUnitToStack(new Exercise("Overhead Shoulder Stretch right"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Cat Stretch", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG));
        addUnitToStack(new Exercise("Clock Face Stretch", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG));
        addUnitToStack(new Exercise("Piriformis Stretch", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG));
        addUnitToStack(new Exercise("Hip Flexor Stretch", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT));

    }
}
