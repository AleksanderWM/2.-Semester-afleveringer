package Grænseflade;

import java.util.Scanner;

import Data.DataException;
import Funktionalitet.IFunktionalitet;

//Udviklet af Morten, Martin, Mikkel & Fahad 12/2-2017

public class TUI {

	private IFunktionalitet f;
	DataException problem = new DataException("FEJL I ARRAY ingen person");

	public TUI(IFunktionalitet f) {
		this.f = f;
	}

	public void kommunikation() throws DataException {

		Scanner tastatur = new Scanner(System.in);
		String cpr = null;

		do {
			System.out.println("1. indtast cpr-nr (på formen XXXXXX-XXXX): ");
			System.out.println("\n2. Tast ''slut'' FOR AT AFSLUTTE");

			cpr = tastatur.nextLine();

			if (cpr.equals("slut"))
				System.out.println("bye");

			else if (cpr.length() != 11)
				System.out.println("prøv igen");

			else if (!cpr.equals("slut")){
				f.getBMI(cpr);
				
				if(f.getNavn(cpr) == null || f.getBMI(cpr)==-1){
					throw problem;
					
				}
				
				System.out.println("Navn: " + f.getNavn(cpr) + ", BMI: " + f.getTextualBMI(cpr));
				}

		} while (!cpr.equals("slut"));

	}

}
