package com.kaala.timestamp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by kaala on 6/23/16.
 */
public class DayTimeStamp {

    public static List<Long> getStartAndEndTimeStamp(Date date) {
        List<Long> startAndEndTimestamp = new ArrayList<>();

        long startTimeStamp = getStartTimeStamp(date);
        long endTimeStamp = getEndTimeStamp(date);

        startAndEndTimestamp.add(startTimeStamp);
        startAndEndTimestamp.add(endTimeStamp);

        return startAndEndTimestamp;
    }

    public static long getStartTimeStamp(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();

    }

    public static long getEndTimeStamp(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }
}
