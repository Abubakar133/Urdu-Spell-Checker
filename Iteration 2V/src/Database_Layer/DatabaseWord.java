package Database_Layer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import BussinessLogic_Layer.MakeWords;

public class DatabaseWord implements DatabaseWordF {
	Connection connection;
	public DatabaseWord() {

	}

	static boolean test = false;
	static List<String> wordtest = new ArrayList<String>();
	DataBaseConnection dbconnection = DataBaseConnection.getInstance();
	public void Word_Data() {
		MakeWords makewordobj = new MakeWords();
		List<String> wordslist = wordslist = makewordobj.returnWordList();
		List<Integer> wordsfre = wordsfre = makewordobj.returnFrequency();
		wordtest = wordslist;

		try {
			
			
			connection = dbconnection.Connec();
			for (int i = 0; i < wordslist.size(); i++) {
				String wrongword=wordslist.get(i);
				int frequency = (int) wordsfre.get(i);
				
				if(wrongword.length()>10&&frequency==1) {
				
				}
				else {
				PreparedStatement preparedst = connection
						.prepareStatement("insert into word values(" + null + ",'" + wordslist.get(i) + "'," + frequency + ")");
				preparedst.execute();
				}

			}
			//JOptionPane.showMessageDialog(null, "Word Sent Successfully in Database");
			test = true;
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Connection Not Found");
		}

	}

	public List<String> test() {

		return wordtest;
	}

	public boolean checkConnectionWord() {

		Word_Data();
		if (test == true) {
			return true;
		} else {
			return false;
		}

	}

	public void delete(int id) {

		try {
			
			
			connection = dbconnection.Connec();

			String query = "DELETE FROM word WHERE word_id = '" + id + "'";
			PreparedStatement preparedst = connection.prepareStatement(query);
			preparedst.execute();

			//JOptionPane.showMessageDialog(null, "Word Delete Successfully in Database");

			// con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Connection Not Found");
		}
	}

	public void update(String word, int id, int fre) {
		try {
			
			
			connection = dbconnection.Connec();

			String query = "UPDATE word SET word_id = " + id + ", words = '" + word + "', frequency = " + fre
					+ " WHERE word_id like '" + id + "'";

			PreparedStatement preparedst = connection.prepareStatement(query);
			preparedst.execute();

			//JOptionPane.showMessageDialog(null, "Word update Successfully in Database");

			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Connection Not Found");
		}
	}

	public void delete() {

		try {
			
			
			connection = dbconnection.Connec();

			PreparedStatement preparedst = connection.prepareStatement("TRUNCATE TABLE word");
			preparedst.execute();

			//JOptionPane.showMessageDialog(null, "Word Delete Successfully in Database");

			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Connection Not Found");
		}
	}
}
