package uebung9;

public class Nivellieren {

	public static void main(String[] args) {
		Student ich = new Student("Heidelberg","Arno",123456);
		Punkt[] punkte = new Punkt[4];
		for(int i=0; i<punkte.length;i++){
			punkte[i]=new Punkt();
		}		
		Nivellierlatte latte= new Nivellierlatte();
		latte.setHoehe(400);
		latte.setMaterial("Holz");
		String me= ich.getVorname()+" "+ich.getName()+" "+ich.getMrk();
		System.out.println("Liebe Frau Czommer, ich ("+me+") habe eine Nivellierlatte aus ["+latte.getMaterial()+"]"
				+ " und einer Höhe von ["+latte.getHoehe()+"] cm zu Punkt ["+punkte[3].getPunktnummer()+""
		+"] getragen. Mit besten Grüßen auch vom Herrn Bruhn.");
	}

}
