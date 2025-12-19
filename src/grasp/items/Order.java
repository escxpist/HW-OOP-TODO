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
        this.orderItems.add(orderItem);
        return true;
    }

    public boolean addItem(Product product, int number){
        //TODO: оновити кількість товарів після їх додавання до ордеру;
        //TODO: розібратись з додаванням товарів на кілограми
        this.orderItems.add(new OrderItem(product, number, new ValidateProductQuantityInst()));
        return true;
    }

    public boolean cancel() {
        //TODO: оновити кількість товарів перед їх вилученням з ордеру
        this.orderItems = new ArrayList<OrderItem>();
        return true;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderItems=" + orderItems +
                '}';
    }
}
