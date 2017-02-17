//Author: Aleksander S114750, Simon S165153, Emil S153063
package bmi;

import java.util.Scanner;

public class TUI {

	public static void main(String[] args) {
		int i = 0;
		Funktion f = new Funktion();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Indtast CPR nummer, afslut med enter");
		String cpr = scan.nextLine();
		while(i < 10)
		{
			System.out.println("Tast 1 for at udregne BMI");
			System.out.println("Tast 2 for at få at vide om det er godt");
			System.out.println("Tast 3 for at få navnet på den aktuelle person");
			System.out.println("Tast 4 for at indtaste nyt CPR nummer");
			System.out.println("Tast 5 for at afslutte programmet");
			i = scan.nextInt();
			if(i == 1){
				System.out.println(f.getBMI(cpr));
			}
			else if(i == 2){
				System.out.println(f.getTextualBMI(cpr));
			}
			else if(i == 3){
				System.out.println(f.getNavn(cpr));
			}
			else if(i == 4){
				System.out.println("Indtast nyt cpr nummer:");
				scan.nextLine();
				cpr = scan.nextLine();
			}
			else if(i == 5){
				System.exit(0);
			}
			
		}
		
		
		

	}

}
