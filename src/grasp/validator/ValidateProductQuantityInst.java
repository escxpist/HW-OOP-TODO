package grasp.validator;

import grasp.exeption.ItemNotAddedException;
import grasp.items.Product;
import grasp.items.ProductByKilos;
import grasp.items.ProductByQuantity;

/**
 * Pure fabrication class - чиста вигадка
 */
public class ValidateProductQuantityInst implements ValidateProductQuantity{

     public boolean validateKilos(Product product, double kilos) {
        //TODO: написати валідацію, що не можна купити більше, ніж є
         if (product instanceof ProductByKilos) {
             ProductByKilos kilosProduct = (ProductByKilos) product;
             if (kilosProduct.getPresentWeight() < kilos) {
                 throw new ItemNotAddedException("Недостатньо товару. Замовлено(кг): " + kilos +
                         ", Є в наявності: " + kilosProduct.getPresentWeight());
             }
         }
        return true;
    }

     public boolean validateNumber(Product product, int number) {
        //TODO: написати валідацію, що не можна купити більше, ніж є
         if (product instanceof ProductByQuantity) {
             ProductByQuantity quantityProduct = (ProductByQuantity) product;
             if (quantityProduct.getPresenceNumber() < number) {
                 throw new ItemNotAddedException("Недостатньо товару. Замовлено(шт): " + number +
                         ", Є в наявності: " + quantityProduct.getPresenceNumber());
             }
         }
        return true;
    }

    @Override
    public boolean validate(Product product) {
        if (product instanceof ProductByKilos){
            return validateKilos(product, ((ProductByKilos) product).getPresentWeight());
        }else if (product instanceof ProductByQuantity){
            return validateNumber(product, ((ProductByQuantity) product).getPresenceNumber());
        } else throw new UnsupportedOperationException( "No product of your type was found.");
     }
}
