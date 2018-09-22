package com.example.sixminutesofhell.Workouts.TimsWorkouts;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.Workout;
import com.example.sixminutesofhell.R;

public class TimsWorkoutStretch extends Workout {

    public final static char stretch = '8';
    private IUnitProvider unitProvider;
    private IUnitConfig unitConfig;

    @Override
    public Character getId() {
        return stretch;
    }

    @Override
    public int getName() {
        return R.string.workoutStetch;
    }

    @Override
    protected void buildUnitConfig() {
        unitConfig = new TimsUnitConfigStretch();
    }

    @Override
    protected void buildUnitProvider() {
        unitProvider = new TimsUnitProviderStretch();
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
