package patterns.strategy;

public class BigDiscount implements Discount{

	@Override
	public boolean ofType(ClientType clientType) {
		return clientType == ClientType.Special;
	}

	@Override
	public double getDiscount(double value) {
		if(value > 500)
			return value * 0.6;
		
		return value * 0.4;
	}

}
