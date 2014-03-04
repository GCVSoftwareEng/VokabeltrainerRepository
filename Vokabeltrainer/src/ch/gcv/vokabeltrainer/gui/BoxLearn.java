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


public class BoxLearn extends JFrame{
	
		
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
		
		JButton plus = new JButton(new ImageIcon(getClass().getResource("back.png")));
		
		JButton next = new JButton(new ImageIcon(getClass().getResource("next.gif")));
		
		JButton check = new JButton(new ImageIcon(getClass().getResource("check.png")));
		
		JLabel question = new JLabel("Question:");
		JLabel answer = new JLabel("Answer:");
		JLabel questionWord = new JLabel("Auto");
		
		JTextField answerField = new JTextField();
		
		
		
		
		JScrollBar scrollbar = new JScrollBar();
		
		String inhalte[] = {"1","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","3","3","3","3","3","3","3"};
		
		public BoxLearn() {
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
			
			//textfiel
			answerField.setEditable(true);
			answerField.setVisible(true);
			answerField.setFont(answerField.getFont().deriveFont(20f));
			answerField.setBounds(185, 250, 275, 50);
			
			//questionlabel
			question.setVisible(true);
			question.setFont(question.getFont().deriveFont(20f));
			question.setBounds(30, 100, 150, 50);
			
			//question word
			questionWord.setVisible(true);
			questionWord.setFont(questionWord.getFont().deriveFont(20f));
			questionWord.setBounds(225, 100, 150, 50);
			
			//answerlabel
			answer.setVisible(true);
			answer.setFont(answer.getFont().deriveFont(20f));
			answer.setBounds(30, 250, 150, 50);
			
			
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
			
			

			
			
			plus.setBounds(20, 10, 51, 50);
			next.setBounds(30, 350, 75, 55);
			check.setBounds(350, 350, 53, 53);
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
			super.add(plus);
			super.add(boxname);
			super.add(question);
			super.add(questionWord);
			super.add(answer);
			super.add(answerField);
			super.add(next);
			super.add(check);
			
			
		}
		
		public static void main(String args[]) {
			BoxLearn test = new BoxLearn();
			test.guiInitalisation();
		}
		
}
