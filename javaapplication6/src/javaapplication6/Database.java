package javaapplication6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    
    static Connection con = createConnection();
    Statement statement;

    public Database() throws SQLException {
        this.statement = con.createStatement();
    }
    
    static Connection createConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/seasun", "root", "");    
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
