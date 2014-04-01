package uebung4;

public class Betrunkener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hausnr = 7;
			while(hausnr !=1 ){
			int muenze = (int) (Math.random()*2); // 0=Kopf 1=Zahl
			String muenzes = "";
			muenzes = muenze==0 ? "Kopf": "";
			muenzes = muenze==1 ? "Zahl": muenzes;
			if (muenze==0){
				System.out.println("Wirtshausstraße"+hausnr+"->"+muenzes+"->");
				hausnr += 1;		
			}
			else {
				System.out.println("Wirtshausstraße"+hausnr+"->"+muenzes+"->");
				hausnr -= 1;
			}
		}
		System.out.println("Wirtshausstraße"+hausnr);
	}

}
