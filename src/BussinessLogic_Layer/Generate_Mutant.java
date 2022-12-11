package BussinessLogic_Layer;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import TransferData.Data_Getter;
import TransferData.Data_Setter;

public class Generate_Mutant {
	

	
	
	
	
	
	Data_Getter obj2=new Data_Getter();
	ArrayList<String> word1 = new ArrayList<String>();
	static ArrayList<String> newList = new ArrayList<String>();
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
		Alif.add("ا");  CH.add("ع");        //1
		Alif.add("ع");  CH.add("ا");         //2  
		
		Alif.add("ت");  CH.add("ط");//2         //3 
		Alif.add("ت");  CH.add("تھ");//2         //4 //4  
		
		Alif.add("ط");  CH.add("ت");         //5
		Alif.add("ح");  CH.add("�?");          //6  
		Alif.add("�?");  CH.add("ح");         //7 
		
		Alif.add("ڈ");  CH.add("ڑ"); //2         //8  
		Alif.add("ڈ");  CH.add("ڈھ");//2         //9 //9  
		
		Alif.add("ڑ");  CH.add("ڈ"); //2         //10  
		Alif.add("ڑ");  CH.add("ڑھ");//2         //11 
		
		Alif.add("س");  CH.add("ص");          //12
		Alif.add("ص");  CH.add("س");          //13 
		Alif.add("غ");  CH.add("گ");          //14
		
		Alif.add("گ");  CH.add("غ"); //2         //15  
		Alif.add("گ");  CH.add("گھ");//2         //16 
		
		Alif.add("ک");  CH.add("ق"); //2         //17 
		Alif.add("ک");  CH.add("کھ");//2         //18 
         
		Alif.add("ق");  CH.add("ک");         //19 
		
		Alif.add("ز");  CH.add("ذ"); //3         //20  
		Alif.add("ز");  CH.add("ض");         //21  
		Alif.add("ز");   CH.add("ظ");          //22  
	
		
		Alif.add("ذ");  CH.add("ز");//3         //23  
		Alif.add("ذ");   CH.add("ض");         //24  
		Alif.add("ذ");  CH.add("ظ");         //25  
		
		Alif.add("ظ");  CH.add("ض"); //3         //26  
		Alif.add("ظ");  CH.add("ز");         //2  
		Alif.add("ظ");   CH.add("ذ");          //2  
		
		Alif.add("ض");  CH.add("ظ"); //3         //29  
		Alif.add("ض");   CH.add("ز");         //2  
		Alif.add("ض");   CH.add("ذ");          //2  
		
         Alif.add("ب"); CH.add("بھ");         //32
		
		Alif.add("پ");  CH.add("پھ");         //33  
       
		
		Alif.add("ٹ");  CH.add("ٹھ");         //34
		Alif.add("ج");  CH.add("جھ");         //35
		Alif.add("چ");  CH.add("چھ");         //36
		Alif.add("د");  CH.add("دھ");         //37
		Alif.add("ر");  CH.add("رھ");         //38
		Alif.add("ل");  CH.add("لھ");         //39
		Alif.add("م");  CH.add("مھ");         //40
		Alif.add("ن");  CH.add("نھ");         //41
		Alif.add("و");  CH.add("وھ");         //42
		Alif.add("ی");  CH.add("یھ");         //43		
		
		for(int i=0;i<30;i++) {
		String word=words.get(i);
		int K=Key.get(i);
		ArrayList<String> wor = new ArrayList<String>();
		
		////////////////////////////////
		////////////////////////////////////////
		////////////////////////////////////
		//////////////////////////////
		
		String[] str = word.split("(?!^)");
		int count=0;
		for(String s: str) {
		      count ++;
		    }
		for(int j=0;j<count;j++) {
			wor.add(str[j]);
			
		}
		
		
		
		ArrayList<Integer> exists = new ArrayList<Integer>();
		ArrayList<Integer> dont = new ArrayList<Integer>();
		
				

		
		//////////////////////////////////////
		
		///////////////Code in run Able form////////////////
		
		////////////////////////////////////////
		
		int fre=0;
		for(int j=0;j<wor.size();j++) {
			int f;
			f=Collections.frequency(Alif, wor.get(j));
			
			if(f>fre) {
				
				fre=f;
			}
			
			
		}
				
		
		for(int j=0;j<fre;j++) {
			
			exists.clear();
			dont.clear();
			
			int length = wor.size();
			int n = 0;
			for (int i1=0; i1<length; i1++)
			{
			    if (Alif.contains(wor.get(i1)))
			    {
			    	int ind= (Alif.indexOf(wor.get(i1)));
			    	
			    	if(ind!=22&&ind!=25&&ind!=28&&ind!=31&&ind!=2&&ind!=7&&ind!=9&&ind!=14&&ind!=16) {
			        exists.add(Alif.indexOf(wor.get(i1)));
			        
			        
			       
			    	}
			    	else if(ind==22||ind==25||ind==28||ind==31||ind==2||ind==7||ind==9||ind==14||ind==16) {
			    		exists.add(Alif.indexOf(wor.get(i1))+j);
			    		
			    	}
			       
			        		
			        n = n+1;
			    }
			    else
			    {
			        
			    }
			}
			for (int i1=0; i1<wor.size(); i1++)
			{
			    if (!Alif.contains(wor.get(i1)))
			    {
			    	dont.add(i1);
			    }
			    else
			    {
			        
			    }
			}
			
			
			
			int maxNumber = 1 << n;
			for (int i1 = 1; i1 < maxNumber; i1++) {
			   
			    ArrayList<String> res = new ArrayList<String>();
			    String binary = Integer.toBinaryString(i1);
			    while (binary.length() != n) {
			        binary = "0" + binary;
			    }
			    for (int j1=0; j1<n; j1++)
			    {
			        char bit = binary.charAt(j1);
			        if (bit == '0')
			        {
			            res.add(Alif.get(exists.get(j1)));
			        }
			        
			        else
			        {
			            res.add(CH.get(exists.get(j1)));  
			        }
			       
			    }
			    int LenRes = dont.size();
			    for (int j1=0;j1<LenRes;j1++)
			    {
			        res.add(dont.get(j1), wor.get(dont.get(j1)));
			    }
			    
			    
			    StringBuilder N = new StringBuilder(res.size());
			    for(String ch: res)
			    {
			        N.append(ch);
			    }
			    if(N.isEmpty()) {
			    	
			    }
			    else {
			    	String St=N.toString();
			    	if((St!=word)) {
			    	if(!NewWord.contains(St.toString())) {
			    	NewWord.add(St);
			          NewKey.add(K);
				     System.out.println(St);
				
			    	}
			    	}
			    	N.setLength(0);
			    }
			}
			
		}
		
		
		
		
		
		
//////////////////////////////////////////////////
		
		
	}
	
              
		JOptionPane.showMessageDialog(null,"Mutants Completely Generated ");    
	}
	
	//public void 
	public ArrayList<String> NewWord(){
		
		return NewWord;
	}
    public ArrayList<Integer> NewKey(){
		
		return NewKey;
	}
}
