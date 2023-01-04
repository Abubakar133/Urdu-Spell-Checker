package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import BussinessLogic_Layer.ReadXmlFiles;

public class DatabaseParagraph implements DatabaseParagraphF {

	public DatabaseParagraph() {

	}

	static boolean test = false;
	static List<String> listtest = new ArrayList<String>();
	Connection connection;
	DataBaseConnection dbconnection = DataBaseConnection.getInstance();
	
	
	
	public void sentParagraphData() {
		ReadXmlFiles readxmlobj = new ReadXmlFiles();
		List<String> authurdetails = readxmlobj.returnAuthor();
		List<String> titledetails = readxmlobj.returnTitle();
		List<String> sectiondetails = readxmlobj.returnParagraph();
		listtest = authurdetails;

		try {
			
			connection = dbconnection.Connec();

			for (int j = 0; j < sectiondetails.size(); j++) {
				try {

					PreparedStatement preparedst = connection.prepareStatement("insert into paragraph values(" + null + ",'"
							+ titledetails.get(j) + "','" + authurdetails.get(j) + "','" + sectiondetails.get(j) + "')");
					preparedst.execute();

				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Currepted File Found");
				}
			}
			test = true;
			
			//JOptionPane.showMessageDialog(null, "File inserted Succesfully in Paragraph Table");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "FIle Connection Error Found");
		}

	}

	public List<String> test() {
		return listtest;

	}

	public boolean checkConnectionParagraph() {

		sentParagraphData();
		if (test == true) {
			return true;
		} else {
			return false;
		}

	}

}
