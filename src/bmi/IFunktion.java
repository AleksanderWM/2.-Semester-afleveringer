//Author: Aleksander S114750, Simon S165153, Emil S153063
package bmi;

public interface IFunktion { // beregn BMI udfra personens CPR-nr
		 double getBMI(String cpr); // return�r en tekst der beskriver BMI intervallet
		String getTextualBMI(String cpr); // return�r perosn navn udfra CPR-nr
		String getNavn(String cpr); } // return�r perosn navn udfra CPR-nr



