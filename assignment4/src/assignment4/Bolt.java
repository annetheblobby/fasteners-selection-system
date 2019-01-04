package assignment4;

import assignment4.Fastener;

//Bolt child class which extends Fastener
public abstract class Bolt extends Fastener {

	private static final long serialVersionUID = 7305965742822660264L;
	private double length;
	private String diameter;
	
	//Bolt constructor which includes length 
	public Bolt(String mat, String fin, double price,int size, String dia, double len) throws IllegalFastener{
		super(mat,fin,price,size);
		
		//set length and diameter attributes
		length=len;
		if (dia != "#8-13" && dia!= "#8-15" && dia != "#8-32"
				&& dia!= "#10-13" && dia !="#10-24" &&dia != "#10-32"
				&& dia!= "1/4-20" && dia !="5/16-18"&& dia!="3/8-16"
				&& dia!="7/16-14"&& dia!="1/2-13" && dia!="5/8-11" && dia!="3/4-10")
			throw new IllegalFastener("thread/diameter size not valid");
		
		diameter=dia;
		
		//restrictions on materials and finishes for bolts
		if (mat != "Brass" && mat!= "Stainless Steel" && mat!= "Steel")
			throw new IllegalFastener("material not valid");
		if (mat=="Steel" && fin != "Chrome" && fin!= "Hot Dipped Galvanized" && fin!= "Plain" && fin!= "Yellow Zinc" && fin!="Zinc")
			throw new IllegalFastener("finish not valid for steel");
		if ((mat=="Brass"||mat=="Stainless Steel")&& fin!="Plain")
			throw new IllegalFastener("finish not valid for brass or stainless steel");
		
		//restrictions on length
		if (len<0.5||len>20)
			throw new IllegalFastener("length for bolt is not valid");
		if ((len<=6 && !(len% 0.25==0))||(len>6 && len<=11 && !(len% 0.5==0))||(len>11 && len<=20 && !(len% 1==0)))
			throw new IllegalFastener("length for bolt is not valid (increment)");
				
	}
	
	//String method adds diameter and length to generic fastener string
	public String toString() {
		return diameter+ " thread, "+length+ " long, "+ super.toString();
		
		
	}
		
}
