

import java.security.SecureRandom;

public class Craps {
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status{CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	
	public Craps() {
		System.out.println("Craps constructor");
	}

}
