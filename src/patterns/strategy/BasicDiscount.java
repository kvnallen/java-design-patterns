package patterns.strategy;

public class BasicDiscount implements Discount {

	@Override
	public boolean ofType(ClientType clientType) {
		return clientType == ClientType.Basic;
	}

	@Override
	public double getDiscount(double value) {
		return value * 0.1;
	}

}
