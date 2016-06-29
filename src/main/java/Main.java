import com.kaala.timestamp.DayTimeStamp;
import com.kaala.timestamp.MonthTimeStamp;
import com.kaala.timestamp.WeekTimeStamp;
import com.kaala.timestamp.YearTimeStamp;

import java.util.Date;

/**
 * Created by kaala on 6/23/16.
 */
public class Main {
    public static void main(String[] args){
        System.out.println(YearTimeStamp.getStartAndEndDate(new Date()));
        System.out.println(MonthTimeStamp.getStartAndEndDate(new Date()));
        System.out.println(WeekTimeStamp.getStartAndEndDate(new Date()));
        System.out.println(DayTimeStamp.getStartAndEndDate(new Date()));
    }
}
