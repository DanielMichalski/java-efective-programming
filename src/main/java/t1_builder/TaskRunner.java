package t1_builder;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Author: Daniel
 */
public class TaskRunner {
    public static void main(String[] args) {
        Date startDate = CalendarUtil.getSampleStartDateFromCalendar();
        Date endDate = CalendarUtil.getSampleEndDateFromGregorianCalendar();
        DateTime alarmDate = CalendarUtil.getSampleAlarmDateFromJodaTime();

        Task task = new Task.TaskBuilder("nazwa")
                .withStartDate(startDate)
                .withEndDate(endDate)
                .withAlarmDate(alarmDate)
                .build();

        System.out.println(task);
    }


}
