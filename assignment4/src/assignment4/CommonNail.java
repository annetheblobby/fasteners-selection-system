package assignment4;

//common nail child class
public class CommonNail extends Nail{

	//common nail constructor
	public CommonNail(String nailsi, double len, double gau, String fin, double price, int size)throws IllegalFastener {
		super(fin, price, size, nailsi, len, gau);
		
	}
	
	//method adds nail type to description
	public String toString() {
		return "Common Nail, " +super.toString();
	}

}
