package RJ_Game;

public  class Person {

	private String ID; // Declared Athlete ID
	private String name; // Declared Athlete Name.
	private String sport;
	private int age;
	private String state;
	
	public Person(String ID, String name, String sport, int age,String state) {
		this.ID = ID;
		this.name = name;
		this.age= age;
		this.state= state;
		this.sport = sport;
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

	@Override
	public String toString() {
		return "ID=" + ID + ", name=" + name + ", sport=" + sport + ", age=" + age + ", state=" + state + "";
	}
	
	

	
		
}

