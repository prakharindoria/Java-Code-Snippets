package ComparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseStudent {
public static void main(String [] args) {
	Student s1=new Student(101,"Robert",10);
	Student s2=new Student(102,"Chris",15);
	Student s3=new Student(103,"Loki",23);
	Student s4=new Student(104,"Marvel",6);
	Student s5=new Student(105,"Vision",34);
	List<Student> al=new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	Collections.sort(al);
	int i=1;
	for(Student s:al) {
		System.out.println("Student "+i+"\t"+s.getAge()+"\t"+s.getName()+"\t"+s.getRoll());
		i++;	
	}
	
	
}
	
	
}
