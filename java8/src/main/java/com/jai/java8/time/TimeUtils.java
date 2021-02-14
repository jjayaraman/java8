package com.jai.java8.time;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.time.temporal.IsoFields;

public class TimeUtils {


    public static long findNumberOfQuarters(LocalDate d1, LocalDate d2) {
        System.out.println(d1.getMonth().getValue());
        System.out.println(d1.getMonth().getValue() % 3);
        int month = d1.getMonth().getValue() + (d1.getMonth().getValue() % 3) - 1;
        System.out.println(month);
        if (d1.getMonth().getValue() % 3 != 0) {
            d1 = d1.withMonth(month);
        }
        d1 = d1.withDayOfMonth(28);
        d2 = d2.withDayOfMonth(1);

        return IsoFields.QUARTER_YEARS.between(d1, d2);
    }
}
