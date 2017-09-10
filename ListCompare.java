package RJGame;

/**
 * Created by Rohan.
 */

import java.util.Comparator;

public class ListCompare implements Comparator<Person> {

	public int compare(final Person a, final Person b) {
		if (a.getTime() < b.getTime()) {
			return -1;
		}
		else if (a.getTime() < b.getTime()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}


