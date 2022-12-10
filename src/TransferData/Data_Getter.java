package TransferData;

import java.util.ArrayList;

import Database_Layer.DataBase;

public class Data_Getter {
	
	DataBase Obj =new DataBase();
	
	
	public ArrayList<String> GET_Word(){
		
		return Obj.Retrive_Data();
		
	}
	public ArrayList<Integer> GET_Key(){
		
		return Obj.SetKey();
	}

	
	 
	 
	
}
