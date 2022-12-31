package BussinessLogic_Layer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class FacadeBussiness implements IFacadeBussiness {

	ViewUpdateWords view;
	ReadXmlFiles read;
	MakeWords word;
	CHeck_Words checkword;
	Generate_Mutant mutants;
	
	public FacadeBussiness(){
		
		view =new ViewUpdateWords();
		read=new ReadXmlFiles();
		word=new MakeWords();
		checkword =new CHeck_Words();
		mutants =new Generate_Mutant();
		
	}
	
	@Override
	public List getWords() {
		// TODO Auto-generated method stub
		return view.getWords();
	}

	@Override
	public void updateWord(String word, int id, int fre) {
		// TODO Auto-generated method stub
		view.updateWord(word, id, fre);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		view.delete(id);
	}

	@Override
	public List<String> returnParagraph() {
		// TODO Auto-generated method stub
		return read.returnParagraph();
	}

	@Override
	public void singleXml(File S_F) {
		// TODO Auto-generated method stub
		read.singleXml(S_F);
	}

	@Override
	public List<String> returnTitle() {
		// TODO Auto-generated method stub
		return read.returnTitle();
	}

	@Override
	public List<String> returnAuthor() {
		// TODO Auto-generated method stub
		return read.returnAuthor();
	}

	@Override
	public void folderXml(File[] file_Folder) {
		// TODO Auto-generated method stub
		read.folderXml(file_Folder);
	}

	@Override
	public void controller() {
		// TODO Auto-generated method stub
		word.controller();
	}

	@Override
	public void singleWord(String Word) {
		// TODO Auto-generated method stub
		word.singleWord(Word);
	}

	@Override
	public List<String> wordCreator(List<String> obj) {
		// TODO Auto-generated method stub
		return word.wordCreator(obj);
	}

	@Override
	public List<String> returnWordList() {
		// TODO Auto-generated method stub
		return word.returnWordList();
	}

	@Override
	public void hashMapFun(List<String> word_List) {
		// TODO Auto-generated method stub
		word.hashMapFun(word_List);
	}

	@Override
	public List<Integer> returnFrequency() {
		// TODO Auto-generated method stub
		return word.returnFrequency();
	}

	@Override
	public void deleteWord(boolean t) {
		// TODO Auto-generated method stub
		word.deleteWord(t);
	}

	@Override
	public void String_Breaker(String textArea) {
		// TODO Auto-generated method stub
		checkword.String_Breaker(textArea);
	}

	@Override
	public void String_Breaker2(String textArea, String Word, String newWord) {
		// TODO Auto-generated method stub
		checkword.String_Breaker2(textArea, Word, newWord);
	}

	@Override
	public void setTextArea(JTextArea textArea_1) {
		// TODO Auto-generated method stub
		checkword.setTextArea(textArea_1);
	}

	@Override
	public void Hilight(JTextArea textArea_1, int h) {
		// TODO Auto-generated method stub
		checkword.Hilight(textArea_1, h);
	}

	@Override
	public void Hilight2(JTextArea textArea_1, JComboBox box) {
		// TODO Auto-generated method stub
		checkword.Hilight2(textArea_1, box);
	}

	@Override
	public String Word(String Word) {
		// TODO Auto-generated method stub
		return checkword.Word(Word);
	}

	@Override
	public boolean check_List() {
		// TODO Auto-generated method stub
		return checkword.check_List();
	}

	@Override
	public boolean TestErrorHI1() {
		// TODO Auto-generated method stub
		return checkword.TestErrorHI1();
	}

	@Override
	public boolean TestErrorHI2() {
		// TODO Auto-generated method stub
		return checkword.TestErrorHI2();
	}

	@Override
	public void Get_Words() {
		// TODO Auto-generated method stub
		mutants.Get_Words();
		
	}

	@Override
	public void Insert_DB() {
		// TODO Auto-generated method stub
		mutants.Insert_DB();
		
	}

	@Override
	public void Mutant(ArrayList<String> words, ArrayList<Integer> Key) {
		// TODO Auto-generated method stub
		mutants.Mutant(words, Key);
	}

	@Override
	public ArrayList<String> NewWord() {
		// TODO Auto-generated method stub
		return mutants.NewWord();
	}

	@Override
	public ArrayList<Integer> NewKey() {
		// TODO Auto-generated method stub
		return mutants.NewKey();
	}

	@Override
	public boolean checkduplication(ArrayList Arr, String ar2) {
		// TODO Auto-generated method stub
		return mutants.checkduplication(Arr, ar2);
	}

}
