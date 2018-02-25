package behavioral.chain;

import java.util.Optional;

public abstract class Approver {

	protected Optional<Approver> successor = Optional.empty();
	protected double maxApprovalValue;

	public void hasSuccessor(Approver successor) {
		this.successor = Optional.of(successor);
	}
	
	public void process(Purchase purchase) {
		
		//Hey, we have a template method pattern here :)
		
		if (purchase.getValue() <= this.maxApprovalValue) {
			System.out.println("Purchase (" + purchase.getNumber() + " " + purchase.getDescription() + ") approved! by the " + this);
			return;
		}
		
		if (this.successor.isPresent())
			this.successor.get().process(purchase);
	}
	
	public void setMaxApprovalValue(double value) {
		this.maxApprovalValue = value;
	}
}
