package model;

import java.io.Serializable;
import java.util.Random;

public class common implements Serializable {
	public static int number4() {

		Random random = new Random();

		int number = 1000 + random.nextInt(9000);
		return number;
	}

}
