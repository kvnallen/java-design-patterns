package creational.singleton;

public class App {

	public static void main(String[] args) {
		System.out.println("If you see the same hashcode, so the singleton was reused!");
		
		DataBase.getInstance().query("from world");
		DataBase.getInstance().query("from world");
	}

}
