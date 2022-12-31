package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import BussinessLogic_Layer.Make_Word;

public class DatabaseWord implements DatabaseWordF {
	Connection con;
	public DatabaseWord() {

	}

	static boolean t = false;
	static List<String> word_DB2 = new ArrayList<String>();
	DataBaseConnection obj1 = DataBaseConnection.getInstance();
	public void Word_Data() {
		Make_Word obj = new Make_Word();
		List<String> word_DB = word_DB = obj.returnWordList();
		List<Integer> word_Fre = word_Fre = obj.returnFrequency();
		word_DB2 = word_DB;

		try {
			
			
			con = obj1.Connec();
			for (int i = 0; i < word_DB.size(); i++) {
				String St=word_DB.get(i);
				int Fre = (int) word_Fre.get(i);
				
				if(St.length()>10&&Fre==1) {
				
				}
				else {
				PreparedStatement st = con
						.prepareStatement("insert into word values(" + null + ",'" + word_DB.get(i) + "'," + Fre + ")");
				st.execute();
				}

			}
			JOptionPane.showMessageDialog(null, "Word Sent Successfully in Database");
			t = true;
			// con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Connection Not Found");
		}

	}

	public List<String> Test() {

		return word_DB2;
	}

	public boolean CheckConnection() {

		Word_Data();
		if (t == true) {
			return true;
		} else {
			return false;
		}

	}

	public void delete(int id) {

		try {
			
			
			con = obj1.Connec();

			String query = "DELETE FROM word WHERE word_id = '" + id + "'";
			PreparedStatement st1 = con.prepareStatement(query);
			st1.execute();

			JOptionPane.showMessageDialog(null, "Word Delete Successfully in Database");

			// con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Connection Not Found");
		}
	}

	public void update(String word, int id, int fre) {
		try {
			
			
			con = obj1.Connec();

			String query = "UPDATE word SET word_id = " + id + ", words = '" + word + "', frequency = " + fre
					+ " WHERE word_id like '" + id + "'";

			PreparedStatement st1 = con.prepareStatement(query);
			st1.execute();

			JOptionPane.showMessageDialog(null, "Word update Successfully in Database");

			// con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Connection Not Found");
		}
	}

	public void delete() {

		try {
			
			
			con = obj1.Connec();

			PreparedStatement st1 = con.prepareStatement("TRUNCATE TABLE word");
			st1.execute();

			JOptionPane.showMessageDialog(null, "Word Delete Successfully in Database");

			// con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Connection Not Found");
		}
	}
}
