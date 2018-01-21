package com.example.sixminutesofhell.UnitTests;

import com.example.sixminutesofhell.FRM.Units.Break;
import com.example.sixminutesofhell.FRM.Units.ITrainingUnit;
import com.example.sixminutesofhell.FRM.UnitProvider;

/**
 * Created by vtewes on 07.05.2016.
 */
class TestUnitProvider extends Test{

    private ITrainingUnit unit1;
    private ITrainingUnit unit2;

    @Override
    public String getTestname(){
        return "UnitProvider";
    }


    @Override
    public boolean test() {

        LocalTestUnitProvider unitProvider = new LocalTestUnitProvider();

        if(unitProvider.getFirst() != unit1){
            setPointOfTestFailure("getFirst");
            return false;
        }
        if(unit2 != unitProvider.getUnitById(unit2.getId())){
            setPointOfTestFailure("getUnitById");
            return false;
        }
        if (unitProvider.getPredecessor(unit1) != null) {
            setPointOfTestFailure("unit1 - getPredecessor");
            return false;
        }
        if (!unitProvider.getSuccessor(unit1).equals(unit2)) {
            setPointOfTestFailure("unit1 - getSuccessor");
            return false;
        }
        if (!unitProvider.getPredecessor(unit2).equals(unit1)) {
            setPointOfTestFailure("unit2 - getPredecessor");
            return false;
        }
        if (unitProvider.getSuccessor(unit2)!= null) {
            setPointOfTestFailure("unit2 - getSuccessor");
            return false;
        }
        return true;
    }

    private class LocalTestUnitProvider extends UnitProvider{

        @Override
        protected void initialize(){
            unit1 = new Break();
            unit2 = new Break();

            addUnitToStack(unit1);
            addUnitToStack(unit2);
        }

    }
}
