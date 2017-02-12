//Author Morten Christiansen, s162682
//Created 11/2-17
package bmi;

public class Main {

	public static void main(String[] args) {
		Data d= new Data();
		Funktion f = new Funktion(d);
		Grænseflade g = new Grænseflade(f);
		g.menu(); //starter menu-metoden fra Grænseflade
	}
	
}
