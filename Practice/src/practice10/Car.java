package practice10;

import java.util.Random;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	int run() {
		Random ram = new Random();
		if(gasoline>0) {
			gasoline --;
			int Mileage = ram.nextInt(15)+1;
			return  Mileage;
		} else {
			return -1;
		}
	}
}
