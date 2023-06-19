/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author chand
 */
public class Mysql {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/chandandb";
        String username="root";
        String password="ch@#123roY";
        System.out.println("Connecting Database...");
        try(Connection connection=DriverManager.getConnection(url,username,password)){
            System.out.println("Database Connected");
            PreparedStatement ps =connection.prepareStatement("insert into user values('chandan','1234')");
            ps.executeUpdate();
        }
        catch(Exception e){
            System.out.println("e");
        }
     
    }
    
}
