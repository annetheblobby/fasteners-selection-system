package assignment4;
import java.io.Serializable;

/* This project creates a Hierarchy of materials for Fasteners.
 * Name: Anne Liu
 * Student Number: 20069271
 */


/*The parent class. It consists of two constructors, one with five parameters and one with four. 
 * It also includes a accessor that returns the cost of the order as well as a toString method
 */

public abstract class Fastener implements Serializable {
	
	private static final long serialVersionUID = 2061646125205415279L;
	private String material;
	private String finish;
	private double unitPrice;
	private int unitSize;


	//constructs a generic Fastener by taking in parameters material, finish, price, size, diameter
	//constructor with four parameters, for the construction of an object that has no thread/diameter
	public Fastener(String mat, String fin, double price, int size)throws IllegalFastener {
		
		//restrict unit size
		if (!(size > 0 && size < 10000))
			throw new IllegalFastener("unit size not valid");
		
		//restrict price 
		if (price <=0)
			throw new IllegalFastener("unit Price not valid");
				
		material=mat;
		finish=fin;
		unitPrice=price;
		unitSize=size; 
			
	}
	
	// accessor that takes in the number of units as a parameter and returns the cost of the order
	public double getOrderCost(int numUnits) {
		
		return  numUnits*(unitPrice);
		
	}
	
	//returns the order specifications for generic fastener specifications
	public String toString() {
	
		return   material+ " with a "+finish+ " finish, "+ unitSize+" in a unit, "+String.format("$%,.2f", unitPrice)+" per unit.";
		
	}
	
	

}
