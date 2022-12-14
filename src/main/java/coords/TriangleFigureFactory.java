package coords;

import java.util.List;

public class TriangleFigureFactory implements FigureCreator{
    @Override
    public Figure create(List<Point> points) {
        return new Triangle(points);
    }
}
