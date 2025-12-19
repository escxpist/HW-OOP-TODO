package house;

public class House {

    private final String color;
    private double size;
    private HouseWindow window;
    private static String address;
    private int roomNumber;
    private int bathRoomNumber;

//    public House() {
//        System.out.println("House is created");
//    }

    public House(String color, double size, int roomNumber, int bathRoomNumber) {
        this.color = color;
        this.size = size;
        this.roomNumber = roomNumber;
        this.bathRoomNumber = bathRoomNumber;
        this.window = new HouseWindow();
        window.setHeight(10);
        window.setWidth(20);
    }

    public String getColor() {
        return color;
    }

  /*  public void setColor(String color) {
        this.color = color;
    }
*/
    public static void anotherStatic(int i) {
        System.out.println("i = " + i);
    }
    public void anotherMethod() {

    }

    public void run(){
        anotherMethod();
        anotherStatic(1);
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", window=" + window +
                ", roomNumber=" + roomNumber +
                ", bathRoomNumber=" + bathRoomNumber +
                '}';
    }
}
