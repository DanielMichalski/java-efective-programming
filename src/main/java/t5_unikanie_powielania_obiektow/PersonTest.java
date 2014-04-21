package t5_unikanie_powielania_obiektow;

import java.util.Date;

/**
 * Author: Daniel
 */
public class PersonTest {
    public static void main(String[] args) {
        createPeopleBaad();
        createPeopleGood();
    }

    private static void createPeopleBaad() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            PersonBaad personBaad = new PersonBaad(new Date());
            personBaad.isBabyBoomer();
        }
        long end = System.currentTimeMillis();

        System.out.println("time: " + (end - start));
    }

    private static void createPeopleGood() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            PersonGood personGood = new PersonGood(new Date());
            personGood.isBabyBoomer();
        }
        long end = System.currentTimeMillis();

        System.out.println("time: " + (end - start));
    }
}
