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

    public boolean isSunday() {
        LocalDateTime localDate = LocalDateTime.of(year,month,day,01,01);
        return localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }
}
