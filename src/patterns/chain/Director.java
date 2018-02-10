package patterns.chain;

public class Director extends Approver {
	
	public Director() {
		this.setMaxApprovalValue(50_000);
	}
	
	@Override
	public String toString() {
	   return "Director";
	}
}
