package patterns.strategy;

public interface Discount {
	public boolean ofType(ClientType clientType);
	public double getDiscount(double value);
}
