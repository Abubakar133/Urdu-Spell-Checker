package BussinessLogic_Layer;
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import Database_Layer.DatabasePG;
import Database_Layer.Facade;
import Database_Layer.IFacade;
import Presentation_Layer.UploadWord;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class ReadXml implements ReadXMLF {
	public ReadXml(){
		
		
		
		
		
		
	}
	
	
	static Facade facade;
	public List<String> returnParagraph() {
	     return xmlparagraphlist;
	 
   }
	
    
    
     
public void singleXml(File xmlfile) {
	facade = new IFacade();
		try {
			  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			  
			DocumentBuilder builder = dbf.newDocumentBuilder();  
			Document xmfile = builder.parse(xmlfile);  
			xmfile.getDocumentElement().normalize();  
			NodeList List = xmfile.getElementsByTagName("document");  
				Node node = List.item(0);  
			
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element data = (Element) node;  
			String title;
			String authors;
			String paragraph;
			
			title=data.getElementsByTagName("title").item(0).getTextContent();
			authors=data.getElementsByTagName("author").item(0).getTextContent();
			paragraph=data.getElementsByTagName("section").item(0).getTextContent(); 
			authors = authors.replaceAll("\\s+"," ").trim();
			title = title.replaceAll("\\s+"," ").trim();
			paragraph = paragraph.replaceAll("\\s+"," ").trim();
			xmlauthorlist.add(authors);
			xmltitlelist.add(title);
			xmlparagraphlist.add(paragraph);
			
			} 
			
			facade.PG_Data();
				}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Sorry FIle is Currupted");
			}
		
	}
public List<String> returnTitle() {
  	 return xmltitlelist;
   }
   public List<String> returnAuthor() {
  	 
  	 return xmlauthorlist;
   }
  static int i=1;
	public void folderXml(File[] files_Folder)   
	{  
		
		facade = new IFacade();
		System.out.println(files_Folder.length);
	    
		for(File S_F:files_Folder) {
			
		if (S_F.isFile()) {
			
			
			
	try {
	  
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
		  
		DocumentBuilder builder = dbf.newDocumentBuilder();  
		Document xmlfile = builder.parse(S_F);  
		xmlfile.getDocumentElement().normalize();  
		NodeList List = xmlfile.getElementsByTagName("document");  
			Node node = List.item(0); 
	
			if (node.getNodeType() == Node.ELEMENT_NODE)   
	{  
		Element data = (Element)node;  
		String xmltitle;
		String xmlauthor;
		String xmlparagraph;
		
		xmltitle=data.getElementsByTagName("title").item(0).getTextContent();
		xmlauthor=data.getElementsByTagName("author").item(0).getTextContent();
		xmlparagraph=data.getElementsByTagName("section").item(0).getTextContent(); 
		xmlauthor = xmlauthor.replaceAll("\\s+"," ").trim();
		xmltitle = xmltitle.replaceAll("\\s+"," ").trim();
		xmlparagraph = xmlparagraph.replaceAll("\\s+"," ").trim();
		xmlauthorlist.add(xmlauthor);
		xmltitlelist.add(xmltitle);
		xmlparagraphlist.add(xmlparagraph);
	} 
		}
	catch(Exception e) {
		
	}
		}
		
		}
		facade.PG_Data();
	
}
	public static List<String> xmltitlelist=new ArrayList<String>();
	static List<String> xmlauthorlist=new ArrayList<String>();
	static List<String> xmlparagraphlist=new ArrayList<String>();
	

   
	
	

   
}