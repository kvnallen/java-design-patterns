package creational.factory.method;

public class DuckFactory {

	public static Duck getDuck(boolean realDuck) {
		return realDuck 
				? new RealDuck() 
				: new ToyDuck();
	}
}
