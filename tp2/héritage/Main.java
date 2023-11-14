package tp2.héritage;

class Main {

	public static void main(String[] args) {

		Vehicle vehicle1 = new Vehicle("Renault", "Clio", "Rouge");

		System.out.println(vehicle1);
		vehicle1.startEngine();

		Bike bike1 = new Bike("Ducati", "Monster", "Noir", 900);

		System.out.println(bike1);

		bike1.startEngine();
	}

}