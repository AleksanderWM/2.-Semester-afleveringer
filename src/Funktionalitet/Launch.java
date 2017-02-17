package Funktionalitet;

import Data.Data;
import Data.DataException;
import Grænseflade.TUI;

//Udviklet af Morten, Martin, Mikkel & Fahad 12/2-2017

public class Launch {

	public static void main(String[] args)  {

		Data d = new Data();
		IFunktionalitet f = new IFunktion(d);
		TUI t = new TUI(f);
		
		try{
		t.kommunikation(); }
		
		catch(DataException E){
			System.out.println(E.getMessage());
			
		}
		
	}
}
