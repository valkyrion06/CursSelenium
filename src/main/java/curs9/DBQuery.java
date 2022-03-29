package curs9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBQuery {

    public static List<String> dbSelectQuery(Connection connection, String query){
        List<String> resultList = new ArrayList<>();

        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                resultList.add(resultSet.getString(3));
            }
        }catch (SQLException e){
            System.out.println("Couldn't do query");
        }
        return resultList;
    }

    public static void dbUpdateQuery(Connection connection, String query){
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Update succeeded.");

        }catch (SQLException e){
            System.out.println("Update failed.");
        }



    }

    public static void dbDeleteQuery(Connection connection, String query){
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Delete succeeded");

        }catch (SQLException e){
            System.out.println("Delete failed.");
        }



    }


}
