package creational.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void getInstance_dataBasesShouldBeEqual() {
		DataBase db1 = DataBase.getInstance();
		DataBase db2 = DataBase.getInstance();
		
		assertEquals(db1, db2);
	}

}
