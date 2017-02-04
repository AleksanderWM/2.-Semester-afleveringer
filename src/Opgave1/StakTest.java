package Opgave1;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class StakTest {
	@Test
	public void ArrayStakTest()
	{
		//Preconditions
		ArrayStak stak = new ArrayStak();
		//Test af at nyoprettet array er tomt.
		assertTrue(stak.empty());
		//pusher ting i arrayet og tjekker om arrayet er fyldt, som det burde være, da vi har lavet
		//et "dynamisk" array
		stak.push("Dette");
		stak.push("er");
		stak.push("en");
		stak.push("mærkelig");
		stak.push("sætning");
		assertTrue(stak.full());
		//vi laver herefter en show, og ser om den er lig sætningen vi forventer
		stak.show();		
		//Popper alt i arrayet og tjekker om det er tomt. Forventer det er det.
		stak.pop();
		stak.pop();
		stak.pop();
		stak.pop();
		stak.pop();
		assertTrue(stak.empty());
		//Vi har nu testet alle metoderne og kan komme frem til at de alle virker.
	}
	
	
	

}
