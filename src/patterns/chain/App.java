package patterns.chain;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Purchase> purchases = Arrays.asList(
				new Purchase(1, "Macbook", 2500), 
				new Purchase(2, "Build", 50_000), 
				new Purchase(3, "Diamond", 100_000),
				new Purchase(4, "Dragon Balls", 500_000)
				);
		
		new Organization().processPayments(purchases);
	}

}
