package assignment4;

//nut child class
public abstract class InnerThreaded extends Fastener{

	private static final long serialVersionUID = -268386966041813670L;
	private String diameter;
	
	//generic nut constructor
	public InnerThreaded(String mat, String fin, double price, int size, String dia) throws IllegalFastener {
		super(mat, fin, price, size);
		
		//restricting thread/diameter
		if (dia != "#8-13" && dia!= "#8-15" && dia != "#8-32"
				&& dia!= "#10-13" && dia !="#10-24" &&dia != "#10-32"
				&& dia!= "1/4-20" && dia !="5/16-18"&& dia!="3/8-16"
				&& dia!="7/16-14"&& dia!="1/2-13" && dia!="5/8-11" && dia!="3/4-10")
			throw new IllegalFastener("thread/diameter size not valid");
		diameter=dia;
		
		//restrictions on material and finish
	
	

	}
	public String toString() {
		return diameter+ " thread, "+ super.toString();
		
	}

}
