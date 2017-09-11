package RJGame;

import java.util.ArrayList;

public class Swimming implements Sport { // Implement interface Sport
	
	private static int runstart = 100; // Declare Swimming Start Time
	private static int runend = 200; // Declare Swimming End Time
		
	Randnum r = new Randnum(runstart, runend);
	
	public ArrayList<Integer> compete(){ // Compute Random Numbers
		r.loadNumbers();
		r.nextInt();
		return r.randomGenrator();
	}	
	

}
