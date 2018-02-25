package behavioral.strategy;

public class MasterDiscount implements Discount {

	@Override
	public boolean ofType(ClientType clientType) {
		return ClientType.Master == clientType;
	}

	@Override
	public double getDiscount(double value) {
		return value * 0.2;
	}

}
