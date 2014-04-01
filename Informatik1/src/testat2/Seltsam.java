package testat2;

public class Seltsam
{
public static void main(String[] args) {
	float number = 0.3f;  // number = 0.3	  
		  number -= 0.5f; // number = -0.19999999 Rundungsfehler
		  number += 0.2f; // number = 1.4901161E-8 
	number = number * 1000000;
	System.out.println(number);
}
}