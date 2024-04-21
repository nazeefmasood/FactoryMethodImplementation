package examples;

public class TabletConcreteFactory extends ProductAbstractFactory {
    @Override
    protected IProduct makeProduct() {
        IProduct product = new Tablet();
        product.setPrice(200);
        product.setColor("Black");
        return product;
    }
}