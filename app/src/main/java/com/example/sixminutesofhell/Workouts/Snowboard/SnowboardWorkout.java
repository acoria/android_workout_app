package com.example.sixminutesofhell.Workouts.Snowboard;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.Workout;
import com.example.sixminutesofhell.R;

/**
 * Created by vtewes on 07.01.2018.
 * Test
 */

public class SnowboardWorkout extends Workout {

    public final static char snowboardWorkout = '2';
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

    @Override
    public Character getId() {
        return snowboardWorkout;
    }

    @Override
    public int getName() {
        return R.string.snowboardWorkout;
    }

    protected void buildUnitProvider(){ unitProvider = new SnowboardUnitProvider(); }
    protected void buildUnitConfig(){
        unitConfig = new SnowboardUnitConfig();
    }


}
