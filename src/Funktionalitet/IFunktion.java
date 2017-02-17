package Funktionalitet;

import Data.Data;
import Data.DataException;

//Udviklet af Morten, Martin, Mikkel & Fahad 12/2-2017

public class IFunktion implements IFunktionalitet {

	private Data d;
	double BMI;
	double vægt;
	double højde;
	

	public IFunktion(Data d) {
		this.d = d;
		this.BMI = 0;
		this.vægt = 0;
		this.højde = 0;
	}

	@Override
	public double getBMI(String cpr)  { // beregner BMI udfra persons CPR-nr
		
		højde = d.getHoejde(cpr);
		vægt = d.getVaegt(cpr);
		BMI = vægt / Math.pow(højde, 2);

		return BMI;
	}

	@Override
	public String getTextualBMI(String cpr) { // returnér en tekst der beskriver
												// BMI intervallet


		if (BMI < 18.5 && BMI > 0 )
			return ("Dit BMI er " + BMI + " Du vejer for lidt \n");
		else if (BMI >= 18.5 && BMI < 25)
			return ("Dit BMI er " + BMI + " Din vægt er passende\n");
		else if (BMI >= 25 && BMI <= 30)
			return ("Dit BMI er " + BMI + " Du er overvægtig\n");
		else if (BMI > 30)
			return ("Dit BMI er " + BMI + " Du er svært overvægtig\n");

		else
			return ("FEJL");
	}

	@Override
	public String getNavn(String cpr) { // returnér personens navn udfra CPR-nr

		String navn = d.getNavn(cpr);

		return navn;
	}

}
