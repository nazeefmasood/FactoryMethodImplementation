package examples;

public class PhoneConcreteFactory extends ProductAbstractFactory {
    @Override
    protected IProduct makeProduct() {
        IProduct product = new Phone();
        product.setPrice(20.30);
        product.setColor("Blue");
        return product;
    }
}