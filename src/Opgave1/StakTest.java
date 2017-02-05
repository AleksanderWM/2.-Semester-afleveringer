package Opgave1;
import static org.junit.Assert.*;
import org.junit.Test;

public class StakTest {
//	@Test
//	public void ArrayStakTest()
//	{
//		//Preconditions
//		ArrayStak stak = new ArrayStak();
//		//Test af at nyoprettet array er tomt.
//		assertTrue(stak.empty());
//		//pusher ting i arrayet og tjekker om arrayet er fyldt, som det burde v�re, da vi har lavet
//		//et "dynamisk" array
//		stak.push("Dette");
//		stak.push("er");
//		stak.push("en");
//		stak.push("m�rkelig");
//		stak.push("s�tning");
//		assertTrue(stak.full());
//		//vi laver herefter en show, og ser om den er lig s�tningen vi forventer
//		stak.show();		
//		//Popper alt i arrayet og tjekker om det er tomt. Forventer det er det.
//		stak.pop();
//		stak.pop();
//		stak.pop();
//		stak.pop();
//		stak.pop();
//		assertTrue(stak.empty());
//		//Vi har nu testet alle metoderne og kan komme frem til at de alle virker.
//	}
	@Test
	public void LinkedStakTest()
	{
		LinkedStak link = new LinkedStak();
		//Test af at nyoprettet LinkList er tomt.
		assertTrue(link.empty());
		//pusher ting i LinkedList og tjekker om det er fyldt
		link.push("Dette");
		link.push("er");
		link.push("en");
		link.push("m�rkelig");
		link.push("s�tning");
		assertTrue(link.full());
		//vi laver herefter en show, og ser om den er lig s�tningen vi forventer
		link.show();		
		//Popper alt i linkedlist og tjekker om det er tomt. Forventer det er det.
		link.pop();
		link.pop();
		link.pop();
		link.pop();
		link.pop();
		assertTrue(link.empty());
		//Vi har nu testet alle metoderne og kan komme frem til at de alle virker.
		
	}
	
	
	

}
