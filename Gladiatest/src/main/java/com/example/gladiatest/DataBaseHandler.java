package com.example.gladiatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseHandler extends Configs {
    Connection dbConnection;

    public  Connection getDbConnection()
            throws ClassNotFoundException, SQLException{
    String connectionString = "jdbc.mysql//" + dbHost + ":" + dbPort + "/" + dbName;

    Class.forName("com.msql.jdbc.Driver");

    dbConnection = DriverManager.getConnection(connectionString, dbUser,dbPass);
    return dbConnection;

    }
}
