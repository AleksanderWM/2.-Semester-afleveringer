//Author: Aleksander S114750, Simon S165153, Emil S153063
package bmi;

public interface IFunktion { // beregn BMI udfra personens CPR-nr
		 double getBMI(String cpr); // returnér en tekst der beskriver BMI intervallet
		String getTextualBMI(String cpr); // returnér perosn navn udfra CPR-nr
		String getNavn(String cpr); } // returnér perosn navn udfra CPR-nr



