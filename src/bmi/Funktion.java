//Author: Aleksander S114750, Simon S165153, Emil S153063

package bmi;

public class Funktion implements IFunktion{
	Data d = new Data();
	private double bmi;
	public Funktion(){
		
	}
	@Override
	public double getBMI(String cpr) {
		double vægt = d.getVaegt(cpr);
		double højde = d.getHoejde(cpr);
		bmi = (vægt/(højde*højde));
		return bmi;
	}

	@Override
	public String getTextualBMI(String cpr) {
		if(bmi < 18.5)
			return d.undervægt();
		else if(bmi < 25)
			return d.godVægt();
		else if(bmi <= 30)
			return d.overvægt();
		else
			return d.megetOvervægtig();
				
	}

	@Override
	public String getNavn(String cpr) {
		return d.getNavn(cpr);
	}

}
