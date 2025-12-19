package car;

import java.util.ArrayList;
import java.util.List;

public class RunCar {
    public static void main(String[] args) {
        Car myfuelCar = new FuelCar("Masha");
        myfuelCar.drive(10, 20);
        Car myCarElectricCar = new ElectricCar("John");
        myCarElectricCar.drive(10, 20);

        ElectricCar myElectricCar = new ElectricCar("Kolia");
        myElectricCar.reparkRemotely(123);

        List<Car> myCars = new ArrayList<>();
        myCars.add(myfuelCar);
        myCars.add(myCarElectricCar);
        myCars.add(myElectricCar);

        for (Car myCar : myCars) {
            myCar.drive(50, 20);
        }

    }
}
