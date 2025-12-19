package grasp.validator;
import grasp.items.Product;

public interface ValidateProductQuantity {
    boolean validate(Product product);

    boolean validateNumber(Product product, int number);
    boolean validateKilos(Product product, double kilos);
}
