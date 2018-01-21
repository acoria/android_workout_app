package com.example.sixminutesofhell.UnitTests;

/**
 * Created by vtewes on 21.01.2018.
 */

abstract class Test implements ITest {

    private String testFailureAt;

    @Override
    public void setPointOfTestFailure(String failureAt){
        testFailureAt = failureAt;
    }
    @Override
    public String getPointOfTestFailure(){
        return this.testFailureAt;
    }
}
