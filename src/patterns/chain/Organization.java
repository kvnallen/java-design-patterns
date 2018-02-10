package patterns.chain;

import java.util.List;

public class Organization {

	Approver chain;
	
	public Organization() {
		buildChain();
	}

	private void buildChain() {
		Approver jean = new ViceDirector();
		Approver john = new Director();
		Approver pedro = new President();

		jean.hasSuccessor(john);
		john.hasSuccessor(pedro);
		
		//the chain start's from from the bottom to the top
		chain = jean;
	}
	
	public void processPayments(List<Purchase> purchases) {
		purchases.forEach(chain::process);
	}
}
