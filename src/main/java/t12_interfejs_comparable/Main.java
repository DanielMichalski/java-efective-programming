package t12_interfejs_comparable;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author: Daniel
 */
public class Main {
    public static void main(String[] args) {
        Set<Worker> workers = new TreeSet<>();

        workers.add(new Worker("Jan", "Kowalski", new BigDecimal(15000)));
        workers.add(new Worker("Tomasz", "Malinowskiski", new BigDecimal(5000)));
        workers.add(new Worker("Józef", "Galicki", new BigDecimal(10000)));

        for (Worker worker : workers) {
            System.out.println("worker = " + worker);
        }
    }
}
