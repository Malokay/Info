package tools;

import java.util.*;

public class TerrainTools {

	public static double[] create(int anzahl) {

		double[] array = new double[anzahl];
		for (int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * 1000);
		}
		return array;
	}

	public static void print(double[] terrain) {

		for (int x = 900; x >= 0; x = x - 100) {
			for (int i = 0; i < terrain.length; i++) {
				if (terrain[i] >= x) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static int maximumIndex(double[] terrain) {

		int stelle = 0;
		for (int i = 0; i < terrain.length; i++) {
			if (terrain[i] > terrain[stelle]) {
				stelle = i;
			}
		}
		return stelle;
	}

	public static double[] smoothCreate(int anzahl, double steil) {

		double[] array = new double[anzahl];
		array[0] = (Math.random() * 500) + 250;
		for (int i = 1; i < array.length; i++) {
			array[i] = array[i - 1] + new Random().nextGaussian() * steil;
			if (array[i] < 0) {
				i--;
			}
			if (array[i] > 1000) {
				i--;
			}
		}
		return array;
	}

	public static double[] resampling(double[] terrain) {
		double[] newterrain = new double[(int) ((terrain.length + 1) / 2)];
		for (int i = 0, k = 0; i < newterrain.length; i++, k = k + 2) {
			newterrain[i] = (terrain[k] + terrain[k + 1]) / 2;
		}
		return newterrain;

	}

	public static int[] maximaIndex(double[] terrain, int area) {
		int[] maxima = new int[terrain.length];
		int j = 0;
		for (int i = 0; i < terrain.length; i++) {
			boolean max = true;
			for (int k = i - area; k <= i + area; k++) {
				int x = k < 0 ? 0 : k;
				x = k >= terrain.length ? terrain.length - 1 : x;
				if (terrain[i] < terrain[x])
					max = false;
			}
			if (max) {
				maxima[j] = i;
				j++;
			}
		}
		return maxima;
	}
	
	public static boolean visible(double[] terrain , int pos1, int pos2){
		boolean visible = true;
		for(int i=pos1+1;i<=pos2-1;i++){
			if (terrain[i]>(terrain[pos1]+(i-pos1+1)*100)){
				visible = false;
			}
		}
		return visible;
	}
	
}
