package introduction;

public class Point {

	private int x;
	private int y;

	

	public void modifierXY(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void print() {
		System.out.println("Point: " + x + ", " + y);
	}

	public void setX (int x) {
		this.x = x;
	}
	
}
