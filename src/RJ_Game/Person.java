package RJ_Game;

import java.util.Random;

public class Person {

	private String ID; // Declared Athlete ID
	private String name; // Declared Athlete Name.
	private String sport;
	private int age;
	private String state;
	private int points;
	private String gameID;
	private int time;
	
	public Person(String gameID, String Id, String name,int time){
		this.gameID=gameID;
		this.ID=Id;
		this.name=name;
		this.time=time;		
	}

	public Person(String ID, String name, String sport, int age, String state, int points){
		this.ID = ID;
		this.name = name;
		this.sport = sport;
		this.age= age;
		this.state= state;
		this.points = points;
	}
	
	public Person(String gameId){
		this.gameID=gameId;
	}
	
	public Person(String Id, String name,int time){
		this.ID=Id;
		this.name=name;
		this.time=time;		
	}		

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}

	public String getGameID() {
		return gameID;
	}

	public void setGameID(String gameID) {
		this.gameID = gameID;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public String toString() {
		if(gameID!=null){
			return "\tGameID= " + getGameID()+"\tID= " + getID() + "\t Name=" + getName() + "\t Time=" + getTime() ;
		}
		else if(time>0){
			
			return "\tID=" + getID() + "\t Name=" + getName() + "\t Time=" + getTime() ;
		}
		return "\tID=" + getID() + "\t Name=" + getName() + "\t Sport=" + getSport()+ "\t" + "Age=" + getAge() + "\t State=" +
			getState() ;
		
			
	}
	
	
}
