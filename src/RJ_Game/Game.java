package RJ_Game;

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

	static int counter;
	static String gameID;

	public static void timesort(){
		Collections.sort(Data.Participantlist,new ListCompare());
	}

	public static void gamePlay(){

		int c=0;
		Data d = new Data();
		gameID = "Game"+(++counter);
		Scanner scan = new Scanner(System.in);

		for (int i=0;i<Randnum.gentime.size();i++){
			Data.Participantlist.get(i).setGameID(gameID);
			Data.Participantlist.get(i).setTime(Randnum.gentime.get(i));
			//System.out.println();
		}

		System.out.println("\tResults");
		for(int i =0;i<Data.Participantlist.size();i++){
			timesort();
			System.out.println(Data.Participantlist.get(i));
			finallist.add(Data.Participantlist.get(i));
		}

		d.Winner();
		
		System.out.println();
		System.out.println("\tWould you like to play another game then Press Y/N :");

		char input= scan.next().charAt(0);

		while(true){
			if(input =='Y' || input == 'y'){
				Driver.GamerunOptions();
				break;
			}else {
				Driver.displayMenu();
				break;
			}

		}

	}



}
