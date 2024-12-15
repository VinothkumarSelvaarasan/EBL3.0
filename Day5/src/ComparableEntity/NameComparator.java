package ComparableEntity;

import java.util.Comparator;

public class NameComparator implements Comparator<Registeration> {

	@Override
	public int compare(Registeration r1, Registeration r2) {
		return r1.getName().compareTo(r2.getName());
	
	}

}
