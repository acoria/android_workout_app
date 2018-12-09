package com.example.sixminutesofhell.FRM.Units;

import com.example.sixminutesofhell.FRM.IUnitConfig;

/**
 * Created by vtewes on 12.02.2016.
 */
public interface ITrainingUnit {

    int getId();
    String getTitle();
    int getLength();
    int getPredecessorId();
    int getSuccessorId();
    IUnitConfig.UnitLengthType getUnitLengthType();
    int getInfoImage();

    boolean hasPredecessor();
    boolean hasSuccessor();

    void setTitle(String title);
    void setUnitLengthType(IUnitConfig.UnitLengthType unitLengthType);
    void setPredecessorId(int predecessorId);
    void setSuccessorId(int successorId);
    void setInfoImage(int infoImage);
}
