package patterns.factory.method;

public class RealDuck implements Duck {

	@Override
	public String quack() {
		return "I'm a real duck";
	}

}
