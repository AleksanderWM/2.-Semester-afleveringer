package aflevering;
/*This class will be using the methods created in LinkedStak to push a few strings
 * and display them afterwards.
 */
public class LinkedTest {
	public static void main(String args[]){
	//an object of LinkedStak is created.
	LinkedStak testStak = new LinkedStak();
	
	//pushing a sentence into the Link.
	testStak.push("Dette");
	testStak.push("er");
	testStak.push("en");
	testStak.push("mærkelig");
	testStak.push("sætning");
	
	//using the show-method to print the sentence.
	testStak.show();
	}
}
