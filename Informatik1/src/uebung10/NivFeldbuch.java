package uebung10;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import testat5.*;
public class NivFeldbuch {

	public static void main(String args[]){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String ausgabe="nivfeldbuch.prt";
		String projektname;
		String datum;
		String bearbeiter;
		String instrument;
		String seriennummer;
		int standpunkte;
		double[][] blick;
		double sumr=0;
		double sumv=0;
		double sumh=0;
		System.out.print("Eingabe Projektname:");
		projektname = scanner.next();
		System.out.print("Eingabe Bearbeiter:");
		bearbeiter = scanner.next();
		System.out.print("Eingabe Datum der Messung:");
		datum = scanner.next();
		System.out.print("Eingabe Instrument:");
		instrument = scanner.next();
		System.out.print("Eingabe Seriennummer:");
		seriennummer = scanner.next();
		System.out.print("Eingabe Anzhal der Instrumentenstandpunkte:");
		standpunkte = scanner.nextInt();
		blick = new double[standpunkte][3];
		for (int i = 0; i < blick.length; i++) {
			System.out.print("Eingabe Rückblick:");
			blick[i][0] = scanner.nextDouble();
			System.out.print("Eingabe Vorblick:");
			blick[i][1] = scanner.nextDouble();
			blick[i][2]=blick[i][0]-blick[i][1];
		}
		PrintWriter out;
		try {
			out = new PrintWriter(ausgabe);
			out.printf("AUSWERTUNG LINIENNVIELLEMENT%n");
			out.printf("----------------------------%n");
			out.printf("%n");
			out.printf("Bearbeiter/t:          Musterstudent\n");
			out.printf("Name des Projekts/5t:  %s\n",projektname );
			out.printf("Datum der Messung:     %s\n", datum);
			out.printf("Instrument:            %s\n", instrument);
			out.printf("Seriennummer:          %s\n",seriennummer);
			out.printf("%n");
			out.printf("Einheiten: Alle Werte in [m]");
			out.printf("%n");
			out.printf("EINGABEWERTE UND ERGEBNISSE\n");
			out.printf("---------------------------\n");			
			out.printf("%n");
			out.printf("i\t r\t\t v\t\t delta_h\n");
			for(int i=0;i<blick.length;i++){
				out.printf("%d\t %.4f\t %.4f\t %.4f\n",i,blick[i][0],blick[i][1],blick[i][2]);				
				sumr+=blick[i][0];
				sumv+=blick[i][1];
				sumh+=blick[i][2];
			}
			out.printf("%n");			
			out.printf("Summe r:        %.4f\n",sumr);
			out.printf("Summe v:        %.4f\n",sumv);
			out.printf("Summe delta_h:  %.4f\n",sumh);
			out.close();		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		scanner.close();
	}
}
