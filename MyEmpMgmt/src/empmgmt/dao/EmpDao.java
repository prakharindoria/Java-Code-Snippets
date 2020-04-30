/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgmt.dao;

import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.EmpPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class EmpDao {
    //Method Add
    public static boolean addEmp(EmpPojo e) throws SQLException{
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("insert into emp values(?,?,?)");
        ps.setInt(1, e.getEmpno());
        ps.setString(2, e.getEname());
        ps.setDouble(3, e.getSal());
        int result=ps.executeUpdate();
        return result==1;
    }
    //Method Find
    public static EmpPojo findEmpByID(int eno)throws SQLException{
          EmpPojo e=null;
          PreparedStatement ps=DBConnection.getConnection().prepareStatement("Select * from emp where empno=?");
          ps.setInt(1, eno);
          ResultSet rs=ps.executeQuery();
          if(rs.next()){
              e=new EmpPojo();
              e.setEmpno(rs.getInt(1));
              e.setEname(rs.getString(2));
              e.setSal(rs.getDouble(3));
            }
          return e;
    }
    
    //Method GetAllEmp
    public static ArrayList<EmpPojo> getAllEmp()throws SQLException{
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("Select * from Employees");
       ResultSet rs=ps.executeQuery();
       ArrayList<EmpPojo> empList=new ArrayList<EmpPojo>();
        while(rs.next()){
        EmpPojo e=new EmpPojo();
        e.setEmpno(rs.getInt("Empno"));
        e.setEname(rs.getString("Ename"));
        e.setSal(rs.getDouble("Sal"));
        empList.add(e);
            }
        return empList;
         }
    
    public static EmpPojo deleteEmp(int eno) throws SQLException{
        EmpPojo e=null;
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("DELETE FROM emp WHERE empno=?");
        ps.setInt(1, eno);
        e=new EmpPojo();
        ps.executeUpdate();
        return e;
    }
    public static EmpPojo updateSalEmp(int eno) throws SQLException{
          EmpPojo e=null;
        PreparedStatement ps=DBConnection.getConnection().prepareStatement("update table emp set ename=?,sal=? where empno=?");
        ps.setInt(3, eno);
        ResultSet rs=ps.executeQuery();
          if(rs.next()){
              e=new EmpPojo();
              e.setEmpno(rs.getInt(1));
              e.setEname(rs.getString(2));
              e.setSal(rs.getDouble(3));
            }
        ps.setString(1, e.getEname());
        ps.setDouble(2, e.getSal());
        ps.executeUpdate();
        return e;
    }
}
