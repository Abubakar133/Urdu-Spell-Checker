package Database_Layer;

import java.util.List;

public interface DatabaseWordF {

	public void Word_Data();
	public List<String> test();
	public boolean checkConnectionWord();
	public void delete(int id);
	public void update(String word, int id, int fre);
	public void delete();
}
