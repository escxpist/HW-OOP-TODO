package grasp.run;

import grasp.items.*;
import grasp.validator.ValidateProductQuantity;
import grasp.validator.ValidateProductQuantityInst;

public class Shop {
    public static void main(String[] args) {

        ValidateProductQuantity validateProductQuantity = new ValidateProductQuantityInst();

        ProductByQuantity socks = new ProductByQuantity("Socks", 40.0, 20);
        ProductByKilos mango = new ProductByKilos("Mango", 200, 10);

        OrderItem buySocks = new OrderItem(socks, 5, validateProductQuantity);
        OrderItem buyMango = new OrderItem(mango, 2, validateProductQuantity);

        Order myOrder = new Order();
        myOrder.addItem(buySocks);
        myOrder.addItem(socks, 1);
        myOrder.addItem(buyMango);

        double orderPrice = myOrder.countPrice();

        System.out.println("Total cost: " + orderPrice);
    }
}
