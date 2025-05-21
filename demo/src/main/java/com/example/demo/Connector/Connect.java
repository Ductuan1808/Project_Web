package com.example.demo.Connector;

import org.apache.catalina.connector.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static Connection connect(){
        String url="jdbc:mysql://localhost:3306/web?useUnicode=true&characterEncoding=UTF-8";
        String user="root";
        String pass="";
        Connection d=null;
        try {
            d=DriverManager.getConnection(url,user,pass);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return d;
    }
}
