package Data;

//Udviklet af Morten, Martin, Mikkel & Fahad 12/2-2017

public interface IData {

	String getNavn(String cpr) throws DataException;

	double getVaegt(String cpr) throws DataException;

	double getHoejde(String cpr) throws DataException;
	
	
}
