package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import TransferData.DataSetter;

public class MutantDatabase {
	
	static ArrayList<String> NewWord = new ArrayList<String>();
	static ArrayList<Integer> NewKey = new ArrayList<Integer>();
	DataSetter obj=new DataSetter();
	Connection con;
	DataBaseConnection obj1 = DataBaseConnection.getInstance();
	public void getNWord() {
		  NewWord=obj.setWord(); 
		  
		  } 
	  public void getNKey() {
	  NewKey=obj.setKey();
	  }
	  
	  public void insertData() {
		  getNWord();
		  getNKey();
		  
		  
	  String str = ""; 
	
		  
	  try { 
		  con=obj1.Connec();
		  
		  for(int i=0;i<NewWord.size();i++) { 
			  
	  
	  str ="insert into Mutants values("+null+",'"+NewWord.get(i)+"',"+NewKey.get(i)+")"; PreparedStatement st = con.prepareStatement(str); st.execute();
	  
	  
	  
	  }  
	  JOptionPane.showMessageDialog(null,"Data Inserted SUCCESSFULLY"); 
	  } 
	  catch(SQLException e) 
	  { System.out.println(e); 
	  }
	  }
	 
}
