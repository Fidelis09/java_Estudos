package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;

public class DB {

    private static Connection conn = null;

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/coursejdbc";
    private static final String USUARIO = "developer";
    private static final String SENHA = "1234567";

    public static Connection getConnection() {
        if (conn == null) {
            try {
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            } catch (SQLException e) {
                throw new DbExeption(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbExeption(e.getMessage());
            }
        }
    }

}