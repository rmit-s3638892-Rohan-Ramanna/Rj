package RJ_Game;

public class Referee {
	
	private String RefID;
	private String RefName;
	private int RefAge;
	private String RefState;
	
	public Referee(String refID, String refName, int refAge, String refState) {
		RefID = refID;
		RefName = refName;
		RefAge = refAge;
		RefState = refState;
	}
	
	public String getRefID() {
		return RefID;
	}

	public void setRefID(String refID) {
		RefID = refID;
	}

	public String getRefName() {
		return RefName;
	}

	public void setRefName(String refName) {
		RefName = refName;
	}

	public int getRefAge() {
		return RefAge;
	}

	public void setRefAge(int refAge) {
		RefAge = refAge;
	}
	
	public String getRefState() {
		return RefState;
	}

	public void setRefState(String refState) {
		RefState = refState;
	}

	@Override
	public String toString() {
		return "Referee RefID=" + RefID + ", RefName=" + RefName + ", RefAge=" + RefAge + ", RefState=" + RefState ;
	}

	
}
