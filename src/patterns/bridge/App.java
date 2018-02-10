package patterns.bridge;

public class App {

	public static void main(String[] args) {
		Map googleMaps = new GoogleMaps();
		Map bingMaps = new Bing();
		
		System.out.println(googleMaps.getMap("Caruaru"));
		System.out.println(bingMaps.getMap("Caruaru"));
	}
}
