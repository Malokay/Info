package tools;

public class ArrayTools {


	public static int[] zufzahlen(int length, int bereich) {
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * bereich);
		}
		return array;
	}
	
	public static int[] zufzahlen() {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}
   
	public static void ausgabe(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void ausgabe(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int min(int[] array) {
		int minimum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimum)
				minimum = array[i];
		}
		return minimum;
	}

	public static int max(int[] array) {
		int maximum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maximum)
				maximum = array[i];
		}
		return maximum;
	}

	public static int summe(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static boolean contains(int[] array, int value){
		for(int i = 0; i < array.length; i++){
			if(value == array[i]) return true;
		}
		return false;
	}
	
	public static int occurences(int[] array, int value){
		int anzahl=0;
		for(int i = 0; i < array.length; i++){
			if(value == array[i]) anzahl++ ;
		}
		return anzahl;	
	}
	
	public static int count (int[] array1, int[] array2){
		int count = 0;
		for(int i = 0; i < array1.length; i++){
			count += occurences(array2,array1[i]);
			
		}
		return count;
	}
	
}
