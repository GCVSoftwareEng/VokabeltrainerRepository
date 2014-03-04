package ch.gcv.vokabeltrainer.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;


public class BoxSelect extends JFrame{
	
		
		// menubar and menus
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu language = new JMenu("Language",true);
		JMenuItem newPro = new JMenuItem("New Profile");
		JMenuItem loadPro = new JMenuItem("Load Profile");
		JMenuItem newboxname = new JMenuItem("New boxname");
		JMenuItem addCard = new JMenuItem("Add Card");
		JMenuItem editCard = new JMenuItem("Edit Card");
		JMenuItem removeCard = new JMenuItem("Remove Card");
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem german = new JMenuItem("Deutsch");
		JMenuItem english = new JMenuItem("English");
		JMenuItem italian = new JMenuItem("Italiano");
		JMenuItem french = new JMenuItem("Français");
		
		JTextPane boxname = new JTextPane();
		
		JButton boxButton1 = new JButton(new ImageIcon(getClass().getResource("box.png")));
		
		JButton boxButton2 = new JButton(new ImageIcon(getClass().getResource("box.png")));
		
		JButton boxButton3 = new JButton(new ImageIcon(getClass().getResource("box.png")));
		
		JButton boxButton4 = new JButton(new ImageIcon(getClass().getResource("box.png")));
		
		JButton boxButton5 = new JButton(new ImageIcon(getClass().getResource("box.png")));
		
		JLabel boxLabel1 = new JLabel("Box 1");
		JLabel boxLabel2 = new JLabel("Box 2");
		JLabel boxLabel3 = new JLabel("Box 3");
		JLabel boxLabel4 = new JLabel("Box 4");
		JLabel boxLabel5 = new JLabel("Box 5");
		
		
	
		public BoxSelect() {
			super("Vokablentrainer");
			guiInitalisation();
		}
		
		
		public void guiInitalisation(){
			
			// JFrame defination
			super.setBackground(Color.WHITE);
			super.setResizable(true);
			super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			super.setSize(500, 500);
			super.setVisible(true);
			super.setLayout(null);
			
			
			// build menubar
			menuBar.add(file);
			menuBar.add(language);
			file.add(newPro);
			file.add(loadPro);
			file.add(newboxname);
			file.add(addCard);
			file.add(editCard);
			file.add(removeCard);
			file.add(exit);
			language.add(german);
			language.add(english);
			language.add(italian);
			language.add(french);
			
			menuBar.setBackground(Color.LIGHT_GRAY);
			
			

			
			// button definition
			boxButton1.setBounds(25, 250, 70, 70);
			boxButton2.setBounds(120, 250, 70, 70);
			boxButton3.setBounds(215, 250, 70, 70);
			boxButton4.setBounds(310, 250, 70, 70);
			boxButton5.setBounds(405, 250, 70, 70);
			
			//layout definition
			boxLabel1.setVisible(true);
			boxLabel1.setFont(boxLabel1.getFont().deriveFont(20f));
			boxLabel1.setBounds(35, 200, 70, 45);
			
			boxLabel2.setVisible(true);
			boxLabel2.setFont(boxLabel2.getFont().deriveFont(20f));
			boxLabel2.setBounds(130, 200, 70, 45);
			
			boxLabel3.setVisible(true);
			boxLabel3.setFont(boxLabel3.getFont().deriveFont(20f));
			boxLabel3.setBounds(225, 200, 70, 45);
			
			boxLabel4.setVisible(true);
			boxLabel4.setFont(boxLabel4.getFont().deriveFont(20f));
			boxLabel4.setBounds(320, 200, 70, 45);
			
			boxLabel5.setVisible(true);
			boxLabel5.setFont(boxLabel5.getFont().deriveFont(20f));
			boxLabel5.setBounds(415, 200, 70, 45);
			
			
			
			 boxname.setEditable(false);
		     SimpleAttributeSet set = new SimpleAttributeSet();
		     StyleConstants.setAlignment(set,StyleConstants.ALIGN_LEFT);
		     StyleConstants.setFontFamily(set,"Times New Roman");
		     StyleConstants.setFontSize(set,30);
		     StyleConstants.setItalic(set,true);
		     StyleConstants.setBold(set,true);
		     boxname.setParagraphAttributes(set,true);
		     boxname.setBackground(Color.WHITE);
		     boxname.setBounds(225,20,200,50);
		     boxname.setText("Box");
			
			super.setJMenuBar(menuBar);
			super.add(boxname);
			super.add(boxButton1);
			super.add(boxButton2);
			super.add(boxButton3);
			super.add(boxButton4);
			super.add(boxButton5);
			super.add(boxLabel1);
			super.add(boxLabel2);
			super.add(boxLabel3);
			super.add(boxLabel4);
			super.add(boxLabel5);
			
			
		}
		
		public static void main(String args[]) {
			BoxSelect test = new BoxSelect();
			test.guiInitalisation();
		}
		
}
