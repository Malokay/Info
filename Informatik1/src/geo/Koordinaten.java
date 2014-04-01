package geo;

public class Koordinaten {
	static private int nummer=0;
	private final int punktnummer;
	private double x;
	private double y;
	
	public Koordinaten(double y,double x){
		this.x=x;
		this.y=y;
		punktnummer=++nummer;
	}

	public Koordinaten(int standnummer, double y, double x){
		this.x=x;
		this.y=y;
		punktnummer=standnummer;
	}
	
	


}
