package com.example.sixminutesofhell.UnitTests;

import com.example.sixminutesofhell.FRM.IUnitConfig;

/**
 * Created by vtewes on 21.01.2018.
 */

class UnitConfigProvider {

    private static IUnitConfig unitConfig;

    public static IUnitConfig getUnitConfigProvider(){
        if(unitConfig == null){
            unitConfig = new UnitConfigForTesting();
        }
        return unitConfig;
    }
}
