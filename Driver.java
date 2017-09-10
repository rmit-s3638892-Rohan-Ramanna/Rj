package RJGame;

/**
 * Created by Rohan.
 */

import java.util.Scanner;
import java.util.InputMismatchException;


public class Driver {
	
	public static Scanner scan = new Scanner(System.in);
	public static int no = 0;
	public static void displayMenu() {

		System.out.println("\t" +"************************************************");
		System.out.println("\t\t 	WELCOME TO OZLYMPIC GAMES \t\n");
		System.out.println("\t" +"************************************************");
		System.out.println("\t1.Select a game to run");
		System.out.println("\t2.Display the final results of all games");
		System.out.println("\t3.Display the points of all Athletes");
		System.out.println("\t4.Exit");

		boolean choice = true;

		do{
			System.out.println();
			System.out.print("\tPlease Select the option from menu: ");
			int input ;

			try {
				input = scan.nextInt();

				while(input > 0 || input <= 4){
					switch(input){
					case 1:
						System.out.println();
						System.out.println("\tSelect a game to run");
						GamerunOptions();
						break;
					case 2:
						System.out.println();
						System.out.println("\tDisplay the final results of all games \n");
						Game.finalParticipantlist();
						System.out.println();
						displayMenu();
						break;
					case 3:
						System.out.println("\tDisplay the points of all Athletes");
						Data.copyathletedata();
						Game.PointsDisplay();
						displayMenu();
						break;
					case 4:
						System.out.println("\tThank you. Visit Again!");
						System.exit(0);
						break;
					default:
					      System.out.println();
					      System.out.println("\tPlease Select Valid Option");
					      System.out.println();
					      System.out.println("\t" + "*****************************************");
					      System.out.println("\t\t WELCOME TO OZLYMPIC GAMES \t\n");
					      System.out.println("\t" + "*****************************************");
					      System.out.println("\t1.Select a game to run");
					      System.out.println("\t2.Display the final results of all games");
					      System.out.println("\t3.Display the points of all Athletes");
					      System.out.println("\t4.Exit");
					      System.out.print("\tPlease Select the option from menu: ");
					      input = scan.nextInt();
					      break;	
						
					}choice = false;
				}
			}

			catch(Exception ex){
				System.out.println("\tPlease input a number!");
				scan.next();
			}
		}while(choice);
	}


	public static void GamerunOptions() {

		Data da = new Data();
		Running r = new Running();
		RefereeData rf = new RefereeData();
		da.athleteData();

		boolean opt = true;

		do{

			System.out.println();
			System.out.println("\t1.RUNNING ");
			System.out.println("\t2.CYCLING ");
			System.out.println("\t3.SWIMMING ");
			System.out.println();

		
				System.out.print("\tEnter the Option : ");
				no = scan.nextInt();
				while ( no >= 1 || no <= 3){
					if (no == 1){ // Select the Game
						System.out.println();
						System.out.println("\tThe Game You have Selected is RUNNING");
						System.out.println();
						da.AthleteDisplay();
						da.SelectrunAthlete();
						rf.DisplayReferee();
						rf.SelectReferee();
						da.PredictWinner();
						GenerateTime();
						Game.gamePlay();
						da.Winner();				
					} else if (no == 2){
						System.out.println();
						System.out.println("\tThe Game You have Selected is CYCLING");
						da.AthleteDisplay();
						da.SelectcycAthlete();
						rf.DisplayReferee();
						rf.SelectReferee();
						da.PredictWinner();
						GenerateTime();
						Game.gamePlay();
						da.Winner();
					} if (no == 3){
						System.out.println();
						System.out.println("\tThe Game You have Selected is SWIMMING");
						da.AthleteDisplay();
						da.SelectswimAthlete();
						rf.DisplayReferee();
						rf.SelectReferee();
						da.PredictWinner();
						GenerateTime();
						Game.gamePlay();
						da.Winner();
					}
					else {
					     System.out.println("\n\tPlease Select Option From List");
					     System.out.println();
					     System.out.println("\t1.RUNNING ");
					     System.out.println("\t2.CYCLING ");
					     System.out.println("\t3.SWIMMING ");
					     System.out.println();
					     System.out.print("\tEnter the Option : ");
					     no = scan.nextInt();
					    }
				}opt = false;			    

		}while(opt);

	}


	public static void listclear(){
		Data.inputList.clear();
		Data.participantList.clear();
		Data.athleteData.clear();
		RefereeData.ref.clear();
		Randnum.gentime.clear();
		Randnum.numbers.clear();		
	}		

	public static void GenerateTime(){

		switch(no){
		case 1:			
			Running rt = new Running();
			rt.compete();
			break;
		case 2:
			Cycling cy = new Cycling();
			cy.compete();
			break;
		case 3:
			Swimming sw = new Swimming();
			sw.compete();
			break;

		}
	}
	
	

}











