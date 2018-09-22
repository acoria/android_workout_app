package com.example.sixminutesofhell.Workouts.MinOfHellCustomWorkout;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.Workout;
import com.example.sixminutesofhell.R;
import com.example.sixminutesofhell.Workouts.MinOfHell.MinOfHellUnitConfig;

/**
 * Created by vtewes on 07.01.2018.
 */

public class MinOfHellCustomWorkout extends Workout {

    public final static char minOfHellCustomWorkout = '4';
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

    @Override
    public Character getId() {
        return minOfHellCustomWorkout;
    }

    @Override
    public int getName() {
        return R.string.minOfHellCustomWorkout;
    }

    protected void buildUnitConfig(){
        unitConfig = new MinOfHellUnitConfig();
    }
    protected void buildUnitProvider(){ unitProvider = new MinOfHellCustomUnitProvider();
    }
}
