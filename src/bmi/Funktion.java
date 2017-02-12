//Author Morten Christiansen, s162682
//Created 7/2-17
package bmi;

public class Funktion implements IFunktion{
	
	private Data d;
	public Funktion (Data d){
		this.d=d;
	}
	//udregner BMI ud fra det givende CPR-nummer
	public double getBMI(String cpr) {
		double bmi;
		bmi=d.getVaegt(cpr)/(d.getHoejde(cpr)*d.getHoejde(cpr));
		return bmi;
	}
	//returnere en teksfil i forhold til det BMI der er knyttet til det givende CPR-nummer
	public String getTextualBMI(String cpr) {
		String ditBMI = " ";
		if (this.getBMI(cpr) < 18.5){
			ditBMI= d.getNavn(cpr) + " vejer for lidt";
		}
		else if (this.getBMI(cpr) >= 18.5 && this.getBMI(cpr) < 25){
			ditBMI= d.getNavn(cpr) + " har en passende vægt";
		}
		else if (this.getBMI(cpr) >= 25 && this.getBMI(cpr) <= 30){
			ditBMI= d.getNavn(cpr) + " er overvægtig";
		}
		else if (this.getBMI(cpr) > 30){
			ditBMI=d.getNavn(cpr) + " er svært overvægtig";
		}
		return ditBMI;
	}
	//returnerer navnet der hører til det givende CPR-nummer
	public String getNavn(String cpr) {
		String navn;
		navn=d.getNavn(cpr);
		return navn;
	}
}
