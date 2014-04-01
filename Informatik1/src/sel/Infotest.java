package sel;

public class Infotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[];
		char[] ch1;
		int a=501;
		int b=799;
		int c=400;
		boolean e =(a>500)||(b<800)&&!(c==400);
		System.out.println(e);
		e =(a>500)||((b<800)&&!(c==400));
		System.out.println(e);
	}

}
