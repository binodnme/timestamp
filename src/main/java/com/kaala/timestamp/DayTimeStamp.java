package com.kaala.timestamp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by kaala on 6/23/16.
 */
public class DayTimeStamp {

    public static List<Long> getStartTimeStamp(Date date) {
        List<Long> startAndEndTimestamp = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        long startTimeStamp = calendar.getTimeInMillis();

        calendar.add(Calendar.DAY_OF_MONTH, 1);
        long endTimeStamp = calendar.getTimeInMillis();

        startAndEndTimestamp.add(startTimeStamp);
        startAndEndTimestamp.add(endTimeStamp);

        return startAndEndTimestamp;
    }
}
