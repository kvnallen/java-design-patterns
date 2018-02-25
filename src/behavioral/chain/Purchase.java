package behavioral.chain;

public class Purchase {

	public Purchase(int number, String description, double value) {
		this.number = number;
		this.description = description;
		this.value = value;
	}

	private int number;
	private String description;
	private double value;

	public int getNumber() {
		return number;
	}

	public String getDescription() {
		return description;
	}
	
	public double getValue() {
		return this.value;
	}
}
