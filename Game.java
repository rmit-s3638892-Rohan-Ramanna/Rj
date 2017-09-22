package RJGame;

import java.sql.Ref;

/**
 * Created by Rohan.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Game {

	Driver d = new Driver();
	static int k=0;
	static int r=0;

	public static ArrayList<Person> finallist = new ArrayList<Person>(); // Arraylist to save final athlete
	public static ArrayList<Person> resultList = new ArrayList<Person>();//Arraylist to save final result

	static int counter;
	static String gameID;

	public static void timesort(){
		Collections.sort(Data.participantList,new ListCompare());
	}

	public static void gamePlay(){ // Method to run game
		gameID = "Game"+(++counter);

		
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

	
	
	public static void finalParticipantlist(){ // Display final Participants
		for (int i=0;i<resultList.size();i++){
			
		
			System.out.println(resultList.get(i));
			
			
		}
	}

	public static void pointslist(){ // Method to Calculate Points

		int p=0;
		
		System.out.println(Data.allPointsdata.size());

		for(int i=(k);i<(k+3);i++){
			for(int j=0;j<Data.allPointsdata.size();j++){
				if(Data.allPointsdata.get(j).getID().contains(finallist.get(i).getID())){
					if(i==(k)){
						p=5+Data.allPointsdata.get(j).getPoints();
						System.out.println("p"+p);
						Data.allPointsdata.get(j).setPoints(p);
					}
					if(i==(k+1)){
						System.out.println("J value =" + j);
						p=2+Data.allPointsdata.get(j).getPoints();
						System.out.println("p"+p);
						Data.allPointsdata.get(j).setPoints(p);
					}if(i==(k+2)){
						System.out.println("J value =" + j);
						p=1+Data.allPointsdata.get(j).getPoints();
						System.out.println("p"+p);
						Data.allPointsdata.get(j).setPoints(p);
					}	
				}
			}
		}
		System.out.println("value of k"+(k+3));
		k=finallist.size();
	}

	public static void PointsDisplay(){ // Points Display

		for (int i=0;i<Data.allPointsdata.size();i++){
			Collections.sort(Data.allPointsdata,new Pointscompare());
			System.out.println("ID = "  + Data.allPointsdata.get(i).getID()+"\t" + "Name = " +Data.allPointsdata.get(i).getName()+"\t"+"Points = " + Data.allPointsdata.get(i).getPoints());
		}

	}



}




