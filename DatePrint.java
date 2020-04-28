
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prakhar patidar
 */
public class DatePrint {
    public static void main(String[] args) {
        Date today =new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
        String date=sdf.format(today);
        System.out.println(date);
    }
    
}
