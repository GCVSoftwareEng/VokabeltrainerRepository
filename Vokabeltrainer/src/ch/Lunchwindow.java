package ch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;

public class Lunchwindow extends JFrame{

	// textfield for welcome window
	JTextArea welcome = new JTextArea();
	
	// buttons for a new profile and to load a profile
	JButton newProfile = new JButton("New Profile");
	JButton loadProfile = new JButton("Load Profile");
	
	// menubar and menus
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu language = new JMenu ("Language");
	
	//panels
	JPanel buttonsPanel = new JPanel();
	JPanel welcomePanel = new JPanel();
	JPanel menuBarPanel = new JPanel();
	
	
	
	public Lunchwindow() {
		super("Vokablentrainer");
		guiInitalisation();
	
	}
	
	public void guiInitalisation(){
		
		// JFrame defination
		super.setBackground(Color.white);
		super.setResizable(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(800, 600);
		super.setVisible(true);
		
		// welcome definition
		welcome.setBackground(Color.LIGHT_GRAY);
		welcome.setSize(400,200);
		welcome.setEditable(false);
		welcome.setText("Willkommen");
		welcome.append("\nWelcome");
		welcome.append("\nBenvenuti");
		welcome.append("\nBienvenue");
		welcome.setVisible(true);
		
		
		// build menubar
		menuBar.add(file);
		menuBar.add(language);
		
		//menubar definition
		menuBar.setSize(800,20);
		menuBar.setBackground(Color.LIGHT_GRAY);
		
		//buttons definition
		
		//layout definition
		menuBarPanel.setSize(800,20);
		welcomePanel.setSize(400,200);
		
		// set panel layout
		buttonsPanel.setLayout(new GridLayout(2, 0));
		welcomePanel.setLayout(new GridLayout(1,0));
		menuBarPanel.setLayout(new GridLayout(1, 0));
		super.setLayout(new BorderLayout());
				
		// add to panel
		buttonsPanel.add(newProfile);
		buttonsPanel.add(loadProfile);
		welcomePanel.add(welcome);
		
		
		
		
		// add to mainframe
		super.add(menuBar,BorderLayout.NORTH);
		super.add(welcomePanel,BorderLayout.CENTER);
		super.add(buttonsPanel,BorderLayout.CENTER);
		
		
	}
	
	public static void main(String args[]) {
		Lunchwindow test = new Lunchwindow();
		test.guiInitalisation();
	}
}