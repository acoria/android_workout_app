package com.example.sixminutesofhell.Workouts.MinOfHell;

import com.example.sixminutesofhell.FRM.Units.Break;
import com.example.sixminutesofhell.FRM.Units.Exercise;
import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.Units.ITrainingUnit;
import com.example.sixminutesofhell.FRM.Units.SpecialUnit;
import com.example.sixminutesofhell.FRM.UnitProvider;
import com.example.sixminutesofhell.R;

/**
 * Created by vtewes on 07.01.2018.
 */

public class MinOfHellUnitProvider extends UnitProvider {

    @Override
    protected void initialize() {

        addUnitToStack(new Exercise("Get ready!", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
        ITrainingUnit trainingUnit = new Exercise("Jumping Jacks");
        trainingUnit.setInfoImage(R.drawable.jumping_jacks);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Wall sit");
        trainingUnit.setInfoImage(R.drawable.wall_sit);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Push-Up");
        trainingUnit.setInfoImage(R.drawable.push_up);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Sit-Up");
        trainingUnit.setInfoImage(R.drawable.abdominal_crunch);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Step-up onto chair, right", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT);
        trainingUnit.setInfoImage(R.drawable.stepup_onto_chair);
        addUnitToStack(trainingUnit);
        trainingUnit = new Exercise("Step-up onto chair, left", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT);
        trainingUnit.setInfoImage(R.drawable.stepup_onto_chair);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Squat");
        trainingUnit.setInfoImage(R.drawable.squat);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Triceps dips on chair");
        trainingUnit.setInfoImage(R.drawable.triceps_dip);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Plank");
        trainingUnit.setInfoImage(R.drawable.plank);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("High knees");
        trainingUnit.setInfoImage(R.drawable.high_knees);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Lunge right", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT);
        trainingUnit.setInfoImage(R.drawable.lunge);
        addUnitToStack(trainingUnit);
        addUnitToStack(new SpecialUnit("Change side", IUnitConfig.UnitLengthType.UNIT_LENGTH_SWAP_SIDE));
        trainingUnit = new Exercise("Lunge left", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT);
        trainingUnit.setInfoImage(R.drawable.lunge);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Push-Up & rotation");
        trainingUnit.setInfoImage(R.drawable.push_up_and_rotation);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());

        trainingUnit = new Exercise("Side plank left", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT);
        trainingUnit.setInfoImage(R.drawable.side_plank);
        addUnitToStack(trainingUnit);
        addUnitToStack(new SpecialUnit("Change side", IUnitConfig.UnitLengthType.UNIT_LENGTH_SWAP_SIDE));
        trainingUnit = new Exercise("Side plank right", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT);
        trainingUnit.setInfoImage(R.drawable.side_plank);
        addUnitToStack(trainingUnit);
    }
}
