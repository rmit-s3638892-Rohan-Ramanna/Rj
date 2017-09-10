package RJ_Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RefereeData {

	private static ArrayList<Referee> Ref = new ArrayList<Referee>();
	private Scanner ip = new Scanner(System.in);

	public RefereeData(){
		Ref.add(new Referee("RF01","Nick",57,"NSW"));
		Ref.add(new Referee("RF02","John",30,"TAS"));
		Ref.add(new Referee("RF03","Reham",25,"VIC"));
	}

	public void DisplayReferee(){
		System.out.println();
		System.out.println("\tOfficials for this Match is: ");
		System.out.println();
		for (Referee r : Ref){
			System.out.println("\tRefID= " + r.getRefID() + "\tRefName= " + r.getRefName() + "\tRefAge= " + r.getRefAge() +"\tState=" + r.getRefState() );
		}
	}

	public void SelectReferee(){

		System.out.println();
		Boolean valid = true; 
		int count = 0;
		System.out.print("\tEnter the Referee ID for this match(in Upper Case): ");

		do
		{
			String umpire = ip.next().toUpperCase();
			for(int i=0;i<Ref.size();i++)
			{	
				if(!(umpire.equals(Ref.get(i).getRefID()))){
					count++;
				}else{
					System.out.println("\tReferee for this Match is : " + Ref.get(i).getRefName());
					valid = false;
					count=0;
					break;
				}
			}
			if(count>0){
				System.out.println("\tEnter the Valid again :");
				ip.nextLine();
			}
		}
		while(valid);
	}
}









