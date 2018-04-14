package com.example.sixminutesofhell.FRM;

import com.example.sixminutesofhell.FRM.Units.ITrainingUnit;

import java.util.ArrayList;

/**
 * Created by vtewes on 08.05.2016.
 */
public abstract class UnitProvider implements IUnitProvider {

    static final String TAG = "UnitProvider";
    private int predessessorId = 0;
    private ArrayList<ITrainingUnit> trainUnits = new ArrayList<ITrainingUnit>();

    public UnitProvider(){
        initialize();
    }

    protected abstract void initialize();

    protected void addUnitToStack(ITrainingUnit trUnit){
        int addedUnitId = trUnit.getId();

        //set predecessor
        trUnit.setPredecessorId(predessessorId);
        predessessorId = addedUnitId;

        //set successors
        trUnit.setSuccessorId(0);
        changeSuccessorIdOfLastElement(addedUnitId);

        this.trainUnits.add(trUnit);
    }
    private void changeSuccessorIdOfLastElement(int addedUnitId){
        if (trainUnits != null && !trainUnits.isEmpty()) {
            ITrainingUnit lastUnit = trainUnits.get(trainUnits.size()-1);
            lastUnit.setSuccessorId(addedUnitId);
        }
    }

    @Override
    public ITrainingUnit getFirst(){
        return trainUnits.get(0);
    }
    @Override
    public ITrainingUnit getUnitById(int id){
        ITrainingUnit foundUnit = null;
        for(ITrainingUnit unit : trainUnits){
            if(unit.getId()==id){
                foundUnit = unit;
                break;
            }
        }
        return foundUnit;
    }
    @Override
    public ITrainingUnit getPredecessor(ITrainingUnit trainingUnit){
        return getUnitById(trainingUnit.getPredecessorId());
    }
    @Override
    public ITrainingUnit getSuccessor(ITrainingUnit trainingUnit){
        return getUnitById(trainingUnit.getSuccessorId());
    }
    @Override
    public ArrayList<ITrainingUnit> getTrainingUnits() {
        return trainUnits;
    }
}
