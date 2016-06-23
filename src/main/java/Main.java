import com.kaala.timestamp.DayTimeStamp;
import com.kaala.timestamp.MonthTimeStamp;
import com.kaala.timestamp.YearTimeStamp;

import java.util.Date;
import java.util.List;

/**
 * Created by kaala on 6/23/16.
 */
public class Main {
    public static void main(String[] args){
//        System.out.println(YearTimeStamp.getStartAndEndTimeStamp(new Date()));
//        System.out.println(DayTimeStamp.getStartAndEndTimeStamp(new Date()));
        System.out.println(MonthTimeStamp.getStartAndEndTimeStamp(new Date()));
    }
}
