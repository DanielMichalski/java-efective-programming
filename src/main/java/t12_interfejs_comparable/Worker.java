package t12_interfejs_comparable;

import java.math.BigDecimal;

/**
 * Author: Daniel
 */
public class Worker implements Comparable<Worker> {
    private String name;
    private String surname;
    private BigDecimal salary;

    public Worker(String name, String surname, BigDecimal salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Worker o) {
        return salary.compareTo(o.salary);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Worker{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
