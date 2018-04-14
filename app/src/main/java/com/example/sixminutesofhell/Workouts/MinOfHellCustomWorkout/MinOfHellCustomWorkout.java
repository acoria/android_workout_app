package com.example.sixminutesofhell.Workouts.MinOfHellCustomWorkout;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.Workout;
import com.example.sixminutesofhell.Workouts.MinOfHell.MinOfHellUnitConfig;
import com.example.sixminutesofhell.Workouts.MinOfHell.MinOfHellUnitProvider;

/**
 * Created by vtewes on 07.01.2018.
 */

public class MinOfHellCustomWorkout extends Workout {

    private IUnitProvider unitProvider;
    private IUnitConfig unitConfig;

    public MinOfHellCustomWorkout(){
        super();
    }
    public IUnitConfig getUnitConfig(){
        return this.unitConfig;
    }
    public IUnitProvider getUnitProvider(){
        return this.unitProvider;
    }

    protected void buildUnitConfig(){
        unitConfig = new MinOfHellUnitConfig();
    }
    protected void buildUnitProvider(){ unitProvider = new MinOfHellCustomUnitProvider();
    }
}
