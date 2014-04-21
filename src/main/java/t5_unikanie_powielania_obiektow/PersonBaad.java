package t5_unikanie_powielania_obiektow;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Author: Daniel
 */
public class PersonBaad {
    private final Date birthDate;

    public PersonBaad(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer() {
        Calendar calendar = Calendar.getInstance(
                TimeZone.getTimeZone("GMT"));

        calendar.set(1946, Calendar.JANUARY, 1);
        Date boomStart = calendar.getTime();

        calendar.set(1965, Calendar.JANUARY, 1);
        Date boomEnd = calendar.getTime();
        return birthDate.compareTo(boomStart) >= 0
                && birthDate.compareTo(boomEnd) <= 0;

    }
}
