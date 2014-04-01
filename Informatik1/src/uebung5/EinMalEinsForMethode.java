package uebung5;

public class EinMalEinsForMethode {

	public static void einMal(int param){
		for (int schleife=1;schleife<=10;schleife++){
			System.out.printf("%d * %d = %d \n" , schleife, param, schleife*param);
		}
	}
	
	public static void main(String[] args) {
	java.util.Scanner scanner = new java.util.Scanner(System.in);	
	int eingabe;
	System.out.print("Geben sie eine Zahl ein:");
	eingabe=scanner.nextInt();
	einMal(eingabe);
	scanner.close();
	}

}
