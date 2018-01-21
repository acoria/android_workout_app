package com.example.sixminutesofhell.Workouts.Snowboard;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.Workout;

/**
 * Created by vtewes on 07.01.2018.
 */

public class SnowboardWorkout extends Workout {

    private IUnitProvider unitProvider;
    private IUnitConfig unitConfig;


    public SnowboardWorkout(){
        super();
    }
    public IUnitConfig getUnitConfig(){
        return unitConfig;
    }
    public IUnitProvider getUnitProvider(){
        return unitProvider;
    }

    protected void buildUnitProvider(){ unitProvider = new SnowboardUnitProvider(); }
    protected void buildUnitConfig(){
        unitConfig = new SnowboardUnitConfig();
    }


}
