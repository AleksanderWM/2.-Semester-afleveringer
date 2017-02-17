//Author: Aleksander S114750, Simon S165153, Emil S153063

package bmi;

public class Funktion implements IFunktion{
	Data d = new Data();
	private double bmi;
	public Funktion(){
		
	}
	@Override
	public double getBMI(String cpr) {
		double v�gt = d.getVaegt(cpr);
		double h�jde = d.getHoejde(cpr);
		bmi = (v�gt/(h�jde*h�jde));
		return bmi;
	}

	@Override
	public String getTextualBMI(String cpr) {
		if(bmi < 18.5)
			return d.underv�gt();
		else if(bmi < 25)
			return d.godV�gt();
		else if(bmi <= 30)
			return d.overv�gt();
		else
			return d.megetOverv�gtig();
				
	}

	@Override
	public String getNavn(String cpr) {
		return d.getNavn(cpr);
	}

}
