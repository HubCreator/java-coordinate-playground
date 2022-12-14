package coords;

import java.util.List;

@FunctionalInterface
public interface FigureCreator {
    Figure create(List<Point> points);
}
