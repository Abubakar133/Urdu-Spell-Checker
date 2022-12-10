package Database_Layer;

import java.util.List;

public interface DatabaseWordF {

	public void Word_Data();
	public List<String> Test();
	public boolean CheckConnection();
	public void delete(int id);
	public void update(String word, int id, int fre);
	public void delete();
}
