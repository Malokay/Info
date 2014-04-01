package uebung6;

public class GGT {


		public static void main(String[] args) {
			java.util.Scanner scanner = new java.util.Scanner(System.in);
			System.out.print("zwei Zahlen eingeben: ");
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			
			int zahl=Euklid.klassisch(a,b);
			System.out.println("klassisch: " + zahl);
			zahl = Euklid.modern(a,b);
			System.out.println("modern: " + zahl);
			zahl=Euklid.recusiv(a,b);
			System.out.println("recusiv: " + zahl);
			scanner.close();
		}

	}


