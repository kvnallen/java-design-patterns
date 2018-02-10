package patterns.bridge;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Map {

	@Override
	public String getMap(String streetName) {
		try {
			URL url = new URL("http://maps.google.com/maps?q=" + streetName);
			InputStream openStream = url.openStream();
			return "I'm from Google Maps API.";
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

}
