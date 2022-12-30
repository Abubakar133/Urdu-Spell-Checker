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

public class ReadXML implements ReadXMLF {
	public ReadXML(){
		
		
		
		
		
		
	}
	
	//static DatabasePG obj=new DatabasePG();
	 
	static Facade Fs;
	public List<String> RP() {
	     return XMLpg;
	 
   }
	
    
    
     
public void XML_Single(File S_F) {
	Fs = new IFacade();
		try {
			  
			DocumentBuilderFactory DF = DocumentBuilderFactory.newInstance();  
			  
			DocumentBuilder X = DF.newDocumentBuilder();  
			Document Fil = X.parse(S_F);  
			Fil.getDocumentElement().normalize();  
			NodeList List = Fil.getElementsByTagName("document");  
				Node St = List.item(0);  
			
			if (St.getNodeType() == Node.ELEMENT_NODE)   
			{  
			Element data = (Element) St;  
			String T_Str;
			String A_Str;
			String P_Str;
			
			T_Str=data.getElementsByTagName("title").item(0).getTextContent();
			A_Str=data.getElementsByTagName("author").item(0).getTextContent();
			P_Str=data.getElementsByTagName("section").item(0).getTextContent(); 
			A_Str = A_Str.replaceAll("\\s+"," ").trim();
			T_Str = T_Str.replaceAll("\\s+"," ").trim();
			P_Str = P_Str.replaceAll("\\s+"," ").trim();
			XMLauthor.add(A_Str);
			XMLtitle.add(T_Str);
			XMLpg.add(P_Str);
			
			} 
			
			Fs.PG_Data();
				}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Sorry FIle is Currupted");
			}
		
	}
public List<String> RT() {
  	 return XMLtitle;
   }
   public List<String> RA() {
  	 
  	 return XMLauthor;
   }
  static int i=1;
	public void XML_Folder(File[] file_Folder)   
	{  
		
		Fs = new IFacade();
		System.out.println(file_Folder.length);
	    
		for(File S_F:file_Folder) {
			
		if (S_F.isFile()) {
			int formula=((i*100)/file_Folder.length);
			try {
				Thread.sleep(10);
				i++;
				
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
	try {
	  
		DocumentBuilderFactory DF = DocumentBuilderFactory.newInstance();  
		  
		DocumentBuilder X = DF.newDocumentBuilder();  
		Document Fil = X.parse(S_F);  
		Fil.getDocumentElement().normalize();  
		NodeList List = Fil.getElementsByTagName("document");  
			Node St = List.item(0); 
	
			if (St.getNodeType() == Node.ELEMENT_NODE)   
	{  
		Element data = (Element)St;  
		String T_Str;
		String A_Str;
		String P_Str;
		
		T_Str=data.getElementsByTagName("title").item(0).getTextContent();
		A_Str=data.getElementsByTagName("author").item(0).getTextContent();
		P_Str=data.getElementsByTagName("section").item(0).getTextContent(); 
		A_Str = A_Str.replaceAll("\\s+"," ").trim();
		T_Str = T_Str.replaceAll("\\s+"," ").trim();
		P_Str = P_Str.replaceAll("\\s+"," ").trim();
		XMLauthor.add(A_Str);
		XMLtitle.add(T_Str);
		XMLpg.add(P_Str);
	} 
		}
	catch(Exception e) {
		
	}
		}
		
		}
		Fs.PG_Data();
	
}
	public static List<String> XMLtitle=new ArrayList<String>();
	static List<String> XMLauthor=new ArrayList<String>();
	static List<String> XMLpg=new ArrayList<String>();
	

   
	
	

   
}