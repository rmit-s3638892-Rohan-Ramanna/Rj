package RJ_Game;

import java.util.Scanner;


public class MenuDriven {

	Scanner scan = new Scanner(System.in);

	public void displayMenu(){

		int choice = 0;
		boolean valid = true;


		while (valid){
			System.out.println("\t" +"*****************************************");
			System.out.println("\t\t WELCOME TO OZLYMPIC GAMES \t\n");
			System.out.println("\t" +"*****************************************");
			System.out.println("\t1.	Select a game to run");
			System.out.println("\t2.	Predict the Winner of the Game");
			System.out.println("\t3.	Start the Game");
			System.out.println("\t4.	Display the final results of all games");
			System.out.println("\t5.	Display the points of all Athletes");
			System.out.println("\t6.	Exit");

			System.out.println();
			System.out.print("\tYour choice : ");

			try {

				choice = scan.nextInt();
				if ( choice >= 1 && choice <= 6){
					if (choice == 6) {      // Exit from the Game
						System.out.println("Thank you. Visit Again");
						System.exit(0);
						break;
					} else if (choice == 1){ // Select the Game
						System.out.println();
						System.out.println("\tSelect A Game to Run");
						System.out.println();
						GamerunOptions();
					} else if (choice == 2){
						System.out.println("\tEntered 2nd loop");
					} else if (choice == 3){
						System.out.println("\tEntered 3th loop");	
					} else if (choice == 4){
						System.out.println("\tEntered 4th loop");
					} else if(choice == 5){
						System.out.println("\tEntered 5th loop");	
					} 
					valid = false;
				}
				else {
					System.out.println("\tEnter the Valid input from menu");
					System.out.println();
				}

			}
			catch (Exception e)
			{
				System.out.println("\tEnter the valid choice");
				scan.nextLine();
			}

		}
	}

	public void GamerunOptions() {
		
		Data ath = new Data();
		ath.athleteData();
		System.out.println("\t1.RUNNING ");
		System.out.println("\t2.CYCLING ");
		System.out.println("\t3.SWIMMING ");
		System.out.print("\n\tSelect a Game from Menu : ");
		int game =0;
		game= scan.nextInt();
		
        Person S11 = Data.info.get("S11");
        System.out.println("QW");
        for (String eachKey : Data.info.keySet()){
        	System.out.println("\t" + Data.info.get(eachKey));
        }

	}

}
