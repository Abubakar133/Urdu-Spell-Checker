package TransferData;

import java.util.ArrayList;

import BussinessLogic_Layer.Generate_Mutant;
import Database_Layer.MutantDatabase;

public class DataSetter {
	Generate_Mutant obj2=new Generate_Mutant();
	
	public ArrayList<String> setWord(){
		  
	  return obj2.NewWord(); 
	  
	  } 
	  public ArrayList<Integer> setKey()
	  {
		  
		 return obj2.NewKey(); 
		  
	  }
	  public void insertDB() {
		  MutantDatabase obj=new MutantDatabase();
		  obj.insertData();
		  
		  
	  }

}
