package com.example.sixminutesofhell.FRM.Units;

import com.example.sixminutesofhell.FRM.IUnitConfig;

/**
 * Created by vtewes on 12.02.2016.
 */
public class Break extends MainUnit {

    public Break(){
        super("Break", IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK );
    }
    public Break(String breakName){
        super(breakName, IUnitConfig.UnitLengthType.UNIT_LENGTH_BREAK);
    }

}
