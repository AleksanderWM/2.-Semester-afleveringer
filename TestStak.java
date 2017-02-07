import static org.junit.Assert.*;

import org.junit.Test;

public class TestStak {

	@Test
	public void arrayTest() {

		//Set-up
		ArrayStak stak = new ArrayStak();
			//Jeg tester om den er blevet oprettet tom
		assertTrue(stak.empty());
		
		//Test
		stak.push("Dette");
		stak.push("er");
		stak.push("en");
		stak.push("mærkelig");
		stak.push("sætning");
		
			//Er den et element i den sidste plads i arrayet?
		assertTrue(stak.full());
		
			//Jeg printer arrayet, det forventes at der til konsollen bliver skrevet "sætning mærkelig en er Dette"
		stak.show();
		System.out.println("");
		
			//Jeg tømmer arrayet igen
		stak.pop();stak.pop();stak.pop();stak.pop();stak.pop();
		
			//Er arrayet tomt?
		assertTrue(stak.empty());
		
			//Jeg printer arrayet, det forventes at der intet vil blive printet
		stak.show();
		
		
	}
	
	@Test
	public void linkedTest() 
	{
		//Set-up
		LinkedStak stak = new LinkedStak();
			//Jeg tester om den er blevet oprettet tom
		assertTrue(stak.empty());
		
		//Test
		stak.push("Dette");
		stak.push("er");
		stak.push("en");
		stak.push("mærkelig");
		stak.push("sætning");
		
			//Er den et element i den sidste plads i arrayet?
		assertTrue(stak.full());
		
			//Jeg printer listen, det forventes at der til konsollen bliver skrevet "sætning mærkelig en er Dette"
		stak.show();
		System.out.println("");
		
			//Jeg tømmer listen igen
		stak.pop();stak.pop();stak.pop();stak.pop();stak.pop();
		
			//Er listen tom?
		assertTrue(stak.empty());
		
			//Jeg printer listen, det forventes at der intet vil blive printet
		stak.show();
		
	}

}
