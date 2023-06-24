package database;

import java.sql.*;
import java.sql.Connection;

public class Dbconnection {

    public static Connection dbConnect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restroflow", "root", "iop123THE");
            System.out.println("connected to database");
            return conn;
        } catch (Exception e) {
            System.out.println("There were errors while connecting to db.");
            return null;
        }
    }
}
