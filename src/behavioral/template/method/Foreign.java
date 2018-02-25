package behavioral.template.method;

public class Foreign implements Payer {

	@Override
	public int maxPayValue() {
		return 500;
	}

}
