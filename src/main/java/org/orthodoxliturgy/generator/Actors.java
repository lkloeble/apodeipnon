package org.orthodoxliturgy.generator;

import java.util.HashSet;
import java.util.Set;

public class Actors {

    private Set actorSet = new HashSet();

    public Actors addActor(ActorType actor) {
        actorSet.add(actor);
        return this;
    }

    public boolean isWithoutPriest() {
        return !actorSet.contains(ActorType.PRIEST);
    }
}
