import java.lang.reflect.Array;

public class ArrayStak implements Stak {
	int maxSize;
	int top;
	String words[];

	public ArrayStak (){
		maxSize = 1; 
		words = new String [maxSize];
		top = -1;
	}
//	
	/**
	 * En ny string tilføjes i vores array, og vores top-værdi øges med en.
	 * Er vores array full, kopieres arrayet over i et nyt array med en ekstra plads,
	 * og kopieres tilbage.
	 */
	public void push(String e) {
		if(full()) {
			String newArray[] = new String[maxSize+1]; 
			System.arraycopy(words, 0, newArray, 0, Array.getLength(words));
			words = newArray;
			maxSize = Array.getLength(words);
		}
			words[++top] = e;
	}
	/**
	 * fjerner hukommelsen på den sidste plads i arrayet
	 */
	public String pop() {
		if(!empty()){
		String word = words[top--];
		return word;
		}
		else{
			return null;
		}
	}
		
	/*
	 * En boolean metode for at undersøge om arrayet er fuld.
	 * Dette er tilfældet, når top er -1 (da dette er angivet i konstruktøren)
	 */
	public boolean empty() {
		return(top == -1);
	}
	/**
	 * en boolean metode til at undersøge om vores array er fuld
	 */
	public boolean full() {
		return(top == maxSize-1);
	}
	/*
	 * viser hvad arrayet indeholder ved at bruge pop metoden.
	 * Dog slettes refferencerne undervejs.
	 */
	public void show() {
			while(!empty()){
			System.out.println(pop());
			}
		
	}
	void addWords() {
		push("This");
		push("is");
		push("a");
		push("weird");
		push("sentence");
		}
}
