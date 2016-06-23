package com.kaala.timestamp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by kaala on 6/23/16.
 */
public class WeekTimeStamp {
    public static List<Long> getStartAndEndTimeStamp(Date date){
        List<Long> list = new ArrayList<>();

        long startTimeStamp = getStartTimeStamp(date);
        long endTimeStamp = getEndTimeStamp(date);

        list.add(startTimeStamp);
        list.add(endTimeStamp);
        return list;
    }

    public static long getStartTimeStamp(Date date){
        Date startDate = getFirstDayOfWeek(date);
        return DayTimeStamp.getStartTimeStamp(startDate);
    }

    public static long getEndTimeStamp(Date date){
        Date startDate = getLastDayOfWeek(date);
        return DayTimeStamp.getEndTimeStamp(startDate);
    }

    public static Date getFirstDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return calendar.getTime();
    }

    public static Date getLastDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        return calendar.getTime();
    }
}
