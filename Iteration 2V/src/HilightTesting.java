import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import BussinessLogic_Layer.CHeck_Words;






class HilightTesting {

	@Test
	public  void assertEqual1()
	{
		CHeck_Words E=new CHeck_Words() ;
		String Str="Esha Cheema Fastians";
		E.String_Breaker(Str);
		
		
		Assertions.assertEquals("Esha",E.TestWord);
		
		
		
	}
	
	
	@Test
	public  void assertEqual2()
	{
		CHeck_Words E=new CHeck_Words() ;
		String Str="Esha Cheema Fastians";
		E.String_Breaker(Str);
		
		
		Assertions.assertEquals("Cheema",E.TestWord);
		
		
		
	}
	@Test
	public  void AssertTrue1()
	{
		CHeck_Words t=new CHeck_Words() ;
		String Str="Esha Cheema Fastians";
		t.String_Breaker(Str);
		Assertions.assertTrue(t.TestErrorHI1());
		
	}
	
	
	@Test
	public  void AssertFalse2()
	{
		CHeck_Words t=new CHeck_Words() ;
		String Str="Esha Cheema Fastians";
		t.String_Breaker(Str);
		Assertions.assertFalse(t.TestErrorHI2());
		
	}
	
	@Test
	public  void AssertFalse3()
	{
		CHeck_Words t=new CHeck_Words() ;
		String Str="متعلقہ ججوں کو مرتد یعنی دین سے";
		t.String_Breaker(Str);
		Assertions.assertFalse(t.TestErrorHI1());
		
	}
	
	@Test
	public  void AssertTrue4()
	{
		CHeck_Words t=new CHeck_Words() ;
		String Str="مطعلقہ ججوں کو مرتد یعنی دین سے";
		t.String_Breaker(Str);
		Assertions.assertTrue(t.TestErrorHI2());
		
	}
	
	
	
	

}
