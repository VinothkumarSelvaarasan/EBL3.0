package ComparableEntity;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Registeration> {

	@Override
	public int compare(Registeration r1, Registeration r2) {
		// TODO Auto-generated method stub
		return r1.getDept().compareTo(r2.getDept());
	}
	

}
