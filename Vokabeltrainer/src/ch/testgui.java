package ch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class testgui extends JFrame{

	// textfield for welcome window
	JTextArea welspace1 = new JTextArea();
	JTextArea welspace2 = new JTextArea();
	JTextArea welspace3 = new JTextArea();
	JTextArea welspace4 = new JTextArea();
	JTextArea welspace5 = new JTextArea();
	JTextArea welspace6 = new JTextArea();
	
	// texfpane for welcome window
	JTextPane welcome = new JTextPane();
	
	//space label
	JLabel spaceb1 = new JLabel();
	JLabel spaceb2 = new JLabel();
	JLabel spaceb3 = new JLabel();
	JLabel spaceb4 = new JLabel();
	
	// buttons for a new profile and to load a profile
	JButton newProfile = new JButton("New Profile ");
	JButton loadProfile = new JButton("Load Profile");
	
	// menubar and menus
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu language = new JMenu ("Language",true);
	
	//panels
	JPanel buttonsPanel = new JPanel();
	JPanel welcomePanel = new JPanel();
	JPanel menuBarPanel = new JPanel();
	JPanel welcomeButtonPanel = new JPanel();
	
	
	
	
	public testgui() {
		super("Vokablentrainer");
		guiInitalisation();
	
	}
	
	public void guiInitalisation(){
		
		// JFrame defination
		super.setBackground(Color.white);
		super.setResizable(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(500, 500);
		super.setVisible(true);
		
		// welcome definition
//		welcome.setBackground(Color.LIGHT_GRAY);
//		welcome.setSize(400,200);
//		welcome.setEditable(false);
//		welcome.setText("Willkommen beim Vokabulartrainer");
//		welcome.append("\nWelcome to the vocabulary trainer");
//		welcome.append("\nBenvenuti al trainer lessicale");
//		welcome.append("\nBienvenue ˆ l'entra”neur de vocabulaire");
//		welcome.setVisible(true);
		
		
		// build menubar
		menuBar.add(file);
		menuBar.add(language);
		
		//menubar definition
//		menuBar.setSize(800,20);
		menuBar.setBackground(Color.LIGHT_GRAY);
		
		//buttons definition
		
		//layout definition
//		menuBarPanel.setSize(800,20);
//		welcomePanel.setSize(400,200);
		
		// set panel layout
		buttonsPanel.setLayout(new FlowLayout());
		welcomePanel.setLayout(new GridLayout(2,0));
		menuBarPanel.setLayout(new GridLayout(1, 0));
		welcomeButtonPanel.setLayout(new GridLayout(2, 0));
		super.setLayout(new BorderLayout());
				
		// add to panel
		buttonsPanel.add(spaceb1);
		buttonsPanel.add(newProfile);
		buttonsPanel.add(spaceb2);
		buttonsPanel.add(spaceb3);
		buttonsPanel.add(loadProfile);
		buttonsPanel.add(spaceb4);
//		welcomePanel.add(welspace1);
		welcomePanel.add(welcome);
//		welcomePanel.add(welspace2);
//		welcomePanel.add(welspace3);
		welcomePanel.add(buttonsPanel);
//		welcomePanel.add(welspace4);
//		welcomePanel.add(welspace5);
//		welcomePanel.add(welspace6);
		
//		welcomePanel.add(welcome);
//		welcomeButtonPanel.add(welcomePanel);
//		welcomeButtonPanel.add(buttonsPanel);
		
		
		
		//textpane		
	     welcome.setEditable(false);
	     SimpleAttributeSet set = new SimpleAttributeSet();
	     StyleConstants.setAlignment(set,StyleConstants.ALIGN_CENTER);
	     StyleConstants.setFontFamily(set,"Times New Roman");
	     StyleConstants.setFontSize(set,20);
	     StyleConstants.setItalic(set,true);
	     StyleConstants.setBold(set,true);
	     welcome.setParagraphAttributes(set,true);
	     welcome.setBackground(Color.WHITE);
	     welcome.setBounds(20,10,750,30);
	     welcome.setText("\n\n\nWillkommen beim Vokabulartrainer"
	     		+ "\nWelcome to the vocabulary trainer"
	     		+ "\nBenvenuti al trainer lessicale"
	     		+ "\nBienvenue ˆ l'entra”neur de vocabulaire");
	     
		
		
		
		// add to mainframe
		super.setJMenuBar(menuBar);
//		super.add(welcomeButtonPanel,BorderLayout.CENTER);
		super.add(welcomePanel,BorderLayout.CENTER);
//		super.add(buttonsPanel,BorderLayout.SOUTH);
		
		
		
	}
	
	public static void main(String args[]) {
		testgui test = new testgui();
		test.guiInitalisation();
	}
}