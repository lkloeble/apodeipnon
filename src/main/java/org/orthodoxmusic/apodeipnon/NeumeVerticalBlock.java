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
            if(neume.getGraphicalSize() > graphicalSize) {
                graphicalSize = neume.getGraphicalSize();
            }
        }
        return graphicalSize;
    }

    public double getLastXPosition() {
        return getStartXIndice() + getGraphicalSize();
    }


    public void drawCenter(Group group, double graphicalSize) {
        draw(group);
    }
}
