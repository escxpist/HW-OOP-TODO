package grasp.items;

import grasp.validator.ValidateProductQuantityInst;

import java.util.ArrayList;
import java.util.List;

public class Order {
    /*
    Informational expert
     */
    private List<OrderItem> orderItems;

    public Order(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Order() {
        this.orderItems = new ArrayList<OrderItem>();
    }

    public double countPrice(){
        double result = 0;
        for (OrderItem orderItem : orderItems) {
            result += orderItem.countPrice();
        }
        return result;
    }

    /*
    Creator + method polymorphism
     */
    public boolean addItem(OrderItem orderItem){
        //TODO: оновити кількість товарів після їх додавання до ордеру
        changeStock(orderItem, false);
        this.orderItems.add(orderItem);
        return true;
    }

    public boolean addItem(Product product, int number) {
        //TODO: оновити кількість товарів після їх додавання до ордеру;
        OrderItem newItem = new OrderItem(product, number, new ValidateProductQuantityInst());
        return addItem(newItem);
    }
        //TODO: розібратись з додаванням товарів на кілограми
    public boolean addItem(Product product, double kilos){
            OrderItem newItem = new OrderItem(product, kilos, new ValidateProductQuantityInst());
            return addItem(newItem);
    }

    public boolean cancel() {
        //TODO: оновити кількість товарів перед їх вилученням з ордеру
        for (OrderItem item : orderItems) {
            changeStock(item, true);
        }
        this.orderItems.clear();
        return true;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderItems=" + orderItems +
                '}';
    }

    private void changeStock(OrderItem item, boolean isRestoring) {
        Product product = item.getProduct();

        if (product instanceof ProductByQuantity) {
            ProductByQuantity quantityProduct = (ProductByQuantity) product;

            int currentStock = quantityProduct.getPresenceNumber();
            int amount = item.getNumber();

            if (isRestoring) {
                quantityProduct.setPresenceNumber(currentStock + amount);
            } else {
                quantityProduct.setPresenceNumber(currentStock - amount);
            }
        }
        else if (product instanceof ProductByKilos) {
            ProductByKilos kilosProduct = (ProductByKilos) product;
            double currentWeight = kilosProduct.getPresentWeight();
            double amount = item.getKilos();
            if (isRestoring) {
                kilosProduct.setPresentWeight(currentWeight + amount);
            } else {
                kilosProduct.setPresentWeight(currentWeight - amount);
            }
        }
    }
}
