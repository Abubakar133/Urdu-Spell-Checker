package BussinessLayer;

import java.awt.Color;
import java.text.BreakIterator;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import DataAccesLAyer.Text_Read;

public class CHeck_Words {
    public static String TestWord;
	static Text_Read Text=new Text_Read();
	StringBuilder TextFiled = new StringBuilder(); 
	public ArrayList<String> errorlist=Text.ErrorList();
	public ArrayList<String> errorlist2=Text.ErrorList2();
	
	
	public void String_Breaker(String textArea) {
	ArrayList<String> words = new ArrayList<String>();
	BreakIterator breakIter = BreakIterator.getWordInstance();		
    breakIter.setText(textArea);
    int last = breakIter.first();
    while (BreakIterator.DONE != last) {
        int first = last;
        last = breakIter.next();
        if (last != BreakIterator.DONE && Character.isLetterOrDigit(textArea.charAt(first))) {
            words.add(textArea.substring(first, last));
          
        }
    }
	
	TestWord=words.get(0);
	Text.connection_FUN(words);
	Text.connection(words);
	
	
	}
	
	public void String_Breaker2(String textArea,String Word,String newWord) {
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> word2 = new ArrayList<String>();
		BreakIterator breakIter = BreakIterator.getWordInstance();		
	    breakIter.setText(textArea);
	    int last = breakIter.first();
	    while (BreakIterator.DONE != last) {
	        int first = last;
	        last = breakIter.next();
	        if (last != BreakIterator.DONE && Character.isLetterOrDigit(textArea.charAt(first))) {
	            words.add(textArea.substring(first, last));
	          
	        }
	    }
		
	    for(int i=0;i<words.size();i++) {
	    	
	    	if(words.get(i).equals(Word)) {
	    		
	    		word2.add(newWord);
	    		
	    	}
	    	else {
	    		word2.add(words.get(i));
	    		
	    	}
	    	
	    }
	    for(int i=0;i<word2.size();i++) {
			
	    	
	    		TextFiled.append(word2.get(i)) ;
	    		if(i+1!=word2.size()) {
	    		TextFiled.append(" ");
	    		}
	    		
	    	
	    	}
	    
	    	Text.connection_FUN(word2);
	    	Text.connection(word2);
	    	
		
		}
	
	public void setTextArea(JTextArea textArea_1) {
		String Str=TextFiled.toString();
		textArea_1.setText(Str);;
		
		
	}
	public void Hilight(JTextArea textArea_1,int h) {
		
		String Text=textArea_1.getText();
		if(h==2) {
			textArea_1.setText(null);
		}
		textArea_1.setText(Text);
		if(errorlist.isEmpty()) {
			  
		}
		else {
			int E1=errorlist.size();
			int E2=errorlist2.size();
			int size=0;
			if(E1>E2) {
				size=E1;
			}
			else {
				size=E2;
			}
			for (int i=0;i<errorlist2.size();i++){
			    if(errorlist.contains(errorlist2.get(i))){
			    	errorlist.remove(errorlist2.get(i));
			    	
			   }
			   
			}
			
			if(errorlist.isEmpty()) {
				  
			}
			else {
				
			
			for(int i=0;i<errorlist.size();i++) {
				Highlighter highlighter = textArea_1.getHighlighter();
		        HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.pink);          
		        int p0 = textArea_1.getText().indexOf(errorlist.get(i));
		        int p1 = p0 + errorlist.get(i).length();
		        
		        try {
		            
		            highlighter.addHighlight(p0, p1, painter);
		        } catch (BadLocationException e1) {
		        	
		        }
				}
			}
		
		}
		
	}
	
	public void Hilight2(JTextArea textArea_1,JComboBox box) {
		
		if(errorlist2.isEmpty()) {
			  
			
		}
		else {
			
		for(int i=0;i<errorlist2.size();i++) {
		Highlighter highlighter = textArea_1.getHighlighter();
        HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.blue);          
        int p0 = textArea_1.getText().indexOf(errorlist2.get(i));
        int p1 = p0 + errorlist2.get(i).length();
        box.addItem(errorlist2.get(i));
        try {
            
            highlighter.addHighlight(p0, p1, painter);
        } catch (BadLocationException e1) {
        	
        }
		}
		
		
		}
		
	}
	
	public String Word(String Word) {
		
		return Text.connection3(Word);
	}

	public boolean check_List() {
		
		if(errorlist.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
		
		
	}
	
	public boolean TestErrorHI1() {
		
		if(errorlist.isEmpty()) {
			  return false;
		}
		else {
			return true;
		}
	}
      public boolean TestErrorHI2() {
		
		if(errorlist2.isEmpty()) {
			  return false;
		}
		else {
			return true;
		}
	}
}
