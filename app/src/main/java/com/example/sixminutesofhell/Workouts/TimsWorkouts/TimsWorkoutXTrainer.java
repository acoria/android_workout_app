package com.example.sixminutesofhell.Workouts.TimsWorkouts;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.IUnitProvider;
import com.example.sixminutesofhell.FRM.Workout;
import com.example.sixminutesofhell.R;

public class TimsWorkoutXTrainer extends Workout {

    public final static char xtrainerWorkout10min = '1';
    public final static char xtrainerWorkout15min = '5';
    public final static char xtrainerWorkout20min = '2';
    private IUnitProvider unitProvider;
    private IUnitConfig unitConfig;
    private int name;
    private char id;

    public TimsWorkoutXTrainer(char id){
        this.id = id;
    }
    @Override
    public Character getId() {
        return id;
    }

    @Override
    public int getName() {
        return name;
    }

    @Override
    protected void buildUnitConfig() {}

    @Override
    protected void buildUnitProvider() {
        unitProvider = new TimsUnitProviderXTrainer();
    }

    @Override
    public IUnitConfig getUnitConfig() {
        return unitConfig;
    }

    @Override
    public IUnitProvider getUnitProvider() {
        return unitProvider;
    }

    public void setUnitConfig(IUnitConfig unitConfig) {
        this.unitConfig = unitConfig;
    }
    public void setName(int name){
        this.name = name;
    }
}
