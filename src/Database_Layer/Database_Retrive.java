package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Database_Retrive implements Database_RetriveF {
	public Database_Retrive() {

	}

	static boolean t = false;
	static DataBaseConnection obj=DataBaseConnection.getInstance();
	public List<String> Word() {
		List<String> A_Str = new ArrayList<String>();
		try {
			Connection con;
			
                con= obj.Connec();

			if (!con.isClosed()) {
				PreparedStatement ps = con.prepareStatement("SELECT * from Paragraph");

				ResultSet rs = ps.executeQuery();

				while (rs.next()) {

					A_Str.add((String) rs.getObject("Context"));

				}
				t = true;
				con.close();
				JOptionPane.showMessageDialog(null, "FIle Retrived Successfully please wait....");
			} else
				JOptionPane.showMessageDialog(null, "Connection Not Found");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Driver Error Found");
		}

		return A_Str;
	}

	public boolean CheckConnection() {

		Word();
		if (t == true) {
			return true;
		} else {
			return false;
		}

	}

}
