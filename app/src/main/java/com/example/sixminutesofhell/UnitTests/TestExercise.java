package com.example.sixminutesofhell.UnitTests;

import com.example.sixminutesofhell.FRM.Units.Exercise;
import com.example.sixminutesofhell.FRM.IUnitConfig;

/**
 * Created by vtewes on 07.05.2016.
 */
class TestExercise extends Test{

    @Override
    public String getTestname(){
        return "Exercise";
    }

    @Override
    public boolean test() {

        String excName = "TestExercise";

        Exercise ex = new Exercise(excName, IUnitConfig.UnitLengthType.UNIT_LENGTH_MIDDLE );

        if(!ex.getTitle().equals(excName)){
            setPointOfTestFailure("getTitle");
            return false;
        }
       // ex.getLength();
        return true;
    }

}
