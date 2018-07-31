package org.orthodoxmusic.apodeipnon;

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
}
