import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import BussinessLogic_Layer.CHeck_Words;
import BussinessLogic_Layer.Generate_Mutant;
import BussinessLogic_Layer.Make_Word;
import BussinessLogic_Layer.ReadXML;
import Database_Layer.DatabasePG;
import Database_Layer.DatabaseWord;
import Database_Layer.Database_Retrive;
import Database_Layer.Facade;
import Database_Layer.IFacade;


class Testing_Cases {

	 
	 
	
	@Test
	@DisplayName("Check Word Data")
	public  void assertEqua()
	{
		Make_Word t=new Make_Word() ;
		
		List<String> w_DB = new ArrayList<String>();
		t.Word_Single("Abubakar");
		w_DB=t.Word_List();
		
		
		String name=w_DB.get(0);
		
		Assertions.assertEquals("Abubakar",name);
		
	}
	
	@Test
	@DisplayName("Check array List")
	public  void assertequal1()
	{
		DatabaseWord t=new DatabaseWord() ;
		Make_Word t2=new Make_Word() ;
		
		List<String> w_DB = new ArrayList<String>();
		t2.Word_Single("Abubakar");
		w_DB=t.Test();
		
		String name=w_DB.get(0);
		
		Assertions.assertEquals("Abubakar",name);
		
	}
	
	@Test
	@DisplayName("Db con 1")
	public  void DB1()
	{
		Database_Retrive t=new Database_Retrive() ;
		
		
		Assertions.assertTrue(t.CheckConnection());
		
	}
	
	

	@Test
	@DisplayName("Db con 2")
	public  void DB2()
	{ Facade Fs=new IFacade();
		DatabasePG t=new DatabasePG() ;
		Assertions.assertTrue(Fs.CheckConnection());
		
	}
	
	@Test
	@DisplayName("Db con 3")
	public  void DB3()
	{
		DatabaseWord t=new DatabaseWord() ;
		
		Assertions.assertTrue(t.CheckConnection());
		
	}
	
	@Test
	@DisplayName("Check Db Data")
	public  void assertequal3()
	{
		ReadXML t=new ReadXML() ;
		DatabasePG t2=new DatabasePG() ;
		List<String> w_DB = new ArrayList<String>();
		t.XMLtitle.add("University");
		w_DB=t2.Test();
		
		String name=w_DB.get(0);
		
		Assertions.assertEquals("Abubakar",name);
		
	}
	@Test
	public void checkduplication() {
		
		Generate_Mutant G=new Generate_Mutant();
		ArrayList ar=new ArrayList();
		ar.add("ibrahim");
		ar.add("Abubakar");
		ar.add("ibrahim");
		Assertions.assertTrue(G.checkduplication(ar, "ibrahim"));
		
	}
	
	

}
