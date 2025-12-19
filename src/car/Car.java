package car;

import corrdinates.GeographicalCoordinates;

public abstract class Car implements TransportMovement {
    public static final String KM_H = "km/h";
    public static final String M_H = "m/h";
    public String owner;

    public Car() {
        System.out.println("Abstract Car created");
    }
    public Car(String owner) {
        System.out.println("Abstract Car created");
        this.owner = owner;
    }

    /**
     * Overloading drive
     * @param speed
     * @param direction
     * @return
     */
    @Override
    public boolean drive(int speed, GeographicalCoordinates direction) {
        return drive(speed, direction.transformToOneDimensional());
    }

    @Override
    public boolean drive(int speed, int direction) {
        System.out.println(this.getClass().getName() + " drives");
        boolean hasFuel = givePower(speed, KM_H);
        boolean hasEngineOn = turnOnEngine();
        boolean isNotOnBreak = unstop();
        boolean isGearOn = turnOnGear();
        boolean areBeltsFastened = fastenBelts();
        System.out.println("----------------------");
        return hasFuel && hasEngineOn && isNotOnBreak && isGearOn && areBeltsFastened;
    }

    public abstract boolean givePower(int speed, String units);

    public boolean fastenBelts() {
        System.out.println("Betls are fastened");
        return true;
    }

    public abstract boolean turnOnEngine();

    public abstract boolean turnOnGear();

    public boolean unstop() {
        return isLegBreakOn() && isHandBreakOn();
    }

    private boolean isHandBreakOn() {
        return true;
    }

    protected boolean isLegBreakOn() {
        return true;
    }

    @Override
    public boolean stop() {
        System.out.println("Car stops");
        throw new UnsupportedOperationException("Not implemented");
    }
}
