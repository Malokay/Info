package uebung4;

public class Pizzavergleich {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Geben sie den Durchmesser[cm] der ersten Pizza ein: ");
		int radiusPizza1 = scanner.nextInt();
		
		System.out.print("Geben sie den Preis der ersten Pizza ein: ");
		double preisPizza1 = scanner.nextDouble();
		
		System.out.print("Geben sie den Durchmesser[cm] der zweiten Pizza ein: ");
		int radiusPizza2 = scanner.nextInt();
		
		System.out.print("Geben sie den Preis der zweiten Pizza ein: ");
		double preisPizza2 = scanner.nextDouble();
		
		double preispercm1 = preisPizza1/(radiusPizza1*radiusPizza1*Math.PI);
		double preispercm2 = preisPizza2/(radiusPizza2*radiusPizza2*Math.PI);
		if (preispercm1<preispercm2){
			System.out.print("Die erste Pizza hat das bessere Preis-Leistungs Verhältnis");	
		}
		else {
			System.out.print("Die erste Pizza hat das bessere Preis-Leistungs Verhältnis");
		}
		if (preispercm1<preispercm2){
			System.out.print("Das Preis-Leistungs Verhältnis ist bei beiden gleich, unglaublich!");
		}
	scanner.close();	
	}

}
