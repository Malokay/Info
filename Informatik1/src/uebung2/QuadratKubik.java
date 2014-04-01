package uebung2;

public class QuadratKubik {
	public static void main(String[] args) {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	System.out.print("Geben sie n ein: ");
	int n = scanner.nextInt();
			System.out.println("\tn \tn^2 \tn^3");
	System.out.println("-----------------------------");
	for (int i=1;i<=n;i++){	
		System.out.println("\t"+i+"\t"+(i*i)+"\t"+(i*i*i));
	}
	scanner.close();
	}

}