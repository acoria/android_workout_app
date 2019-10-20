package com.example.sixminutesofhell.Workouts.Snowboard;

import com.example.sixminutesofhell.FRM.Units.Break;
import com.example.sixminutesofhell.FRM.Units.Exercise;
import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.UnitProvider;
import com.example.sixminutesofhell.FRM.Units.ITrainingUnit;
import com.example.sixminutesofhell.R;

/**
 * Created by vtewes on 07.01.2018.
 */

public class SnowboardUnitProvider extends UnitProvider {

    @Override
    protected void initialize() {

        addUnitToStack(new Exercise("Get ready!", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
        ITrainingUnit trainingUnit = new Exercise("Weighted Box Jumps");
        trainingUnit.setInfoImage(R.drawable.interm_snowb_1_weighted_box_jumps);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());
        trainingUnit = new Exercise("Double Mountain Climber");
        trainingUnit.setInfoImage(R.drawable.interm_snowb_2_double_mountain_climber);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());
        trainingUnit = new Exercise("Lateral Jump and Tap");
        trainingUnit.setInfoImage(R.drawable.interm_snowb_3_lateral_jump);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());
        trainingUnit = new Exercise("Wood-chops with Medicine Ball - left");
        trainingUnit.setInfoImage(R.drawable.interm_snowb_4_wood_chops);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());
        trainingUnit = new Exercise("Wood-chops with Medicine Ball - right");
        trainingUnit.setInfoImage(R.drawable.interm_snowb_4_wood_chops);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());
        trainingUnit = new Exercise("Jack Knife");
        trainingUnit.setInfoImage(R.drawable.interm_snowb_5_jack_knife);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());
        trainingUnit = new Exercise("Medicine Ball Lunge w. Balance Board - left");
        trainingUnit.setInfoImage(R.drawable.interm_snowb_6_lunge);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());
        trainingUnit = new Exercise("Medicine Ball Lunge w. Balance Board - right");
        trainingUnit.setInfoImage(R.drawable.interm_snowb_6_lunge);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());
        trainingUnit = new Exercise("Rotating Box Jump");
        trainingUnit.setInfoImage(R.drawable.interm_snowb_7_rotating_box_jumps);
        addUnitToStack(trainingUnit);
        addUnitToStack(new Break());
        trainingUnit = new Exercise("Medicine Ball Russian Twist");
        trainingUnit.setInfoImage(R.drawable.interm_snowb_8_russian_twist);
        addUnitToStack(trainingUnit);
    }
}
