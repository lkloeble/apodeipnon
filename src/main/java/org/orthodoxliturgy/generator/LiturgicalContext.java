package org.orthodoxliturgy.generator;

public class LiturgicalContext {

    private LiturgicalDay liturgicalDay;
    private Actors actors;
    private OfficeType officeType;

    public LiturgicalContext(LiturgicalDay liturgicalDay, Actors actors, OfficeType officeType) {
        this.liturgicalDay = liturgicalDay;
        this.actors = actors;
        this.officeType = officeType;
    }

    public LiturgicalDay getLiturgicalDay() {
        return liturgicalDay;
    }

    public Actors getActors() {
        return actors;
    }

    public OfficeType getOfficeType() {
        return officeType;
    }

    public boolean isBigFeast() {
        return false;
    }

    public boolean isWithoutPriest() {
        return actors.isWithoutPriest();
    }
}
