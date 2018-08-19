package org.orthodoxmusic.apodeipnon;

import javafx.scene.Group;
import org.orthodoxmusic.apodeipnon.letters.french.Letter;
import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.util.ArrayList;
import java.util.Collection;
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
        stringBuilder.append(" (").append(getGraphicalSize())
                .append(" From ").append(getStartXIndice())
                .append(" To ").append(getLastXPosition()).append(")");
        System.out.println(stringBuilder);
    }

    public void draw(Group group) {
        neumes.forEach(neume -> group.getChildren().add(neume.getSvgPath()));
    }

    private double getStartXIndice() {
        double startXIndice = Integer.MAX_VALUE;
        for(Neume neume : neumes) {
            if(neume.getCurrentX() < startXIndice) {
                startXIndice = neume.getCurrentX();
            }
        }
        return startXIndice;
    }

    public int getGraphicalSize() {
        int graphicalSize = 0;
        for(Neume neume : neumes) {
            graphicalSize += neume.getGraphicalSize();
        }
        return graphicalSize;
    }

    public double getLastXPosition() {
        return getStartXIndice() + getGraphicalSize();
    }


    public void drawCenter(Group group, double graphicalSize) {
        double shift = (graphicalSize - getGraphicalSize()) / 2;
        Set<Neume> localNeumes = new HashSet<>(neumes);
        for(Neume neume : localNeumes) {
            Neume neumeWithShifting = neume.getNeumeWithShifting(shift);
            group.getChildren().add(neumeWithShifting.getSvgPath());
        }
    }

    public boolean isEmpty() {
        System.out.println("neumes empty " + neumes.isEmpty());
        return neumes.isEmpty();
    }
}
