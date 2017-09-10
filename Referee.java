package RJGame;

public class Referee {
	
	private String rid; // Declare instance variable Referee ID
	private String rname; // Declared Referee Name
	private int rage; // Declare Referee Age
	private String rstate; // Declare Referee State
	
	public Referee(String refID, String refName, int refAge, String refState) { // Referee Constructor
		rid = refID;
		rname = refName;
		rage = refAge;
		rstate = refState;
	}
	
	public String getRefID() {
		return rid;
	}

	public void setRefID(String refID) {
		rid = refID;
	}

	public String getRefName() {
		return rname;
	}

	public void setRefName(String refName) {
		rname = refName;
	}

	public int getRefAge() {
		return rage;
	}

	public void setRefAge(int refAge) {
		rage = refAge;
	}
	
	public String getRefState() {
		return rstate;
	}

	public void setRefState(String refState) {
		rstate = refState;
	}

	@Override
	public String toString() { // Instance Variable toString Conversion
		return "Referee RefID=" + rid + ", RefName=" + rname + ", RefAge=" + rage + ", RefState=" + rstate ;
	}

	
}
