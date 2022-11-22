package bussinesslogicLayer;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import TransferData.Data_Getter;
import TransferData.Data_Setter;

public class Generate_Mutant {
	

	
	
	
	
	
	Data_Getter obj2=new Data_Getter();
	ArrayList<String> word1 = new ArrayList<String>();
	public void Get_Words() {
		word1=obj2.GET_Word();
		Key=obj2.GET_Key();
		Mutant(word1,Key);
		
		
		
	}
	ArrayList<Integer> Key = new ArrayList<Integer>();
	public void Insert_DB() {
		
		Data_Setter obj=new Data_Setter();
		obj.Insert_DB();
		
	}
	static ArrayList<String> NewWord = new ArrayList<String>();
	static ArrayList<Integer> NewKey = new ArrayList<Integer>();
	
	public static void Mutant(ArrayList<String> words,ArrayList<Integer> Key ) {
		System.out.println(words.size());
		ArrayList<String> Alif = new ArrayList<String>();
		ArrayList<String> CH = new ArrayList<String>();
		Alif.add("ا");  CH.add("ع"); 
		Alif.add("ع");  CH.add("ا"); 
		Alif.add("ت");  CH.add("ط");
		Alif.add("ط");  CH.add("ت");
		Alif.add("ح");  CH.add("ہ"); 
		Alif.add("ہ");  CH.add("ح");
		Alif.add("ڈ");  CH.add("ڑ"); 
		Alif.add("ڑ");  CH.add("ڈ"); 
		Alif.add("س");  CH.add("ص"); 
		Alif.add("ص");  CH.add("س"); 
		Alif.add("غ");  CH.add("گ"); 
		Alif.add("گ");  CH.add("غ"); 
		Alif.add("ک");  CH.add("ق"); 
		Alif.add("ق");  CH.add("ک"); 
		Alif.add("ز");  CH.add("ذ"); 
		Alif.add("ذ");  CH.add("ز"); 
		Alif.add("ظ");  CH.add("ض"); 
		Alif.add("ض");  CH.add("ظ"); 
		
		for(int i=0;i<words.size();i++) {
		String word=words.get(i);
		int K=Key.get(i);
		ArrayList<String> wor = new ArrayList<String>();
		
		
		
		String[] str = word.split("(?!^)");
		int count=0;
		for(String s: str) {
		      count ++;
		    }
		for(int j=0;j<count;j++) {
			wor.add(str[j]);
			
		}
		
		for(int k=0;k<Alif.size();k++) {
			ArrayList<String> Nword = new ArrayList<String>();
			for(int c=0;c<wor.size();c++) {
			if(Alif.get(k).equals(wor.get(c))) {
				
				for(int h=0;h<count;h++) {
					if(h==c) {
						Nword.add(CH.get(k));
					}
					else {
					Nword.add(wor.get(h));
					}
				}
			}
		}
			StringBuilder N = new StringBuilder(Nword.size());
		    for(String ch: Nword)
		    {
		        N.append(ch);
		    }
		    if(N.isEmpty()) {
		    	
		    }
		    else {
		    	
		    	NewWord.add(N.toString());
		    	NewKey.add(K);
			
			N.setLength(0);
		    }
		    
			}
		
	}
		JOptionPane.showMessageDialog(null,"Mutants Completely Generated ");    
	}
	
	public ArrayList<String> NewWord(){
		
		return NewWord;
	}
    public ArrayList<Integer> NewKey(){
		
		return NewKey;
	}
}
