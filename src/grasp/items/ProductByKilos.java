package grasp.items;

public class ProductByKilos extends Product{
    private double weight;
    private double presentWeight;

    public ProductByKilos(String name, double price, double presenceKilos) {
        super(name, price);
        this.presentWeight = presenceKilos;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPresentWeight() {
        return presentWeight;
    }

    public void setPresentWeight(double presentWeight) {
        this.presentWeight = presentWeight;
    }
}
