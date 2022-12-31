import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import BussinessLogic_Layer.Generate_Mutant;
import BussinessLogic_Layer.ReadXmlFiles;
import Database_Layer.DatabaseParagraph;
import Database_Layer.DatabaseWord;
import Database_Layer.DatabaseRetriveParagraph;
import Database_Layer.FacadeDatabase;
import Database_Layer.IFacadeDatabase;
import BussinessLogic_Layer.IFacadeBussiness;
import BussinessLogic_Layer.FacadeBussiness;


class Testing_Cases {

	 
	 
	
	@Test
	@DisplayName("Check Word Data")
	public  void assertEqua()
	{
		
		IFacadeBussiness Fs=new FacadeBussiness();
		List<String> w_DB = new ArrayList<String>();
		Fs.singleWord("Abubakar");
		w_DB=Fs.returnWordList();
		
		
		String name=w_DB.get(0);
		
		Assertions.assertEquals("Abubakar",name);
		
	}
	
	@Test
	@DisplayName("Check array List")
	public  void assertequal1()
	{
		IFacadeBussiness Fs=new FacadeBussiness();
		
		FacadeDatabase t=new IFacadeDatabase();
		
		
		List<String> w_DB = new ArrayList<String>();
		Fs.singleWord("Abubakar");
		w_DB=t.test();
		
		String name=w_DB.get(0);
		
		Assertions.assertEquals("Abubakar",name);
		
	}
	
	@Test
	@DisplayName("Db con 1")
	public  void DB1()
	{
		FacadeDatabase Fs=new IFacadeDatabase();
		DatabaseRetriveParagraph t=new DatabaseRetriveParagraph() ;
		
		
		Assertions.assertTrue(Fs.checkConnectionRetrive());
		
	}
	
	

	@Test
	@DisplayName("Db con 2")
	public  void DB2()
	{ FacadeDatabase Fs=new IFacadeDatabase();
		DatabaseParagraph t=new DatabaseParagraph() ;
		Assertions.assertTrue(Fs.checkConnectionParagraph());
		
	}
	
	@Test
	@DisplayName("Db con 3")
	public  void DB3()
	{
		DatabaseWord t=new DatabaseWord() ;
		
		Assertions.assertTrue(t.checkConnectionWord());
		
	}
	
	@Test
	@DisplayName("Check Db Data")
	public  void assertequal3()
	{
		ReadXmlFiles t=new ReadXmlFiles() ;
		DatabaseParagraph t2=new DatabaseParagraph() ;
		List<String> w_DB = new ArrayList<String>();
		t.xmltitlelist.add("University");
		w_DB=t2.test();
		
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
