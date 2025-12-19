package grasp.items;

import grasp.validator.ValidateProductQuantity;

public class OrderItem {
    private Product product;
    private int number;
    private double kilos;
    //TODO: треба булоб прибрати залежність від реалізації інтерфейсу, а зробити залежність від абстракції
//    private final ValidateProductQuantityInst validateProductQuantity = new ValidateProductQuantityInst();
    //To get rid of high coupling, та раннього зв’язування, use dependency inversion of control we put this parameter in a constructor
    private final ValidateProductQuantity validateProductQuantity;// = new ValidateProductQuantityInst();

    public OrderItem(Product product, ValidateProductQuantity validateProductQuantity){
        this.validateProductQuantity = validateProductQuantity;
        this.validateProductQuantity.validate(product);
    }

    public OrderItem(Product product, int number, ValidateProductQuantity validateProductQuantity) {
        this.product = product;
        this.number = number;
        this.validateProductQuantity = validateProductQuantity;
        this.validateProductQuantity.validate(product);
      //  validateProductQuantity.validateNumber(product, number);
    }

    public OrderItem(Product product, double kilos, ValidateProductQuantity validateProductQuantity) {
        this.product = product;
        this.validateProductQuantity = validateProductQuantity;
        this.kilos = kilos;
        this.validateProductQuantity.validate(product);
     //   validateProductQuantity.validateKilos(product, kilos);
    }

/* this all was overriden by using Polymorphism; if-else - замінені поліморфізмом, до цього треба наближатись в ООП програмуванні.
Застосовується поліморфізм на рівні різних видів продуктів, які забороняють наявність створити продукт не з тими параметрами,
а також на рівні конструкторів, які вимагають тільки певні
    public OrderItem(Product product, int number, double kilos) {
        this.product = product;
        this.number = number;

        validateNumbers(product, number, kilos);
    }

    private void validateNumbers(Product product, int number, double kilos) {
        if (product instanceof ProductByKilos){
            validateKilos(product, kilos);
        }else if (product instanceof ProductByQuantity){
            validateNumber(product, number);
        } else throw new UnsupportedOperationException( "No product of your type was found.");
    }

    private boolean validateTrhoughIfs(Product product, int number, double kilos){
        if (kilos > 0 && number > 0){
            throw new ItemNotAddedException("Please specify either the number or kilograms for product: " + product);
        }else if (number > 0) {
            return validateNumber(product, number);
        } else if (kilos > 0) {
            return validateKilos(product, kilos);
        } else if (kilos <= 0 && number <= 0) {
            throw new ItemNotAddedException("Please specify the number or kilograms for product: " + product);
        } else {
            throw new ItemNotAddedException("Please specify correct number or kilograms for product: " + product);
        } ,mmmk//L</;hbnkhfuy
    }*/
    public double countPrice(){
        return number * product.getPrice();
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "product=" + product +
                ", number=" + number +
                '}';
    }

    public Product getProduct() {
        return product;
    }

    public int getNumber() {
        return number;
    }

    public double getKilos() {
        return kilos;
    }
}
