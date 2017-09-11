package RJGame;

import java.util.Random;

public class Person {

	private String id; // Declared Athlete ID
	private String name; // Declared Athlete Name.
	private String sport; // Declared Sport 
	private int age; // Decalred person age
	private String state;
	private int points;
	private String gameID;
	private int time;
	
	public Person(String gameID, String id, String name,int time){ // Person Constructor
		this.gameID=gameID;
		this.id=id;
		this.name=name;
		this.time=time;		
	}

	public Person(String ID, String name, String sport, int age, String state, int points){ // Person Constructor with Points
		this.id = ID;
		this.name = name;
		this.sport = sport;
		this.age= age;
		this.state= state;
		this.points = points;
	}
	
	public Person(String gameId){ // Person constructor with Game ID 
		this.gameID=gameId;
	}
	
	public Person(String Id, String name,int time){ // person Constructor used for Time display
		this.id=Id;
		this.name=name;
		this.time=time;		
	}		

	public String getID() {
		return id;
	}

	public void setID(String iD) {
		id = iD;
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
	
	public String toString() { // select the toString for specific Constructor
		if(gameID!=null){
			return "\tGameID=" + getGameID()+"\tID=" + getID() + "\t Name=" + getName() + "\t Time=" + getTime() ;
		}
		else if(time>0 && points>=0){
			
			return "\tID=" + getID() + "\t Name=" + getName() + "\t Time=" + getTime() + "\t Points=" + getPoints();
		}
		return "\tID=" + getID() + "\t Name=" + getName() + "\t Sport=" + getSport()+ "\t" + "Age=" + getAge() + "\t State=" +
			getState() ;
		
			
	}
	
	
}
