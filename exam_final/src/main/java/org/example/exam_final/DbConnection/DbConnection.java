package org.example.exam_final.DbConnection;


import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DbConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/exam_final";
    private static final String USER = "postgres";
    private static final String PASSWORD = "17Novembre2003";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
