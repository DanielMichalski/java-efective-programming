package t9_metoda_hashcode_oraz_equals;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Daniel
 */
public class PhoneNumberTest {
    public static void main(String[] args) {
        Map<PhoneNumber, String> m =
                new HashMap<>();

        PhoneNumber pn = new PhoneNumber(408, 867, 5309);
        m.put(pn, "Jenny");

        // jesli nie ma hashcode w PhoneNumber to zwroci null
        System.out.println(m.get(new PhoneNumber(408, 867, 5309)));

        System.out.println(pn);
    }
}
