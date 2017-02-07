public class ArrayStak implements Stak {
	
	/**
	 * Jeg opretter et array af størrelsen 0, 
	 * svarende til at jeg definerer at have en tom bunke kort, 
	 * hvor der endnu ikke er tilføjet et kort i bunken.
	 * 
	 * Desuden opretter jeg en integer svarende til størrelsen på mit array (0)
	 */
	
	private int size;
	private String AStak[];
	
	public ArrayStak()
	{
		AStak = new String[0];
		size = AStak.length;
	}
	
	
	//public String[] AStak = new String[0];
	
	@Override
	public void push(String e) 
	{
		String[] tempArray = new String[size+1];
		System.arraycopy(AStak, 0, tempArray, 0, AStak.length);
		AStak = new String[size+1];
		AStak = (String[])tempArray.clone();
		AStak[size] = e;
		size++;
	}

	@Override
	/**
	 * Hvis der er elementer i stakken returneres det første element som også fjernes fra stakken.
	 * Hvis stakken er tom returneres en fejlbesked
	 */
	public String pop() {
		if(empty() == false)
		{
		String[] tempArray = new String[size-1];
		String hold = AStak[size-1];
		System.arraycopy(AStak, 0, tempArray, 0, tempArray.length);
		AStak = new String[size-1];
		AStak = (String[])tempArray.clone();
		size--;
		return hold;
		}
		else
			return ("Stack is empty");
	}

	@Override
	public boolean empty() {
		return(size == 0);
	}

	@Override
	public boolean full() {
		if(AStak[AStak.length-1] != null)
			return true;
		else
			return false;
	}

	@Override
	public void show() {
		for(int i=AStak.length;i>0 ; i--)
			System.out.print(AStak[i-1] + " ");
	}
}
