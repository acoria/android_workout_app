package com.example.sixminutesofhell.FRM.Units;

import android.graphics.drawable.Drawable;

import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.RuntimeObjectStorage;

/**
 * Created by vtewes on 07.05.2016.
 */
public abstract class MainUnit implements ITrainingUnit {

    private static boolean isInTestMode;
    private static int currentId = 1;
    private int id;
    private String title ="Exercise Unit";
    private int length;
    private int predecessorId;
    private int successorId;
    private IUnitConfig.UnitLengthType unitLengthType;
    private int infoImage;

    public MainUnit(String unitName, IUnitConfig.UnitLengthType unitLengthType){
        this.id = currentId++;
        this.title = unitName;
        this.unitLengthType = unitLengthType;
    }

    @Override
    public int getId() { return id; }
    @Override
    public String getTitle() { return title; }
    @Override
    public int getLength() {
        if(isInTestMode && length > 3){
            return length/10+1;
        }else{
            IUnitConfig unitConfig = RuntimeObjectStorage.getWorkout().getUnitConfig();
               return unitConfig.getLengthByType(unitLengthType);
            //getWorkoutService workoutService getWorkout;
            //workout.getLengthByType();
           // return length;
        }
    }
    @Override
    public IUnitConfig.UnitLengthType getUnitLengthType(){ return unitLengthType; }
    @Override
    public int getPredecessorId() {
        return predecessorId;
    }
    @Override
    public int getSuccessorId() {
        return successorId;
    }

    @Override
    public int getInfoImage() {
        return infoImage;
    }

    @Override
    public boolean hasPredecessor() {
        return getPredecessorId() != 0;
    }

    @Override
    public boolean hasSuccessor() {
        if(getSuccessorId() != 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public void setUnitLengthType(IUnitConfig.UnitLengthType unitLengthType){
        this.unitLengthType = unitLengthType;
    }
    @Override
    public void setPredecessorId(int predecessor) {
        this.predecessorId = predecessor;
    }
    @Override
    public void setSuccessorId(int successor) {
        this.successorId = successor;
    }

    public static void setTestMode (boolean testModeOn){
        isInTestMode = testModeOn;
    }

    @Override
    public void setInfoImage(int infoImage) {
        this.infoImage = infoImage;
    }
}
