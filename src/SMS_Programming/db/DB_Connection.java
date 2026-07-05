package SMS_Programming.db;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
    static Connection con;
    public static Connection createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user ="root";
            String pass = "65Strickysqlgiri#";
            String url = "jdbc:mysql://localhost:3306" +
                    "/student";
            con= DriverManager.getConnection(url,user,pass);

        }

        catch (Exception ex){
            ex.printStackTrace();
        }
       return con;
    }
}


