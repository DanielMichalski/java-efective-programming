package t8_przedefiniowywanie_metody_equals.symetria;

/**
 * Author: Daniel
 */
public class CaseIntensiveStringBad {
    private String s;

    public CaseIntensiveStringBad(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseIntensiveStringBad) {
            return s.equalsIgnoreCase(((CaseIntensiveStringBad) o).s);
        }
        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }
}
