package com.kaala.timestamp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by kaala on 6/23/16.
 */
public class YearTimeStamp {
    public static List<Long> getStartAndEndTimeStamp(Date date) {
        List<Long> list = new ArrayList<>();

        long startTimeStamp = getStartTimeStamp(date);
        long endTimeStamp = getEndTimeStamp(date);

        list.add(startTimeStamp);
        list.add(endTimeStamp);
        return list;
    }

    public static long getStartTimeStamp(Date date){
        Date startDate = getFirstDayOfYear(date);
        return DayTimeStamp.getStartTimeStamp(startDate);
    }

    public static long getEndTimeStamp(Date date){
        Date startDate = getLastDayOfYear(date);
        return DayTimeStamp.getEndTimeStamp(startDate);
    }


    public static Date getFirstDayOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    public static Date getLastDayOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }
}
