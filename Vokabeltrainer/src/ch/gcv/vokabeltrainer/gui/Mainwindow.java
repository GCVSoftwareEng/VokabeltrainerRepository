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


public class Mainwindow extends JFrame{
	
		
		// menubar and menus
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu language = new JMenu("Language",true);
		JMenuItem newPro = new JMenuItem("New Profile");
		JMenuItem loadPro = new JMenuItem("Load Profile");
		JMenuItem newTopic = new JMenuItem("New Topic");
		JMenuItem addCard = new JMenuItem("Add Card");
		JMenuItem editCard = new JMenuItem("Edit Card");
		JMenuItem removeCard = new JMenuItem("Remove Card");
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem german = new JMenuItem("Deutsch");
		JMenuItem english = new JMenuItem("English");
		JMenuItem italian = new JMenuItem("Italiano");
		JMenuItem french = new JMenuItem("Français");
		
		private JList liste;
		JButton plus = new JButton(new ImageIcon(getClass().getResource("plus.png")));
		
//		JLabel topic = new JLabel("Topic");
		
		JTextPane topic = new JTextPane();
		
		
		
		JScrollBar scrollbar = new JScrollBar();
		
		String inhalte[] = {"1","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","3","3","3","3","3","3","3"};
		
		public Mainwindow() {
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
			file.add(newTopic);
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
			
			plus.setBounds(400, 10, 51, 50);
//			topic.setBounds(50, 10, 200, 50);
//			topic.setVisible(true);
			
			
			
			 topic.setEditable(false);
		     SimpleAttributeSet set = new SimpleAttributeSet();
		     StyleConstants.setAlignment(set,StyleConstants.ALIGN_LEFT);
		     StyleConstants.setFontFamily(set,"Times New Roman");
		     StyleConstants.setFontSize(set,30);
		     StyleConstants.setItalic(set,true);
		     StyleConstants.setBold(set,true);
		     topic.setParagraphAttributes(set,true);
		     topic.setBackground(Color.WHITE);
		     topic.setBounds(50,20,200,50);
		     topic.setText("Topic");
			
			super.setJMenuBar(menuBar);
			super.add(pane);
			super.add(plus);
			super.add(topic);
			
			
		}
		
		public static void main(String args[]) {
			Mainwindow test = new Mainwindow();
			test.guiInitalisation();
		}
		
}
