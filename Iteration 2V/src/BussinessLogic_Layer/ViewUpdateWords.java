package BussinessLogic_Layer;

import java.util.List;

import Database_Layer.DatabaseWord;
import Database_Layer.FacadeDatabase;
import Database_Layer.IFacadeDatabase;
import Database_Layer.ReadWords;

public class ViewUpdateWords implements ViewUpdateWordsF {
	
	private FacadeDatabase facade;
	
	public List getWords() {
		facade = new IFacadeDatabase();
		facade.getWords();

		return facade.returnWord();

	}

	public void updateWord(String word, int id, int fre) {
		facade = new IFacadeDatabase();
		facade.update(word, id, fre);

	}

	public void delete(int id) {
		facade = new IFacadeDatabase();
		facade.delete(id);
	}
}
