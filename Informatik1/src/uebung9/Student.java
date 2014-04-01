package uebung9;

public class Student {
	private String name;
	private String vorname;
	private int matrikelnummer;
	
	public Student(String name, String vorname, int matrikelnummer){
		this.name=name;
		this.vorname=vorname;
		this.matrikelnummer=matrikelnummer;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setVorname(String vor){
		this.vorname=vor;
	}
	
	public String getVorname(){
		return this.vorname;
	}
	
	public void setMrk (int nummer){
		this.matrikelnummer=nummer;
	}
	
	public int getMrk(){
		return this.matrikelnummer;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", vorname=" + vorname
				+ ", matrikelnummer=" + matrikelnummer + "]";
	}
	
}
