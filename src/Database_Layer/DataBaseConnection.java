package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DataBaseConnection
{
    private static DataBaseConnection obj;
 
    String Username="root";
    String Password="";
    
    private DataBaseConnection() {}
 
    public static DataBaseConnection getInstance()
    {
        if (obj==null)
            obj = new DataBaseConnection();
        return obj;
    }
    
    public Connection Connec() throws SQLException {
    	
    	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker2", Username, Password);
		return connection;
    	
    }
    
}