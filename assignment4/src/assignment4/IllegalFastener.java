package assignment4;

//throws exceptions for non valid values 
public class IllegalFastener extends Exception{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2485694171556022411L;

	public IllegalFastener() {
		super("Illegal parameter value supplied.");
		
	}
	
	public IllegalFastener(String message) {
		super(message);
	}
}
