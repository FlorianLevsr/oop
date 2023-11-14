package tp2.héritage;

public class Bike extends Vehicle{

	private int engineSize;

	public Bike(String brand, String model, String color, int engineSize) {
		super(brand, model, color);
		this.engineSize = engineSize;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public void startEngine() {
		System.out.println("vrooooooooom vrooooooooooooooooooooooooooooooooom!");
	}

	@Override
	public String toString() {
		return super.toString() + " engineSize=" + engineSize;
	}
}
