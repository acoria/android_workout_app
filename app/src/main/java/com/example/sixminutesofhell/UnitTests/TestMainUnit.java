package com.example.sixminutesofhell.UnitTests;

import com.example.sixminutesofhell.FRM.Units.ITrainingUnit;
import com.example.sixminutesofhell.FRM.IUnitConfig;
import com.example.sixminutesofhell.FRM.Units.MainUnit;

/**
 * Created by vtewes on 07.05.2016.
 */
class TestMainUnit extends Test{

    private String unitName = "Unit";
    private IUnitConfig.UnitLengthType unitLengthType = IUnitConfig.UnitLengthType.UNIT_LENGTH_MIDDLE;

    @Override
    public String getTestname(){
        return "MainUnit";
    }

    @Override
    public boolean test(){

        ITrainingUnit helperUnit = new Unit();
        ITrainingUnit unit = new Unit();

        int helperUnitId = helperUnit.getId();

        if(unit.getId() != ++helperUnitId){
            setPointOfTestFailure("getId");
            return false;
        }
        if(!unit.getTitle().equals(unitName)){
            setPointOfTestFailure("getTitle");
            return false;
        }
        //int getLength();
        if(unit.getPredecessorId() != 0){
            setPointOfTestFailure("getPredId");
            return false;
        }
        if(unit.getSuccessorId() != 0){
            setPointOfTestFailure("getSuccId");
            return false;
        }
        if(!unit.getUnitLengthType().equals(unitLengthType)){
            setPointOfTestFailure("getUnitLengthType");
            return false;
        }
        if(unit.hasPredecessor()){
            setPointOfTestFailure("hasPred - should not");
            return false;
        }
        if(unit.hasSuccessor()){
            setPointOfTestFailure("hasSucc - should not");
            return false;
        }

        String newTitle = "newTitle";
        unit.setTitle(newTitle);
        if(!unit.getTitle().equals(newTitle)){
            setPointOfTestFailure("setTitle");
            return false;
        }
        IUnitConfig.UnitLengthType newType = IUnitConfig.UnitLengthType.UNIT_LENGTH_LONG;
        unit.setUnitLengthType(newType);
        if(!unit.getUnitLengthType().equals(newType)){
            setPointOfTestFailure("setUnitLengthType");
            return false;
        }
        int newPred = 7;
        unit.setPredecessorId(newPred);
        if(unit.getPredecessorId() != newPred){
            setPointOfTestFailure("setPredId");
            return false;
        }
        int newSucc = 9;
        unit.setSuccessorId(newSucc);
        if(unit.getSuccessorId() != newSucc){
            setPointOfTestFailure("setSuccId");
            return false;
        }

        return true;
    }

    private class Unit extends MainUnit {

        Unit() {
            super(unitName, unitLengthType);
        }

    }
}
