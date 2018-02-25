package behavioral.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	
	static List<Discount> discounts;
	
	static {
		discounts = Arrays.asList(
				new BasicDiscount(), 
				new BigDiscount(), 
				new MasterDiscount());
	}

	public static void main(String[] args) {
		for (ClientType type : ClientType.values()) {
			double discount = getDiscount(type);
			System.out.println("The discount for " + type + " was: " + discount);
		}
	}

	private static double getDiscount(ClientType type) {
		return discounts.stream()
				.filter(c -> c.ofType(type))
				.collect(Collectors.toList())
				.get(0)
				.getDiscount(500);
	}

}
