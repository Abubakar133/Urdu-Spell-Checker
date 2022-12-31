package BussinessLogic_Layer;

import java.util.List;

public interface view_updateF {
	public List getWords();
	public void updateWord(String word, int id, int fre);
	public void delete(int id);
}
