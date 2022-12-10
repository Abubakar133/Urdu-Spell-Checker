package Presentation_Layer;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import BussinessLogic_Layer.CHeck_Words;

import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class Hilight extends JFrame {

	private JPanel contentPane;
     JTextArea textArea_1;
	private JTextArea textArea;
	private static JScrollPane Scoll;
	private JScrollPane scrollPane;
	JComboBox comboBox;
	static Hilight frame = new Hilight();
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new Hilight();
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
	public Hilight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 666);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(UIManager.getBorder("DesktopIcon.border"));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Scoll=new JScrollPane();
		
		Scoll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		Scoll.setViewportBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		Scoll.setBounds(71, 109, 679, 183);
		contentPane.add(Scoll);
		Scoll.setViewportView(textArea);
		getContentPane().add(Scoll);
		
		textArea = new JTextArea();
		textArea.setTabSize(14);
		Scoll.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Test Paragraph");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textArea.getText().isEmpty()) {
					
				}
				else {
				comboBox.removeAllItems();
				comboBox_1.removeAllItems();
				
				textArea_1.setText(textArea.getText());
				CHeck_Words obj=new CHeck_Words();
				
				obj.String_Breaker(textArea.getText());
				if(obj.check_List()) {
				obj.Hilight(textArea_1,1);
				obj.Hilight2(textArea_1,comboBox);
				String Nword=obj.Word((String) comboBox.getSelectedItem());
				comboBox_1.addItem(Nword);
				
				}
				else {
					JOptionPane.showMessageDialog(null,"No Error Found 👌");    
				}
				}
			}
		});
		
		
		btnNewButton.setBounds(760, 246, 125, 47);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBounds(71, 346, 679, 261);
		contentPane.add(scrollPane);
		    
		      this.textArea_1 = new JTextArea();
		      textArea_1.setTabSize(14);
		      scrollPane.setViewportView(textArea_1);
		      textArea_1.setEditable(false);
		      
		      JLabel lblNewLabel = new JLabel("Spell Checker");
		      lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 26));
		      lblNewLabel.setBounds(299, 37, 249, 62);
		      contentPane.add(lblNewLabel);
		      
		      JLabel lblResult = new JLabel("Result");
		      lblResult.setFont(new Font("Snap ITC", Font.BOLD, 26));
		      lblResult.setBounds(365, 302, 112, 47);
		      contentPane.add(lblResult);
		      
		      JButton btnNewButton_1 = new JButton("Clear Fields");
		      btnNewButton_1.addActionListener(new ActionListener() {
		      	public void actionPerformed(ActionEvent e) {
		      		textArea_1.setText(null);
		      		textArea.setText(null);
		      		
		      	}
		      });
		      btnNewButton_1.setBounds(760, 346, 125, 41);
		      contentPane.add(btnNewButton_1);
		      
		     
		       comboBox = new JComboBox();
		      comboBox.setBounds(760, 427, 125, 41);
		      contentPane.add(comboBox);
		      
		      comboBox_1 = new JComboBox();
		      comboBox_1.setBounds(760, 499, 125, 39);
		      contentPane.add(comboBox_1);
		      
		      JButton btnNewButton_2 = new JButton("Replace Word");
		      btnNewButton_2.addActionListener(new ActionListener() {
		      	public void actionPerformed(ActionEvent e) {
		      		
					comboBox_1.removeAllItems();
					
					CHeck_Words obj=new CHeck_Words();
					String Nword=obj.Word((String) comboBox.getSelectedItem());
					comboBox_1.addItem(Nword);
					obj.String_Breaker2(textArea_1.getText(),(String) comboBox.getSelectedItem(),Nword);
					obj.setTextArea(textArea_1);
					comboBox.removeAllItems();
					
					if(obj.check_List()) {
						obj.Hilight(textArea_1,2);
						obj.Hilight2(textArea_1,comboBox);
						
						}
						else {
							JOptionPane.showMessageDialog(null,"No Error Found 👌");    
						}
					
		      		
		      	}
		      });
		      btnNewButton_2.setBounds(760, 566, 125, 41);
		      contentPane.add(btnNewButton_2);
		      
		      JLabel lblNewLabel_1 = new JLabel("Error Words");
		      lblNewLabel_1.setBounds(760, 404, 91, 13);
		      contentPane.add(lblNewLabel_1);
		      
		      JLabel lblNewLabel_2 = new JLabel("Real Word");
		      lblNewLabel_2.setBounds(760, 476, 91, 13);
		      contentPane.add(lblNewLabel_2);
		      
		      JButton btnNewButton_3 = new JButton("Home Page");
		      btnNewButton_3.addActionListener(new ActionListener() {
		      	public void actionPerformed(ActionEvent e) {
		      		frame.dispose();
		      		HomeScreen frame1 = new HomeScreen();
					frame1.setVisible(true);
					
		      		
		            
		      	}
		      });
		      btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		      btnNewButton_3.setBounds(812, 37, 137, 47);
		      contentPane.add(btnNewButton_3);
		      
		
	}
}
