package com.example.sixminutesofhell.FRM.Units;

import com.example.sixminutesofhell.FRM.IUnitConfig;

/**
 * Created by vtewes on 11.02.2016.
 */
public class Exercise extends MainUnit {

    public Exercise(String exerciseName){
        super(exerciseName, IUnitConfig.UnitLengthType.UNIT_LENGTH_MIDDLE);
    }

    public Exercise(String exerciseName, IUnitConfig.UnitLengthType lengthType){
        super(exerciseName,lengthType);
    }

}
