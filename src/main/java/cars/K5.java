package cars;

public class K5 extends Car {

    public K5(int mileage) {
        super(mileage);
    }

    @Override
    double getDistancePerLiter() {
        return 13d;
    }

    @Override
    double getTripDistance() {
        return mileage;
    }

    @Override
    String getName() {
        return "K5";
    }
}
