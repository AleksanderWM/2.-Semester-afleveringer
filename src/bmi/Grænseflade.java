//Author Morten Christiansen, s162682
//Created 11/2-17
package bmi;

import java.util.Scanner;

public class Grænseflade {
	private Funktion f;
	private String cpr;
	private double i = -1.0;
	Scanner scanner = new Scanner(System.in);
	public Grænseflade (Funktion f){
		this.f=f;
	}
	//metode, som kører programmet
	public void menu(){
		System.out.println("Dette program udregner BMI ud fra et angivet CPR-nummer");
		System.out.println("Du kan vælge mellem følgende profiler:");
		cpr = "234567-8901";
		System.out.println("Personen: "+ f.getNavn(cpr) + ", ved at skrive CPR-nummeret: " + cpr);
		cpr = "456789-0123";
		System.out.println("Personen: "+ f.getNavn(cpr) + ", ved at skrive CPR-nummeret: " + cpr);
		cpr = "123456-7890";
		System.out.println("Personen: "+ f.getNavn(cpr) + ", ved at skrive CPR-nummeret: " + cpr);
		while(true){	//Loop for at kunne prøve andre CPR-numre
		System.out.println("Angiv en af ovenstående CPR-numre. Skriv slut for at stoppe");
		cpr = scanner.nextLine(); //Brugeren skriver et CPR-nummer
		if (i!=f.getBMI(cpr)){ //tjekker at BMI ikke returnere -1.0 (altså at CPR-nummeret findes i registeret)
		System.out.println("Du har valgt BMI for " + f.getNavn(cpr));
		System.out.println(f.getNavn(cpr) + " har en BMI på " + f.getBMI(cpr));
		System.out.println("Dette betyder at " + f.getTextualBMI(cpr));
		System.out.println("Tryk enter for at prøve med et andet CPR-nummer. Skriv slut for at stoppe");
		cpr = scanner.nextLine().trim();
		}
		if(cpr.equals("slut")){ //går ud af while-loopet hvis der skrives slut i konsollen
			break;
		}
		}
		System.out.println("Farvel");
		scanner.close();
		System.exit(0);
	}
}
