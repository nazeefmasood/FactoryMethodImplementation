package examples;

public class Phone implements IProduct {
    private double price;
    private String color;
    
    @Override
    public String getName() {
        return "Apple TouchPad";
    }

    @Override
    public boolean setPrice(double price) {
        this.price = price;
        return true;
    }
    public double getPrice() {
        return price;
    }

	@Override
	public String setColor(String color) {
		return this.color = color;
	}
	public String getColor() {
        return color;
    }
}