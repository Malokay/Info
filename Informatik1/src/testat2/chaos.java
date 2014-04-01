package testat2;
public class chaos
{
public static void main(String[] args) {
java.util.Scanner scanner = new java.util.Scanner(System.in);


int Var1=2,Var2=1;										//Var2 Jahre


double I=1;												//Zinsrate
double i=0.03;											//Startkapital
I=0.03;

String Name="",Mist="a";
System.out.print("St"+Mist+"r");
Mist=Mist+"p";
System.out.print("tk"+Mist+"i");						// print Startkapital >>
Mist=" ";
System.out.print("tal"+Mist+">>"+Mist);
Name=Mist+">";
i=scanner.nextDouble();									// Scanner Speichert das Startkapital in i


Mist=Name+">"+Mist;
Name="ahr";
System.out.print("J"+Name+"e"+Mist);
Name="a";												//  print Jahre >>
Var2=Var1;
Var2=scanner.nextInt();									// Scanner

System.out.print("En");    
for(int h=1;Var2>0;i=i*(1+I)){Var2=Var2-h;}				// berechnet das Entkapital

System.out.print("dk"+Name+"pi");     // print Entkapital >>

System.out.printf("t"+Name+"l"+Mist+"%.2f",i);   		// print Wert von Entkapital
scanner.close();
}
}
