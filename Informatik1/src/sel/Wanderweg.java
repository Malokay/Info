package sel;

public class Wanderweg {

	public static void main(String[] args) {
		
		float[] laengen = {2.0f,1.5f,3.7f,0.4f,1.6f,4.2f};
		float[] hoehen = {0.3f,0.3f,-0.1f,-0.2f,0.1f,-0.4f};
		System.out.println("<die Gesamtdauer der <wanderung beträgt " +  gesZeit(laengen, hoehen)  + "Stunden.");
		
	}
	public static float dauer(float laengen, float hoehen){
		float m = hoehen/laengen;
		float v = (float)(6*Math.exp(-3.5*Math.abs(m+0.05)));
		float t = laengen/v;
		return t;
	}
	public static float gesZeit(float[] laengen, float[] hoehen){		
		float ges =0;
		for (int i=0;i<hoehen.length;i++){
			ges+=dauer(laengen[i],hoehen[i]);
		}
		return ges;
		}
}

