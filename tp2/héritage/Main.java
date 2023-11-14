package tp2.héritage;

import java.util.Arrays;
import java.util.List;

class Main {

	public static void main(String[] args) {

		Bike bike1 = new Bike("Ducati", "Monster", "Noir", 900);

		System.out.println(bike1);

		bike1.startEngine();

		System.out.println("----- start all engines -----");
		startAll(Arrays.asList(bike1));
	}

	public static void startAll(List<Vehicle> vehicles) {
		for (Vehicle v:vehicles) {
			v.startEngine();
		}
	}

}