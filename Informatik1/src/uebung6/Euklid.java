package uebung6;

public class Euklid {

	public static int klassisch(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	public static int modern(int a, int b) {
		int rest = 1;
		while (rest != 0) {
			rest = a % b;
			a = b;
			b = rest;
		}
		return a;
	}

	public static int recusiv(int a, int b) {
		if (a % b != 0)
			return recusiv(b, a % b);
		else
			return b;
	}

}
