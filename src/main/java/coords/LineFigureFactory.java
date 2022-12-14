package coords;

import java.util.List;

public class LineFigureFactory implements FigureCreator {

    @Override
    public Figure create(List<Point> points) {
        return new Line(points);
    }
}
