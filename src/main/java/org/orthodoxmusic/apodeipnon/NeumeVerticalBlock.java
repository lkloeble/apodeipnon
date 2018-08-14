package org.orthodoxmusic.apodeipnon;

import javafx.scene.Group;
import org.orthodoxmusic.apodeipnon.letters.french.Letter;
import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.util.HashSet;
import java.util.Set;

public class NeumeVerticalBlock {

    private Set<Neume> neumes;

    public NeumeVerticalBlock() {
        neumes = new HashSet<Neume>();
    }

    public void addNeume(Neume neume) {
        neumes.add(neume);
    }

    public void printlog() {
        StringBuilder stringBuilder = new StringBuilder(" / Neumes : ");
        for(Neume neume : neumes) {
            stringBuilder.append(neume.getNeumeName()).append(" ");
        }
        System.out.println(stringBuilder);
    }

    public void draw(Group group) {
        neumes.forEach(neume -> group.getChildren().add(neume.getSvgPath()));
    }

    public int getGraphicalSize() {
        int graphicalSize = 0;
        for(Neume neume : neumes) {
            if(neume.getGraphicalSize() > graphicalSize) {
                graphicalSize = neume.getGraphicalSize();
            }
        }
        return graphicalSize;
    }

    public double getLastXPosition() {
        double lastXPosition = 0;
        for(Neume neume : neumes) {
            double lastXPositionNeume = neume.getCurrentX();
            if(lastXPositionNeume > lastXPosition) {
                lastXPosition = lastXPositionNeume;
            }
        }
        return lastXPosition;
    }


}
