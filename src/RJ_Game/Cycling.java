package RJ_Game;

import java.util.ArrayList;

public class Cycling implements Sport {

	
	private static int runstart = 500;
	private static int runend = 800;
	
	
	Randnum r = new Randnum(runstart, runend);
	
	public ArrayList<Integer> compete(){
		r.loadNumbers();
		r.nextInt();
		return r.randomGenrator();
	}	
	
	
}
