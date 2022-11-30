package cars;

public class Avante extends Car {
    public Avante(int mileage) {
        super(mileage);
    }

    @Override
    double getDistancePerLiter() {
        return 15d;
    }

    @Override
    double getTripDistance() {
        return mileage;
    }

    @Override
    String getName() {
        return "Avante";
    }
}
