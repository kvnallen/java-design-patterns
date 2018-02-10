package patterns.factory.method;

public class App {

	public static void main(String[] args) {
		Duck fakeDuck = DuckFactory.getDuck(false);
		Duck realDuck = DuckFactory.getDuck(true);
		
		System.out.println("Fake Duck -> " + fakeDuck);
		System.out.println("Real Duck -> " + realDuck);
	}

}
