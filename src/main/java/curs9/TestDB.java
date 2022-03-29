package curs9;

import java.sql.Connection;

public class TestDB {

    static String hostname = "jdbc:mysql://keytraining-demo.c050jeowbe1q.eu-central-1.rds.amazonaws.com:3306/KeyTraining";
    static String user ="demouser";
    static String password = "demouser";


    public static void main (String[] args){

        Connection connection = DBConn.openDBConnection(hostname,user,password);
        System.out.println(DBQuery.dbSelectQuery(connection,QueryStatements.SELECT.getQuery()));
        DBQuery.dbUpdateQuery(connection, QueryStatements.UPDATE_CUSTOMERS.getQuery());
        System.out.println(DBQuery.dbSelectQuery(connection,QueryStatements.SELECT.getQuery()));


        DBConn.closeDBConnection(connection);


    }

}
