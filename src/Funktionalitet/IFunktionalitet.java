package Funktionalitet;

import Data.DataException;

//Udviklet af Morten, Martin, Mikkel & Fahad 12/2-2017

public interface IFunktionalitet {// beregn BMI udfra personens CPR-nr

	double getBMI(String cpr); // returnér en tekst der beskriver BMI
								// intervallet

	String getTextualBMI(String cpr); // returnér perosn navn udfra CPR-nr

	String getNavn(String cpr) ; // returnér personens navn udfra CPR-nr

}
