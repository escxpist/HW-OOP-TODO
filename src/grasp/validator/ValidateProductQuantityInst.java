package grasp.validator;

import grasp.items.Product;
import grasp.items.ProductByKilos;
import grasp.items.ProductByQuantity;

/**
 * Pure fabrication class - чиста вигадка
 */
public class ValidateProductQuantityInst implements ValidateProductQuantity{

     public boolean validateKilos(Product product, double kilos) {
        //TODO: написати валідацію, що не можна купити більше, ніж є
        return true;
    }

     public boolean validateNumber(Product product, int number) {
        //TODO: написати валідацію, що не можна купити більше, ніж є
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
