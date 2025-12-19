package car;

import java.sql.SQLOutput;

public class FuelCar extends Car {

    public FuelCar(String owner) {
        super(owner);
        System.out.println("Fuel Car created for " + owner);
    }

    @Override
    public boolean givePower(int speed, String units) {
        System.out.println("Give fuel to provide " + speed + "  " + units);
        return true;
    }

    @Override
    public boolean turnOnEngine() {
        return false;
    }

    @Override
    public boolean turnOnGear() {
        return false;
    }
}
