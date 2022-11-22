package TransferData;

import java.util.ArrayList;

import bussinesslogicLayer.Generate_Mutant;
import dataAccessLayer.Insert_to_Database;

public class Data_Setter {
	Generate_Mutant obj2=new Generate_Mutant();
	
	public ArrayList<String> Set_Word(){
		  
	  return obj2.NewWord(); 
	  
	  } 
	  public ArrayList<Integer> Set_Key()
	  {
		  
		 return obj2.NewKey(); 
		  
	  }
	  public void Insert_DB() {
		  Insert_to_Database obj=new Insert_to_Database();
		  obj.Insert_Data();
		  
		  
	  }

}
