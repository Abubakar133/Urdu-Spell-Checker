package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import BussinessLogic_Layer.ReadXML;

public class DatabasePG {

	
	public DatabasePG(){
		
	}
	
	static List<String> A_Str2=new ArrayList();
	public static void PG_Data() {
		ReadXML obj=new ReadXML();
		List<String> A_Str=obj.RA();
		List<String> T_Str=obj.RT();
		List<String> P_Str=obj.RP();
		A_Str2=A_Str;
		
		
		
	  	
		try {
	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker","root","");
	    	
	    	for(int i=0;i<P_Str.size();i++) {
	    		try {
	    			
	    		
		        PreparedStatement st = con.prepareStatement("insert into paragraph values("+null+",'"+T_Str.get(i)+"','"+A_Str.get(i)+"','"+P_Str.get(i)+"')");
		        st.execute();
	    		
		         
	    		}
		        catch(SQLException e) {
		        	JOptionPane.showMessageDialog(null,"Currepted File Found");
			    }
	    	}
	    	con.close();
	    	JOptionPane.showMessageDialog(null,"File inserted Succesfully in Paragraph Table"); 
	    }
	    catch(SQLException e) {
	    	JOptionPane.showMessageDialog(null,"FIle Connection Error Found"); 
	    }

	}
	
	public List Test() {
		return A_Str2;
		
	}
	
	
}
