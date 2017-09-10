package RJ_Game;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.InputMismatchException;


public class Driver {
	public static Scanner scan = new Scanner(System.in);

	public static void displayMenu() {

		System.out.println("\t" +"*****************************************");
		System.out.println("\t\t WELCOME TO OZLYMPIC GAMES \t\n");
		System.out.println("\t" +"*****************************************");
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

				if(input > 0 || input <= 4){
					switch(input){
					case 1:
						System.out.println();
						System.out.println("\tSelect a game to run");
						GamerunOptions();
						break;
					case 2:
						System.out.println("\tDisplay the final results of all games");
						break;
					case 3:
						System.out.println("\tDisplay the points of all Athletes");
						break;
					case 4:
						System.out.println("\tThank you. Visit Again!");
						System.exit(0);
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

		Data ath = new Data();
		Running r = new Running();
		RefereeData ref = new RefereeData();
		ath.athleteData();
		int no = 0;
		boolean opt = true;

		do{

			System.out.println();
			System.out.println("\t1.RUNNING ");
			System.out.println("\t2.CYCLING ");
			System.out.println("\t3.SWIMMING ");
			System.out.println();

			try {
				System.out.print("\tEnter the Option : ");
				no = scan.nextInt();
				if ( no >= 1 || no <= 3){
					if (no == 1){ // Select the Game
						System.out.println();
						System.out.println("\tThe Game You have Selected is RUNNING");
						System.out.println();
						ath.AthleteDisplay();
						ath.SelectrunAthlete();
						ref.DisplayReferee();
						ref.SelectReferee();
						ath.PredictWinner();						
						Game.gamePlay();
					} else if (no == 2){
						System.out.println();
						System.out.println("\tThe Game You have Selected is CYCLING");
						ath.AthleteDisplay();
						ath.SelectcycAthlete();
						ref.DisplayReferee();
						ref.SelectReferee();
						ath.PredictWinner();
						Game.gamePlay();
					} if (no == 3){
						System.out.println();
						System.out.println("\tThe Game You have Selected is SWIMMING");
						ath.AthleteDisplay();
						ath.SelectswimAthlete();
						ref.DisplayReferee();
						ref.SelectReferee();
						ath.PredictWinner();
						Game.gamePlay();
					}

				}opt = false;
			}
			catch (Exception e){	
				System.out.println("Enter the valid option from Menu");
				System.err.println(e);
				scan.next();
			}

		}while(opt);

	}

}







