package BussinessLogic_Layer;

import java.text.BreakIterator;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Database_Layer.DatabaseWord;
import Database_Layer.Database_Retrive;
import Database_Layer.Facade;
import Database_Layer.IFacade;

public class Make_Word implements Make_WordF {

	
	
	public Make_Word(){
		
		
	}
	
	private Facade Fs=new IFacade();
	static List<String> w_DB = new ArrayList<String>(); 
    static List<Integer> F_DB = new ArrayList<Integer>();
    
    
 
   // static DatabaseWord T1= new DatabaseWord();
    
    public void controller() {
    	
    	
    	List<String> c1 = Fs.Word();
    	
    	List<String> c2 = Word_Creator(c1);
    	HashMap_Fun(c2);
    	Fs.Word_Data();
    }
    
    public void Word_Single(String Word) {
    	
    	w_DB.add(Word);
    	
    	F_DB.add(010);
    	Fs.Word_Data();
    }
    
	@SuppressWarnings("unchecked")
	public List<String> Word_Creator(List<String> obj ) {
		
		
		
		   
   	 List<String> Word_List=new ArrayList<String>();
        Word_List.clear();
  
   	 BreakIterator cn = BreakIterator.getWordInstance();
		for(int i=0;i<obj.size();i++) {
			
		String P=obj.get(i);
		
	    cn.setText(P);
	    int l1 = cn.first();
	    while (BreakIterator.DONE != l1) {
	        int first = l1;
	        l1 = cn.next();
	        if (l1 != BreakIterator.DONE && Character.isLetterOrDigit(P.charAt(first))) {
	            Word_List.add(P.substring(first, l1));
	        }
	    }
		}
   	 
        return Word_List;
        
        
    }
	public List<String> Word_List() {
	   	 
	   	 return w_DB;
	    }
	
	public void HashMap_Fun(List<String> word_List) {
		
      HashMap <String,Integer>T3=new HashMap<>(); 
        
        for(String count : word_List) {
        if (T3.containsKey(count)) {
         T3.put(count,T3.get(count)+1);
         
         }
        else{ 
            T3.put (count,1);
         } 
        }
        for (Map.Entry<String,Integer>entry:T3.entrySet()) 
        {  
        	String word=entry.getKey();
        	int Key=entry.getValue();
       	     w_DB.add(word);
       	     F_DB.add(Key);
    
        }
          
	}
	
	
    public List<Integer> Word_Fre() {
   	 
   	 return F_DB;
    }
    
    boolean check;
   
    
    public void delete(boolean t) {
    	if(t=true) {
    		Fs.delete();
    	}
    	else {
		

    	}
    	}
    

    
}
