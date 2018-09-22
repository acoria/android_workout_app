package com.example.sixminutesofhell.Workouts.SnowboardStretches;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.Workout;
import com.example.sixminutesofhell.R;

/**
 * Created by vtewes on 07.01.2018.
 */

public class SnowboardStretchesWorkout extends Workout {

    public final static char snowboardStretches = '3';
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

    @Override
    public Character getId() {
        return snowboardStretches;
    }

    @Override
    public int getName() {
        return R.string.snowboardStretches;
    }

    protected void buildUnitProvider(){
        unitProvider = new SnowboardStretchesUnitProvider();
    }
    protected void buildUnitConfig(){
        unitConfig = new SnowboardStretchesConfig();
    }
}
