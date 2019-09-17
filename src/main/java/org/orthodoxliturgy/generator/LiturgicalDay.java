package org.orthodoxliturgy.generator;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class LiturgicalDay {

    private int day;
    private int month;
    private int year;

    public LiturgicalDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean isSpecificDay(DayOfWeek dayOfWeek) {
        LocalDateTime localDate = getLocalDateTimeOfThisLiturgicalDay();
        return localDate.getDayOfWeek().equals(dayOfWeek);
    }

    public boolean isSunday() {
        return isSpecificDay(DayOfWeek.SUNDAY);
    }

    public boolean isWednesday() {
        return isSpecificDay(DayOfWeek.WEDNESDAY);
    }

    public boolean isFriday() {
        return isSpecificDay(DayOfWeek.FRIDAY);
    }

    public boolean isMonday() {
        return isSpecificDay(DayOfWeek.MONDAY);
    }

    public boolean isTuesday() {
        return isSpecificDay(DayOfWeek.TUESDAY);
    }

    public boolean isThursday() {
        return isSpecificDay(DayOfWeek.THURSDAY);
    }

    public boolean isSaturday() {
        return isSpecificDay(DayOfWeek.SATURDAY);
    }

    public boolean isEasterSunday() {
        LocalDateTime easterForYear = getEasterDateByYear(year);
        return easterForYear.getYear() == year && easterForYear.getMonthValue() == month && easterForYear.getDayOfMonth() == day;
    }

    private LocalDateTime getEasterDateByYear(int year) {
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int d = (19 * a + 15) % 30;
        int e = (2 * b + 4 * c + 6 * d + 6) % 7;
        int f = d + e;
        LocalDateTime easterForYear = null;
        if (f <= 9) {
            LocalDateTime march22 = LocalDateTime.of(year, 3, 22, 1, 1);
            easterForYear = march22.plusDays(f);
        } else {
            LocalDateTime april9 = LocalDateTime.of(year, 4, f, 1, 1);
            easterForYear = april9.minusDays(9);
        }
        easterForYear = easterForYear.plusDays(13);
        return easterForYear;
    }

    public boolean isInBigFeast() {
        LocalDateTime easterDateByYear = getEasterDateByYear(year);
        LocalDateTime beginningOfBigFeast = easterDateByYear.minusDays(42);
        LocalDateTime endOfBigFeast = easterDateByYear.minusDays(7);
        LocalDateTime thisDay = getLocalDateTimeOfThisLiturgicalDay();
        return (thisDay.isAfter(beginningOfBigFeast) || thisDay.equals(beginningOfBigFeast))&& thisDay.isBefore(endOfBigFeast);
    }

    private LocalDateTime getLocalDateTimeOfThisLiturgicalDay() {
        LocalDateTime localDate = LocalDateTime.of(year, month, day, 01, 01);
        return localDate;
    }

    @Override
    public String toString() {
        return "LiturgicalDay{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

}
