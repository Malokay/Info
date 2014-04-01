package uebung4;

public class Pytagoras {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Geben sie die Grenze für die Pytagoras Trippel ein: ");
		int grenze = scanner.nextInt();
		for (int a = 1; a<=grenze; a++){
			for (int b = a;b<=grenze;b++){
				int c2 = a*a+b*b;
				double c = Math.sqrt(c2);
				double cgerund = Math.round(c);
				double epsilon = c-cgerund;
				epsilon=Math.abs(epsilon);
				if (epsilon<0.00001){
					System.out.println(a+" * "+a+" + "+b+" * "+b+" = "+(int)c+" * "+(int)c);
				}
				
			}
		}
	scanner.close();
	}

}
