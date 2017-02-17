package Data;

import java.util.ArrayList;

//Udviklet af Morten, Martin, Mikkel & Fahad 12/2-2017

public class Data implements IData {
	
	

	private class Person {

		String cpr;
		String navn;
		double hoejde;
		double vaegt;

		public Person(String cpr, String navn, double hoejde, double vaegt) {

			this.cpr = cpr;
			this.navn = navn;
			this.hoejde = hoejde;
			this.vaegt = vaegt;
		}
	}

	private ArrayList<Person> personer;

	public Data() {
		personer = new ArrayList<Person>();

		// Tilføj personer
		personer.add(new Person("234567-8901", "Ib Olsen", 1.80, 75.0));
		personer.add(new Person("456789-0123", "Ole Jensen", 1.75, 95.0));
		personer.add(new Person("123456-7890", "Eva Hansen", 1.65, 65.0));
		personer.add(new Person("050195-1765", "Fahad Ali", 1.80, 90.0));
		
	}

	public String getNavn(String cpr) { // Returner personens navn

		int i = 0;
		
		while (true) {
			
			

			try {

				if (personer.get(i).cpr.equals(cpr)) {
					return personer.get(i).navn;
					

				}
				

			}

			catch (Exception E) {
				//System.out.println("exception e1");
				return null;
			}
			
			i++;

		}
		
		

	}

	public double getVaegt(String cpr) { // Returner personens vægt

		int i = 0;
		
		while (true) {
			
			

			try {

				if (personer.get(i).cpr.equals(cpr)) {
					return personer.get(i).vaegt;

				}
				

			}

			catch (Exception E) {
				//System.out.println("exception e2");
				return -1;
			}
			i++;

		}

	}

	public double getHoejde(String cpr) { // Returner personens hæjde

		int i = 0;
		
		while (true) {
			
			

			try {

				if (personer.get(i).cpr.equals(cpr)) {
					return personer.get(i).hoejde;

				}
				

			}

			catch (IndexOutOfBoundsException E) {
				//System.out.println("exception e3");
				return -1;
			}
			i++;

		}

	}

}
