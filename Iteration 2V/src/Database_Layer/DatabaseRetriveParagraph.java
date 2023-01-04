package Database_Layer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DatabaseRetriveParagraph implements DatabaseRetriveParagraphF {
	public DatabaseRetriveParagraph() {

	}
	Connection connection;
	static boolean t = false;
	static DataBaseConnection dbconnection=DataBaseConnection.getInstance();
	
	public List<String> getParagraphs() {
		List<String> section = new ArrayList<String>();
		try {
			
			
                connection= dbconnection.Connec();

			if (!connection.isClosed()) {
				PreparedStatement preparedst = connection.prepareStatement("SELECT * from Paragraph");

				ResultSet rs = preparedst.executeQuery();

				while (rs.next()) {

					section.add((String) rs.getObject("Context"));

				}
				t = true;
				
				
			} else
				JOptionPane.showMessageDialog(null, "Connection Not Found");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Driver Error Found");
		}

		return section;
	}

	public boolean checkConnectionRetrive() {

		getParagraphs();
		if (t == true) {
			return true;
		} else {
			return false;
		}

	}

}
