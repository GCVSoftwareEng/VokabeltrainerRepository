package ch.gcv.vokabeltrainer.gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;


public class BoxLayout extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	
	public void BoxLayout(){
		
		super.setTitle("hallo");
		gui();
		
	}
	
	public void gui(){
		
		super.setBackground(Color.white);
		super.setSize(300, 300);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		super.getContentPane().setLayout(new BorderLayout(5,5));;
		
//		super.add(b1);
//		super.add(b2);
//		super.add(b3);
//		super.add(b4);
		
		super.setVisible(true);
		
	}
	
	public static void main(String args[]) {
		BoxLayout test = new BoxLayout();
		test.gui();
	}
	
}
	

