package grasp.controller;

import grasp.items.Order;
import grasp.items.OrderItem;

import java.util.List;

public class OrderController {
    public Order createOrder(List<OrderItem> orderItems){
        return new Order(orderItems);
    }

    public boolean cancelOrder(Order order){
        return order.cancel();
    }

    //TODO: додати метод для додавання одного айтему до ордеру
    public boolean addItemToOrder(Order order, OrderItem orderItem){
        return order.addItem(orderItem);
    }
}
