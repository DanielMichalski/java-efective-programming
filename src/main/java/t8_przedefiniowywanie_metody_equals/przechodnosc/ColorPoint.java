package t8_przedefiniowywanie_metody_equals.przechodnosc;

import java.awt.*;

/**
 * Author: Daniel
 */
public class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Blad - Naruszona symetria
    @Override
    public boolean equals(Object obj) {
        return obj instanceof ColorPoint
                && super.equals(obj)
                && ((ColorPoint) obj).color == color;
    }

}
