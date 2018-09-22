package com.example.sixminutesofhell.UnitTests;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.IWorkout;
import com.example.sixminutesofhell.FRM.UnitConfig;
import com.example.sixminutesofhell.FRM.UnitProvider;
import com.example.sixminutesofhell.FRM.Units.Break;
import com.example.sixminutesofhell.FRM.Units.Exercise;
import com.example.sixminutesofhell.FRM.Workout;

/**
 * Created by vtewes on 07.05.2016.
 */
class TestWorkout extends Test{

    private String unitName = "Unit";
    private IUnitConfig.UnitLengthType unitLengthType = IUnitConfig.UnitLengthType.UNIT_LENGTH_MIDDLE;

    @Override
    public String getTestname(){
        return "Workout";
    }

    @Override
    public boolean test() {

        IWorkout workout = new Loc_Workout();
        int leng = workout.getTotalWorkoutLength();
        if(leng != 654321000){
            setPointOfTestFailure("getTotalWorkoutLength");
            return false;
        }
        return true;
    }

    private class Loc_Workout extends Workout {

        private IUnitProvider unitProvider;
        private IUnitConfig unitConfig;

        @Override
        public Character getId() {
            return null;
        }

        @Override
        public int getName() {
            return 0;
        }

        @Override
        protected void buildUnitConfig() {
            this.unitConfig = new Loc_UnitConfig();
        }
        @Override
        protected void buildUnitProvider() {
            this.unitProvider = new Loc_UnitProvider();
        }
        @Override
        public IUnitConfig getUnitConfig() {
            return unitConfig;
        }
        @Override
        public IUnitProvider getUnitProvider() {
            return unitProvider;
        }
    }
    private class Loc_UnitProvider extends UnitProvider{
        @Override
        protected void initialize() {
            addUnitToStack(new Break());
            addUnitToStack(new Exercise("test", IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT));
            addUnitToStack(new Exercise("test", IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG));
            addUnitToStack(new Exercise("test", IUnitConfig.UnitLengthType.UNIT_LENGTH_SWAP_SIDE));
            addUnitToStack(new Exercise("test", IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP));
            addUnitToStack(new Exercise("test"));
        }
    }
    private class Loc_UnitConfig extends UnitConfig{
        Loc_UnitConfig(){
            addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_SHORT, 1);
            addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_MIDDLE, 20);
            addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG, 300);
            addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_SWAP_SIDE, 4000);
            addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK, 50000);
            addUnitLength(IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP, 600000);
        }
    }
}
