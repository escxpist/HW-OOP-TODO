package grasp.items;

public class ProductByQuantity extends Product{
    private int presenceNumber;
    private String color;

    public ProductByQuantity(String name, double price, int presenceNumber) {
        super(name, price);
        this.presenceNumber = presenceNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getPresenceNumber() {
        return presenceNumber;
    }

    public void setPresenceNumber(int presenceNumber) {
        this.presenceNumber = presenceNumber;
    }

}
