package com.example.sixminutesofhell.FRM;

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

    protected abstract void buildUnitConfig();
    protected abstract void buildUnitProvider();

    public abstract IUnitConfig getUnitConfig();
    public abstract IUnitProvider getUnitProvider();

}
