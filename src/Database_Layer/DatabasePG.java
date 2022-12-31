package Database_Layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import BussinessLogic_Layer.ReadXml;

public class DatabasePG implements DatabasePGF {

	public DatabasePG() {

	}

	static boolean t = false;
	static List<String> A_Str2 = new ArrayList<String>();
	Connection con;
	DataBaseConnection obj1 = DataBaseConnection.getInstance();
	public void PG_Data() {
		ReadXml obj = new ReadXml();
		List<String> A_Str = obj.returnAuthor();
		List<String> T_Str = obj.returnTitle();
		List<String> P_Str = obj.returnParagraph();
		A_Str2 = A_Str;

		try {
			
			con = obj1.Connec();

			for (int j = 0; j < P_Str.size(); j++) {
				try {

					PreparedStatement st = con.prepareStatement("insert into paragraph values(" + null + ",'"
							+ T_Str.get(j) + "','" + A_Str.get(j) + "','" + P_Str.get(j) + "')");
					st.execute();

				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Currepted File Found");
				}
			}
			t = true;
			
			JOptionPane.showMessageDialog(null, "File inserted Succesfully in Paragraph Table");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "FIle Connection Error Found");
		}

	}

	public List<String> Test() {
		return A_Str2;

	}

	public boolean CheckConnection() {

		PG_Data();
		if (t == true) {
			return true;
		} else {
			return false;
		}

	}

}
