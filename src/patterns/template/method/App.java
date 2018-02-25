package patterns.template.method;

public class App {

	public static void main(String[] args) {
		System.out.println("# Paying as foreign users\n");
		Foreign foreign = new Foreign();

		foreign.pay(300);
		foreign.pay(600);
		
		System.out.println("\n");
		
		System.out.println("# Paying as local users\n");
		Payer local = new LocalUser();
		local.pay(900);
		local.pay(1900);
	}

}
