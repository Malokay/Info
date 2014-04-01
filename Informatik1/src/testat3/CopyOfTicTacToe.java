package testat3;

public class CopyOfTicTacToe {
	static java.util.Scanner scanner = new java.util.Scanner(System.in);
	static int[][] feld = new int[4][4];	// Variablen in ein Feld geändert
	
	// Mensch == 1, Computer == 2
	static int amZug = 1;
	static int sieger = 0;

	public static void ausgabe() {
		// Spielfeld ausgeben
		String spielfeld = "\n";
		spielfeld += feld[1][1] == 0 ? "1" : feld[1][1] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[1][2] == 0 ? "2" : feld[1][2] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[1][3] == 0 ? "3" : feld[1][3] == 2 ? "O" : "X";
		spielfeld += "\n";
		spielfeld += "-+-+-\n";
		spielfeld += feld[2][1] == 0 ? "4" : feld[2][1] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[2][2] == 0 ? "5" : feld[2][2] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[2][3] == 0 ? "6" : feld[2][3] == 2 ? "O" : "X";
		spielfeld += "\n";
		spielfeld += "-+-+-\n";
		spielfeld += feld[3][1] == 0 ? "7" : feld[3][1] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[3][2] == 0 ? "8" : feld[3][2] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[3][3] == 0 ? "9" : feld[3][3] == 2 ? "O" : "X";
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
			if (feldnummer == 1 && feld[1][1] == 0 || feldnummer == 2 && feld[1][2] == 0
					|| feldnummer == 3 && feld[1][3] == 0 || feldnummer == 4
					&& feld[2][1] == 0 || feldnummer == 5 && feld[2][2] == 0
					|| feldnummer == 6 && feld[2][3] == 0 || feldnummer == 7
					&& feld[3][1] == 0 || feldnummer == 8 && feld[3][2] == 0
					|| feldnummer == 9 && feld[3][3] == 0)
				besetztesFeld = false;
		} while (besetztesFeld);
		// Feld besetzen
		if (feldnummer == 1)
			feld[1][1] = amZug;
		if (feldnummer == 2)
			feld[1][2] = amZug;
		if (feldnummer == 3)
			feld[1][3] = amZug;
		if (feldnummer == 4)
			feld[2][1] = amZug;
		if (feldnummer == 5)
			feld[2][2] = amZug;
		if (feldnummer == 6)
			feld[2][3] = amZug;
		if (feldnummer == 7)
			feld[3][1] = amZug;
		if (feldnummer == 8)
			feld[3][2] = amZug;
		if (feldnummer == 9)
			feld[3][3] = amZug;
	}

	public static int sieg() {
		// Alle Felder besetzt -> Unentschieden
		if (feld[1][1] != 0 && feld[1][2] != 0 && feld[1][3] != 0 && feld[2][1] != 0 && feld[2][2] != 0
				&& feld[2][3] != 0 && feld[3][1] != 0 && feld[3][2] != 0 && feld[3][3] != 0)
			sieger = -1;
		// Horizontal
		if (feld[1][1] == feld[1][2] && feld[1][2] == feld[1][3])
			sieger = feld[1][1];
		if (feld[2][1] == feld[2][2] && feld[2][2] == feld[2][3])
			sieger = feld[2][1];
		if (feld[3][1] == feld[3][2] && feld[3][2] == feld[3][3])
			sieger = feld[3][1];
		// Vertical
		if (feld[1][1] == feld[2][1] && feld[2][1] == feld[3][1])
			sieger = feld[1][1];
		if (feld[1][2] == feld[2][2] && feld[2][2] == feld[3][2])
			sieger = feld[1][2];
		if (feld[1][3] == feld[2][3] && feld[2][3] == feld[3][3])
			sieger = feld[1][3];

		// Diagonal
		if (feld[1][1] == feld[2][2] && feld[2][2] == feld[3][3])
			sieger = feld[2][2];
		if (feld[1][3] == feld[2][2] && feld[2][2] == feld[3][1])
			sieger = feld[2][2];
		// Anderer Spieler ist dran
		return sieger;
	}
		


	public static void ergebnis() {

		String spielfeld = "\n";
		spielfeld += feld[1][1] == 0 ? " " : feld[1][1] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[1][2] == 0 ? " " : feld[1][2] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[1][3] == 0 ? " " : feld[1][3] == 2 ? "O" : "X";
		spielfeld += "\n";
		spielfeld += "-+-+-\n";
		spielfeld += feld[2][1] == 0 ? " " : feld[2][1] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[2][2] == 0 ? " " : feld[2][2] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[2][3] == 0 ? " " : feld[2][3] == 2 ? "O" : "X";
		spielfeld += "\n";
		spielfeld += "-+-+-\n";
		spielfeld += feld[3][1] == 0 ? " " : feld[3][1] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[3][2] == 0 ? " " : feld[3][2] == 2 ? "O" : "X";
		spielfeld += "|";
		spielfeld += feld[3][3] == 0 ? " " : feld[3][3] == 2 ? "O" : "X";
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
		if(win(2)!=0) return win(2);	 //Wenn der Computer gewinnen kann, setzt er auf das Feld zum gewinnen
		if(nolose()!=0) return nolose(); //Verhindert ein direktes gewinnen des Spielers				
		if(zug()!=0) return zug();		 //setzt erst in die Mitte dann in die Ecken
		else return (1 + (int) (Math.random() * 9));	//letzter Ausweg
	}
	
	
	public static int nolose(){
		if (win(1)!=0) return win(1);
		if(feld[1][1]==1&&feld[3][3]==0)return 9;	//Einen Typ von Zwickmühle verhindern
		if(feld[3][3]==1&&feld[1][1]==0)return 1;
		if(feld[3][1]==1&&feld[1][3]==0)return 3;
		if(feld[1][3]==1&&feld[3][1]==0)return 7;
		else return 0;
	
	}
	public static int win(int a){
		for(int i=1; i<4;i++){
			if(feld[i][1]==a&&feld[i][2]==a&&feld[i][3]==0)return 3*i;
			if(feld[i][1]==a&&feld[i][3]==a&&feld[i][2]==0)return 3*i-1;
			if(feld[i][2]==a&&feld[i][3]==a&&feld[i][1]==0)return 3*i-2;
			if(feld[1][i]==a&&feld[2][i]==a&&feld[3][i]==0)return 6+i;
			if(feld[1][i]==a&&feld[3][i]==a&&feld[2][i]==0)return 3+i;
			if(feld[2][i]==a&&feld[3][i]==a&&feld[1][i]==0)return i;
			}
		if(feld[1][1]==a&&feld[3][3]==a&&feld[2][2]==0)return 5;
		if(feld[1][3]==a&&feld[3][1]==a&&feld[2][2]==0)return 5;
		if(feld[2][2]==a&&feld[1][1]==a&&feld[3][3]==0)return 9;
		if(feld[2][2]==a&&feld[3][3]==a&&feld[1][1]==0)return 1;
		if(feld[2][2]==a&&feld[3][1]==a&&feld[1][3]==0)return 3;
		if(feld[2][2]==a&&feld[1][3]==a&&feld[3][1]==0)return 7;
		else return 0;
	}
	public static int zug(){
		if(feld[2][2]==0) return 5;
		for(int i=1;i<4;i=i+2){
		if(feld[i][1]==0) return 3*i-2;
		if(feld[1][i]==0) return 3*i;
		}	
		return 0;
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
