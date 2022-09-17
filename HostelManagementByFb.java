/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hostelmanagementbyfb;

import com.mysql.cj.xdevapi.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fb
 */
public class HostelManagementByFb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new login().setVisible(true);
        
        String user = "root";
        String ps = "Fenil@123";
        String url = "jdbc:mysql://localhost:3306/forhostel";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, user, ps);
            
            java.sql.Statement stm = c.createStatement();
//                    stm.executeUpdate("INSERT INTO `forhostel`.`hosteldata` (`id`, `Name`, `Surname`, `City`, `Mobile`, `Stream`) VALUES ('3', 'fenil', 'patel', 'rajkot', '12345', 'Maths');");

//            ResultSet rs = stm.executeQuery("Select * from hosteldata");
            
//            while(rs.next()) {
//                System.out.println(rs);
//            }
            
            if(c!=null) {
                System.out.println("complete");
            } else System.out.println("incomplete");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HostelManagementByFb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HostelManagementByFb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
