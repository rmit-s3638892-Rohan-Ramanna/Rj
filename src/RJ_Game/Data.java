package RJGame;

/**
 * Created by Rohan.
 */

import java.util.*;


public class Data {

	public static ArrayList<Person> athleteData = new ArrayList<Person>();
	public static ArrayList<Person> participantList = new ArrayList<Person>();
	public static ArrayList<String> inputList = new ArrayList<String>();
	
	
	public static int p;
	String prediction;

	public void athleteData(){	

		athleteData.add(new Person("S11","Sagar","Swimming ",21,"TAS",0));
		athleteData.add(new Person("S22","Bhushan","Swimming ",29,"SA",0));
		athleteData.add(new Person("S33","Namrata","Swimming ",25,"WA",0));
		athleteData.add(new Person("S44","Varad","Swimming ",28,"QLD",0));
		athleteData.add(new Person("S55","Amit","Swimming ",31,"VIC",0));
		athleteData.add(new Person("S66","Abha","Swimming ",22,"VIC",0));
		athleteData.add(new Person("S77","Ambar","Swimming ",24,"NSW",0));
		athleteData.add(new Person("S88","Rucha","Swimming ",23,"NT",0));

		athleteData.add(new Person("C11","Jimmy","Cycling ",21,"TAS",0));
		athleteData.add(new Person("C22","Susan","Cycling ",29,"ACT",0));
		athleteData.add(new Person("C33","Giri","Cycling ",25,"WA",0));
		athleteData.add(new Person("C44","Jacky","Cycling ",28,"QLD",0));
		athleteData.add(new Person("C55","Chaitu","Cycling ",19,"VIC",0));
		athleteData.add(new Person("C66","Deep","Cycling ",24,"NSW",0));
		athleteData.add(new Person("C77","Eshan","Cycling ",27,"NSW",0));
		athleteData.add(new Person("C88","Carol","Cycling ",34,"NSW",0));

		athleteData.add(new Person("R11","Naresh","Running ",18,"NT",0));
		athleteData.add(new Person("R12","Satya","Running ",21,"WA",0));
		athleteData.add(new Person("R13","Shreya","Running ",30,"ACT",0));
		athleteData.add(new Person("R14","Dave","Running ",27,"TAS",0));
		athleteData.add(new Person("R15","Niraj","Running ",22,"NSW",0));
		athleteData.add(new Person("R16","Shivang","Running ",23,"QLD",0));
		athleteData.add(new Person("R17","Gagan","Running ",28,"VIC",0));
		athleteData.add(new Person("R19","Shewale","Running ",18,"NT",0));

		athleteData.add(new Person("P01","Rohan","SpAthlete",21,"MYS",0));
		athleteData.add(new Person("P02","Arjun","SpAthlete",25,"NSW",0));
		athleteData.add(new Person("P03","Shradha","SpAthlete",18,"NT",0));
		athleteData.add(new Person("P04","Nilema","SpAthlete",26,"WA",0));
		athleteData.add(new Person("P05","Pandeji","SpAthlete",28,"VIC",0));
		athleteData.add(new Person("P06","Giri","SpAthlete",25,"NSW",0));
		athleteData.add(new Person("P07","Revati","SpAthlete",21,"MYS",0));
		athleteData.add(new Person("P08","Rohit","SpAthlete",27,"MYS",0));
	}


	public void AthleteDisplay(){
		for(Person p : athleteData)
			System.out.println("\tID="+ p.getID() + "\tName=" +p.getName() + "\tSport="+ p.getSport() + "\tAge=" +p.getAge() + "\tState=" + p.getState());
	}


	public void SelectrunAthlete(){

		boolean choice = true;
		int value;

		String id;
		Scanner input = new Scanner(System.in);
		System.out.println();

		do{
			System.out.println();
			System.out.print("\tEnter the number of Participants you want to Compete: ");
			p=input.nextInt();
			System.out.println("\tYou have Decided to compete with" +" " + p + " " +"Athletes");

			if(p>=5 && p<=8){
				System.out.println("\tEnter the Athlete ID : ");

				for (int i=0;i<p;i++){
					value=0;
					id = input.next().toUpperCase();
					if(id.substring(0,1).equals("R") || id.substring(0,1).equals("P")){
						for(int j = 0; j<athleteData.size();j++){
							if (inputList.contains(id)){
								System.out.println("Already Exists");
								break;
							}
							if(id.equals(athleteData.get(j).getID())){
								value++;
							}
						}
					}
					if(value!=0){
						inputList.add(id);
					}else{
						System.out.println("Enter a valid ID");
						input.nextLine();
						i--;
					}
				}
				choice = false;
			}else{
				System.out.println("\n\tHowever You need to have atleast 5 Athletes or atmost 8 Athletes to Start a game.");
				input.nextLine();
			} 

			for (int m=0;m<athleteData.size();m++){     
				if (inputList.contains(athleteData.get(m).getID())){
					System.out.println(athleteData.get(m));
					participantList.add(athleteData.get(m));
				}
			}   

		}while(choice);
	}


	public void SelectswimAthlete(){

		boolean choice = true;
		int value;

		String id;
		Scanner input = new Scanner(System.in);
		System.out.println();

		do{
			System.out.println();
			System.out.print("\tEnter the number of Participants you want to Compete: ");
			p=input.nextInt();
			System.out.println("\tYou have Decided to compete with" +" " + p + " " +"Athletes");

			if(p>=5 && p<=8){
				System.out.println("\tEnter the Athlete ID : ");

				for (int i=0;i<p;i++){
					value=0;
					id = input.next().toUpperCase();
					if(id.substring(0,1).equals("S") || id.substring(0,1).equals("P")){
						for(int j = 0; j<athleteData.size();j++){
							if (inputList.contains(id)){
								System.out.println("Already Exists");
								break;
							}
							if(id.equals(athleteData.get(j).getID())){
								value++;
							}
						}
					}
					if(value!=0){
						inputList.add(id);
					}else{
						System.out.println("Enter a valid ID");
						input.nextLine();
						i--;
					}
				}
				choice = false;
			}else{
				System.out.println("\n\tHowever You need to have atleast 5 Athletes or atmost 8 Athletes to Start a game.");
				input.nextLine();
			} 

			for (int m=0;m<athleteData.size();m++){     
				if (inputList.contains(athleteData.get(m).getID())){
					System.out.println(athleteData.get(m));
					participantList.add(athleteData.get(m));
				}
			}   

		}while(choice);
	}


	public void SelectcycAthlete(){

		boolean choice = true;
		int value;

		String id;
		Scanner input = new Scanner(System.in);
		System.out.println();

		do{
			System.out.println();
			System.out.print("\tEnter the number of Participants you want to Compete: ");
			p=input.nextInt();
			System.out.println("\tYou have Decided to compete with" +" " + p + " " +"Athletes");

			if(p>=5 && p<=8){
				System.out.println("\tEnter the Athlete ID : ");

				for (int i=0;i<p;i++){
					value=0;
					id = input.next().toUpperCase();
					if(id.substring(0,1).equals("C") || id.substring(0,1).equals("P")){
						for(int j = 0; j<athleteData.size();j++){
							if (inputList.contains(id)){
								System.out.println("Already Exists");
								break;
							}
							if(id.equals(athleteData.get(j).getID())){
								value++;
							}
						}
					}
					if(value!=0){
						inputList.add(id);
					}else{
						System.out.println("Enter a valid ID");
						input.nextLine();
						i--;
					}
				}
				choice = false;
			}else{
				System.out.println("\n\tHowever You need to have atleast 5 Athletes or atmost 8 Athletes to Start a game.");
				input.nextLine();
			} 

			for (int m=0;m<athleteData.size();m++){     
				if (inputList.contains(athleteData.get(m).getID())){
					System.out.println(athleteData.get(m));
					participantList.add(athleteData.get(m));
				}
			}   

		}while(choice);
	}



	public void PredictWinner(){
		System.out.println();
		Boolean valid = true; 
		int count = 0;
		System.out.print("\tPredict the winner of the Game: ");
		Scanner scan = new Scanner(System.in); 

		do{
			prediction = scan.next();
			for(int i=0;i<athleteData.size();i++){	
				if(!(prediction.equals(athleteData.get(i).getName()))){
					count++;
				}else{
					System.out.println("\tPredicted Winner is : " + athleteData.get(i).getName());
					valid = false;
					count=0;
					break;
				}
			}
			if(count>0){
				System.out.println("\tEnter the Valid Name :");
				scan.nextLine();
			}
		}
		while(valid);

	}


	public void Winner(){
		
		if(prediction.equals(participantList.get(0).getName())){		
			
			System.out.println("Congragulations");			
		}else{
			System.out.println("Prediction is incorrect");
		}	
		
/*		Scanner scan= new Scanner(System.in);
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
*/
		}
	}
	
	










