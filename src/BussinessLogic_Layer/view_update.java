package BussinessLogic_Layer;

import java.util.List;

import Database_Layer.DatabaseWord;
import Database_Layer.Facade;
import Database_Layer.IFacade;
import Database_Layer.Read_words;

public class view_update implements view_updateF {
	
	private Facade facade;
	
	public List getWords() {
		facade = new IFacade();
		facade.WordST();

		return facade.returnword();

	}

	public void updateWord(String word, int id, int fre) {
		facade = new IFacade();
		facade.update(word, id, fre);

	}

	public void delete(int id) {
		facade = new IFacade();
		facade.delete(id);
	}
}
