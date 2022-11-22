import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import BussinessLogic_Layer.Make_Word;
import BussinessLogic_Layer.ReadXML;
import Database_Layer.DatabasePG;
import Database_Layer.DatabaseWord;


class UC1_Testing {

	
	
	@Test
	@DisplayName("Check Word Data")
	public  void assertnull()
	{
		Make_Word t=new Make_Word() ;
		
		List<String> w_DB = new ArrayList<String>();
		t.Word_Single("Abubakar");
		w_DB=t.Word_List();
		
		
		String name=w_DB.get(0);
		
		Assertions.assertEquals("Abubakar",name);
		
	}
	
	@Test
	@DisplayName("Check words")
	public  void assertnull2()
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
	@DisplayName("Check words")
	public  void assertnull3()
	{
		ReadXML t=new ReadXML() ;
		DatabasePG t2=new DatabasePG() ;
		List<String> w_DB = new ArrayList<String>();
		t.XMLtitle.add("University");
		w_DB=t2.Test();
		
		String name=w_DB.get(0);
		
		Assertions.assertEquals("Abubakar",name);
		
	}

}
