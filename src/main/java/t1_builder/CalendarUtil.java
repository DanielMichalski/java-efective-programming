package t1_builder;

import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Author: Daniel
 */
public class CalendarUtil {

    public static Date getSampleStartDateFromCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, 2014);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        return calendar.getTime();
    }

    public static Date getSampleEndDateFromGregorianCalendar() {
        Calendar calendar = new GregorianCalendar(2014, Calendar.JANUARY, 13);
        return calendar.getTime();
    }

    public static DateTime getSampleAlarmDateFromJodaTime() {
        return new DateTime()
                .withDayOfMonth(23)
                .withMonthOfYear(1)
                .withYear(2014);
    }

    public static String formatDate(Date date) {
        if(date == null) return null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        return sdf.format(date);
    }
}
