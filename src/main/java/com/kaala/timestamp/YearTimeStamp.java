package com.kaala.timestamp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by kaala on 6/23/16.
 */
public class YearTimeStamp {
    public static List<Long> getStartAndEndTimeStamp(int year) {
        List<Long> list = new ArrayList<>();

        Date startDate = getLastDayOfYear(year);

        DayTimeStamp.getStartTimeStamp(startDate);
        return DayTimeStamp.getStartTimeStamp(startDate);
    }

    public static Date getFirstDayOfYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    public static Date getLastDayOfYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }
}
