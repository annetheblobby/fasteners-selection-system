package assignment4;

//carriage bolt child class
public class CarriageBolt extends Bolt {
	
	private static final long serialVersionUID = -206245001360424303L;

	//constructs a carriage bolt
	public CarriageBolt(double len, String dia, String mat, String fin, double price, int size ) throws IllegalFastener{
		super(mat,fin,price,size,dia,len);	
	}
	
    //method adds type of bolt to description
	public String toString() {
		return "Carriage Bolt "+ super.toString();
	}
	
}
