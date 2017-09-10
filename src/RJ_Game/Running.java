package RJ_Game;

import java.util.ArrayList;

public class Running implements Sport{

	private static int runstart = 10;
	private static int runend = 20;
		
	Randnum r = new Randnum(runstart, runend);
	
	public ArrayList<Integer> compete(){
		r.loadNumbers();
		r.nextInt();
		return r.randomGenrator();
	}	
	
}
