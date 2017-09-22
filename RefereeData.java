package RJGame;

import java.util.ArrayList;
import java.util.Scanner;

public class RefereeData {

	public static ArrayList<Referee> ref = new ArrayList<Referee>();
	public static ArrayList<Referee> refFinal = new ArrayList<Referee>();
	private static Scanner ip = new Scanner(System.in);
	public String umpirename;

	public String getUmpire() {
		return umpirename;
	}

	public void setUmpire(String umpire) {
		this.umpirename = umpire;
	}

	public RefereeData(){ // Referee Database
		ref.add(new Referee("RF01","Nick",57,"NSW"));
		ref.add(new Referee("RF02","John",30,"TAS"));
		ref.add(new Referee("RF03","Reham",25,"VIC"));
	}

	public void DisplayReferee(){ // DisplayReferee Details
		System.out.println();
		System.out.println("\tOfficials for this Match is: ");
		System.out.println();
		for (Referee r : ref){
			System.out.println("\tRefID= " + r.getRefID() + "\tRefName= " + r.getRefName() + "\tRefAge= " + r.getRefAge() +"\tState=" + r.getRefState());
			refFinal.addAll(ref);
		}
	}

	public void SelectReferee(){
		System.out.println();
		Boolean valid = true; 
		int count = 0;
		System.out.print("\tEnter the Referee ID for this match: ");

		do
		{
			String umpire = ip.next().toUpperCase();
			for(int i=0;i<ref.size();i++)
			{	
				if(!(umpire.equals(ref.get(i).getRefID()))){
					count++;
				}else{
					umpirename=ref.get(i).getRefName();
					refFinal.add(ref.get(i));
					System.out.println("\tReferee for this Match is : " + ref.get(i).getRefName());
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









