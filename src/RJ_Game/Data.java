package RJ_Game;

import java.util.*;

public class Data {
	
	public static HashMap<String,Person> info = new HashMap<String,Person>();

	public void athleteData(){	

		info.put("S11",new Person("S11","Neil","Swimming",21,"TAS"));
		info.put("S22",new Person("S22","Mark","Swimming",29,"SA"));
		info.put("S33",new Person("S33","Steve","Swimming",25,"WA"));
		info.put("S44",new Person("S44","Nicolas","Swimming",28,"QLD"));
		info.put("S55",new Person("S55","Rogue","Swimming",99,"VIC"));
		info.put("S66",new Person("S66","Austin","Swimming",24,"NSW"));	

		info.put("C11",new Person("C11","Roma","Cycling ",21,"TAS"));
		info.put("C22",new Person("C22","Susan","Cycling ",29,"ACT"));
		info.put("C33",new Person("C33","Giri","Cycling ",25,"WA"));
		info.put("C44",new Person("C44","Nargis","Cycling ",28,"QLD"));
		info.put("C55",new Person("C55","Rachele","Cycling ",99,"VIC"));
		info.put("C66",new Person("C66","Amy","Cycling ",24,"NSW"));

		info.put("R99",new Person("R99","Naresh","Running ",18,"NT"));
		info.put("R88",new Person("R88","Satya","Running ",21,"WA"));
		info.put("R77",new Person("R77","Shreya","Running ",30,"ACT"));
		info.put("R66",new Person("R66","Dave","Running ",17,"TAS"));
		info.put("R33",new Person("R33","Niraj","Running ",22,"NSW"));
		info.put("R44",new Person("R44","Shivang","Running ",23,"QLD"));
		info.put("R11",new Person("R11","Gagan","Running ",28,"VIC"));	

		info.put("SA01",new Person("SA01","Rohan","SpAthlete ",21,"MYS"));
		info.put("SA02",new Person("SA02","Arjun","SpAthlete ",25,"NSW"));
		info.put("SA03",new Person("SA03","Jimmy","SpAthlete ",48,"NT"));
		info.put("SA04",new Person("SA04","Nilema","SpAthlete ",56,"WA"));
		info.put("SA05",new Person("SA05","Pandeji","SpAthlete ",65,"VIC"));

//		System.out.println();
//		System.out.println("\t"+"Player ID" +"\t"+"Player Name" + "\t" + "Sport" + "\t" + "\t"+"Age" +"\t" + "State");
//		System.out.println("\t" + "***************************************************************** ");
//		for (int i = 0; i < info.size(); i++) {
//			System.out.println("\t"+info.get(i).getID()+"\t"+"\t"+ info.get(i).getName()+"\t" +"\t"+ info.get(i).getSport()+"\t" +info.get(i).getAge()+"\t"+info.get(i).getState());
//		}

	}


}
