package com.avandal.cdb.mapper;

import java.time.LocalDate;

public class DateMapper {
    public static String toString(LocalDate date) {
        if (date == null) {
            return null;
        }

        return date.toString();
    }

    public static LocalDate toDate(String date) {
        if (date == null) {
            return null;
        }

        return LocalDate.parse(date);
    }
}
