package car;

public class ElectricCar extends Car {

    public ElectricCar(String owner) {
        super(owner);
        System.out.println("Electric Car created for " + owner);
    }

    public boolean reparkRemotely(int place) {
        System.out.println("I repark remotely in place " + place);
        return true;
    }
    @Override
    public boolean givePower(int speed, String units) {
        System.out.println("Give electric power to provide " + speed + " " + units);
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
