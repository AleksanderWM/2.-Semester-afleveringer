package aflevering;
/*This class will be using the methods created in ArrayStak to push a few strings
 * and display them afterwards.
 */



public class StakTest{
		public static void main(String args[]){
			//an object of ArrayStak is created.
			ArrayStak testArray = new ArrayStak();
			//a sentence is pushed into the array.
			testArray.push("Dette");
			testArray.push("er");
			testArray.push("en");
			testArray.push("mærkelig");
			testArray.push("sætning");
			//the show-method is called and the printed result is expected to be the sentence in reverse order.
			testArray.show();
}
		
}