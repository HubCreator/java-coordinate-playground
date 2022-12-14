package coords;

import java.util.List;

public class Line implements AreaStrategy {

    private final List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    @Override
    public double getResult() {
        return Math.sqrt(
                Math.pow(points.get(0).getY() - points.get(1).getY(), 2) +
                        Math.pow(points.get(0).getX() - points.get(1).getX(), 2)
        );
    }
}
