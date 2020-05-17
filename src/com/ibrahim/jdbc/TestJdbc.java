package com.ibrahim.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/hb_student_tracker";
        String user = "postgres";
        String password = "postgres";

        System.out.println("Connecting to database: " + jdbcUrl);
        Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
        System.out.println("Connection successful!!!");
    }
}
