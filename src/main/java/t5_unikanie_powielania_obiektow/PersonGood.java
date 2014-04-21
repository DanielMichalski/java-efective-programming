package t5_unikanie_powielania_obiektow;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Author: Daniel
 */
public class PersonGood {
    private final Date birthDate;

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar calendar = Calendar.getInstance(
                TimeZone.getTimeZone("GMT"));

        calendar.set(1946, Calendar.JANUARY, 1);
        BOOM_START = calendar.getTime();

        calendar.set(1965, Calendar.JANUARY, 1);
        BOOM_END = calendar.getTime();
    }

    public PersonGood(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0
                && birthDate.compareTo(BOOM_END) <= 0;
    }
}
