package testat2;
public class chaosneu {

	public static void main(String[] args) {
		
		double zins=0.03;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Startkapital >>");
		double start=scanner.nextDouble();
		System.out.print("Jahre >>");
		int jahre=scanner.nextInt();
		System.out.print("Endkapital >>");
		double ende=Math.pow((1+zins), jahre);
		System.out.printf("%.2f",ende*start);
	scanner.close();
	}

}
