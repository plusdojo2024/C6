package model;

import java.io.Serializable;
import java.util.Random;

public class common implements Serializable{
	public static void main(String[] args) {

		Random random= new Random();

		int number=1000+random.nextInt(9000);
	}

}
