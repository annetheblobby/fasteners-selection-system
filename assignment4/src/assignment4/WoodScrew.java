package assignment4;

//WoodScrew child class
public class WoodScrew extends Screw{

	private static final long serialVersionUID = -6668535869832688608L;
	private String point;
	
	//constructor including point attribute
	public WoodScrew(double len, String dia, String mat, String fin, String he, String dr, String pt,double price, int size) throws IllegalFastener {
		super(mat, fin, price, size, dia, len, he, dr);
		point=pt;
		
		//restrictions on point attribute
		if (pt!="DoubleCut" && pt!="Sharp" && pt!="Type 17")
			throw new IllegalFastener("point is not valid");
	}
	
	//method adds type of screw to description
	public String toString() {
		return "WoodScrew "+ super.toString();
	}
	
}
