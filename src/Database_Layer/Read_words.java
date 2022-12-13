package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Read_words implements Read_wordsF {
	static List<String> A_Str = new ArrayList<String>();
	Connection con;
	DataBaseConnection obj = DataBaseConnection.getInstance();
	public void WordST() {
		A_Str.clear();
		try {
			
			con = obj.Connec();
			if (!con.isClosed()) {
				PreparedStatement ps = con.prepareStatement("SELECT * from word ORDER by frequency");

				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					int id = (int) rs.getObject("word_id");
					int fre = (int) rs.getObject("frequency");
					A_Str.add(Integer.toString(id));
					A_Str.add((String) rs.getObject("words"));
					A_Str.add(Integer.toString(fre));

				}

				

			} else
				JOptionPane.showMessageDialog(null, "Connection Not Found");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Driver Error Found");
		}

		System.out.println(A_Str.size());
	}

	public List returnword() {

		return A_Str;
	}
}
