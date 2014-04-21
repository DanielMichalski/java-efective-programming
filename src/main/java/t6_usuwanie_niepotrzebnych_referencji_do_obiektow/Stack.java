package t6_usuwanie_niepotrzebnych_referencji_do_obiektow;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Author: Daniel
 */
public class Stack implements IStack<String> {
    private String[] elements;

    private int size = 0;

    public Stack(int initialCapity) {
        this.elements = new String[initialCapity];
    }

    @Override
    public void push(String e) {
        ensureCapity();
        elements[size++] = e;
    }

    @Override
    public String pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        String result = elements[--size];
        elements[size] = null;                      // bez tego program nie usunie nieuzytkow poniewaz referensje zostana
        return result;
    }

    /**
     * Zapewnienie miejsca na co najmniej jeden element przy
     * dwukrotnym zwiększeniu rozmiaru tablicy za każdym razem,
     * gdy musi być powiększona
     */
    private void ensureCapity() {
        if (elements.length == size) {
            System.out.println("ensureCapity() called");
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
