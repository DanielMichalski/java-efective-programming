package t1_builder;

import javafx.util.Builder;
import org.joda.time.DateTime;

import java.util.Date;

public class Task {
    private String name;
    private Date startDate;
    private Date endDate;
    private DateTime alarmDate;
    private boolean isAlarmSelected;
    private PriorityType priorityType;

    private Task() {}

    @Override
    public String toString() {
        String formattedStartDate = CalendarUtil.formatDate(startDate);
        String formattedEndDate = CalendarUtil.formatDate(endDate);
        String formattedAlarmDate = CalendarUtil.formatDate(alarmDate.toDate());

        final StringBuilder sb = new StringBuilder("Task{");
        sb.append("name='").append(name).append('\'');
        sb.append(", startDate=").append(formattedStartDate);
        sb.append(", endDate=").append(formattedEndDate);
        sb.append(", alarmDate=").append(formattedAlarmDate);
        sb.append(", isAlarmSelected=").append(isAlarmSelected);
        sb.append(", priorityType=").append(priorityType);
        sb.append('}');
        return sb.toString();
    }

    public static class TaskBuilder implements Builder<Task> {
        private String name;
        private Date startDate;
        private Date endDate;
        private DateTime alarmDate;
        private boolean isAlarmSelected;
        private PriorityType priorityType;

        public TaskBuilder(String name) {
            this.name = name;
        }

        public TaskBuilder withStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public TaskBuilder withEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public TaskBuilder withAlarmDate(DateTime alarmDate) {
            this.alarmDate = alarmDate;
            return this;
        }

        public TaskBuilder withIsAlarmSelected(boolean isAlarmSelected) {
            this.isAlarmSelected = isAlarmSelected;
            return this;
        }

        public TaskBuilder withPriorityType(PriorityType priorityType) {
            this.priorityType = priorityType;
            return this;
        }

        @Override
        public Task build() {
            Task task = new Task();

            task.name = name;
            task.startDate = startDate;
            task.endDate = endDate;
            task.alarmDate = alarmDate;
            task.isAlarmSelected = isAlarmSelected;
            task.priorityType = priorityType;

            return task;
        }
    }
}
