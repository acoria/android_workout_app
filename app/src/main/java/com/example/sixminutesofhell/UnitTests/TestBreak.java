package com.example.sixminutesofhell.UnitTests;

import com.example.sixminutesofhell.FRM.Units.Break;

/**
 * Created by vtewes on 07.05.2016.
 */
class TestBreak extends Test{

    @Override
    public String getTestname(){
        return "Break";
    }

    @Override
    public boolean test(){

        Break br = new Break();

        String title = br.getTitle();
        if (!title.equals("Break")){
            setPointOfTestFailure("getTitle");
            return false;
        }

      /* if(br.getLength() != 15000){
            setPointOfTestFailure("getLength");
            return false;
        }
        */
        return true;
    }
}
