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
import javax.swing.JPanel;
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
		JMenuItem newtopicname = new JMenuItem("New topicname");
		JMenuItem addCard = new JMenuItem("Add Card");
		JMenuItem editCard = new JMenuItem("Edit Card");
		JMenuItem removeCard = new JMenuItem("Remove Card");
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem german = new JMenuItem("Deutsch");
		JMenuItem english = new JMenuItem("English");
		JMenuItem italian = new JMenuItem("Italiano");
		JMenuItem french = new JMenuItem("Fran�ais");
		
		JTextPane topicname = new JTextPane();
		JTextPane boxnumber = new JTextPane();
		
		JButton plus = new JButton(new ImageIcon(getClass().getResource("back.png")));
		
		JButton next = new JButton(new ImageIcon(getClass().getResource("next.png")));
		
		JButton check = new JButton(new ImageIcon(getClass().getResource("check.png")));
		
		JLabel question = new JLabel("Question:");
		JLabel answer = new JLabel("Answer:");
		JLabel questionWord = new JLabel("Auto");
		JLabel lastLearn = new JLabel("last learn:");
		JLabel date = new JLabel("05.11.1990");
		
		JTextField answerField = new JTextField();
		
		JPanel cardPanel = new JPanel();
		
		
		
		
		
		public BoxLearn() {
			super("Vokablentrainer");
			guiInitalisation();
		}
		
		
		public void guiInitalisation(){
			
			// JFrame defination
			super.setBackground(Color.WHITE);
			super.setResizable(false);
			super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			super.setSize(800, 500);
			super.setVisible(true);
			super.setLayout(null);
			
			cardPanel.setBackground(Color.LIGHT_GRAY);
			cardPanel.setBounds(25, 120, 750, 300);
			cardPanel.setVisible(true);
			cardPanel.setLayout(null);
			

			//questionlabel
			question.setVisible(true);
			question.setFont(question.getFont().deriveFont(20f));
			question.setBounds(15, 15, 150, 50);
			question.setBackground(Color.LIGHT_GRAY);
			
			//question word
			questionWord.setVisible(true);
			questionWord.setFont(questionWord.getFont().deriveFont(20f));
			questionWord.setBounds(170, 15, 575, 50);
			questionWord.setBackground(Color.LIGHT_GRAY);
			
			//answerlabel
			answer.setVisible(true);
			answer.setFont(answer.getFont().deriveFont(20f));
			answer.setBounds(15, 100, 150, 50);
			answer.setBackground(Color.LIGHT_GRAY);
			
			//textfiel
			answerField.setEditable(true);
			answerField.setVisible(true);
			answerField.setFont(answerField.getFont().deriveFont(20f));
			answerField.setBounds(170, 100, 575, 50);
			
			
			//lastlearn label
			lastLearn.setVisible(true);
			lastLearn.setFont(lastLearn.getFont().deriveFont(10));
			lastLearn.setBounds(500, 270, 150, 20);
			lastLearn.setBackground(Color.LIGHT_GRAY);
			
			//date label
			date.setVisible(true);
			date.setFont(date.getFont().deriveFont(10));
			date.setBounds(650, 270, 80, 20);
			date.setBackground(Color.LIGHT_GRAY);
			
			
			
			
			
			
			
			
			
			// build menubar
			menuBar.add(file);
			menuBar.add(language);
			file.add(newPro);
			file.add(loadPro);
			file.add(newtopicname);
			file.add(addCard);
			file.add(editCard);
			file.add(removeCard);
			file.add(exit);
			language.add(german);
			language.add(english);
			language.add(italian);
			language.add(french);
			
			menuBar.setBackground(Color.WHITE);
			
			

			
			
			plus.setBounds(20, 10, 51, 50);
			next.setBounds(175, 188, 145, 48);
			check.setBounds(475, 185, 53, 53);
//			topicname.setBounds(50, 10, 200, 50);
//			topicname.setVisible(true);
			
			
			
			 topicname.setEditable(false);
		     SimpleAttributeSet set1 = new SimpleAttributeSet();
		     StyleConstants.setAlignment(set1,StyleConstants.ALIGN_LEFT);
		     StyleConstants.setFontFamily(set1,"Times New Roman");
		     StyleConstants.setFontSize(set1,30);
		     StyleConstants.setItalic(set1,true);
		     StyleConstants.setBold(set1,true);
		     topicname.setParagraphAttributes(set1,true);
		     topicname.setBackground(Color.WHITE);
		     topicname.setBounds(90,20,500,40);
		     topicname.setText("Topicname");
		     
		     boxnumber.setEditable(false);
		     SimpleAttributeSet set2 = new SimpleAttributeSet();
		     StyleConstants.setAlignment(set2,StyleConstants.ALIGN_LEFT);
		     StyleConstants.setFontFamily(set2,"Times New Roman");
		     StyleConstants.setFontSize(set2,23);
		     StyleConstants.setItalic(set2,true);
		     StyleConstants.setBold(set2,true);
		     boxnumber.setParagraphAttributes(set2,true);
		     boxnumber.setBackground(Color.WHITE);
		     boxnumber.setBounds(90,75,200,40);
		     boxnumber.setText("Box: 1");
			
			super.setJMenuBar(menuBar);
			super.add(plus);
			super.add(topicname);
			super.add(boxnumber);
			super.add(cardPanel);
			cardPanel.add(question);
			cardPanel.add(questionWord);
			cardPanel.add(answer);
			cardPanel.add(answerField);
			cardPanel.add(next);
			cardPanel.add(check);
			cardPanel.add(lastLearn);
			cardPanel.add(date);
			
			
			
			
		}
		
		public static void main(String args[]) {
			BoxLearn test = new BoxLearn();
			test.guiInitalisation();
		}
		
}
