package com.example.sixminutesofhell.UnitTests;

/**
 * Created by vtewes on 21.01.2018.
 */

interface ITest {
    String getTestname();
    boolean test();
    void setPointOfTestFailure(String failureAt);
    String getPointOfTestFailure();
}
