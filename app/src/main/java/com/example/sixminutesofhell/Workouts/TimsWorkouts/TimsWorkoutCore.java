package com.example.sixminutesofhell.Workouts.TimsWorkouts;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.Workout;
import com.example.sixminutesofhell.R;

public class TimsWorkoutCore extends Workout {

    public final static char core = '9';

    private IUnitProvider unitProvider;
    private IUnitConfig unitConfig;

    public TimsWorkoutCore(){
        super();
    }

    @Override
    public Character getId() {
        return core;
    }

    @Override
    public int getName() {
        return R.string.workoutCore;
    }

    @Override
    protected void buildUnitConfig() {
        unitConfig = new TimsUnitConfigCore();
    }

    @Override
    protected void buildUnitProvider() {
        unitProvider = new TimsUnitProviderCore();
    }

    @Override
    public IUnitConfig getUnitConfig() {
        return unitConfig;
    }

    @Override
    public IUnitProvider getUnitProvider() {
        return unitProvider;
    }
}
