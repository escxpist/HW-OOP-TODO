package grasp.items;

public class Product2 {
    private final String name;
    private double price;
    private int presenceInItems;
    private int presenceInKilos;
    private String color;
    private double weight;

    public Product2(String name, double price, int presenceInItems) {
        this.name = name;
        this.price = price;
        this.presenceInItems = presenceInItems;
    }

    public Product2(String name, double price, int presenceInKilos, double weight) {
        this.name = name;
        this.price = price;
        this.presenceInKilos = presenceInKilos;
        this.weight = weight;
        this.presenceInItems = 0;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getPresenceInItems() {
        return presenceInItems;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", presenceNumber=" + presenceInItems +
                '}';
    }
}
