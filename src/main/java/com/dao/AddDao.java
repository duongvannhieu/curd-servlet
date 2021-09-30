package com.dao;

import com.models.ShowUserModel;
import com.utils.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddDao {
    public void AddUser(ShowUserModel showUserModel) {
        Connection conn;
        PreparedStatement preparedStatement;
        conn = ConnectDB.createConnect();
        String sqlCommand = "insert into sinhvien (ho_ten, so_dien_thoai, dia_chi, gioi_tinh, ngay_sinh, email, mat_khau)" +
                "values(?, ?, ?, ?, ?, ?, ?)";
        try {
            preparedStatement = conn.prepareStatement(sqlCommand);
            preparedStatement.setString(1, showUserModel.getName());
            preparedStatement.setString(2, showUserModel.getPhone());
            preparedStatement.setString(3, showUserModel.getAddress());
            preparedStatement.setString(4, showUserModel.getSex());
            preparedStatement.setString(5, showUserModel.getBirthday());
            preparedStatement.setString(6, showUserModel.getEmail());
            preparedStatement.setString(7, showUserModel.getPassword());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
