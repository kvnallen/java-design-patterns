package behavioral.template.method;

public class LocalUser implements Payer {

	@Override
	public int maxPayValue() {
		return 1000;
	}

}
