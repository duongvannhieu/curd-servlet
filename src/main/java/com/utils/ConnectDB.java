package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static Connection createConnect()  {
        Connection conn = null;

//        Properties p = new Properties();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            p.load(new FileInputStream("database.properties"));
//            url = p.getProperty("url");
//            user = p.getProperty("user");
//            password = p.getProperty("password");

            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Study;integratedSecurity=true;user=sa;password=123456789");
        } catch (ClassNotFoundException | SQLException e) {
           System.out.println("Connect err " + e.getMessage());
        }
        return conn;
    }
}
