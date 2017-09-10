package RJGame;

import java.util.ArrayList;

public class Swimming implements Sport {
	
	private static int runstart = 500; // Declare Swimming Start Time
	private static int runend = 800; // Declare Swimming End Time
		
	Randnum r = new Randnum(runstart, runend);
	
	public ArrayList<Integer> compete(){ // Compute Random Numbers
		r.loadNumbers();
		r.nextInt();
		return r.randomGenrator();
	}	
	

}
