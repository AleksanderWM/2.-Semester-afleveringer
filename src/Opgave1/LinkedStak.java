package Opgave1;

public class LinkedStak implements Stak {

	
	private class Element
	{
		private Element last;
		private String x;
		private Element next;
		
	}


	private Element first;
	private Element actual;
	private Element last;
	
	public LinkedStak(){
		first = null;

	}
	
	private void setFirst()
	{
		actual = first;
	}

	private void save(String e){
		actual.x = e;
	}
	private String get(){
		return actual.x;
	}

	private void insertFirst(){
		Element temp = new Element();
		temp.next = first;
		first = temp;
		first.last = last;
	}
	private void insertNext(){
		Element temp = new Element();
		temp.last = actual;
		actual.next = temp;
		actual = temp;
		
	}
	private void delete(){
		if(actual == first){
			first = actual = null;
		}
		
		else if(full()){
			Element temp = new Element();
			temp = actual.last;
			actual = temp;
			actual.next = null;
		}
		
	}
	private void findLast(){
		setFirst();
		while(actual.next != null){
			actual = actual.next;
		}
	}
	
	@Override
	public void push(String e) {
		if(first == null){
			insertFirst();
			setFirst();
			save(e);	
		}
		else {
			insertNext();
			save(e);
		}
	}

	@Override
	public String pop() {
		findLast();
		String temp = actual.x;
		delete();
		if(actual != last)
			findLast();
		return temp;
		

		
	}
		

	@Override
	public boolean empty() {
		return (first == null);
	}

	@Override
	public boolean full() {
		return (actual.next == null);
	}

	@Override
	public void show() {
		while(actual.last != null){
			System.out.print(get() + " ");
			Element temp = new Element();
			temp = actual.last;
			actual = temp;
		}
		System.out.println(get());

	}
}
	

