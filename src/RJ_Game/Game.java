package RJ_Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Game {

	public static Iterator iter = Data.Participantlist.iterator();

	Driver d = new Driver();
	private static ArrayList<Person> game = new ArrayList<Person>();

	static int counter;
	static String gameID;


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
			System.out.println(Data.Participantlist.get(i));
		}


		System.out.println("\tWould you like to play another game then Press Yes or No :");

		String input= scan.next();

		if(input =="Yes" || input == "yes"){
			Driver.displayMenu();
		}
		if(input =="NO" || input == "no"){
			Driver.GamerunOptions();
		}



	}



}
