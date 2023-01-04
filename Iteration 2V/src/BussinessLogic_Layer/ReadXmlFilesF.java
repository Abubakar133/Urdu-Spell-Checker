package BussinessLogic_Layer;

import java.io.File;
import java.util.List;

public interface ReadXmlFilesF {
	public List<String> returnParagraph();
	public void singleXml(File S_F);
	public List<String> returnTitle();
	public List<String> returnAuthor();
	public void folderXml(File[] file_Folder);
}
