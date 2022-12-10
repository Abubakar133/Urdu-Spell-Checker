package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import TransferData.Data_Setter;

public class Insert_to_Database {
	
	static ArrayList<String> NewWord = new ArrayList<String>();
	static ArrayList<Integer> NewKey = new ArrayList<Integer>();
	Data_Setter obj=new Data_Setter();
	
	public void get_NWord() {
		  NewWord=obj.Set_Word(); 
		  
		  } 
	  public void Get_NKey() {
	  NewKey=obj.Set_Key();
	  }
	  
	  public void Insert_Data() {
		  get_NWord();
		  Get_NKey();
		  
		  
	  String str = ""; 
	
		  
	  try { 
		  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker","root","");
		  for(int i=0;i<NewWord.size();i++) { 
			  
	  
	  str ="insert into Mutants values("+null+",'"+NewWord.get(i)+"',"+NewKey.get(i)+")"; PreparedStatement st = con.prepareStatement(str); st.execute();
	  
	  
	  
	  } con.close(); 
	  JOptionPane.showMessageDialog(null,"Data Inserted SUCCESSFULLY"); 
	  } 
	  catch(SQLException e) 
	  { System.out.println(e); 
	  }
	  }
	 
}
