package BussinessLogic_Layer;

import java.util.List;

import Database_Layer.DatabaseWord;
import Database_Layer.Read_words;

public class view_update {
	Read_words obj = new Read_words();
	DatabaseWord obj2 = new DatabaseWord();

	public List getWords() {
		obj.Word();

		return obj.returnword();

	}

	public void update(String word, int id, int fre) {

		obj2.update(word, id, fre);

	}

	public void delete(int id) {

		obj2.delete(id);
	}
}
