package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import BussinessLogic_Layer.Make_Word;

public class DatabaseWord {
	public DatabaseWord(){
		
		
	}
	static boolean t=false;
	static List<String> word_DB2=new ArrayList<String>();
public static void Word_Data() {
	Make_Word obj=new Make_Word();
	List<String> word_DB=word_DB=obj.Word_List();
	List<Integer> word_Fre=word_Fre=obj.Word_Fre();
	word_DB2=word_DB;
		
		
		
    	
    	try {
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker","root","");
        	
        	PreparedStatement st1 = con.prepareStatement("TRUNCATE TABLE word");
	        st1.execute();
        	
        		for(int i=0;i<word_DB.size();i++) {
        		int Fre=(int) word_Fre.get(i);
        		
    	        PreparedStatement st = con.prepareStatement("insert into word values("+null+",'"+word_DB.get(i)+"',"+Fre+")");
    	        st.execute();
        		
        		}
        		JOptionPane.showMessageDialog(null,"Word Sent Successfully in Database");
        		t=true;
        	con.close();
        }
        catch(SQLException e) {
        	JOptionPane.showMessageDialog(null,"Connection Not Found");
        }
		
		
	}

    public  List<String> Test() {
	
	      return word_DB2; 
        }
public static boolean CheckConnection() {
		
	Word_Data();
		if(t==true) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
}
