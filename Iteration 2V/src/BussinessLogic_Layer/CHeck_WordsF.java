package BussinessLogic_Layer;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

public interface CHeck_WordsF {
	public void String_Breaker(String textArea);
	public void String_Breaker2(String textArea,String Word,String newWord);
	public void setTextArea(JTextArea textArea_1);
	public void Hilight(JTextArea textArea_1,int h);
	public void Hilight2(JTextArea textArea_1,JComboBox box);
	public String Word(String Word);
	public boolean check_List() ;
	public boolean TestErrorHI1();
	public boolean TestErrorHI2();
	
}
