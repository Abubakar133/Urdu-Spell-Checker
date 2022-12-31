package BussinessLogic_Layer;

import java.io.File;
import java.util.List;

public class FacadeBussiness implements IFacadeBussiness {

	ViewUpdateWords view;
	ReadXmlFiles read;
	MakeWords word;
	
	public FacadeBussiness(){
		
		view =new ViewUpdateWords();
		read=new ReadXmlFiles();
		word=new MakeWords();
		
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

}
