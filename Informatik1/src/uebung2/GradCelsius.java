package uebung2;

public class GradCelsius {
	public static void main(String[] args) {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	System.out.println("Geben Sie einen Wert in Grad Celsius ein: ");
	double Grad = scanner.nextDouble();
	double Far = Grad*9D/5D + 32;
	System.out.printf("%.2f  Grad Celsius sind %.2f Grad Fahrenheit",Grad,Far);
	scanner.close();
	}

}
