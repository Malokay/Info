package testat3;

public class Quersumme {


	
	public static int quersumme1(int zahl){
	int ergebnis=0;
	
	while (zahl!=0){
		ergebnis+=zahl%10;
		zahl /=10;
	}
	return ergebnis;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(quersumme1(15382));
		System.out.print(quersumme(15382));
	}

	public static int quersumme(int zahl){		
		if(zahl!=0) return (zahl%10) + quersumme(zahl/10);
		else return 0;	
		}	
}
