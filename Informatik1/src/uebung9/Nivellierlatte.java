package uebung9;

public class Nivellierlatte {
	static String eigentuemer ="LE GuV";
	private String material;
	private int hoehe;
	private Punkt position;
	
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getHoehe() {
		return hoehe;
	} 
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	
	public void frage(){
		System.out.println(position.toString());
	}
	
	public void  trage (Punkt a){
		position.setX(a.getX());
		position.setY(a.getY());		
	}
}
