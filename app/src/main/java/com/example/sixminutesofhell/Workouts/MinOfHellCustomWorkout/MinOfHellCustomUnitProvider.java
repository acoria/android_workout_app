package com.example.sixminutesofhell.Workouts.MinOfHellCustomWorkout;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitProvider;
import com.example.sixminutesofhell.FRM.Units.Break;
import com.example.sixminutesofhell.FRM.Units.Exercise;
import com.example.sixminutesofhell.FRM.Units.SpecialUnit;

/**
 * Created by vtewes on 07.01.2018.
 */

public class MinOfHellCustomUnitProvider extends UnitProvider {

    @Override
    protected void initialize() {

        addUnitToStack(new Exercise("Get ready!", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
        addUnitToStack(new Exercise("Jumping Jacks"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Wall sit"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Push-Up"));
        addUnitToStack(new SpecialUnit("Break", IUnitConfig.UnitLengthType.UNIT_LENGTH_SWAP_SIDE));
        addUnitToStack(new Exercise("Sit-Up"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Jump onto Plyobox", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Squat"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Triceps dips on chair"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Plank"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("High knees"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Lunge right", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Lunge left", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Push-Up & rotation"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Side plank left", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT));
        addUnitToStack(new SpecialUnit("Change side", IUnitConfig.UnitLengthType.UNIT_LENGTH_SWAP_SIDE));
        addUnitToStack(new Exercise("Side plank right", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Leg dip right", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG));
        addUnitToStack(new SpecialUnit("Change side", IUnitConfig.UnitLengthType.UNIT_LENGTH_SWAP_SIDE));
        addUnitToStack(new Exercise("Leg dip left", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG));
    }
}
