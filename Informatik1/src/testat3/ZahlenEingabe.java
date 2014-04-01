package testat3;

public class ZahlenEingabe {

	public static void eingabe(){
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	int zahl=scanner.nextInt();
	if (zahl != 0){
		eingabe();
	}
	System.out.print(zahl);	
	scanner.close();
	}
	
	
	public static void main(String[] args) {
		eingabe();
	}

}
