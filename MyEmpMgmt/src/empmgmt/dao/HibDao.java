/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.dao;

import empmgmt.hib.HibConnect;
import empmgmt.pojo.EmpPojo;
import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author prakhar patidar
 */
public class HibDao {
    //Create
    public static boolean addEmp(EmpPojo e) throws SQLException {
        Session sess=HibConnect.getSession();
        Transaction t=sess.beginTransaction();
        sess.save(e);
        t.commit(); 
        return true;
    }
    
    //Read
    public static EmpPojo findEmpByID(int eno) throws SQLException {
        EmpPojo e = null;
        Session sess=HibConnect.getSession();
        e=(EmpPojo)sess.load(empmgmt.pojo.EmpPojo.class,eno);
        return e;
    }
    
    //Update
        public static boolean updateEmp(EmpPojo e) throws SQLException {
        Session sess=HibConnect.getSession();
        Transaction t=sess.beginTransaction();
        sess.update(e);
        t.commit(); 
        return true;
    }
        
    //Delete needs improve...
        public static boolean deleteEmp(int eno) throws SQLException {
        Session sess=HibConnect.getSession();
        Transaction t=sess.beginTransaction();
        sess.delete(String.valueOf(eno),empmgmt.pojo.EmpPojo.class);
        t.commit(); 
        return true;
    }
    
    
    
   
    
    
    
}
