package t8_przedefiniowywanie_metody_equals.simple_types;

/**
 * Author: Daniel
 */
public class SimpleTypesTest {
    public static void main(String[] args) {
        doubleTest();
        floatTest();
    }

    private static void doubleTest() {
        double a = 0.0;
        double b = -0.0;

        long aLong = Double.doubleToLongBits(a);
        long bLong = Double.doubleToLongBits(b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a == b ? " + (aLong == bLong));
    }

    private static void floatTest() {
        float a = 0.0F;
        float b = -0.0F;

        int aInt = Float.floatToIntBits(a);
        int bInt = Float.floatToIntBits(b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a == b ? " + (aInt == bInt));
    }
}
