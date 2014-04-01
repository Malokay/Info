package testat4;

import tools.ArrayTools;

public class Lotto {

	public static void main(String[] args) {
		int[] test = tipp();
		ArrayTools.ausgabe(test);
	}

	public static int[] lotto() {
		int[] zahlen = new int[6];
		boolean doppelt = true;
		while (doppelt) {
			doppelt = false;
			zahlen = ArrayTools.zufzahlen(zahlen.length, 48);
			for (int i = 0; i < 49; i++) {
				if (ArrayTools.occurences(zahlen, i) != 1
						&& ArrayTools.occurences(zahlen, i) != 0) {
					doppelt = true;
				}
			}
		}
		return zahlen;
	}

	public static int[] tipp() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int[] zahlen = new int[6];
		boolean doppelt = true;

		while (doppelt) {
			doppelt = false;
			System.out.println("Geben sie ihren Tipp ein (6 Zahlen): ");
			for (int i = 0; i < zahlen.length; i++) {
				zahlen[i] = scanner.nextInt();
			}
			for (int i = 0; i < 49; i++) {
				if (ArrayTools.occurences(zahlen, i) != 1
						&& ArrayTools.occurences(zahlen, i) != 0) {
					doppelt = true;
					System.out.println("Jede Zahl darf nur einmal vorkommen!");
				}		
			}
			for (int i = 0;i < zahlen.length;i++){
					if (zahlen[i] > 48 || zahlen[i]<0) {
						doppelt = true;
						System.out.println("Die Zahlen müssen zwichen 0-48 liegen!");					
					}
				}
			}		
		scanner.close();
		return zahlen;
	}
}
