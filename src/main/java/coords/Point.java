package coords;

import java.util.Objects;

public class Point {

    private final int y;
    private final int x;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return y == point.y && x == point.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }

    public boolean isSameX(Point point) {
        return this.x == point.x;
    }

    public boolean isSameY(Point point) {
        return this.y == point.y;
    }
}
