package examples;

public abstract class ProductAbstractFactory {
    protected abstract IProduct makeProduct();
    public IProduct getObject() {
        return this.makeProduct();
    }
}