package com.example.sixminutesofhell.Workouts.SnowboardStretches;

import com.example.sixminutesofhell.FRM.Units.Break;
import com.example.sixminutesofhell.FRM.Units.Exercise;
import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitProvider;
import com.example.sixminutesofhell.FRM.Units.ITrainingUnit;
import com.example.sixminutesofhell.R;

/**
 * Created by vtewes on 07.01.2018.
 */

public class SnowboardStretchesUnitProvider extends UnitProvider {

    @Override
    protected void initialize() {

        final String textSwapSides = "Swap Sides";

        addUnitToStack(new Exercise("Get ready!", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
        ITrainingUnit trainingUnit = new Exercise("Quad Stretch left");
        trainingUnit.setInfoImage(R.drawable.quad_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break(textSwapSides));

        trainingUnit = new Exercise("Quad Stretch right");
        trainingUnit.setInfoImage(R.drawable.quad_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Hamstring Stretch left");
        trainingUnit.setInfoImage(R.drawable.hamstring_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break(textSwapSides));

        trainingUnit = new Exercise("Hamstring Stretch right");
        trainingUnit.setInfoImage(R.drawable.hamstring_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Groin Stretch");
        trainingUnit.setInfoImage(R.drawable.groin_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Gluteus Stretch left");
        trainingUnit.setInfoImage(R.drawable.gluteus_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break(textSwapSides));

        trainingUnit = new Exercise("Gluteus Stretch right");
        trainingUnit.setInfoImage(R.drawable.gluteus_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Shoulder Stretch left");
        trainingUnit.setInfoImage(R.drawable.shoulder_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break(textSwapSides));

        trainingUnit = new Exercise("Shoulder Stretch right");
        trainingUnit.setInfoImage(R.drawable.shoulder_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Overhead Shoulder Stretch left");
        trainingUnit.setInfoImage(R.drawable.overhead_shoulder_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break(textSwapSides));

        trainingUnit = new Exercise("Overhead Shoulder Stretch right");
        trainingUnit.setInfoImage(R.drawable.overhead_shoulder_stretch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Cat Stretch", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG);
        trainingUnit.setInfoImage(R.drawable.cat_stretch);
        addUnitToStack(trainingUnit);

        trainingUnit = new Exercise("Clock Face Stretch", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG);
        trainingUnit.setInfoImage(R.drawable.clockface_stretch);
        addUnitToStack(trainingUnit);

        trainingUnit = new Exercise("Piriformis Stretch", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG);
        trainingUnit.setInfoImage(R.drawable.pirifirmis_stretch);
        addUnitToStack(trainingUnit);

        trainingUnit = new Exercise("Hip Flexor Stretch", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT);
        trainingUnit.setInfoImage(R.drawable.pirifirmis_stretch);
        addUnitToStack(trainingUnit);
    }
}
