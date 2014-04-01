package uebung10;

public class BildFilter {

	public static void main (String args[]){
	int[][] bild = new int[3][3];
	bild[0][0]=255;
	bild[1][0]=219;
	bild[2][0]=24;
	bild[1][1]=40;
	bild[1][2]=35;
	bild[2][1]=241;
	bild[2][2]=116;
	bild[0][1]=123;
	bild[0][2]=145;
	bild[1][1]=0;
	schreib(bild);
	bild=mittelw(bild);
	schreib(bild);
	
	}

	private static void schreib(int[][] bild) {
		System.out.printf("%d  %d  %d%n",bild[0][0],bild[0][1],bild[0][2]);
		System.out.printf("%d  %d  %d%n",bild[1][0],bild[1][1],bild[1][2]);
		System.out.printf("%d  %d  %d%n",bild[2][0],bild[2][1],bild[2][2]);
	}

	static int[][] mittelw (int[][] bild){
		for (int i=0;i<bild.length;i++){
			for (int j=0;j<bild[i].length;j++){
				if (i!=j||i!=1){					
					bild[1][1]+=bild[i][j]; 
				}
			}
		}
		bild[1][1]=(int)(bild[1][1]/8+0.5);
		System.out.printf("Der neue Pixelwert beträgt: %d%n",bild[1][1]);
		return bild;
	}
}
