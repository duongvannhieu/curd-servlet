package com.dao;

import com.models.ShowUserModel;
import com.utils.ConnectDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class WelcomeDao {
    String name;
    String phone;
    String address;
    String sex;
    String birthday;
    String email;
    String password;

    public ArrayList<ShowUserModel> showUser() {
        Connection conn;
        Statement statement;
        ResultSet resultSet;
        String gioi_tinh;

        conn = ConnectDB.createConnect();
        String sqlCommand = "select * from sinhvien";
        ArrayList<ShowUserModel> list = new ArrayList<ShowUserModel>();
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sqlCommand);
            while (resultSet.next()) {
                name = resultSet.getString("ho_ten");
                phone = resultSet.getString("so_dien_thoai");
                address = resultSet.getString("dia_chi");
                if(resultSet.getString("gioi_tinh").equals("1")) {
                    gioi_tinh = "Nam";
                } else {
                    gioi_tinh = "Nu";
                }
                sex = gioi_tinh;
                birthday = resultSet.getString("ngay_sinh");
                email = resultSet.getString("email");
                password = resultSet.getString("mat_khau");
                list.add(new ShowUserModel(name, phone, address, sex, birthday, email, password));

            }
        } catch (SQLException e) {
            System.out.println("Statement err " + e.getMessage());
        }
        return list;
    }
}
