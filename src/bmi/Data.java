//Author: Aleksander S114750, Simon S165153, Emil S153063
//Dog kopieret fra opgaves�ttet det meste af det.
package bmi;

import java.util.ArrayList;
import java.util.Scanner;

public class Data implements IData{
private class Person {
				String cpr;
				String navn;
				double hoejde;
				double vaegt;
				public Person(String cpr, String navn, double hoejde, double vaegt) {
					super();
					this.cpr = cpr;
					this.navn = navn;
					this.hoejde = hoejde;
					this.vaegt = vaegt;
				}
	}
Scanner scan = new Scanner(System.in);
private ArrayList<Person> personer;
public Data(){
		personer = new ArrayList<Person>();
		// Tilf�j personer
		personer.add(new Person("234567-8901", "Ib Olsen", 1.80, 75.0));
		personer.add(new Person("456789-0123", "Ole Jensen", 1.75, 95.0));
		personer.add(new Person("123456-7890", "Eva Hansen", 1.65, 65.0)); }
public String getNavn(String cpr){ //Returner personens navn
	for (int i= 0; i< personer.size(); i++)
		if (personer.get(i).cpr.equals(cpr))
			return personer.get(i).navn;
	return null; }
public double getVaegt(String cpr){ //Returner personens v�gt
	for (int i= 0; i< personer.size(); i++)
		if (personer.get(i).cpr.equals(cpr))
			return personer.get(i).vaegt;
	return -1; }
public double getHoejde(String cpr){ //Returner personens h�jde
	for (int i= 0; i< personer.size(); i++)
		if (personer.get(i).cpr.equals(cpr))
			return personer.get(i).hoejde;
	return -1; }

public String underv�gt(){
	return "Du vejer for lidt";
}
public String godV�gt(){
	return "Din v�gt er passende";
}
public String overv�gt(){
	return "Du er overv�gtig";
}
public String megetOverv�gtig(){
	return "Du er sv�rt overv�gtig";
}
@Override
public String setUserString() {
	return scan.nextLine();
}

@Override
public int setUserInt() {
	return scan.nextInt();
}

@Override
public void opretPerson() {
	personer.add(new Person(setUserString(), setUserString(), setUserInt(), setUserInt()));
	
}
}
