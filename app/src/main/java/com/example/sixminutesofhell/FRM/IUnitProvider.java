package com.example.sixminutesofhell.FRM;

import com.example.sixminutesofhell.FRM.Units.ITrainingUnit;

import java.util.ArrayList;

/**
 * Created by vtewes on 07.01.2018.
 */

public interface IUnitProvider {
    ITrainingUnit getFirst();
    ITrainingUnit getUnitById(int id);
    ITrainingUnit getPredecessor(ITrainingUnit trainingUnit);
    ITrainingUnit getSuccessor(ITrainingUnit trainingUnit);
    ArrayList<ITrainingUnit> getTrainingUnits();
}
