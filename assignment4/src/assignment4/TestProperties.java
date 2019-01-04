package assignment4;

import java.util.ArrayList;

public class TestProperties {
	public static void main(String[] args) throws IllegalFastener{
		ArrayList<Fastener> db= new ArrayList<>();
		
		
		
		db.add(new CarriageBolt(20, "3/8-16", "Steel", "Plain", 0.2985, 3));
		db.add(new CarriageBolt(0.75, "1/4-20", "Brass", "Plain", 18.825, 2));
		db.add(new WoodScrew(0.75, "#8-15", "Steel", "Zinc", "Flat", "Square", "Sharp", 8.84, 100));
		//db.add(new CommonNail("10D", 3.0, 6.0, "Plain", 21.69, 345));
		//db.add(new WingNut("15/16-18", "Steel", "Zinc", 18.225, 50));
		
	for(Fastener fastener:db)
		//System.out.println(fastener);  
		
		System.out.println(fastener.getOrderCost(3));
		
		
	
	}
}
