package BussinessLogic_Layer;

import java.text.BreakIterator;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Database_Layer.DatabaseWord;
import Database_Layer.DatabaseRetriveParagraph;
import Database_Layer.FacadeDatabase;
import Database_Layer.IFacadeDatabase;

public class MakeWords implements MakeWordsF {

	
	
	public MakeWords(){
		
		
	}
	
	private FacadeDatabase facade=new IFacadeDatabase();
	static List<String> words = new ArrayList<String>(); 
    static List<Integer> wordfrequency = new ArrayList<Integer>();
    
    
 
   
    
    public void controller() {
    	
    	
    	List<String> c1 = facade.getParagraphs();
    	List<String> c2 = wordCreator(c1);
    	hashMapFun(c2);
    	facade.Word_Data();
    	
    }
    
    public void singleWord(String Word) {
    	
    	words.add(Word);
    	
    	wordfrequency.add(010);
    	facade.Word_Data();
    	words.clear();
    	wordfrequency.clear();
    }
    
    
	@SuppressWarnings("unchecked")
	public List<String> wordCreator(List<String> obj ) {
		
		
		
		   
   	 List<String> wordlist=new ArrayList<String>();
        wordlist.clear();
  
   	 BreakIterator breakiterator = BreakIterator.getWordInstance();
		for(int i=0;i<obj.size();i++) {
			
		String word=obj.get(i);
		
	    breakiterator.setText(word);
	    int f1 = breakiterator.first();
	    while (BreakIterator.DONE != f1) {
	        int first = f1;
	        f1 = breakiterator.next();
	        if (f1 != BreakIterator.DONE && Character.isLetterOrDigit(word.charAt(first))) {
	            wordlist.add(word.substring(first,f1));
	        }
	    }
		}
		
		
   	 
        return wordlist;
        
        
    }
	public List<String> returnWordList() {
	   	 
	   	 return words;
	    }
	
	public void hashMapFun(List<String> word_List) {
		
		
      HashMap <String,Integer>T3=new HashMap<>(); 
        
        for(String count : word_List) {
        if (T3.containsKey(count)) {
         T3.put(count,T3.get(count)+1);
         
         }
        else{ 
            T3.put (count,1);
         } 
        }
        

        hashMap2(T3);
	}
	
	public void hashMap2(HashMap<String,Integer> T3) {
		
		
		
		for (Map.Entry<String,Integer>entry:T3.entrySet()) 
        {  
        	String word=entry.getKey();
        	int Key=entry.getValue();
        	boolean numeric = true;

            numeric = word.matches("-?\\d+(\\.\\d+)?");
        	if(!numeric) {
       	     words.add(word);
       	     wordfrequency.add(Key);
       	   
        	}
    
        }
		
	}
	
    public List<Integer> returnFrequency() {
   	 
   	 return wordfrequency;
    }
    
   // boolean check;
   
    
    public void deleteWord(boolean t) {
    	if(t=true) {
    		facade.delete();
    	}
    	else {
		

    	}
    	}
    

    
}
