package Opgave1;
import java.lang.reflect.Array;

public class ArrayStak implements Stak {

		// TODO Auto-generated method stub

	
	private int sizeOfStak; //vi bruger denne til at holde styr p� hvor stort vores array er.
	private String stakArray[]; //opretter et array af strings
	private int top; // opretter en int, til at holde styr p� hvor i stacken vi er, i forhold til arrayet.
	
	/**
	 * Opretter constructor til at et arraystak object altid indeholder:
	 * st�rrelsen p� stakken/arrayet
	 * Et array af strings.
	 * en int v�rdi til at holde styr p� hvilket nr top kortet er, for at finde det i arrayet.
	 */
	public ArrayStak ()
	{
		sizeOfStak = 1;
		stakArray = new String[sizeOfStak];
		top = -1;
	}

	@Override
	//Med denne s�tter vi endnu en string ind, efter at vi har h�vet v�rdien top med en.
	//Hvis arrayet er fyldt, oprettes et nyt array, alt kopieres over, og arrayet bliver kopieret med 1. array for at �bne plads igen.
	public void push(String e) {
		if(full()){
			String stakArray2[] = new String[sizeOfStak+1];
			System.arraycopy(stakArray, 0, stakArray2, 0, Array.getLength(stakArray));
			stakArray = stakArray2;
			sizeOfStak = Array.getLength(stakArray);
		}
		stakArray[++top] = e;
	}

	@Override
	// Her printes den sidst indf�rte i arrayet, for s� at fjerne den.
	// Er der intet tilbage g�r den intet.
	public String pop() {
		if (!empty()){
			return stakArray[top--];
		}
		return null;
	}

	@Override
	// Vi laver her en metode som s�rger for at der returneres TRUE, n�r top = -1
	public boolean empty() {
		return (top == -1);
	}

	@Override
	//Tjekker her for om stakken er fuld, ved at matche top med st�rrelse p� stakken, minus 1
	public boolean full() {
		return (top == (sizeOfStak - 1));
	}

	@Override
	//Viser hvad der er i Arrayet/stakken, dog uden at "poppe" dem v�k fra arrayet som �nsket.
	//Hvis stakken skulle poppes mens der showes, skulle der fjernes showNr og inds�ttes top.
	public void show() {
		int showNr = top;
		while(showNr != -1)
			System.out.print(stakArray[showNr--]+ " ");
	}
	
	}
