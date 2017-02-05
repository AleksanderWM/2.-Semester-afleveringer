package Opgave1;

public class LinkedStak implements Stak {

	//Klasse til at oprette elementer til at oprette stakken.
	private class Element
	{
		private Element last;
		private String x;
		private Element next;
		
	}
	//Opretter 3 objekter af element. et sidste element, som lægges før first.
	// et first element som indikerer først kort.
	// et actual element, som indikerer det element der er aktuelt.
	private Element last;
	private Element first;
	private Element actual;

	
	//Konstruktør til at oprette linkedstak object. 
	public LinkedStak(){
		first = null;
	}
	//Sætter den aktuelle til at være den første.
	private void setFirst()
	{
		actual = first;
	}
	//Gemmer en string værdi i det aktuelle element.
	private void save(String e){
		actual.x = e;
	}
	//Returnere det aktuelle elements string værdi.
	private String get(String e){
		return e;
	}
	//Indsætter det første element i en stak, og definerer at first.last er last.
	private void insertFirst(){
		Element temp = new Element();
		temp.next = first;
		first = temp;
		first.last = last;
	}
	//Indsætter et nyt element i stakken. Men holder stadig styr på det foregående element.
	private void insertNext(){
		Element temp = new Element();
		actual.next = temp;
		temp.last = actual;
		actual = temp;
		
	}
	//Fjerner et element, ved at gå et skridt tilbage i stakken, og så sætte .next til null
	private void delete(){
		if(actual != first){
		actual = actual.last;
		actual.next = null;
		}
		else actual = first = null;
		
	}
	
	@Override
	//indsætter nyt element på stakken
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
	//fjerner et element fra stakken.
	public String pop() {
		String temp = actual.x;
		delete();
		return temp;
	}

	@Override
	//Tjekker om stakken er tomt, ved at se om det første element, er null
	public boolean empty() {
		return (first == null);
	}

	@Override
	//Tjekker om stakken er tom, ved at se om det næste element er null.
	public boolean full() {
		return (actual.next == null);
	}

	@Override
	//Printer ud, så længe at det aktuelle element ikke er last, og går tilbage i stakken
	//ved hjælp af .last
	public void show() {
		if(actual != null){
		Element temp = new Element();
		temp = actual;
		while(temp != last){
			System.out.print(get(temp.x)+ " ");
			temp = temp.last;
		}
		}
		else System.out.println("There is nothing in the stack");
	}
}
	

