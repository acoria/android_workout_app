package com.example.sixminutesofhell.Workouts.Snowboard;

import com.example.sixminutesofhell.FRM.Units.Break;
import com.example.sixminutesofhell.FRM.Units.Exercise;
import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitProvider;

/**
 * Created by vtewes on 07.01.2018.
 */

public class SnowboardUnitProvider extends UnitProvider {

    @Override
    protected void initialize() {

        addUnitToStack(new Exercise("Get ready!", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
        addUnitToStack(new Exercise("Weighted Box Jumps"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Double Mountain Climber"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Lateral Jump and Tap"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Wood-chops with Medicine Ball - left"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Wood-chops with Medicine Ball - right"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Prep. for Jack Knife", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
        addUnitToStack(new Exercise("Jack Knife"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Medicine Ball Lunge w. Balance Board - left"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Medicine Ball Lunge w. Balance Board - right"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Rotating Box Jump"));
        addUnitToStack(new Break());
        addUnitToStack(new Exercise("Medicine Ball Russian Twist"));
    }
}
