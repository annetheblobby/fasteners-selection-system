package assignment4;

//Screw child class extends Fastener
public abstract class Screw extends Fastener{
	
	private static final long serialVersionUID = 5783861999322929124L;
	private String head;
	private String drive;
	private String diameter;
	
	//generic screw constructor
	public Screw(String mat, String fin, double price,int size, String dia, double len, String he, String dr) throws IllegalFastener{
		super(mat,fin,price,size);
		
		//set head, drive and diameter attributes
		head=he;
		drive=dr;
		if (dia != "#8-13" && dia!= "#8-15" && dia != "#8-32"
				&& dia!= "#10-13" && dia !="#10-24" &&dia != "#10-32"
				&& dia!= "1/4-20" && dia !="5/16-18"&& dia!="3/8-16"
				&& dia!="7/16-14"&& dia!="1/2-13" && dia!="5/8-11" && dia!="3/4-10")
			throw new IllegalFastener("thread/diameter size not valid");
		diameter=dia;
		
		//material and finish restrictions
		if (mat != "Brass" && mat!= "Stainless Steel" && mat!= "Steel")
			throw new IllegalFastener("material not valid");
		if (mat=="Steel" && fin != "Black Phosphate" && fin!= "ACQ 1000 Hour" && fin!= "Lubricated" && fin != "Chrome" && fin!= "Hot Dipped Galvanized" && fin!= "Plain" && fin!= "Yellow Zinc" && fin!="Zinc" )
			throw new IllegalFastener("finish not valid for steel");
		if ((mat=="Brass"||mat=="Stainless Steel")&& fin!="Plain")
			throw new IllegalFastener("finish not valid for brass or stainless steel");
		
		//length restrictions
		if (len<0.5||len>20)
			throw new IllegalFastener("length for screw is not valid");
		if ((len<=6 && !(len% 0.25==0))||(len>6 && len<=11 && !(len% 0.5==0))||(len>11 && len<=20 && !(len% 1==0)))
			throw new IllegalFastener("length for screw is not valid (increment)");
		
		//head and drive restrictions
		if (he!= "Bugle" && he!="Flat" && he!="Oval" && he!="Pan" && he!="Round")
			throw new IllegalFastener("head is not valid");
		if (dr!="6-Lobe" & dr!="Philips" & dr!="Slotted" & dr!="Square")
			throw new IllegalFastener("drive is not valid");
			
	}
	
	//toString method adds diameter, head, and drive attributes 
	public String toString() {
		return diameter+ " thread, "+ head+" head, "+ drive+ " drive, "+ super.toString();
	}
}
