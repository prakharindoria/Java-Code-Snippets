package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseEmp {
	public static void main(String[] args) {
		Emp e1 = new Emp(101, "WonderWoman", 73000);
		Emp e2 = new Emp(102, "Batman", 44000);
		Emp e3 = new Emp(103, "Deadpool", 23000);
		Emp e4 = new Emp(104, "Flash", 9000);
		Emp e5 = new Emp(105, "Aquaman", 11000);

		List<Emp> al = new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		Collections.sort(al,new CompareBySal());
		for (Emp e : al) {
			System.out.println(e);
		}

	}

}
