package com.jai.java8.time;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TimeUtilsTest {

    @Test
    public void findNumberOfQuarters() {
        LocalDate d1, d2;
//        d1 = LocalDate.of(2019, 11, 16);
//        d2 = LocalDate.of(2020, 6, 26);
//        assertEquals(1, TimeUtils.findNumberOfQuarters(d1, d2));

        d1 = LocalDate.of(2019, 10, 16);
        d2 = LocalDate.of(2020, 6, 26);
        assertEquals(1, TimeUtils.findNumberOfQuarters(d1, d2));

//        d1 = LocalDate.of(2019, 12, 16);
//        d2 = LocalDate.of(2020, 7, 26);
//        assertEquals(2, TimeUtils.findNumberOfQuarters(d1, d2));
//
//        d1 = LocalDate.of(2019, 11, 16);
//        d2 = LocalDate.of(2020, 7, 26);
//        assertEquals(2, TimeUtils.findNumberOfQuarters(d1, d2));
    }
}