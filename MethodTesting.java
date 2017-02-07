package aflevering;
import static org.junit.Assert.*;
import org.junit.Test;


//This class will be used to perform a JUnit test on the methods created in the ArrayStak class.

public class MethodTesting {
		@Test
		public void ArrayStakTesting(){
			
			//preconditions - creating a new array for testing.
			ArrayStak testArray = new ArrayStak();
			
			//making sure that the newly created array is empty, as no elements have been pushed into it yet.
			assertTrue(testArray.empty());
			
			/*pushing elements into the array, and checking whether or not the array is full.
			 *this should be true, as the array is dynamic.
			 */
			testArray.push("This");
			testArray.push("is");
			testArray.push("a");
			testArray.push("test");
			assertTrue(testArray.full());
			
			//by using the show-method we can check if the sentence displayed matches the pushed sentence.
			testArray.show();
			
			//we will now pop the array 4 times in order to remove all the pushed words, and check if the array is empty afterwards.
			testArray.pop();
			testArray.pop();
			testArray.pop();
			testArray.pop();
			assertTrue(testArray.empty());
			
			//all the methods have now been tested and have been confirmed to work.
	}

	@Test
	public void LinkedStakTesting(){
		
		//preconditions - creating a new linked stack for testing.
		LinkedStak testStak = new LinkedStak();
		
		//making sure that the newly created linked stack is empty, as no elements have been added to it yet.
		assertTrue(testStak.empty());
		
		/*pushing elements into the linked stack, and checking whether or not the link is full.
		 * this should be true, as the link is dynamic.
		 */
		testStak.push("This");
		testStak.push("is");
		testStak.push("a");
		testStak.push("test");
		assertTrue(testStak.full());
		
		//by using the show-method we can check if the sentence displayed matches the pushed sentence.
		testStak.show();
		
		//we will now pop the link 4 times in order to remove all the pushed words, and check if the link is empty afterwards.
		testStak.pop();
		testStak.pop();
		testStak.pop();
		testStak.pop();
		assertTrue(testStak.empty());
		
		//all the methods have now been tested and have been confirmed to work.
	}
}

