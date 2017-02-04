package Opgave1;

public class LinkedStak implements Stak {

	
	class Element
	{
		private String x;
		private Element next;
	}
	private Element first;
	private Element actual;
	
	public LinkedStak(){
		first = actual = null;
	}
	
	public void setFirst()
	{
		actual = first;
	}
	public void setNext(){
		actual = actual.next;
	}
	public void save(String e){
		actual.x = e;
	}
	public String get(){
		return actual.x;
	}
	public void saveFirst(String e){
		first.x = e;
	}
	public String getFirst(){
		return first.x;
	}
	public void insertFirst(){
		Element temp= new Element();
		temp.next = first;
		first = temp;
	}
	public void insertNext(){
		Element temp = new Element();
		temp.next = actual.next;
		actual.next = temp;
	}
	public void deleteFirst(){
		first = first.next;
	}
	public void deleteNext(){
		actual.next = actual.next.next;
	}
	public boolean empty2(){
		return first == null;
	}
	public boolean last(){
		return actual.next == null;
	}
	
	@Override
	public void push(String e) {
		
		
	}

	@Override
	public String pop() {
		
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean full() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}
	

