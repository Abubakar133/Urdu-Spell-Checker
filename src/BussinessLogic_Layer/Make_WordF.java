package BussinessLogic_Layer;

import java.util.List;

public interface Make_WordF {
	public void controller();
	public void Word_Single(String Word);
	public List<String> Word_Creator(List<String> obj );
	public List<String> Word_List();
	public void HashMap_Fun(List<String> word_List);
	public List<Integer> Word_Fre();
	public void delete(boolean t);
}
