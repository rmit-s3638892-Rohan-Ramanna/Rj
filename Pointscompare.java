package RJGame;

import java.util.Comparator;

public class Pointscompare  implements Comparator<Person> {
	public int compare(final Person a, final Person b) {
		if (a.getPoints() < b.getPoints()) {
			return -1;
		}
		else if (a.getPoints() < b.getPoints()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
