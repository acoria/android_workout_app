package com.example.sixminutesofhell.UnitTests;

import com.example.sixminutesofhell.Workouts.MinOfHell.MinOfHellUnitConfig;
import com.example.sixminutesofhell.Workouts.MinOfHell.MinOfHellUnitProvider;
import com.example.sixminutesofhell.Workouts.MinOfHell.MinOfHellWorkout;
import com.example.sixminutesofhell.Workouts.Snowboard.SnowboardUnitConfig;
import com.example.sixminutesofhell.Workouts.Snowboard.SnowboardUnitProvider;
import com.example.sixminutesofhell.Workouts.Snowboard.SnowboardWorkout;
import com.example.sixminutesofhell.Workouts.SnowboardStretches.SnowboardStretchesConfig;
import com.example.sixminutesofhell.Workouts.SnowboardStretches.SnowboardStretchesUnitProvider;
import com.example.sixminutesofhell.Workouts.SnowboardStretches.SnowboardStretchesWorkout;

/**
 * Created by vtewes on 21.01.2018.
 */

class TestWorkouts extends Test {

    @Override
    public String getTestname(){
        return "Workouts";
    }


    @Override
    public boolean test() {

        MinOfHellWorkout minWorkout = new MinOfHellWorkout();
        try{
          MinOfHellUnitConfig minOfHellConfig = (MinOfHellUnitConfig) minWorkout.getUnitConfig();
            if(minOfHellConfig == null){
                setPointOfTestFailure("minOfHellUnitConfig");
                return false;
            }
            MinOfHellUnitProvider minOfHellProvider = (MinOfHellUnitProvider) minWorkout.getUnitProvider();
            if(minOfHellProvider == null){
                setPointOfTestFailure("minOfHellUnitProvider");
                return false;
            }
        }catch(ClassCastException e){
            setPointOfTestFailure("minOfHell cast");
        }

        SnowboardWorkout snowboardWorkout = new SnowboardWorkout();
        try{
            SnowboardUnitConfig snowboardUnitConfig = (SnowboardUnitConfig) snowboardWorkout.getUnitConfig();
            if(snowboardUnitConfig == null){
                setPointOfTestFailure("snowboardUnitConfig");
                return false;
            }
            SnowboardUnitProvider snowboardUnitProvider = (SnowboardUnitProvider) snowboardWorkout.getUnitProvider();
            if(snowboardUnitProvider == null){
                setPointOfTestFailure("snowboardUnitProvider");
                return false;
            }
        }catch(ClassCastException e){
            setPointOfTestFailure("snowboard cast");
        }

        SnowboardStretchesWorkout snowStretchWorkout = new SnowboardStretchesWorkout();
        try{
            SnowboardStretchesConfig snowStretchesConfig = (SnowboardStretchesConfig) snowStretchWorkout.getUnitConfig();
            if(snowStretchesConfig== null){
                setPointOfTestFailure("snowboardStretchesConfig");
                return false;
            }
            SnowboardStretchesUnitProvider snowboardUnitProvider = (SnowboardStretchesUnitProvider) snowStretchWorkout.getUnitProvider();
            if(snowboardUnitProvider == null){
                setPointOfTestFailure("snowboardStretchesProvider");
                return false;
            }
        }catch(ClassCastException e){
            setPointOfTestFailure("snowboardStretches cast");
        }

        return true;
    }
}
