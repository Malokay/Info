package uebung2;
public class Teiler {
	public static void main(String[] args) {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	System.out.println("Geben sie eine Zahl ein deren Teile sie wissen möchten: ");
	int Zahl = scanner.nextInt();
	System.out.println("Die gesuchten Teiler für: "+Zahl);
	for (int i=1;i<=Zahl;i++)
	{	
	if(Zahl%i==0) System.out.print(i+" ");
	}
	scanner.close();
	}

}
