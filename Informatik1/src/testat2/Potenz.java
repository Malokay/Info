package testat2;

public class Potenz
{
public static void main(String[] args) {
java.util.Scanner scanner = new java.util.Scanner(System.in);
	// Eingabe
	System.out.print("Basis >> ");
	int basis = scanner.nextInt();
	System.out.print("Exponent >> ");
	int exponent = scanner.nextInt();
	
	// Berechnung
	int ergebnis = 1;						// Hier stand eine 0 was in der Multiplikation immer zu 0 führt
											// Neutrales Element der Multiplikation ist die 1
	for (int i=1; i<=exponent; i++) {		//Die for-schleife muss bis zu i<=exponent laufen
	ergebnis *= basis;
	}
	// Ausgabe
	String ausgabe = basis +" hoch "+ exponent +" ist "+ ergebnis;
	System.out.println(ausgabe);
	scanner.close();
	}
}