package com.example.sixminutesofhell.UnitTests;

import com.example.sixminutesofhell.FRM.IUnitConfig;

/**
 * Created by vtewes on 21.01.2018.
 */

class TestUnitConfig extends Test {

    @Override
    public String getTestname(){
        return "UnitConfig";
    }

    @Override
    public boolean test(){
        IUnitConfig unitConfig = UnitConfigProviderForTesting.getUnitConfigProvider();

        if(unitConfig.getLengthByType(IUnitConfig.UnitLengthType.UNIT_LENGTH_PREP) != UnitConfigForTesting.LENGTH_PREP*1000){
            setPointOfTestFailure("getLengthByType");
            return false;
        }
        return true;
    }

}
