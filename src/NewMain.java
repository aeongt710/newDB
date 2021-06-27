
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AHMAD
 */
import java.sql.*;
//jdbc:oracle:thin:@//localhost:1521/ORCLPDB

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
//        String exp = "231*+9-";
////        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
//        
        String url="jdbc:oracle:thin:@//localhost:1521/ORCLPDB";
        Connection conn=DriverManager.getConnection(url, "hr", "hr");
        Statement state=conn.createStatement();
        ResultSet rs=state.executeQuery("Select * from employees");
        while(rs.next()){
            System.out.println("ID: "+rs.getInt(1)+" Name: "+rs.getString(2)+" Lname"+rs.getString(3));
        }
        conn.close();
        
    }

}
