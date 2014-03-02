package ch.gcv.vokabeltrainer.testGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class GUI extends JFrame {

	JPanel menuPanel;
	JPanel mainPanel;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItemL;
	JMenuItem menuItemS;
	JMenuItem menuItemN;
	JButton delete;
	JPanel buttonPanel;

	JLabel testLabel;

	public GUI(String titel) {
		// set Frame settings
		super(titel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(700, 450);
		this.setLayout(new BorderLayout(0, 0));

		// Test
//		JPanel panelScroll = new JPanel();
//		JTextArea textarea = new JTextArea(3, 13);
//		JScrollPane sp = new JScrollPane(textarea);
//
//		textarea.setTabSize(5);
//		textarea.setText("Dies ist ein Test um die ScrollPane …");
//	
//		setContentPane(panelScroll);

		

	

		

		// Create Panels
		menuPanel = new JPanel();
		mainPanel = new JPanel();
		buttonPanel = new JPanel();
		mainPanel.setBackground(Color.cyan);
		JPanel platzhalter = new JPanel();
		platzhalter.setBackground(Color.YELLOW);

		// Create Buttons
		delete = new JButton("Delte");

		// Create text field;

		// Create lable field;
		testLabel = new JLabel("Hallo Vini Cyan");

		// Set layouts
		menuPanel.setLayout(new BorderLayout(10, 10));
		mainPanel.setLayout(new BorderLayout(0, 0));
		buttonPanel.setLayout(new FlowLayout());

		// Create the menu bar.
		menuBar = new JMenuBar();

		// Build the first menu.
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_N);
		menu.getAccessibleContext().setAccessibleDescription(
				"This menu does nothing");
		menuBar.add(menu);

		// Create the menuItems
		menuItemL = new JMenuItem("Load Profile", KeyEvent.VK_T);
		menuItemL.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,
				ActionEvent.ALT_MASK));
		menuItemL.getAccessibleContext().setAccessibleDescription(
				"This doesn't really do anything");

		menuItemS = new JMenuItem("Save Profile", KeyEvent.VK_T);
		menuItemS.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,
				ActionEvent.ALT_MASK));
		menuItemS.getAccessibleContext().setAccessibleDescription(
				"This doesn't really do anything");

		menuItemN = new JMenuItem("New Profile", KeyEvent.VK_T);
		menuItemN.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3,
				ActionEvent.ALT_MASK));
		menuItemN.getAccessibleContext().setAccessibleDescription(
				"This doesn't really do anything");
		menu.add(menuItemL);
		menu.add(menuItemS);
		menu.add(menuItemN);

		// Build second menu in the menu bar.
		menu = new JMenu("Language");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription(
				"The only menu in this program that has menu items");
		menuBar.add(menu);

		// Add things to panels
		menuPanel.add(menuBar);
		buttonPanel.add(delete);

		
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		mainPanel.add(testLabel, BorderLayout.CENTER); // farbiiig cyan
		

		// Add to mainFrame
		this.add(menuPanel, BorderLayout.NORTH);
		this.add(mainPanel, BorderLayout.CENTER);
		this.add(platzhalter, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		GUI frame = new GUI("Vokabeltrainer");
		frame.setVisible(true);
	}
}