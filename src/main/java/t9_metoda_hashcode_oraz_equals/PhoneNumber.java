package t9_metoda_hashcode_oraz_equals;

/**
 * Author: Daniel
 */
public class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "nr kierunkowy");
        rangeCheck(prefix, 999, "prefiks");
        rangeCheck(lineNumber, 9999, "numer lini");

        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + ": " + arg);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof PhoneNumber)) return false;

        PhoneNumber pn = (PhoneNumber) obj;
        return areaCode == pn.areaCode
                && prefix == pn.prefix
                && lineNumber == pn.lineNumber;
    }

    @Override
    public int hashCode() {
        int result = (int) areaCode;
        result = 31 * result + (int) prefix;
        result = 31 * result + (int) lineNumber;
        return result;
    }
}
