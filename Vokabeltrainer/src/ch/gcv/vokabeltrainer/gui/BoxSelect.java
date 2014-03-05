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
		
		JLabel cardCount1 = new JLabel("Cards:");
		JLabel cardCount2 = new JLabel("Cards:");
		JLabel cardCount3 = new JLabel("Cards:");
		JLabel cardCount4 = new JLabel("Cards:");
		JLabel cardCount5 = new JLabel("Cards:");
		
		JLabel card1ummber1 = new JLabel("100");
		JLabel card1ummber2 = new JLabel("100");
		JLabel card1ummber3 = new JLabel("100");
		JLabel card1ummber4 = new JLabel("100");
		JLabel card1ummber5 = new JLabel("100");
		
		
	
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
			boxButton1.setBounds(25, 240, 70, 70);
			boxButton2.setBounds(120, 240, 70, 70);
			boxButton3.setBounds(215, 240, 70, 70);
			boxButton4.setBounds(310, 240, 70, 70);
			boxButton5.setBounds(405, 240, 70, 70);
			
			//layout definition
			boxLabel1.setVisible(true);
			boxLabel1.setFont(boxLabel1.getFont().deriveFont(20f));
			boxLabel1.setBounds(30, 170, 70, 20);
			
			boxLabel2.setVisible(true);
			boxLabel2.setFont(boxLabel2.getFont().deriveFont(20f));
			boxLabel2.setBounds(125, 170, 70, 20);
			
			boxLabel3.setVisible(true);
			boxLabel3.setFont(boxLabel3.getFont().deriveFont(20f));
			boxLabel3.setBounds(220, 170, 70, 20);
			
			boxLabel4.setVisible(true);
			boxLabel4.setFont(boxLabel4.getFont().deriveFont(20f));
			boxLabel4.setBounds(315, 170, 70, 20);
			
			boxLabel5.setVisible(true);
			boxLabel5.setFont(boxLabel5.getFont().deriveFont(20f));
			boxLabel5.setBounds(410, 170, 70, 20);
			
			
			cardCount1.setVisible(true);
			cardCount1.setFont(cardCount1.getFont().deriveFont(14));
			cardCount1.setBounds(30, 195, 70, 20);
			
			cardCount2.setVisible(true);
			cardCount2.setFont(cardCount2.getFont().deriveFont(14));
			cardCount2.setBounds(125, 195, 70, 20);
			
			cardCount3.setVisible(true);
			cardCount3.setFont(cardCount3.getFont().deriveFont(14));
			cardCount3.setBounds(220, 195, 70, 20);
			
			cardCount4.setVisible(true);
			cardCount4.setFont(cardCount4.getFont().deriveFont(14));
			cardCount4.setBounds(315, 195, 70, 20);
			
			cardCount5.setVisible(true);
			cardCount5.setFont(cardCount5.getFont().deriveFont(14));
			cardCount5.setBounds(410, 195, 70, 20);
			
			card1ummber1.setVisible(true);
			card1ummber1.setFont(card1ummber1.getFont().deriveFont(14));
			card1ummber1.setBounds(45, 325, 70, 30);
			
			card1ummber2.setVisible(true);
			card1ummber2.setFont(card1ummber2.getFont().deriveFont(14));
			card1ummber2.setBounds(140, 325, 70, 30);
			
			card1ummber3.setVisible(true);
			card1ummber3.setFont(card1ummber3.getFont().deriveFont(14));
			card1ummber3.setBounds(235, 325, 70, 30);
			
			card1ummber4.setVisible(true);
			card1ummber4.setFont(card1ummber4.getFont().deriveFont(14));
			card1ummber4.setBounds(330, 325, 70, 30);
			
			card1ummber5.setVisible(true);
			card1ummber5.setFont(card1ummber5.getFont().deriveFont(14));
			card1ummber5.setBounds(425, 325, 70, 30);
			
			
			
			
			
			 boxname.setEditable(false);
		     SimpleAttributeSet set = new SimpleAttributeSet();
		     StyleConstants.setAlignment(set,StyleConstants.ALIGN_LEFT);
		     StyleConstants.setFontFamily(set,"Times New Roman");
		     StyleConstants.setFontSize(set,35);
		     StyleConstants.setItalic(set,true);
		     StyleConstants.setBold(set,true);
		     boxname.setParagraphAttributes(set,true);
		     boxname.setBackground(Color.WHITE);
		     boxname.setBounds(30,50,450,50);
		     boxname.setText("Topicname");
			
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
			super.add(cardCount1);
			super.add(cardCount2);
			super.add(cardCount3);
			super.add(cardCount4);
			super.add(cardCount5);
			super.add(card1ummber1);
			super.add(card1ummber2);
			super.add(card1ummber3);
			super.add(card1ummber4);
			super.add(card1ummber5);
			
			
		}
		
		public static void main(String args[]) {
			BoxSelect test = new BoxSelect();
			test.guiInitalisation();
		}
		
}
