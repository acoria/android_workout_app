package com.example.sixminutesofhell.UnitTests;

import java.util.ArrayList;

/**
 * Created by vtewes on 07.05.2016.
 */
public class RunTests {

    public static void main(String args[]) {

        ArrayList<Test> tests = new ArrayList<Test>();
        boolean success;

        tests.add(new TestMainUnit());
        tests.add(new TestUnitConfig());
        tests.add(new TestBreak());
        tests.add(new TestExercise());
        tests.add(new TestUnitProvider());
        tests.add(new TestWorkouts());
        tests.add(new TestWorkout());
        tests.add(new TestWorkoutFactory());

        for(int i = 0; i < tests.size(); i++){
            ITest test = tests.get(i);
            success = test.test();
            if (success) {
                writeSuccessful(test.getTestname());
            }else{
                writeFailed(test.getTestname() + ":"+ test.getPointOfTestFailure());
            }
        }
    }

    private static void writeSuccessful(String typeOfTest) {
        System.out.println("Test successful " + typeOfTest);
    }
    private static void writeFailed(String failureMessage){
        System.out.println("Test unsuccessful! " + failureMessage);
        System.exit(0);
    }
    protected static void testUnsuccessful(String testBrokeHere){
        System.out.println("Test unsuccessful & broke at: " + testBrokeHere);
        System.exit(0);

    }
}
