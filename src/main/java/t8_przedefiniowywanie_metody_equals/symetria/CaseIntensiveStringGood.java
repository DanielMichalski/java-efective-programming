package t8_przedefiniowywanie_metody_equals.symetria;

/**
 * Author: Daniel
 */
public class CaseIntensiveStringGood {
    private String s;

    public CaseIntensiveStringGood(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseIntensiveStringGood
                && s.equalsIgnoreCase(((CaseIntensiveStringGood) o).s);
    }
}
