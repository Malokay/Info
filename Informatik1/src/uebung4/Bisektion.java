package uebung4;

public class Bisektion {

	public static void main(String[] args) {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	System.out.print("Geben sie die grenze ein");
	double grenze = scanner.nextDouble();
	double up,down,neu;
	//Intervall festlegen
	up=1;
	down=0;
	neu=0;
	while(up-down>grenze){
		neu = (up+down)/2;
		double f = (neu*neu*neu + 3*neu*neu -1);
		if (f<0) down = neu;
		if (f>0) up = neu;
	}
	System.out.print("Die Nullstelle ist: "+ neu);
	scanner.close();
	}

}
