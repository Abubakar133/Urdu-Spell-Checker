package BussinessLogic_Layer;

import java.util.ArrayList;

public interface Generate_MutantsF {
	public void Get_Words();
	public void Insert_DB();
	public void Mutant(ArrayList<String> words,ArrayList<Integer> Key );
	public ArrayList<String> NewWord();
	public ArrayList<Integer> NewKey();
	public boolean checkduplication(ArrayList Arr,String ar2);
	
	
}
