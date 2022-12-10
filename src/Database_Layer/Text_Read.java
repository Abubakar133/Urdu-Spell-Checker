package Database_Layer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Text_Read {
	static String Title;
	static String Author;
	static String Paragraph;
	int id;
	
	public static ArrayList<String> errorlist = new ArrayList<String>();
	public static ArrayList<String> errorlist2 = new ArrayList<String>();
	
	
public void connection_FUN(ArrayList words) {
	errorlist.clear();
	
	try {
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker","root","");
    	
    	
    		for ( int i=0;i<words.size();i++ ) {
    		PreparedStatement ps = con.prepareStatement("SELECT * FROM word WHERE words LIKE '" + words.get(i) + "'");
          
            ResultSet rs = ps.executeQuery();
    	      
    	      if (rs.next()) {
    	    	 
    	    	  
                 
              } else {
            	 
            	  errorlist.add((String) words.get(i));
            	  
              }
    		}
    	      con.close();
    	   
    	   
    	}
    catch(SQLException e) {
    	System.out.println(e);
    }

}

public void connection(ArrayList words) {
	errorlist2.clear();
	
	try {
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker","root","");
    	
    	
    		for ( int i=0;i<words.size();i++ ) {
    		PreparedStatement ps = con.prepareStatement("SELECT * FROM mutants WHERE Word LIKE '" + words.get(i) + "'");
          
            ResultSet rs = ps.executeQuery();
    	      
    	      if (rs.next()) {
    	    	 
    	    	  errorlist2.add((String) words.get(i));
                 
              } else {
            	 
            	  
            	  
              }
    		}
    	      con.close();
    	  
    	}
    catch(SQLException e) {
    	System.out.println(e);
    }

}
public String connection3(String word) {
  
	int id = 0;
	String Nword = null;
	try {
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker","root","");
    	
    	
    		PreparedStatement ps = con.prepareStatement("SELECT * FROM mutants WHERE Word LIKE '" + word + "'");
          
            ResultSet rs = ps.executeQuery();
    	      
    	      if (rs.next()) {
    	    	  id= (int) rs.getObject("F_Key");
    	    	                  
              } else {
            	 
            	  
            	  
              }

    	      PreparedStatement ps1 = con.prepareStatement("SELECT * FROM word WHERE word_id = '" + id + "'");
              
              ResultSet rs1 = ps1.executeQuery();
      	      
      	      if (rs1.next()) {
      	    	 
      	    	  Nword=(String) rs1.getObject("words");
                   
                } 
    	      
    	      
    	      
    	      
    	      con.close();
    	  
    	}
    catch(SQLException e) {
    	System.out.println(e);
    }

	return Nword;
}



 public ArrayList<String> ErrorList() {
	 
	 return errorlist;
 }
 
public ArrayList<String> ErrorList2() {
	 
	 return errorlist2;
 }


}

