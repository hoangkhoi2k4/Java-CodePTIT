/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author duc
 */
public class TestDB {

    /**
     * @param args the command line arguments
     */
    
    public Connection getConnection() throws SQLException {
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "123456aA@");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/email_list", connectionProps);
        return conn;
    }
    
    public boolean executeUpdate(Connection conn, String command) throws SQLException {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(command); // This will throw a SQLException if it fails
            return true;
        } finally {

            // This will run whether we throw an exception or not
            if (stmt != null) { stmt.close(); }
        }
    }
    
    public ResultSet executeQuery(Connection conn, String command) throws SQLException {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(command); // This will throw a SQLException if it fails
            return rs;
        } catch (SQLException e) {
                System.out.println("ERROR: Could not query the database");
                e.printStackTrace();
                return null;
        }
    }
    
    public void run() {
        // Connect DB
        Connection conn = null;
        try {
            conn = this.getConnection();
            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.out.println("ERROR: Could not connect to the database");
            e.printStackTrace();
            return;
        }
        
        // Create a table
        try {
            String dropString = "DROP TABLE IF EXISTS employee";
            this.executeUpdate(conn, dropString);
            String createString =
                    "CREATE TABLE employee( " +
                    "ID INTEGER NOT NULL, " +
                    "NAME varchar(40) NOT NULL, " +
                    "PRIMARY KEY (ID))";
            this.executeUpdate(conn, createString);
            System.out.println("Created a table");
        } catch (SQLException e) {
            System.out.println("ERROR: Could not create the table");
            e.printStackTrace();
            return;
        }
        
        // Insert data
        try {
            String insertString =
                    "INSERT INTO employee VALUES( " +
                    "01, " +
                    "'Peter')";
            this.executeUpdate(conn, insertString);
            System.out.println("Inserted a row into table");
            insertString =
                    "INSERT INTO employee VALUES( " +
                    "02, " +
                    "'Mary')";
            this.executeUpdate(conn, insertString);
            System.out.println("Inserted a row into table");
        } catch (SQLException e) {
            System.out.println("ERROR: Could not insert data into the table");
            e.printStackTrace();
            return;
        }
        
        // Query data
        try {
            String queryString = "SELECT * FROM employee";
            ResultSet rs = this.executeQuery(conn, queryString);
            System.out.println("Data in the table:");
            while (rs.next()){
                System.out.println("ID: " + rs.getInt("ID"));
                System.out.println("Name: " + rs.getString("Name"));
                System.out.println("---------------");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: Could not query data from the table");
            e.printStackTrace();
            return;
        }
    }
    
    public static void main(String[] args) {
        TestDB app = new TestDB();
        app.run();
    }
    
}
