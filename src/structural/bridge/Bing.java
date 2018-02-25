package structural.bridge;

public class Bing implements Map {

	@Override
	public String getMap(String streetName) {
		// search in another system
		return "i'm from bing";
	}

}
