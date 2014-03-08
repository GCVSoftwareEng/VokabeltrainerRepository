package ch.gcv.vokabeltrainer.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

import org.omg.CORBA.PUBLIC_MEMBER;


public class TopicEditView extends JFrame{
	
		
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
		
		
		JButton back = new JButton(new ImageIcon(getClass().getResource("back.png")));
		JButton edit = new JButton(new ImageIcon(getClass().getResource("edit.png")));
		
		JTextField topicnameField = new JTextField();
		JLabel topicname = new JLabel("Topicname:");
		
		JTextPane topic = new JTextPane();
		

	
		public TopicEditView() {
			super("Vokablentrainer");
			guiInitalisation();
		}
		
		
		
		
		
		public void guiInitalisation(){
			
			// JFrame defination
			super.setBackground(Color.WHITE);
			super.setResizable(true);
			super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			super.setSize(600, 280);
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
			
			//topicnamelabel
			topicname.setVisible(true);
			topicname.setFont(topicname.getFont().deriveFont(20f));
			topicname.setBounds(20, 80, 550, 30);
			topicname.setBackground(Color.LIGHT_GRAY);
			
			
			// textfiel
			topicnameField.setEditable(true);
			topicnameField.setVisible(true);
			topicnameField.setFont(topicnameField.getFont().deriveFont(20f));
			topicnameField.setBounds(20, 130, 490, 50);
			
			back.setBounds(20, 10, 51, 50);
			edit.setBounds(520, 130, 51, 50);

			
			
			
			 topic.setEditable(false);
		     SimpleAttributeSet set = new SimpleAttributeSet();
		     StyleConstants.setAlignment(set,StyleConstants.ALIGN_LEFT);
		     StyleConstants.setFontFamily(set,"Times New Roman");
		     StyleConstants.setFontSize(set,30);
		     StyleConstants.setItalic(set,true);
		     StyleConstants.setBold(set,true);
		     topic.setParagraphAttributes(set,true);
		     topic.setBackground(Color.WHITE);
		     topic.setBounds(90, 20, 500, 40);
		     topic.setText("Topic");
			
			super.setJMenuBar(menuBar);
			super.add(back);
			super.add(edit);
			super.add(topic);
			super.add(topicname);
			super.add(topicnameField);
			
//			add listener
			back.addActionListener(new ButtonListener());
			edit.addActionListener(new ButtonListener());
			newPro.addActionListener(new MenubarListener());
			german.addActionListener(new MenubarListener());
			
			
		}
		
		class ButtonListener implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				
				if(e.getSource() == back){
					Mainwindow main = new Mainwindow();
					main.guiInitalisation();	
				}
				else if(e.getSource() == newPro){
					
					String text = topicnameField.getText();
					topic.setText(text);
				}
				
			}
		}
			
		class MenubarListener implements ActionListener{
				
				public void actionPerformed(ActionEvent e){
					
					if(e.getSource() == file){
						topic.setText("file");
					}
					else if(e.getSource() == german){
						topic.setText("deutsch");
					}
					
				}
		}
			
		
		
		public static void main(String args[]) {
			TopicEditView test = new TopicEditView();
			test.guiInitalisation();
		}
		
}
