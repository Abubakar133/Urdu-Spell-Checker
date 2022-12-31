package BussinessLogic_Layer;

import java.util.List;

public interface Make_WordF {
	public void controller();
	public void singleWord(String Word);
	public List<String> wordCreator(List<String> obj );
	public List<String> returnWordList();
	public void hashMapFun(List<String> word_List);
	public List<Integer> returnFrequency();
	public void deleteWord(boolean t);
}
