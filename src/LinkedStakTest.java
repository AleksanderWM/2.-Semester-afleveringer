import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedStakTest {
	
	LinkedStak linkedStak = new LinkedStak();
	@Test
	public void LinkedStakMethods(){
		assertTrue(linkedStak.empty()); //Tjekker at stakken er tom
		
		linkedStak.push("This"); //tilføjer element med string i stakken
		linkedStak.push("is");	//tilføjer element med string i stakken
		linkedStak.push("a");	//tilføjer element med string i stakken	
		linkedStak.push("weird");	//tilføjer element med string i stakken
		linkedStak.push("sentence");	//tilføjer element med string i stakken
		assertTrue(!linkedStak.full());	//tjekker at stakken ikke er fuld (vil altid returnerer false)
		assertTrue(!linkedStak.empty()); //tjekker at stakken ikke er tom
		linkedStak.show(); //udskriver stakken fra nyeste til ældst.
		
		linkedStak.delete(); 	//fjerner det seneste element og tilhørende string i stakken
		linkedStak.delete();	//fjerner det seneste element og tilhørende string i stakken
		linkedStak.delete();	//fjerner det seneste element og tilhørende string i stakken
		linkedStak.delete();	//fjerner det seneste element og tilhørende string i stakken
		assertTrue(!linkedStak.empty()); //tjekker stakken ikke er tom
		linkedStak.delete();	//fjerner det seneste element og tilhørende string i stakken
		assertTrue(linkedStak.empty()); //tjekker at stakken er tom
		
		System.out.println("----------");
		linkedStak.push("order"); //tilføjer element med string i stakken
		linkedStak.push("readable");	//tilføjer element med string i stakken
		linkedStak.push("a");	//tilføjer element med string i stakken	
		linkedStak.push("in");	//tilføjer element med string i stakken
		linkedStak.push("is");	//tilføjer element med string i stakken
		linkedStak.push("sentence");	//tilføjer element med string i stakken
		linkedStak.push("this");	//tilføjer element med string i stakken
		linkedStak.show(); //udskriver stakken fra nyeste til ældst.
		assertTrue(!linkedStak.empty()); //tjekker stakken ikke er tom
		
	}

}
