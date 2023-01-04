package Database_Layer;

import java.util.List;

public class IFacadeDatabase implements FacadeDatabase {

	
	ReadWordsF readword;
	DatabaseParagraphF sendsection;
	DatabaseWordF sendword;
	DatabaseRetriveParagraphF readsection;
	public IFacadeDatabase() {
		readword = new ReadWords();
		sendsection= new DatabaseParagraph();
		sendword= new DatabaseWord();
		readsection= new DatabaseRetriveParagraph(); 
	}
	@Override
	public List<?> returnWord() {
		// TODO Auto-generated method stub
		return readword.returnWord();
	}
	@Override
	public void sentParagraphData() {
		// TODO Auto-generated method stub
		  sendsection.sentParagraphData();
	}

	
	
	
	@Override
	public List<String> test() {
		// TODO Auto-generated method stub
		return sendsection.test();
	}

	

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sendword.delete(id);
	}

	@Override
	public void update(String word, int id, int fre) {
		// TODO Auto-generated method stub
		sendword.update(word, id, fre);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		sendword.delete();
	}

	@Override
	public void Word_Data() {
		// TODO Auto-generated method stub
		sendword.Word_Data();
	}

	@Override
	public List<String> getParagraphs() {
		// TODO Auto-generated method stub
		return readsection.getParagraphs();
	}

	@Override
	public void getWords() {
		// TODO Auto-generated method stub
		readword.getWords();
	}
	@Override
	public boolean checkConnectionWord() {
		// TODO Auto-generated method stub
		return sendword.checkConnectionWord();
	}
	@Override
	public boolean checkConnectionParagraph() {
		// TODO Auto-generated method stub
		return sendsection.checkConnectionParagraph();
	}
	@Override
	public boolean checkConnectionRetrive() {
		// TODO Auto-generated method stub
		return readsection.checkConnectionRetrive();
	}

}
