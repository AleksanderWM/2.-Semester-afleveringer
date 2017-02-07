public class LinkedStak implements Stak {
/**
 *Jeg opretter en type kaldet "Element". Hvert element indeholder 3 variable:
 *Et forrigt element, det næste element og så selve værdien som det aktuelle element indeholder
 *Jeg opretter nu 3 instanser af element, et første element, et forrige element og et aktuelt element.
 */
	private class Element
	{
		private Element previous;
		private String value;
		private Element next;
		
	}

	private Element previous;
	private Element first;
	private Element actual;


	public LinkedStak(){
		first = null;
	}

	//Sætter et element til at indeholde en streg
	private void set(String e){
		actual.value = e;
	}
	
	//Returnere strengen fra det aktuelle element
	private String get(Element actual){
		return actual.value;
	}
	
	//Opretter det første element, og definerer at til det element er det forrige element sig selv.
	//Denne metoder skal kun bruges til det første element 
	private void createFirst(){
		Element elem = new Element();
		first = elem;
		first.previous = previous;
		actual = first;
	}
	
	//Opretter et nyt element i listen, og gemmer referencen til det forrige element i det nye
	private void createNext(){
		Element elem = new Element();
		actual.next = elem;
		elem.previous = actual;
		actual = elem;
		
	}
	//Sletter det nuværende element ved at definere at det forrige element nu er det aktuelle, og derefter slette dennes "next"
	//Hvis det aktuelle element er det første element i listen bliver det blot sat til null. Man vil skulle køre createFirst() for at oprette listen igen.
	private void delete(){
		if(actual != first){
		actual = actual.previous;
		actual.next = null;
		}
		else actual = first = null;
	}
	
	@Override
	//Push opretter et nyt element ved enden af listen. Hvis der endnu ikke er et eneste element på listen oprettes et first.
	//Det oprettede element for tildelt streng-værdien ved e parametren
	public void push(String e) {
		if(empty()){
			createFirst();
			set(e);	
		}
		else {
			createNext();
			set(e);
		}
	}

	@Override
	//Sletter et element fra listen og returnere strengen der lå i en
	public String pop() {
		String hold = actual.value;
		delete();
		return hold;
	}

	@Override
	//Returnerer true hvis listen ikke indeholder nogen elementer
	public boolean empty() {
		return (first == null);
	}

	@Override
	//Returnerer om listen er fuld ved at se om der et element på den kommende plads
	public boolean full() {
		return (actual.next == null);
	}

	@Override
	//Printer ud, så længe at det aktuelle element ikke er last, og går tilbage i stakken
	//ved hjælp af .last
	public void show() {
		Element elem = new Element();
		elem = actual;
		while(elem != previous){
			System.out.print(get(elem)+ " ");
			elem = elem.previous;
		}
	}
}
