package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Database_Retrive {
	Database_Retrive(){
		
		
	}
	 

	public static List<String> Word() {
		 List<String> A_Str = new ArrayList<String>();
		try {
	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker","root","");
	    	
	    	if (!con.isClosed())
	    	   {
	    		PreparedStatement ps = con.prepareStatement("SELECT * from Paragraph");
	          
	            ResultSet rs = ps.executeQuery();
	    	      
	    	      while (rs.next())
	    	      {
	    	    	 
	    	        A_Str.add((String) rs.getObject("Context"));
	    	        
	    	        
	    	      }

	    	      con.close();
	    	      JOptionPane.showMessageDialog(null,"FIle Retrived Successfully please wait....");
	    	   }
	    	   else
	    		   JOptionPane.showMessageDialog(null,"Connection Not Found");
	    	}
	    catch(SQLException e) {
	    	JOptionPane.showMessageDialog(null,"Driver Error Found");
	    }

		return A_Str;
	}

		
	
}
