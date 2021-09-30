package com.dao;

import com.models.UserModel;
import com.utils.ConnectDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
    public String checkUser(UserModel userModel)  {
        Connection conn;
        Statement statement;
        ResultSet resultSet;

        conn = ConnectDB.createConnect();
        String sqlCommand = "select email, mat_khau from sinhvien";
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sqlCommand);
            while (resultSet.next()) {
                if (resultSet.getString("email").equals(userModel.getUsername())
                && resultSet.getString("mat_khau").equals(userModel.getPassword())) {
                    return "success";
                }
            }
        } catch (SQLException e) {
           System.out.println("Create statement err" + e.getMessage());
        }
        return "Connot Cannection";
    }


}
