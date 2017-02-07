import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayStakTest {


	ArrayStak arrayStak = new ArrayStak();
	@Test
	public void ArrayStakMethods(){
		
		assertTrue(arrayStak.empty()); //tester at arrayet er tomt fra start
		arrayStak.addWords();
		arrayStak.show(); //viser orderne i omvendt rækkefølge (og sletter)
		
		assertTrue(!arrayStak.full()); //arrayet er ikke fuld da show bruger pop
		
		System.out.println("----------");
		arrayStak.push("This"); //Tilføjer "This " i words arrayet
		arrayStak.push("is"); //Tilføjer "is " i words arrayet
		arrayStak.push("also"); //Tilføjer "also " i words arrayet
		arrayStak.push("a"); //Tilføjer "a " i words arrayet
		arrayStak.push("weird"); //Tilføjer "werid " i words arrayet
		arrayStak.push("sentence"); //Tilføjer "sentence " i words arrayet
		
		assertTrue(arrayStak.full()); //tester om arrayet er fuld
		arrayStak.show(); //viser alle orderne (sentence er her fjernet, grundet pop
		
		arrayStak.pop(); //fjerner hukommelsen på den sidste plads i arrayet
		
		assertTrue(!arrayStak.full()); //tjekekr nu at arrayet ikke er fuld længere
		
		arrayStak.show(); //viser alle orderne (sentence er her fjernet, grundet pop
		
		assertTrue(arrayStak.empty()); //grundet show, fjernes hukommelsen på alle pladser
		
	}
	
	
}
