package curs9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

    public static Connection openDBConnection(String hostname, String user, String password){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(hostname,user,password);
            System.out.println("Connection done.");

        }catch(SQLException e){
            System.out.println("Connection failed.");
        }

        return connection;
    }

    public static void closeDBConnection(Connection connection){
        try{

            connection.close();
            System.out.println("Connection closed");

        }catch (SQLException e){
            System.out.println("Closing failed");
        }
    }

}
