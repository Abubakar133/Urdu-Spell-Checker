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

public class ViewAndUpdate extends JFrame {

	private JPanel contentPane;
	private JTable tableData;
	private DefaultTableModel defaultmodel;
	private JTextField textFieldID;
	private JTextField textFieldword;
	private JTextField textField_freq;
	JRadioButton insertbtn;
	JRadioButton updatebtn;
	JRadioButton deletebtn;
	JRadioButton searchbtn;
	JRadioButton clearbtn;
	
	List words = new ArrayList();
	boolean T = false;
	HomeScreen homescreen;
	private IFacade fasad =new Facade();
	static ViewAndUpdate viewupdate = new ViewAndUpdate();

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
					viewupdate = new ViewAndUpdate();
					viewupdate.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewAndUpdate() {
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
		defaultmodel = new DefaultTableModel(colNames, 0);

		JButton btnNewButton = new JButton("View Table");
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dtm = (DefaultTableModel) tableData.getModel();
				dtm.getDataVector().removeAllElements();
				dtm.fireTableDataChanged();
                 words.clear();
				words = fasad.getWords();
				int count = 1;
				for (int i = 0; i < words.size(); i = i + 3) {

					Object[] B_Dat = new Object[4];
					B_Dat[0] = count++;
					B_Dat[1] = words.get(i);
					B_Dat[2] = words.get(i + 1);
					B_Dat[3] = words.get(i + 2);

					defaultmodel.addRow(B_Dat);
				}
				tableData.setModel(defaultmodel);
				
				

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

		textField_freq = new JTextField();
		textField_freq.setBackground(new Color(255, 255, 255));
		textField_freq.setEditable(false);
		textField_freq.setColumns(10);
		textField_freq.setBounds(671, 311, 132, 32);
		contentPane.add(textField_freq);

		JLabel lblNewID = new JLabel("ID");
		lblNewID.setForeground(SystemColor.textHighlightText);
		lblNewID.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewID.setBounds(590, 185, 81, 32);
		contentPane.add(lblNewID);

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

		JButton btnNewButton_insert = new JButton("insert");
		btnNewButton_insert.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(insertbtn.isSelected()) {
				fasad.Word_Single(textFieldword.getText());
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Please First Select Something");
				}

			}
		});
		btnNewButton_insert.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton_insert.setBounds(586, 400, 109, 32);
		contentPane.add(btnNewButton_insert);

		JButton btnNewButton_update = new JButton("Update");
		btnNewButton_update.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(updatebtn.isSelected()) {
				int id = Integer.parseInt(textFieldID.getText());
				int fre = Integer.parseInt(textField_freq.getText());
				fasad.update(textFieldword.getText(), id, fre);
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Please First Select Something");
					
				}

			}
		});
		btnNewButton_update.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_update.setBounds(718, 400, 96, 32);
		contentPane.add(btnNewButton_update);

		JButton btnNewButton_1_1_1 = new JButton("Delete");
		btnNewButton_1_1_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                  if(deletebtn.isSelected()) {
				int id = Integer.parseInt(textFieldID.getText());
				fasad.delete(id);
                  }
                  else {
                	  
                	  JOptionPane.showMessageDialog(null, "Please First Select Something");
                	  
                  }

			}
		});
		btnNewButton_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1_1.setBounds(586, 463, 109, 32);
		contentPane.add(btnNewButton_1_1_1);

		JButton btnNewButton_clear = new JButton("Clear");
		btnNewButton_clear.setIcon(new ImageIcon(ViewAndUpdate.class.getResource("/images/clear-icon.png")));
		btnNewButton_clear.setBackground(SystemColor.inactiveCaption);
		btnNewButton_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel dm = (DefaultTableModel) tableData.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				textFieldword.setText("");
				textField_freq.setText("");
				textFieldID.setText("");

			}
		});
		btnNewButton_clear.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_clear.setBounds(590, 518, 224, 32);
		contentPane.add(btnNewButton_clear);
		
		JTable table = new JTable(defaultmodel);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);

		JButton btnNewButton_search = new JButton("Search");
		btnNewButton_search.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(searchbtn.isSelected()) {
				DefaultTableModel dm = (DefaultTableModel) tableData.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				String id = textFieldID.getText();
				String wordField = textFieldword.getText();

				try {
					if (id != null) {
						for (int i = 0; i < words.size(); i = i + 3) {
							if (id.equals(words.get(i))) {

								Object[] B_Data = new Object[4];
								B_Data[0] = 1;
								B_Data[1] = words.get(i);
								B_Data[2] = words.get(i + 1);
								B_Data[3] = words.get(i + 2);

								defaultmodel.addRow(B_Data);
								break;
							}
						}
						tableData.setModel(defaultmodel);
					}

					if (wordField != null) {

						for (int i = 0; i < words.size(); i = i + 3) {
							if (wordField.equals(words.get(i + 1))) {

								Object[] B_Data = new Object[4];
								B_Data[0] = 1;
								B_Data[1] = words.get(i);
								B_Data[2] = words.get(i + 1);
								B_Data[3] = words.get(i + 2);

								defaultmodel.addRow(B_Data);
								break;
							}
						}
						tableData.setModel(defaultmodel);
					}
					if (textField_freq.getText() != null) {
						int frequencyfield = Integer.parseInt(textField_freq.getText());
						for (int i = 0; i < words.size(); i = i + 3) {
							String Str = (String) words.get(i + 2);
							int frequency = Integer.parseInt(Str);
							if (frequency <= frequencyfield) {

								Object[] B_Data = new Object[4];
								B_Data[0] = 1;
								B_Data[1] = words.get(i);
								B_Data[2] = words.get(i + 1);
								B_Data[3] = words.get(i + 2);

								defaultmodel.addRow(B_Data);

							}
						}
						tableData.setModel(defaultmodel);
					}
				} catch (NumberFormatException e1) {

				}
			}
			
			else {
				
				JOptionPane.showMessageDialog(null, "Please First Select Something");
			}
			}
		});
		btnNewButton_search.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_search.setBounds(718, 463, 96, 32);
		contentPane.add(btnNewButton_search);

		insertbtn = new JRadioButton("");
		insertbtn.setBackground(SystemColor.desktop);
		insertbtn.setBounds(583, 380, 28, 21);
		contentPane.add(insertbtn);

		updatebtn = new JRadioButton("");
		updatebtn.setBackground(SystemColor.desktop);
		updatebtn.setBounds(718, 380, 28, 21);
		contentPane.add(updatebtn);

		deletebtn = new JRadioButton("");
		deletebtn.setBackground(SystemColor.activeCaptionText);
		deletebtn.setBounds(589, 444, 28, 21);
		contentPane.add(deletebtn);
		
		clearbtn = new JRadioButton("");
		clearbtn.setBackground(Color.BLACK);
		clearbtn.setBounds(589, 496, 28, 21);
		contentPane.add(clearbtn);


		searchbtn = new JRadioButton("");
		searchbtn.setBackground(SystemColor.desktop);
		searchbtn.setBounds(718, 446, 28, 21);
		contentPane.add(searchbtn);
		ButtonGroup btngroup = new ButtonGroup();
		btngroup.add(insertbtn);
		btngroup.add(updatebtn);
		btngroup.add(searchbtn);
		btngroup.add(deletebtn);
		btngroup.add(searchbtn);
		btngroup.add(clearbtn);

		getContentPane().add(insertbtn);
		getContentPane().add(updatebtn);
		getContentPane().add(deletebtn);
		getContentPane().add(searchbtn);
		getContentPane().add(clearbtn);
		

		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.setIcon(new ImageIcon(ViewAndUpdate.class.getResource("/images/home-icon.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HomeScreen.Homescreen.setVisible(true);
				viewupdate.dispose();

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(671, 47, 104, 32);
		contentPane.add(btnNewButton_2);

		insertbtn.addAncestorListener(null);
		
		updatebtn.addAncestorListener(null);



		textFieldword.setText("///");
		textFieldID.setText("///");
		textField_freq.setText("///");
		
		 		insertbtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				textFieldword.setEditable(true);
				textFieldID.setEditable(false);
				
				textField_freq.setEditable(false);
				textFieldID.setText("///");
				textFieldword.setText("");
				textField_freq.setText("///");

			}

		});
		updatebtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textFieldword.setEditable(true);
				textFieldID.setEditable(true);
				textField_freq.setEditable(true);
				textFieldID.setText("");
				textFieldword.setText("");
				textField_freq.setText("");

			}

		});
		deletebtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textFieldword.setEditable(false);
				textFieldID.setEditable(true);
				textField_freq.setEditable(false);
				textFieldID.setText("");
				textFieldword.setText("///");
				textField_freq.setText("///");


			}

		});
		searchbtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textFieldword.setEditable(true);
				textFieldID.setEditable(true);
				textField_freq.setEditable(true);
				textFieldID.setText("");
				textFieldword.setText("");
				textField_freq.setText("");


			}

		});
		clearbtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textFieldword.setEditable(false);
				textFieldID.setEditable(false);
				textField_freq.setEditable(false);
				textFieldID.setText("///");
				textFieldword.setText("///");
				textField_freq.setText("///");


			}

		});

		tableData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(final MouseEvent e) {
				try {
					if(updatebtn.isSelected()||deletebtn.isSelected()||searchbtn.isSelected()) {
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
