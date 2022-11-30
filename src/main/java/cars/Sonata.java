package cars;

public class Sonata extends Car {
    public Sonata(int mileage) {
        super(mileage);
    }

    @Override
    double getDistancePerLiter() {
        return 10d;
    }

    @Override
    double getTripDistance() {
        return mileage;
    }

    @Override
    String getName() {
        return "Sonata";
    }
}
