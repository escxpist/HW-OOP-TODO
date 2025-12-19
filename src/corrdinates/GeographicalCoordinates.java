package corrdinates;

public class GeographicalCoordinates {
    public final int latitude;
    public final int longitude;

    public GeographicalCoordinates(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int transformToOneDimensional() {
        return latitude * longitude;
    }
}
