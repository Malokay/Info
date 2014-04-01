package testat5;

public class Katesische {
	private double x;
	private double y;

	public Katesische() {

	}

	public Katesische(double y, double x) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double rewi(Katesische punkt) {
		return Math.atan2(punkt.getY() - this.y, punkt.getX() - this.x) * 200
				/ Math.PI;
	}

	public double distance(Katesische punkt) {
		return Math.sqrt(Math.pow((punkt.getY() - this.y), 2)
				+ Math.pow((punkt.getX() - this.x), 2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Katesische [x=" + x + ", y=" + y + "]";
	}

}
