package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import TransferData.Data_Getter;
import TransferData.Data_Setter;

public class DataBase {
	
public ArrayList<String> Retrive_Data() {
		  
		
		ArrayList<String> Array1 = new ArrayList<String>();
		
		
		try {
	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker","root","");
	    	
	    	if (!con.isClosed())
	    	   {
	    		PreparedStatement ps = con.prepareStatement("SELECT * from word");
	          
	            ResultSet rs = ps.executeQuery();
	    	      
	    	      while (rs.next())
	    	      {
	    	    	 String arr;
	    	        arr=(String) rs.getObject("words");
	    	        Array2.add((Integer)rs.getObject("word_id"));
	    	        Array1.add(arr);
	    	        
	    	      }
	    	     
	    	      con.close();
	    	   }
	    	   else
	    	      System.out.println("fail");
	    	}
	    catch(SQLException e) {
	    	System.out.println(e);
	    }
          return(Array1);
	}
ArrayList<Integer> Array2 = new ArrayList<Integer>();
public ArrayList<Integer> SetKey() {
	
	
	return Array2;
	
	
}

}
