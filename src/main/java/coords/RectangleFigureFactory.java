package coords;

import java.util.List;

public class RectangleFigureFactory implements FigureCreator{

    @Override
    public Figure create(List<Point> points) {
        return new Rectangle(points);
    }
}
