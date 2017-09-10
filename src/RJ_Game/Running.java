package RJGame;

import java.util.ArrayList;

public class Running implements Sport{

	private static int runstart = 10; // Declared run Start time
	private static int runend = 20;  //Decalred run End Time
		
	Randnum r = new Randnum(runstart, runend);
	
	public ArrayList<Integer> compete(){
		r.loadNumbers();
		r.nextInt();
		return r.randomGenrator();
	}	
	
}
