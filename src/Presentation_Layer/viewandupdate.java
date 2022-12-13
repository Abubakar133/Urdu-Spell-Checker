package Presentation_Layer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import BussinessLogic_Layer.Facade;
import BussinessLogic_Layer.IFacade;
import javax.swing.ImageIcon;

public class viewandupdate extends JFrame {

	private JPanel contentPane;
	private JTable tableData;
	private DefaultTableModel MD;
	private JTextField textFieldID;
	private JTextField textFieldword;
	private JTextField textField_2;
	JRadioButton Insert;
	JRadioButton update;
	JRadioButton delete;
	JRadioButton search;
	JRadioButton clear;
	
	List words = new ArrayList();
	boolean T = false;
	HomeScreen HS;
	private IFacade FS =new Facade();
	static viewandupdate frame = new viewandupdate();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						try {
							UIManager.setLookAndFeel(info.getClassName());
						} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
								| UnsupportedLookAndFeelException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
				}
				try {
					frame = new viewandupdate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public viewandupdate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 621);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane js = new JScrollPane();
		js.setVisible(true);
		getContentPane().add(js);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		scrollPane.setBounds(26, 35, 551, 478);
		contentPane.add(scrollPane);

		tableData = new JTable();
		tableData.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane.setViewportView(tableData);

		tableData
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, },
						new String[] { "Count", "id", "word", "Frequency" }));

		String[] colNames = { "Count", "id", "Word", "Frequency" };
		MD = new DefaultTableModel(colNames, 0);

		JButton btnNewButton = new JButton("View Table");
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel) tableData.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
                 words.clear();
				words = FS.getWords();
				int c = 1;
				for (int i = 0; i < words.size(); i = i + 3) {

					Object[] B_Dat = new Object[4];
					B_Dat[0] = c++;
					B_Dat[1] = words.get(i);
					B_Dat[2] = words.get(i + 1);
					B_Dat[3] = words.get(i + 2);

					MD.addRow(B_Dat);
				}
				tableData.setModel(MD);
				
				

			}

		});
		btnNewButton.setBounds(206, 533, 178, 41);
		contentPane.add(btnNewButton);

		textFieldID = new JTextField();
		textFieldID.setBackground(new Color(255, 255, 255));
		textFieldID.setEditable(false);
		textFieldID.setBounds(671, 185, 132, 32);
		contentPane.add(textFieldID);
		textFieldID.setColumns(10);

		textFieldword = new JTextField();
		textFieldword.setBackground(new Color(255, 255, 255));
		textFieldword.setEditable(false);
		textFieldword.setColumns(10);
		textFieldword.setBounds(671, 246, 132, 32);
		contentPane.add(textFieldword);

		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(671, 311, 132, 32);
		contentPane.add(textField_2);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel.setBounds(590, 185, 81, 32);
		contentPane.add(lblNewLabel);

		JLabel lblWord = new JLabel("word");
		lblWord.setForeground(SystemColor.textHighlightText);
		lblWord.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblWord.setBounds(587, 246, 84, 32);
		contentPane.add(lblWord);

		JLabel lblFrequency = new JLabel("Frequency");
		lblFrequency.setForeground(SystemColor.textHighlightText);
		lblFrequency.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblFrequency.setBounds(587, 311, 84, 32);
		contentPane.add(lblFrequency);

		JButton btnNewButton_1 = new JButton("insert");
		btnNewButton_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(Insert.isSelected()) {
				FS.Word_Single(textFieldword.getText());
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Please First Select Something");
				}

			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton_1.setBounds(586, 400, 109, 32);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Update");
		btnNewButton_1_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(update.isSelected()) {
				int id = Integer.parseInt(textFieldID.getText());
				int fre = Integer.parseInt(textField_2.getText());
				FS.update(textFieldword.getText(), id, fre);
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Please First Select Something");
					
				}

			}
		});
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(718, 400, 96, 32);
		contentPane.add(btnNewButton_1_1);

		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                  if(delete.isSelected()) {
				int id = Integer.parseInt(textFieldID.getText());
				FS.delete(id);
                  }
                  else {
                	  
                	  JOptionPane.showMessageDialog(null, "Please First Select Something");
                	  
                  }

			}
		});
		btnNewButton_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1.setBounds(586, 463, 109, 32);
		contentPane.add(btnNewButton_1_1_1);

		JButton btnNewButton_1_1_2 = new JButton("Clear");
		btnNewButton_1_1_2.setIcon(new ImageIcon(viewandupdate.class.getResource("/images/clear-icon.png")));
		btnNewButton_1_1_2.setBackground(SystemColor.inactiveCaption);
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel dm = (DefaultTableModel) tableData.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				textFieldword.setText("");
				textField_2.setText("");
				textFieldID.setText("");

			}
		});
		btnNewButton_1_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_2.setBounds(590, 518, 224, 32);
		contentPane.add(btnNewButton_1_1_2);
		
		JTable table = new JTable(MD);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);

		JButton btnNewButton_1_1_1_1 = new JButton("Search");
		btnNewButton_1_1_1_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(search.isSelected()) {
				DefaultTableModel dm = (DefaultTableModel) tableData.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				String id = textFieldID.getText();
				String Wor = textFieldword.getText();

				try {
					if (id != null) {
						for (int i = 0; i < words.size(); i = i + 3) {
							if (id.equals(words.get(i))) {

								Object[] B_Data = new Object[4];
								B_Data[0] = 1;
								B_Data[1] = words.get(i);
								B_Data[2] = words.get(i + 1);
								B_Data[3] = words.get(i + 2);

								MD.addRow(B_Data);
								break;
							}
						}
						tableData.setModel(MD);
					}

					if (Wor != null) {

						for (int i = 0; i < words.size(); i = i + 3) {
							if (Wor.equals(words.get(i + 1))) {

								Object[] B_Data = new Object[4];
								B_Data[0] = 1;
								B_Data[1] = words.get(i);
								B_Data[2] = words.get(i + 1);
								B_Data[3] = words.get(i + 2);

								MD.addRow(B_Data);
								break;
							}
						}
						tableData.setModel(MD);
					}
					if (textField_2.getText() != null) {
						int fre = Integer.parseInt(textField_2.getText());
						for (int i = 0; i < words.size(); i = i + 3) {
							String Str = (String) words.get(i + 2);
							int f = Integer.parseInt(Str);
							if (f <= fre) {

								Object[] B_Data = new Object[4];
								B_Data[0] = 1;
								B_Data[1] = words.get(i);
								B_Data[2] = words.get(i + 1);
								B_Data[3] = words.get(i + 2);

								MD.addRow(B_Data);

							}
						}
						tableData.setModel(MD);
					}
				} catch (NumberFormatException e1) {

				}
			}
			
			else {
				
				JOptionPane.showMessageDialog(null, "Please First Select Something");
			}
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1_1.setBounds(718, 463, 96, 32);
		contentPane.add(btnNewButton_1_1_1_1);

		Insert = new JRadioButton("");
		Insert.setBackground(SystemColor.desktop);
		Insert.setBounds(583, 380, 28, 21);
		contentPane.add(Insert);

		update = new JRadioButton("");
		update.setBackground(SystemColor.desktop);
		update.setBounds(718, 380, 28, 21);
		contentPane.add(update);

		delete = new JRadioButton("");
		delete.setBackground(SystemColor.activeCaptionText);
		delete.setBounds(589, 444, 28, 21);
		contentPane.add(delete);
		
		clear = new JRadioButton("");
		clear.setBackground(Color.BLACK);
		clear.setBounds(589, 496, 28, 21);
		contentPane.add(clear);


		search = new JRadioButton("");
		search.setBackground(SystemColor.desktop);
		search.setBounds(718, 446, 28, 21);
		contentPane.add(search);
		ButtonGroup bg = new ButtonGroup();
		bg.add(Insert);
		bg.add(update);
		bg.add(search);
		bg.add(delete);
		bg.add(search);
		bg.add(clear);

		getContentPane().add(Insert);
		getContentPane().add(update);
		getContentPane().add(delete);
		getContentPane().add(search);
		getContentPane().add(clear);
		

		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.setIcon(new ImageIcon(viewandupdate.class.getResource("/images/home-icon.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HomeScreen.frame1.setVisible(true);
				frame.dispose();

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(671, 47, 104, 32);
		contentPane.add(btnNewButton_2);

		Insert.addAncestorListener(null);
		
		update.addAncestorListener(null);

//		if (Insert.isSelected()) {
//			textFieldID.setEnabled(true);
//		} else if (update.isSelected()) {
//			textFieldID.setEnabled(false);
//		}

		textFieldword.setText("///");
		textFieldID.setText("///");
		textField_2.setText("///");
		
		 		Insert.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				textFieldword.setEditable(true);
				textFieldID.setEditable(false);
				
				textField_2.setEditable(false);
				textFieldID.setText("///");
				textFieldword.setText("");
				textField_2.setText("///");

			}

		});
		update.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textFieldword.setEditable(true);
				textFieldID.setEditable(true);
				textField_2.setEditable(true);
				textFieldID.setText("");
				textFieldword.setText("");
				textField_2.setText("");

			}

		});
		delete.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textFieldword.setEditable(false);
				textFieldID.setEditable(true);
				textField_2.setEditable(false);
				textFieldID.setText("");
				textFieldword.setText("///");
				textField_2.setText("///");


			}

		});
		search.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textFieldword.setEditable(true);
				textFieldID.setEditable(true);
				textField_2.setEditable(true);
				textFieldID.setText("");
				textFieldword.setText("");
				textField_2.setText("");


			}

		});
		clear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textFieldword.setEditable(false);
				textFieldID.setEditable(false);
				textField_2.setEditable(false);
				textFieldID.setText("///");
				textFieldword.setText("///");
				textField_2.setText("///");


			}

		});

		tableData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				try {
					if(update.isSelected()||delete.isSelected()||search.isSelected()) {
					if (e.getClickCount() == 1) {
						final JTable le = (JTable) e.getSource();
						final int r = le.getSelectedRow();
						final int c = le.getSelectedColumn();
						final String val = (String) le.getValueAt(r, c);
						textFieldID.setText(val);
					}
					}
				} catch (Exception e1) {

				}
			}
		});
	}
}
