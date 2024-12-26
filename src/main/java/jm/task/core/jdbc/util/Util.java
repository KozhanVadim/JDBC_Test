package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
   private static final String URL = "jdbc:postgresql://localhost:5432/userservicetest";
    private static final String USER = "postgres";
    private static final String PASS = "0000";

    public static Connection open() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Util() {
    }
}
