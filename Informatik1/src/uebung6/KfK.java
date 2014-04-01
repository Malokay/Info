package uebung6;

public class KfK {

	public static void main(String[] args) {
		neu(91);
	}
	public static void neu(int a){
		a--;
		if (a>65)neu(a);
		System.out.print((char)a);	//(char)66 <=> A; (char)67 <=> B; ...
	}


//	public static int betrag(int a){

//		if(a>=0){ return a;	}
//		if(a<0){ return -a; }
		
//	}
	public static double betrag(double a){

		if(a>=0){ return a;	}
		else{ return -a; }
		
	}
	
}