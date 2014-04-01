package uebung5;

public class Berechnung {

	
	public static void aufrufEinMal() {
	java.util.Scanner scanner = new java.util.Scanner(System.in);	
	int eingabe;
	System.out.print("Geben sie eine Zahl ein:");
	eingabe=scanner.nextInt();
	einMal(eingabe);
	scanner.close();
	}

		
	public static void einMal(int zahl){
		for (int i=1;i<=9;i++){
			System.out.printf("%d * %d = %d \n" , i, zahl, i*zahl);
		}
	}
	
	public static void gradCelsius(){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Geben Sie einen Wert in Grad Celsius ein: ");
		double grad = scanner.nextDouble();
		double far = grad*9D/5D + 32;
		System.out.printf("%.2f  Grad Celsius sind %.2f Grad Fahrenheit",grad,far);
		scanner.close();

	}
	public static void teiler() {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	System.out.print("Geben sie eine Zahl ein deren Teile sie wissen möchten: ");
	int zahl = scanner.nextInt();
	System.out.println("Die gesuchten Teiler für: "+zahl);
	for (int i=1;i<=zahl;i++)
	{	
	if(zahl%i==0) System.out.print(i+" ");
	}
	scanner.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scanner = new java.util.Scanner(System.in);		
		String eingabe;
		System.out.print("Welches Programm wollen sie ausführen:(EinMalEins,Teiler,GradCelsius)");	
		eingabe=scanner.next();	
		switch(eingabe){
		case "Teiler": teiler();
		break;
		case "EinMalEins": aufrufEinMal();
		break;
		case "GradCelsius": gradCelsius();
		break;
		default: System.out.print("Dieses Programm ist nicht vorhanden!");
		break;
		}
		scanner.close();
	}

}
