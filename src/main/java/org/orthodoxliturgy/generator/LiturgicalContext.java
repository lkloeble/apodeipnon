package org.orthodoxliturgy.generator;

import org.orthodoxliturgy.generator.elementaryblocks.WeekTone;

public class LiturgicalContext {

    private LiturgicalDay liturgicalDay;
    private Actors actors;
    private OfficeType officeType;
    private Omophore omophore;

    public LiturgicalContext(LiturgicalDay liturgicalDay, Actors actors, OfficeType officeType, Omophore omophore) {
        this.liturgicalDay = liturgicalDay;
        this.actors = actors;
        this.officeType = officeType;
        this.omophore = omophore;
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
        return liturgicalDay.isInBigFeast();
    }

    public boolean isWithoutPriest() {
        return actors.isWithoutPriest();
    }

    public String getOmophoreText() {
        return omophore.getText();
    }

    public boolean withoutPrecedingOrthros() {
        return false;
    }

    public boolean isBigFeastFourthWeek() {
        return false;
    }

    public WeekTone getWeekTone() {
        return null;
    }

    public boolean isSunday() {
        return liturgicalDay.isSunday();
    }

    public String getDayName() {
        return null;
    }

    public boolean willCelebrate(OfficeType tierce) {
        return false;
    }
}
