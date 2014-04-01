package testat3;

public class TicTacToe {
	static java.util.Scanner scanner = new java.util.Scanner(System.in);
	static int feld1 = 0;
	static int feld2 = 0;
	static int feld3 = 0;
	static int feld4 = 0;
	static int feld5 = 0;
	static int feld6 = 0;
	static int feld7 = 0;
	static int feld8 = 0;
	static int feld9 = 0;
	// Mensch == 1, Computer == 2
	static int amZug = 1;
	static int sieger = 0;

	public static void ausgabe() {
		// Spielfeld ausgeben
		String spielfeld = "\n";
		spielfeld += feld1 == 0 ? "1" : feld1 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld2 == 0 ? "2" : feld2 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld3 == 0 ? "3" : feld3 == 2 ? "O" : "X";
		spielfeld += "\n";
		spielfeld += "-+-+-\n";
		spielfeld += feld4 == 0 ? "4" : feld4 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld5 == 0 ? "5" : feld5 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld6 == 0 ? "6" : feld6 == 2 ? "O" : "X";
		spielfeld += "\n";
		spielfeld += "-+-+-\n";
		spielfeld += feld7 == 0 ? "7" : feld7 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld8 == 0 ? "8" : feld8 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld9 == 0 ? "9" : feld9 == 2 ? "O" : "X";
		spielfeld += "\n";
		System.out.println(spielfeld);
	}

	public static void feldBesetzten() {
		int feldnummer = 0;
		boolean besetztesFeld;
		do {
			besetztesFeld = true;
			if (amZug == 1) {
				System.out.print("Feldnummer >> ");
				feldnummer = scanner.nextInt();
			}
			if (amZug == 2) {
				feldnummer = ai(); // computer eingabe
			}
			if (feldnummer == 1 && feld1 == 0 || feldnummer == 2 && feld2 == 0
					|| feldnummer == 3 && feld3 == 0 || feldnummer == 4
					&& feld4 == 0 || feldnummer == 5 && feld5 == 0
					|| feldnummer == 6 && feld6 == 0 || feldnummer == 7
					&& feld7 == 0 || feldnummer == 8 && feld8 == 0
					|| feldnummer == 9 && feld9 == 0)
				besetztesFeld = false;
		} while (besetztesFeld);
		// Feld besetzen
		if (feldnummer == 1)
			feld1 = amZug;
		if (feldnummer == 2)
			feld2 = amZug;
		if (feldnummer == 3)
			feld3 = amZug;
		if (feldnummer == 4)
			feld4 = amZug;
		if (feldnummer == 5)
			feld5 = amZug;
		if (feldnummer == 6)
			feld6 = amZug;
		if (feldnummer == 7)
			feld7 = amZug;
		if (feldnummer == 8)
			feld8 = amZug;
		if (feldnummer == 9)
			feld9 = amZug;
	}

	public static int sieg() {
		// Alle Felder besetzt -> Unentschieden
		if (feld1 != 0 && feld2 != 0 && feld3 != 0 && feld4 != 0 && feld5 != 0
				&& feld6 != 0 && feld7 != 0 && feld8 != 0 && feld9 != 0)
			sieger = -1;
		// Horizontal
		if (feld1 == feld2 && feld2 == feld3)
			sieger = feld1;
		if (feld4 == feld5 && feld5 == feld6)
			sieger = feld4;
		if (feld7 == feld8 && feld8 == feld9)
			sieger = feld7;
		// Vertical
		if (feld1 == feld4 && feld4 == feld7)
			sieger = feld1;
		if (feld2 == feld5 && feld5 == feld8)
			sieger = feld2;
		if (feld3 == feld6 && feld6 == feld9)
			sieger = feld3;

		// Diagonal
		if (feld1 == feld5 && feld5 == feld9)
			sieger = feld5;
		if (feld3 == feld5 && feld5 == feld7)
			sieger = feld5;
		// Anderer Spieler ist dran
		return sieger;
	}
		


	public static void ergebnis() {

		String spielfeld = "\n";
		spielfeld += feld1 == 0 ? " " : feld1 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld2 == 0 ? " " : feld2 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld3 == 0 ? " " : feld3 == 2 ? "O" : "X";
		spielfeld += "\n";
		spielfeld += "-+-+-\n";
		spielfeld += feld4 == 0 ? " " : feld4 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld5 == 0 ? " " : feld5 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld6 == 0 ? " " : feld6 == 2 ? "O" : "X";
		spielfeld += "\n";
		spielfeld += "-+-+-\n";
		spielfeld += feld7 == 0 ? " " : feld7 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld8 == 0 ? " " : feld8 == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld9 == 0 ? " " : feld9 == 2 ? "O" : "X";
		spielfeld += "\n";
		System.out.println(spielfeld);
		if (sieger < 0)
			System.out.println("Unentschieden");
		if (sieger == 1)
			System.out.println("Sie haben gewonnen");
		if (sieger == 2)
			System.out.println("Sie haben verloren");

	}

	public static int ai(){
		int zug;
		zug = 1 + (int) (Math.random() * 9);
		return zug;
	}
	
	
	public static void main(String[] args) {
		do {
		ausgabe();
		feldBesetzten();
		if (amZug == 1)
			amZug = 2;
		else
			amZug = 1;
		}while(sieg()==0);
		
		ergebnis();
			
	}

}
