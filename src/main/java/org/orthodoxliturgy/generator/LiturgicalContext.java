package org.orthodoxliturgy.generator;

import org.orthodoxliturgy.generator.elementaryblocks.WeekTone;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiturgicalContext {

    private static final String EMPTY_STRING = "";

    private LiturgicalDay liturgicalDay;
    private Actors actors;
    private OfficeType officeType;
    private Omophore omophore;
    private List<String> protectors;
    private List<String> countryMainSaints;

    public LiturgicalContext(LiturgicalDay liturgicalDay, Actors actors, OfficeType officeType, Omophore omophore, List<String> protectors, List<String> countryMainSaints) {
        this.liturgicalDay = liturgicalDay;
        this.actors = actors;
        this.officeType = officeType;
        this.omophore = omophore;
        this.protectors=protectors;
        if(protectors == null) {
            this.protectors = Collections.EMPTY_LIST;
        }
        if(countryMainSaints == null) {
            countryMainSaints = Collections.EMPTY_LIST;
        }
        this.countryMainSaints=filterSaintsWithProtectors(countryMainSaints);
    }

    private List<String> filterSaintsWithProtectors(List<String> countryMainSaints) {
        List<String> saintsWithNoProtectors = new ArrayList<>();
        for(String countrySaint : countryMainSaints) {
            if(protectors.contains(countrySaint)) continue;
            saintsWithNoProtectors.add(countrySaint);
        }
        return saintsWithNoProtectors;
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
        LocalDateTime nearestPrecedentEaster = getNearestPrecedenteaster();
        LocalDateTime liturgicalDayInDateTime = getLiturgicalDay().getDateTime();
        int numberOfWeeksBetweenEasterAndDate = getWeeksInterval(nearestPrecedentEaster,liturgicalDayInDateTime);
        return WeekTone.getValue(numberOfWeeksBetweenEasterAndDate%8);
    }

    private int getWeeksInterval(LocalDateTime nearestPrecedentEaster, LocalDateTime liturgicalDayInDateTime) {
        LocalDateTime work = LocalDateTime.from(nearestPrecedentEaster);
        long weeks = work.until(liturgicalDayInDateTime, ChronoUnit.WEEKS);
        return (int)weeks;
    }

    private LocalDateTime getNearestPrecedenteaster() {
        if(liturgicalDay.isEasterSunday()) return liturgicalDay.getDateTime();
        LiturgicalDay sundayBefore = getSundayBefore(liturgicalDay);
        while(!sundayBefore.isEasterSunday()) {
            sundayBefore = getSundayBefore(sundayBefore);
        }
        return sundayBefore.getDateTime();
    }

    private LiturgicalDay getSundayBefore(LiturgicalDay day) {
        int dayInterval = 0;
        if(day.isSunday()) {
            dayInterval = 7;
        } else if(day.isSaturday()) {
            dayInterval = 6;
        } else if(day.isFriday()) {
            dayInterval = 5;
        } else if(day.isThursday()) {
            dayInterval = 4;
        } else if(day.isWednesday()) {
            dayInterval = 3;
        } else if(day.isTuesday()) {
            dayInterval = 2;
        } else if(day.isMonday()) {
            dayInterval = 1;
        }
        LocalDateTime dateTime = day.getDateTime();
        dateTime = dateTime.minusDays(dayInterval);
        return new LiturgicalDay(dateTime.getDayOfMonth(), dateTime.getMonthValue(),dateTime.getYear());
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

    public String getCelebrationFormula() {
        if(isSunday()) {
            return "qui est ressuscité des morts, ";
        }
        return EMPTY_STRING;
    }

    public String getParishProtectors() {
        StringBuilder stringBuilder = new StringBuilder();
        for(String countrySaint : countryMainSaints) {
            stringBuilder.append(countrySaint).append(", ");
        }
        for(String protector : protectors) {
            stringBuilder.append(protector).append(", ");
        }
        return stringBuilder.toString();
    }

    public String getSaintsOfCelebrationDay() {
        return " les Saints du jour TODO, ";
    }

    public String getOfficeDate() {
        return liturgicalDay.showDate();
    }

    public boolean isFromEasterToPentecost() {
        return liturgicalDay.isBetweenEasterAndPentecost();
    }

    public boolean withoutPrecedingPrime() {
        return false;
    }
}
