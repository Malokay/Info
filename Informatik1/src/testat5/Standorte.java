package testat5;

public class Standorte {
	private static int nummer=0;
	private final int punktnummer = nummer;
	private double vorblick;
	private double rueckblick;
	
	public Standorte() {
		nummer++;
	}
	public Standorte(double vorblick, double rueckblick){
		this.vorblick=vorblick;
		this.rueckblick=rueckblick;
		nummer++;
	}
		
	public double getVorblick() {
		return vorblick;
	}
	public void setVorblick(double vorblick) {
		this.vorblick = vorblick;
	}
	public double getRueckblick() {
		return rueckblick;
	}
	public void setRueckblick(double rueckblick) {
		this.rueckblick = rueckblick;
	}
	public void reset(){
		nummer=0;
	}
	
	
}
