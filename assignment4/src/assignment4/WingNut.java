package assignment4;

public class WingNut extends InnerThreaded{
	

	private static final long serialVersionUID = -6934100690437996178L;

	//constructs a specific Wingnut
	public WingNut(String dia, String mat, String fin, double price, int size) throws IllegalFastener {
		super(mat, fin, price, size, dia);
		if (mat != "Brass" && mat!= "Stainless Steel" && mat!= "Steel")
			throw new IllegalFastener("material not valid");
		if (mat=="Steel" && fin != "Chrome" && fin!= "Hot Dipped Galvanized" && fin!= "Plain" && fin!= "Yellow Zinc" && fin!="Zinc")
			throw new IllegalFastener("finish not valid for steel");
		if ((mat=="Brass"||mat=="Stainless Steel")&& fin!="Plain")
			throw new IllegalFastener("finish not valid for brass or stainless steel");
	}
	
	public String toString() {
		return "Wing nut "+ super.toString();
	}
}
