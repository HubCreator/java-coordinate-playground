package coords;

import java.util.List;

public class FigureProducer {
    private final Figure figure;

    public FigureProducer(List<Point> points, FigureCreator figureCreator) {
        this.figure = figureCreator.create(points);
    }

    public double getDistance() {
        return figure.getResult();
    }
}
