package patterns.chain;

public class ViceDirector extends Approver {

	public ViceDirector() {
		this.setMaxApprovalValue(5000);
	}
	
	@Override
	public String toString() {
		return "Vice Director";
	}
}
