package coords;

import java.util.Arrays;
import java.util.List;

public class Rectangle implements DistanceStrategy {
    private final List<Point> points;

    public Rectangle(List<Point> points) {
        this.points = points;
    }

    @Override
    public double getDistance() {
        Point target = points.get(0);
        Line horizontal = getHorizontal(target);
        Line vertical = getVertical(target);

        return horizontal.getDistance() * vertical.getDistance();
    }

    private Line getHorizontal(Point target) {
        Line result = null;
        for (int i = 1; i < points.size(); i++) {
            if (target.isSameX(points.get(i))) {
                result = new Line(Arrays.asList(target, points.get(i)));
            }
        }
        return result;
    }

    private Line getVertical(Point target) {
        Line result = null;
        for (int i = 1; i < points.size(); i++) {
            if (target.isSameY(points.get(i))) {
                result = new Line(Arrays.asList(target, points.get(i)));
            }
        }
        return result;
    }
}
