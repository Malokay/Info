package uebung9;

public class Punkt {
	static private short nummer=0;
	private final short punktnummer = nummer;
	private int x;
	private int y;
	
	public Punkt(){
		nummer++;
	}
	
	public Punkt(int x,int y){
		this.x=x;
		this.y=y;
		nummer++;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public short getPunktnummer() {
		return punktnummer;
	}

	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}
	
}

