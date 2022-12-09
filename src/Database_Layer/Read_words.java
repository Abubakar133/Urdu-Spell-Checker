package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Read_words {
	static List<String> A_Str = new ArrayList<String>();

	public static void Word() {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker", "root", "");

			if (!con.isClosed()) {
				PreparedStatement ps = con.prepareStatement("SELECT * from word");

				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					int id = (int) rs.getObject("word_id");
					int fre = (int) rs.getObject("frequency");
					A_Str.add(Integer.toString(id));
					A_Str.add((String) rs.getObject("words"));
					A_Str.add(Integer.toString(fre));

				}

				con.close();
				JOptionPane.showMessageDialog(null, "FIle Retrived Successfully please wait....");
			} else
				JOptionPane.showMessageDialog(null, "Connection Not Found");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Driver Error Found");
		}

	}
}
