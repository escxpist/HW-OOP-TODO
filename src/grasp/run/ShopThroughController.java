package grasp.run;

import grasp.controller.OrderController;
import grasp.items.*;
import grasp.validator.ValidateProductQuantity;
import grasp.validator.ValidateProductQuantityInst;

import java.util.Arrays;
import java.util.List;

public class ShopThroughController {
    public static void main(String[] args) {
        ProductByQuantity socks = new ProductByQuantity("Socks", 40.0, 20);
        ProductByKilos mango = new ProductByKilos("Mango", 200, 10);

        ValidateProductQuantity validateProductQuantity = new ValidateProductQuantityInst();
        OrderItem buySocks = new OrderItem(socks, 5, validateProductQuantity);
        OrderItem buyMango = new OrderItem(mango, 2, validateProductQuantity);

        List<OrderItem> orderItems = Arrays.asList(buyMango, buySocks);

        OrderController orderController = new OrderController();
        Order myOrder = orderController.createOrder(orderItems);

        System.out.println("Total cost with items: " + myOrder.countPrice() + "\n Order Items: " + myOrder.toString());

        orderController.cancelOrder(myOrder);
        System.out.println("Total cost items removed: " + myOrder.countPrice());
    }
}
