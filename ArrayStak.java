package aflevering;
import java.lang.reflect.Array;

//creating the class ArrayStak that implements the interface.
public class ArrayStak implements Stak {

	private int top; //this int will be used to determine our location in the array.
	private int arraysize; //this int will be used to determine the size of the array.
	private String[] stack; //creating a string array.
	
	/*creating a constructor for the ArrayStak-object. This will make sure that the object is always
	 * going to contain the top int, the arraysize int and the String array.
	 */
	
	public ArrayStak(){
		top = -1;
		arraysize = 1;
		stack = new String[arraysize];
		
	}
	/*this method will be used to add elements to the array.
	 * if the array becomes too full to hold anymore elements a new, larger, array will be created.
	 * this new array will contain all the elements from the old array, and take its place.
	 */
	@Override
	public void push(String e) {
		if (full()){
			String stack2[] = new String[arraysize+1];
			System.arraycopy(stack, 0, stack2, 0, Array.getLength(stack));
			stack=stack2;
			arraysize=Array.getLength(stack);	
		}
		stack[++top]=e;
		
	}
	//this method will be used to remove an element from the array. It will also be able to display a message if the array is empty.
	@Override
	public String pop() {
		if(!empty()){
			return stack[top--];
		}
		else {
			System.out.println("The stack is empty. Can no longer pop.");
		return null;
		}
	}

	//creating a method to signal that the stack is empty. This is done by returning "true", when the top variable = -1.
	@Override
	public boolean empty() {
		return (top == -1);
	}
	
	/*creating a method to signal that the stack is full. 
	 * This is done by returning "true", when the top variable is one less than the size of the array. */
	@Override
	public boolean full() {
		return (top == arraysize-1);
	}
	/*creates a method for showing the contents of the array, without popping the contents displayed.
	 * this is done by creating the second int variable called "showEle" (short for show Element).
	 * this variable will be = to the top variable, and therefore it won't pop the stack as it would've if top was used.
	 */
	@Override
	public void show() {
		int showEle = top;
		while (showEle!=-1){
			System.out.print(stack[showEle--]+" ");
			
		}
	
	}	
}



