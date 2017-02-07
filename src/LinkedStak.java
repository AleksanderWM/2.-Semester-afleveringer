public class LinkedStak implements Stak{
	
	private class Element {
		private Element prior; 
		private String word;
		private Element next;
		 
	 }
	 	private Element prior;
	 	private Element first;
	 	private Element current;
	 	
	 /*
	  * den første (og nuværende) værdi sættes til null, da vi ikke har angivet nogen værdi endnu
	  */
	 public LinkedStak(){
			 first = current = null;
	 	}
	 /*
	  * set metode til at gemme en string på elementet
 	 */
	 public void set(String v){
			 current.word = v;
		 }
	/*
	* get metode til at hente stringen på det nuværende element
	*/
	public String get(Element current){
			 return current.word;
		 }
	/*
	* Bruges kun ved første element.
	* Gemmer en string på det første element
	*/
	public void addFirst(){
			 Element temp = new Element();
			 first = temp;
			 first.prior = prior;
			 current = first;
		 }
	/*
	* Tilføjer en string på det næste element i stakken
	*/
	 public void addNext(){
			 Element temp = new Element();
			 current.next = temp;
			 temp.prior = current;
			 current = temp;
		}
	/*
	* fjerner det nuværende (seneste) element.
	* Dette sker ved at det nuværende element sættes til det forrige,
	* og det og det nuværende dermed slettes fra hukommelsen.
	*/
	public void delete(){
			 if(current != first){
			current = current.prior;
			current.next=null;
			 }
			 else {
			 current = first = null;
		 }
		 }
	
	/*
	 * Bruges til at lave et ekstra element, som en string gemmes på.
	 * Er vores element liste tom, bruges if sætningen. 
	 * Har vores liste fået tildelt værdier, anvendes else sætningen.
	 */
	public void push(String e) {
		// TODO Auto-generated method stub
		if(first == null){
			addFirst();
			set(e);
		}
		else {
			addNext();
			set(e);
		}
	}
	/*
	 *	Sletter det seneste element (stringen slettes altså også)
	 */
	public String pop() {
		// TODO Auto-generated method stub
		String temp = current.word;
		delete();
		return temp;
	}
	/*
	 * Undersøger om stakken er tom.
	 * Bruges til at undersøge om vi skal gemme vores string på den første plads,
	 * eller ej.
	 */
	public boolean empty() {
		// TODO Auto-generated method stub
		return (first == null);
	}
	/*
	 * Undersøger om stakken er fuld.
	 * Dog har jeg sat denne metode til altid at returnere false,
	 * da stakken altid kan blive større (der kommer selvfølgelig en grænse,
	 * i forhold til ens ram)
	 */
	public boolean full() {
		// TODO Auto-generated method stub
		return false;
	}
	/*
	 * Viser de gemte stringe på stakken fra nyeste string til ældst.
	 */
	public void show() {
		// TODO Auto-generated method stub
		Element temp = new Element();
		temp = current;
		while (temp != prior){
			System.out.println(get(temp));
			temp = temp.prior;
		}
			}
	}


