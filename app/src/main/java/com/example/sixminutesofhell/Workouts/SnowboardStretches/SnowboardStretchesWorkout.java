package com.example.sixminutesofhell.Workouts.SnowboardStretches;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.Workout;

/**
 * Created by vtewes on 07.01.2018.
 */

public class SnowboardStretchesWorkout extends Workout {

    private IUnitProvider unitProvider;
    private IUnitConfig unitConfig;


    public SnowboardStretchesWorkout(){
        super();
    }
    public IUnitConfig getUnitConfig(){
        return unitConfig;
    }
    public IUnitProvider getUnitProvider(){
        return unitProvider;
    }

    protected void buildUnitProvider(){
        unitProvider = new SnowboardStretchesUnitProvider();
    }
    protected void buildUnitConfig(){
        unitConfig = new SnowboardStretchesConfig();
    }
}
