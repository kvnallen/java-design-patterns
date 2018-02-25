package creational.singleton;

public final class DataBase {

	private static DataBase INSTANCE;

	public static DataBase getInstance() {
		if (INSTANCE == null) {
			System.out.println("Connected at database!\n");
			INSTANCE = new DataBase();
		}
		
		return INSTANCE;
	}
	
	public void query(String query) {
		System.out.println("running query from database...");
		System.out.println("Hashcode -> " + INSTANCE.hashCode() + "\n");
	}

}
