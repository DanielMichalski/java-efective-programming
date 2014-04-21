package t8_przedefiniowywanie_metody_equals.symetria;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
public class CaseIntensiveStringTest {
    public static void main(String[] args) {
        badTest();
        goofTest();
    }

    private static void badTest() {
        List<CaseIntensiveStringBad> list =
                new ArrayList<CaseIntensiveStringBad>();

        list.add(new CaseIntensiveStringBad("Polish"));
        list.add(new CaseIntensiveStringBad("polish"));


        System.out.println("Contains 'Polish'? " + list.contains(new CaseIntensiveStringBad("Polish")));
        System.out.println("Contains 'polish'? " + list.contains(new CaseIntensiveStringBad("polish")));
        System.out.println("Contains 'polish'? " + list.contains("Polish"));
        System.out.println("Contains 'polish'? " + list.contains("polish"));
    }

    private static void goofTest() {
        List<CaseIntensiveStringGood> list =
                new ArrayList<CaseIntensiveStringGood>();

        list.add(new CaseIntensiveStringGood("Polish"));
        list.add(new CaseIntensiveStringGood("polish"));


        System.out.println("Contains 'Polish'? " + list.contains(new CaseIntensiveStringGood("Polish")));
        System.out.println("Contains 'polish'? " + list.contains(new CaseIntensiveStringGood("polish")));
        System.out.println("Contains 'polish'? " + list.contains("Polish"));
        System.out.println("Contains 'polish'? " + list.contains("polish"));
    }
}
