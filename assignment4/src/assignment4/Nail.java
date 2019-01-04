package assignment4;

//Nail child class extends fastener
public abstract class Nail extends Fastener{
	
	private static final long serialVersionUID = -9161760709168066609L;
	private String nailSize;
	private double length;
	private double gauge;
	private static String mat="Steel"; //only available material for nails
	
	//Generic Nail constructor includes nail size, the length, the gauge
	public Nail(String fin, double price, int size, String nailsi, double len, double gau) throws IllegalFastener {
		super(mat, fin, price, size);
		nailSize=nailsi;
		length=len;
		gauge=gau;
		
		//restriction on size
		if (nailsi!="6D" && nailsi!="8D"&& nailsi!="10D"&& nailsi!="12D"&& nailsi!="16D"&& nailsi!="60D")
			throw new IllegalFastener("nail size not valid");
		
		//restriction on finishes
		if (fin != "Bright" && fin!= "Hot Dipped Galvanized")
			throw new IllegalFastener("finish not valid for Nails");
		
		//restriction on length
		if (len!=2 && len!=2.5 && len!=3 && len!=3.25 && len!=3.5 && len!=6 )
			throw new IllegalFastener("length not valid");
		
		//restriction on gauge
		if (gau!=2 && gau!=8 && gau!=9 && gau!=10.25 && gau!=11.5)
			throw new IllegalFastener("gauge not valid");		
	}
	
	//adds size, length and gauge attributes to description of the fastener
	public String toString() {
		return nailSize+ " size, "+length+ " long, "+gauge+ " gauge, " +super.toString();
	}

}
