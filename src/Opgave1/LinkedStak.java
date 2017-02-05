package Opgave1;

public class LinkedStak implements Stak {

	//Klasse til at oprette elementer til at oprette stakken.
	private class Element
	{
		private Element last;
		private String x;
		private Element next;
		
	}
	//Opretter 3 objekter af element. et sidste element, som l�gges f�r first.
	// et first element som indikerer f�rst kort.
	// et actual element, som indikerer det element der er aktuelt.
	private Element last;
	private Element first;
	private Element actual;

	
	//Konstrukt�r til at oprette linkedstak object. 
	public LinkedStak(){
		first = null;
	}
	//S�tter den aktuelle til at v�re den f�rste.
	private void setFirst()
	{
		actual = first;
	}
	//Gemmer en string v�rdi i det aktuelle element.
	private void save(String e){
		actual.x = e;
	}
	//Returnere det aktuelle elements string v�rdi.
	private String get(String e){
		return e;
	}
	//Inds�tter det f�rste element i en stak, og definerer at first.last er last.
	private void insertFirst(){
		Element temp = new Element();
		temp.next = first;
		first = temp;
		first.last = last;
	}
	//Inds�tter et nyt element i stakken. Men holder stadig styr p� det foreg�ende element.
	private void insertNext(){
		Element temp = new Element();
		actual.next = temp;
		temp.last = actual;
		actual = temp;
		
	}
	//Fjerner et element, ved at g� et skridt tilbage i stakken, og s� s�tte .next til null
	private void delete(){
		if(actual != first){
		actual = actual.last;
		actual.next = null;
		}
		else actual = first = null;
		
	}
	
	@Override
	//inds�tter nyt element p� stakken
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
	//Tjekker om stakken er tomt, ved at se om det f�rste element, er null
	public boolean empty() {
		return (first == null);
	}

	@Override
	//Tjekker om stakken er tom, ved at se om det n�ste element er null.
	public boolean full() {
		return (actual.next == null);
	}

	@Override
	//Printer ud, s� l�nge at det aktuelle element ikke er last, og g�r tilbage i stakken
	//ved hj�lp af .last
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
	

