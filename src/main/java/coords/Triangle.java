package coords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle implements AreaStrategy {
    private final List<Point> points;

    public Triangle(List<Point> points) {
        this.points = points;
    }

    @Override
    public double getResult() {
        return getByHeron(getLines());
    }

    private List<Line> getLines() {
        List<Line> lines = new ArrayList<>();
        points.add(points.get(0));
        for (int index = 0; index < points.size() - 1; index++) {
            lines.add(new Line(Arrays.asList(points.get(index), points.get(index + 1))));
        }
        points.remove(points.get(points.size() - 1));
        return lines;
    }

    private double getByHeron(List<Line> lines) {
        double sum = lines.stream().mapToDouble(Line::getResult)
                .reduce(Double::sum).getAsDouble();
        double s = sum / 2;

        return Math.sqrt(s * (s - lines.get(0).getResult()) * (s - lines.get(1).getResult()) * (s - lines.get(2).getResult()));
    }
}
