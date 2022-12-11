package BussinessLogic_Layer;

import java.util.List;

import Database_Layer.DatabaseWord;
import Database_Layer.Facade;
import Database_Layer.IFacade;
import Database_Layer.Read_words;

public class view_update implements view_updateF {
	
	private Facade Fs;
	
	public List getWords() {
		Fs = new IFacade();
		Fs.WordST();

		return Fs.returnword();

	}

	public void update(String word, int id, int fre) {
		Fs = new IFacade();
		Fs.update(word, id, fre);

	}

	public void delete(int id) {
		Fs = new IFacade();
		Fs.delete(id);
	}
}
