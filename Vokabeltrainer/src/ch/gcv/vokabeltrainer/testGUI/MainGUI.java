package ch.gcv.vokabeltrainer.testGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainGUI extends JFrame {
	
	JPanel center, north, east, south, west;
	JTextField display = new JTextField(30);

	public MainGUI(String title) {
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 400);
		display.setFont(new Font("Arial", Font.BOLD, 24));
		center = new JPanel();
		center.setBackground(Color.white);
		center.add(display);
		north = new JPanel();
		north.setBackground(Color.blue);
		// create Button
		JButton temp;
		north.add(temp = new JButton("I'm a Button"));
		// create ComboBox
		JComboBox boxTemp;
		String[] comboItems = { "first", "second", "third" };
		north.add(boxTemp = new JComboBox(comboItems));
		boxTemp.setActionCommand("Aufzaehlen");
		// create TextField
		JTextField textfieldTemp;
		north.add(textfieldTemp = new JTextField(10));
		south = new JPanel();
		south.setBackground(Color.red);
		east = new JPanel();
		east.setBackground(Color.yellow);
		east.add(temp = new JButton("eins"));
		east.add(temp = new JButton("zwei"));
		east.add(temp = new JButton("drei"));
		east.setPreferredSize(new Dimension(75, east.getPreferredSize().height));
		east.setBorder(BorderFactory.createTitledBorder("Zahlen"));
		west = new JPanel();
		west.setBackground(Color.pink);
		this.getContentPane().add(center, BorderLayout.CENTER);
		this.getContentPane().add(north, BorderLayout.NORTH);
		this.getContentPane().add(south, BorderLayout.SOUTH);
		this.getContentPane().add(west, BorderLayout.WEST);
		this.getContentPane().add(east, BorderLayout.EAST);
	}

	public static void main(String[] args) {
		MainGUI mf = new MainGUI("Wiederholung");
		mf.setVisible(true);
	}
}