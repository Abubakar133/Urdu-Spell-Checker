package TransferData;

import java.util.ArrayList;

import BussinessLogic_Layer.Generate_Mutant;
import Database_Layer.MutantDatabase;

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
		  MutantDatabase obj=new MutantDatabase();
		  obj.insertData();
		  
		  
	  }

}
