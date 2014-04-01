package uebung4;

public class SteinScherePapier {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Ihre Wahl (0 = Schere, 1 = Stein, 2 = Papier): ");
		int spieler=scanner.nextInt();
		int computer= (int) (Math.random()*3);
		String computers = "";
		computers = computer==0 ? "Schere" : computers;
		computers = computer==1 ? "Stein" : computers;
		computers = computer==2 ? "Papier" : computers;
		switch(spieler)
		{
		case 0 :
		{
			if (computer==0) System.out.print("Unendschieden! ");
			if (computer==1) System.out.print("Verloren! ");
			if (computer==2) System.out.print("Gewonnen! ");
			break;
		}
		case 1:
		{
			if (computer==0) System.out.print("Gewonnen! ");
			if (computer==1) System.out.print("Unendschieden! ");
			if (computer==2) System.out.print("Verloren! ");	
			break;
		}
		case 2:
		{
			if (computer==0) System.out.print("Verloren! ");
			if (computer==1) System.out.print("Gewonnen! ");
			if (computer==2) System.out.print("Unendschieden! ");		
			break;
		}
		default: System.out.print("Ihre Eingabe war nicht richtig!");
		}
		System.out.print("Computer hat "+ computers +" gewählt");
		scanner.close();
	}

}