package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ReadWords implements ReadWordsF {
	static List<String> wordsdetails = new ArrayList<String>();
	Connection connection;
	DataBaseConnection dbconnection = DataBaseConnection.getInstance();
	
	
	public void getWords() {
		wordsdetails.clear();
		try {
			
			connection = dbconnection.Connec();
			if (!connection.isClosed()) {
				PreparedStatement ps = connection.prepareStatement("SELECT * from word ORDER by frequency");

				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					int id = (int) rs.getObject("word_id");
					int frequency = (int) rs.getObject("frequency");
					wordsdetails.add(Integer.toString(id));
					wordsdetails.add((String) rs.getObject("words"));
					wordsdetails.add(Integer.toString(frequency));

				}

				

			} else
				JOptionPane.showMessageDialog(null, "Connection Not Found");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Driver Error Found");
		}

		
	}

	public List returnWord() {

		return wordsdetails;
	}
}
