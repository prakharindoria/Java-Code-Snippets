package empmgmt.dao;

import empmgmt.dbutil.DBConnection;
import empmgmt.pojo.EmpPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDao {
    //Create
    public static boolean addEmp(EmpPojo e) throws SQLException {
        PreparedStatement ps = DBConnection.getConnection().prepareStatement("insert into employee values(?,?,?)");
        ps.setInt(1, e.getEmpno());
        ps.setString(2, e.getEname());
        ps.setDouble(3, e.getSal());
        int result = ps.executeUpdate();
        return result == 1;
    }

    //Read
    public static EmpPojo findEmpByID(int eno) throws SQLException {
        EmpPojo e = null;
        PreparedStatement ps = DBConnection.getConnection().prepareStatement("Select * from employee where empid=?");
        ps.setInt(1, eno);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            e = new EmpPojo();
            e.setEmpno(rs.getInt(1));
            e.setEname(rs.getString(2));
            e.setSal(rs.getDouble(3));
        }
        return e;
    }

    //Read
    public static ArrayList<EmpPojo> getAllEmp() throws SQLException {
        
        PreparedStatement ps = DBConnection.getConnection().prepareStatement("Select * from employee order by empid");
        ResultSet rs = ps.executeQuery();
        ArrayList<EmpPojo> empList = new ArrayList<EmpPojo>();
        while (rs.next()) {
            EmpPojo e = new EmpPojo();
            e.setEmpno(rs.getInt(1));
            e.setEname(rs.getString(2));
            e.setSal(rs.getDouble(3));
            empList.add(e);
        }
        return empList;
    }
    
    //Update
    public static boolean updateEmp(EmpPojo e) throws SQLException {
        PreparedStatement ps = DBConnection.getConnection().prepareStatement("update employee set empname=?,empsal=? where empid=?");
        ps.setString(1, e.getEname());
        ps.setDouble(2,e.getSal());
        ps.setInt(3, e.getEmpno());
        int res=ps.executeUpdate();
        return res==1;
    }

    //Delete
    public static boolean deleteEmp(int eno) throws SQLException {
        PreparedStatement ps = DBConnection.getConnection().prepareStatement("DELETE FROM employee WHERE empid=?");
        ps.setInt(1, eno);
        int res=ps.executeUpdate();
        return res==1;
    }

    
}
