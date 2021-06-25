package in.piesquare.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UseEmployee {
public static void main(String[] args) {
	 
		Configuration cfg=new Configuration();
		cfg.configure();
	    SessionFactory sf=cfg.buildSessionFactory();
	    Session sess=sf.openSession();
	   
	   
	   //Session sess=new Configuration().configure().buildSessionFactory().openSession();
	   
	   
	   Scanner kb=new Scanner(System.in);
	   System.out.println("Enter emp no:");
	   int eno=kb.nextInt();
	   
	   
	   Employee e=(Employee)sess.load(in.scabhopal.hibernate.Employee.class,eno);
	   if(e!=null) {
		   System.out.println("EmpNo:"+e.getEmpNo());
		   System.out.println("Ename:"+e.getEmpName());
		   System.out.println("Sal:"+e.getEmpSal());
	   }
	   else {
		   System.out.println("Record not found");
	   }
	   
	   
	   //From Cache
//	   System.out.println("Calling get second time");
//	   e=(Employee)sess.get(in.scabhopal.hibernate.Employee.class,eno);
//	   if(e!=null) {
//		   System.out.println("EmpNo:"+e.getEmpNo());
//		   System.out.println("Ename:"+e.getEmpName());
//		   System.out.println("Sal:"+e.getEmpSal());
//	   }
//	   else {
//		   System.out.println("Record not found");
//	   }
	   
	   sess.close();
	   sf.close();
	   
	   
	
}
}
