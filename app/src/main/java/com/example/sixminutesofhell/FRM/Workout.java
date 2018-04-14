package com.example.sixminutesofhell.FRM;

import com.example.sixminutesofhell.FRM.Units.ITrainingUnit;

import java.util.ArrayList;

/**
 * Created by vtewes on 07.01.2018.
 */

public abstract class Workout implements IWorkout {

    protected Workout(){
        buildUnitConfig();
        buildUnitProvider();
    }
    @Override
    public int getLengthByType(IUnitConfig.UnitLengthType lengthType){
        IUnitConfig unitConfig = getUnitConfig();
        return unitConfig.getLengthByType(lengthType);
    }

    @Override
    public int getTotalWorkoutLength(){
        int totalLength = 0;
        IUnitProvider unitProvider = getUnitProvider();
        ArrayList<ITrainingUnit> trainingUnits = unitProvider.getTrainingUnits();
        for (ITrainingUnit trainingUnit:trainingUnits) {
            totalLength += getLengthByType(trainingUnit.getUnitLengthType());
        }
        return totalLength;
    }

    protected abstract void buildUnitConfig();
    protected abstract void buildUnitProvider();

    public abstract IUnitConfig getUnitConfig();
    public abstract IUnitProvider getUnitProvider();

}
