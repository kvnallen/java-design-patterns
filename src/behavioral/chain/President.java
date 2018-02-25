package behavioral.chain;

/**
 * Concrete handler class
 */
public class President extends Approver {

	
	public President() {
	}

	@Override
	public void process(Purchase purchase) {
		if (purchase.getValue() <= 100_000) {
			System.out.println("Purchase (" + purchase.getNumber() + " " + purchase.getDescription() +") approved! by the " + this );
			return;
		}
		
		System.out.println("The purchase '" + purchase.getDescription() + "' require's an executive meeting.");
	}
	
	@Override
	public String toString() {
		return "President";
	}
}
