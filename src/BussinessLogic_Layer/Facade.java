package BussinessLogic_Layer;

import java.io.File;
import java.util.List;

public class Facade implements IFacade {

	view_update view;
	ReadXML read;
	Make_Word word;
	
	public Facade(){
		
		view =new view_update();
		read=new ReadXML();
		word=new Make_Word();
		
	}
	
	@Override
	public List getWords() {
		// TODO Auto-generated method stub
		return view.getWords();
	}

	@Override
	public void update(String word, int id, int fre) {
		// TODO Auto-generated method stub
		view.update(word, id, fre);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		view.delete(id);
	}

	@Override
	public List<String> RP() {
		// TODO Auto-generated method stub
		return read.RP();
	}

	@Override
	public void XML_Single(File S_F) {
		// TODO Auto-generated method stub
		read.XML_Single(S_F);
	}

	@Override
	public List<String> RT() {
		// TODO Auto-generated method stub
		return read.RT();
	}

	@Override
	public List<String> RA() {
		// TODO Auto-generated method stub
		return read.RA();
	}

	@Override
	public void XML_Folder(File[] file_Folder) {
		// TODO Auto-generated method stub
		read.XML_Folder(file_Folder);
	}

	@Override
	public void controller() {
		// TODO Auto-generated method stub
		word.controller();
	}

	@Override
	public void Word_Single(String Word) {
		// TODO Auto-generated method stub
		word.Word_Single(Word);
	}

	@Override
	public List<String> Word_Creator(List<String> obj) {
		// TODO Auto-generated method stub
		return word.Word_Creator(obj);
	}

	@Override
	public List<String> Word_List() {
		// TODO Auto-generated method stub
		return word.Word_List();
	}

	@Override
	public void HashMap_Fun(List<String> word_List) {
		// TODO Auto-generated method stub
		word.HashMap_Fun(word_List);
	}

	@Override
	public List<Integer> Word_Fre() {
		// TODO Auto-generated method stub
		return word.Word_Fre();
	}

	@Override
	public void delete(boolean t) {
		// TODO Auto-generated method stub
		
	}

}
