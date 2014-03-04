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
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;


public class Box extends JFrame{
	
		
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
		
		private JList liste;
		JButton plus = new JButton(new ImageIcon(getClass().getResource("back.png")));
		
//		JLabel boxname = new JLabel("boxname");
		
		JTextPane boxname = new JTextPane();
		
		
		
		JScrollBar scrollbar = new JScrollBar();
		
		String inhalte[] = {"1","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","3","3","3","3","3","3","3"};
		
		public Box() {
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
			
			liste = new JList(inhalte);

			JScrollPane pane = new JScrollPane(liste);
			pane.setBounds(50, 80, 400, 350);
			
			plus.setBounds(20, 10, 51, 50);
//			boxname.setBounds(50, 10, 200, 50);
//			boxname.setVisible(true);
			
			
			
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
			super.add(pane);
			super.add(plus);
			super.add(boxname);
			
			
		}
		
		public static void main(String args[]) {
			Box test = new Box();
			test.guiInitalisation();
		}
		
}
