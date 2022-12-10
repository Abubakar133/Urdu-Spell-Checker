package Database_Layer;

import java.util.List;

public class IFacade implements Facade {

	
	Read_wordsF R1;
	DatabasePGF D1;
	DatabaseWordF DW;
	Database_RetriveF DR;
	public IFacade() {
		R1 = new Read_words();
		D1= new DatabasePG();
		DW= new DatabaseWord();
		DR= new Database_Retrive(); 
	}
	@Override
	public List<?> returnword() {
		// TODO Auto-generated method stub
		return R1.returnword();
	}

	public void PG_Data() {
		// TODO Auto-generated method stub
		  D1.PG_Data();
	}

	
	

	@Override
	public boolean CheckConnection() {
		// TODO Auto-generated method stub
		return DR.CheckConnection();
	}

	
	
	
	@Override
	public List<String> Test() {
		// TODO Auto-generated method stub
		return D1.Test();
	}

	

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		DW.delete(id);
	}

	@Override
	public void update(String word, int id, int fre) {
		// TODO Auto-generated method stub
		DW.update(word, id, fre);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		DW.delete();
	}

	@Override
	public void Word_Data() {
		// TODO Auto-generated method stub
		DW.Word_Data();
	}

	@Override
	public List<String> Word() {
		// TODO Auto-generated method stub
		return DR.Word();
	}

	@Override
	public void WordST() {
		// TODO Auto-generated method stub
		R1.WordST();
	}

}
