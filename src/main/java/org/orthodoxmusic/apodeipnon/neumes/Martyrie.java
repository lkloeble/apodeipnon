package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Martyrie extends Neume {

    private Note note;
    private Diatonique diatonique;

    public Martyrie(Note note, Diatonique diatonique) {
        this.note = note;
        this.diatonique = diatonique;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeightForNeumes) {
        return note.getNeumeSVG(textLinePositions,positionInSentence,currentXPosition,maxHeightForNeumes)
                + diatonique.getNeumeSVG(textLinePositions,positionInSentence,currentXPosition,maxHeightForNeumes);
    }
}
