package t8_przedefiniowywanie_metody_equals.przechodnosc;

/**
 * Author: Daniel
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) return false;

        Point p = (Point) obj;
        return x == p.x && y == p.y;
    }
}
