package uebung8;
import tools.*;


public class Hauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] test=TerrainTools.smoothCreate(40, 100);
		//double[] testtest=TerrainTools.resampling(test);
		ArrayTools.ausgabe(test);
		System.out.println();
		TerrainTools.print(test);
		ArrayTools.ausgabe(TerrainTools.maximaIndex(test, 2));
		System.out.println();
		System.out.print(TerrainTools.visible(test, 2, 5));
		//System.out.println(TerrainTools.maximumIndex(test));
		//TerrainTools.print(testtest);
		
	}

}
