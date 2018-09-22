package com.example.sixminutesofhell.Workouts.MinOfHell;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.Workout;
import com.example.sixminutesofhell.R;

/**
 * Created by vtewes on 07.01.2018.
 */

public class MinOfHellWorkout extends Workout {

    public final static char minOfHellWorkout = '1';
    private IUnitProvider unitProvider;
    private IUnitConfig unitConfig;


    public MinOfHellWorkout(){
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
        return minOfHellWorkout;
    }

    @Override
    public int getName() {
        return R.string.minOfHellWorkout;
    }

    protected void buildUnitProvider(){ unitProvider = new MinOfHellUnitProvider(); }
    protected void buildUnitConfig(){
        unitConfig = new MinOfHellUnitConfig();
    }
}
