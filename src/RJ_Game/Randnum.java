package RJ_Game;

import java.awt.List;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;

public class Randnum {


	public static ArrayList<Integer> gentime = new ArrayList<Integer>(); 
	private int start ;
	private int end ;

	private Stack<Integer> numbers = new Stack<>();

	public Randnum(int start, int end){
		this.start = start;
		this.end = end;
	}

	public void loadNumbers(){
		for (int i=start;i<=end;i++){
			numbers.push(i);
		}
		Collections.shuffle(numbers);
	}

	public int nextInt(){
		if (numbers.empty()) loadNumbers();
		return numbers.pop();
	}


	public ArrayList<Integer> randomGenrator()
	{	
		int pick;
		Data d = new Data();
		Randnum rand = new Randnum(start,end);

		for(int i=0; i<d.p;i++){
			pick = rand.nextInt();
			gentime.add(pick);
			//System.out.println(gentime);

		}

		return gentime;
	}
}