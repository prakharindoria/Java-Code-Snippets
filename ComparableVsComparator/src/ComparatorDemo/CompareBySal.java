package ComparatorDemo;
import java.util.*;
public class CompareBySal implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		return (int)((int)e1.getEsal()-e2.getEsal());
	}
	

}
