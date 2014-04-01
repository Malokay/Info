package testat5;

public class Haupt {
	
	public static void main(String args[]){
		Katesische punkt1 = new Katesische(5,5);
		Katesische punkt2 = new Katesische(10,10);
		System.out.println(punkt1.rewi(punkt2));
		
		Polar punkt3 = new Polar(50,7.071);
		System.out.println(gdhaupt(punkt1,punkt2,punkt3));
		System.out.println(gdhaupt2(punkt1,gdhaupt(punkt1,punkt2,punkt3)));
	}
	
	public static Katesische gdhaupt(Katesische standpunkt, Katesische nach, Polar pkord ){
		Katesische neupunkt=new Katesische();
		double rewi=standpunkt.rewi(nach);
		neupunkt.setX(standpunkt.getX()+Math.cos((rewi+pkord.getWinkel())*(Math.PI/200))*pkord.getStrecke());
		neupunkt.setY(standpunkt.getY()+Math.sin((rewi+pkord.getWinkel())*(Math.PI/200))*pkord.getStrecke());
		return neupunkt;
	}
	public static Polar gdhaupt2(Katesische standpunkt, Katesische nach){
		Polar neupunkt = new Polar();
		neupunkt.setWinkel(standpunkt.rewi(nach));
		neupunkt.setStrecke(standpunkt.distance(nach));
		return neupunkt;
	}
}
