package aflevering;

//creating the class LinkedStak that implements the interface.
public class LinkedStak implements Stak {
	
	/*creating a new type called "Element", which contains 3 variables.
	 * a value of the element (a string), the next element (an element) and the previous element (an element). 
	 */
	
	private class Element{
		private String s;
		private Element next;
		private Element previous;
	}
	
	//creating 3 instances of Element. The first, the actual and the previous.
	
	private Element first;
	private Element actual;
	private Element previous;
	
	
	public LinkedStak() {
		first = null;
	}
	//makes the current element contain a string.
	private void setElement(String e){
		actual.s = e;
	}
	//returns the string contained in the current element.
	private String getElement(Element actual){
		return actual.s;
	}
	
	/*creates the first element in the link. This also defines the previous element so it stays the same.
	 * this is only to be used for the first element in the link.
	 */
	
	private void insertFirst(){
		Element temp = new Element();
		first = temp;
		first.previous = previous;
		actual = first;
	}
	//creates a new element in the link. Also saves the previous Element in the newly created one. 
	private void insertNext(){
		Element temp = new Element();
		actual.next = temp;
		temp.previous = actual;
		actual = temp;
	}
	/*deletes the current element in the link.
	 * if the current element is the first element, set it to null.
	 */
	
	private void deleteElement(){
		if(actual != first){
			actual = actual.previous;
			actual.next = null;
		}
		else {
			actual = first = null;
		}
		
	}
	
	/*pops an element into the link. If the element is the first element in the link, it creates a new one
	 * via the insertFirst-method, and gives it a string (e).
	 * If the element is not the first one in the link, then it just creates a new element using the
	 * insertNext-method, and gives it a string (e).
	 */
	@Override
	public void push(String e) {
		if (empty()){
			insertFirst();
			setElement(e);
		}
		else {
			insertNext();
			setElement(e);
			
		}
	}

	//deletes an element from the link, and returns the String in it.
	@Override
	public String pop() {
		String keep = actual.s;
		deleteElement();
		return keep;
	}

	//returns true if the first element is null - meaning that the list is empty.
	@Override
	public boolean empty() {
		return (first == null);
	}

	//returns true if the next element is null - meaning that the list is empty.
	@Override
	public boolean full() {
		return (actual.next == null);
	}

	//displays the elements in the link, by going back through it, until the last element is reached.
	@Override
	public void show() {
		Element temp = new Element();
		temp = actual;
		while (temp != previous){
			System.out.print(getElement(temp)+" ");
			temp = temp.previous;
		}	
	}
}