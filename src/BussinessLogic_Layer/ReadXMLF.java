package BussinessLogic_Layer;

import java.io.File;
import java.util.List;

public interface ReadXMLF {
	public List<String> RP();
	public void XML_Single(File S_F);
	public List<String> RT();
	public List<String> RA();
	public void XML_Folder(File[] file_Folder);
}
