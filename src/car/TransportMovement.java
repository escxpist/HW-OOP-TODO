package car;

import corrdinates.GeographicalCoordinates;

public interface TransportMovement {
    boolean drive(int speed, GeographicalCoordinates direction);

    boolean drive(int speed, int direction);
    boolean stop();
}
