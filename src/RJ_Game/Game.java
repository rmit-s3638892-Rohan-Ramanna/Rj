package RJGame;

/**
 * Created by Rohan.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Game {

	Driver d = new Driver();

	private static ArrayList<Person> game = new ArrayList<Person>();
	public static ArrayList<Person> finallist = new ArrayList<Person>();
	public static ArrayList<Person> resultList = new ArrayList<Person>();
	
	static int counter;
	static String gameID;

	public static void timesort(){
		Collections.sort(Data.participantList,new ListCompare());
	    }

	public static void gamePlay(){

		gameID = "Game"+(++counter);
		Scanner scan = new Scanner(System.in);

		for (int i=0;i<Randnum.gentime.size();i++){
			Data.participantList.get(i).setGameID(gameID);
			Data.participantList.get(i).setTime(Randnum.gentime.get(i));
		}
		
		System.out.println();
		System.out.println("\tResults:");
		for(int i =0;i<Data.participantList.size();i++){
			timesort();
			System.out.println(Data.participantList.get(i));
			finallist.add(Data.participantList.get(i));	
			resultList.add(Data.participantList.get(i));			
		}

	}
	
	public static void finalParticipantlist(){
		for (int i=0;i<resultList.size();i++){
			System.out.println(resultList.get(i));
		}
	}
	
	public static void point(){
		
		int p=0;
		int first;
		
	
		
		
		
	}
	
	

}
