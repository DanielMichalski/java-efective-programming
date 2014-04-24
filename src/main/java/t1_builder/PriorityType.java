package t1_builder;

/**
 * Author: Daniel
 */
public enum PriorityType {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int priority;

    PriorityType(int priority) {
        this.priority = priority;
    }

    public static PriorityType fromValue(int value) {
        PriorityType[] values = PriorityType.values();
        for (PriorityType priorityType : values) {
            if(priorityType.priority == value) {
                return priorityType;
            }
        }
        return null;
    }
}
