package creational.singleton;

public class App {

	public static void main(String[] args) {
		DataBase.getInstance().query("from world");
		DataBase.getInstance().query("from world");
	}

}
