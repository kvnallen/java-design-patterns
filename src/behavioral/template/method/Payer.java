package behavioral.template.method;

public interface Payer {

	int maxPayValue();

	default boolean pay(int value) {
		if (maxPayValue() > value) {
			System.out.println("OK Sir, your purchase of " + value + " was approved successfully!");
			return true;
		}

		System.out.println("Sorry Sir, your purchase exceed your max value of " + maxPayValue() + ".");
		return false;
	}

}
