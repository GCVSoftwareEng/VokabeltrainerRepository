package ch.gcv.vokabeltrainer.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EinfacherRechnerV2 extends JFrame {

	JTextField display = new JTextField();
	JTextField firstNumberField = new JTextField();
	JTextField secondNumberField = new JTextField();
	JTextField placeholder1 = new JTextField();
	JTextField placeholder2 = new JTextField();
	// button
	JButton start = new JButton();
			//new ImageIcon(getClass()
			//.getResource("play.jpg")));
	// panels
	JPanel displayPanel = new JPanel();
	JPanel radioPanel = new JPanel();
	JPanel textField1 = new JPanel();
	JPanel textField2 = new JPanel();
	JPanel button = new JPanel();
	// radiobutton
	JRadioButton add = new JRadioButton("add");
	JRadioButton sub = new JRadioButton("sub");
	JRadioButton mul = new JRadioButton("mul");
	JRadioButton div = new JRadioButton("div");

	// group
	ButtonGroup group = new ButtonGroup();

	public EinfacherRechnerV2() {
		super("Einfacher Rechner");
		guiInitalisation();
	}

	public void guiInitalisation() {
		super.setBackground(Color.white);
		super.setResizable(false);
		// Exit Application while pressing close-Box
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// build group
		group.add(add);
		group.add(sub);
		group.add(mul);
		group.add(div);

		// placeholder
		placeholder1.setVisible(false);
		placeholder2.setVisible(false);

		// setLayout
		displayPanel.setLayout(new GridLayout(1, 0));
		textField1.setLayout(new GridLayout(1, 0));
		textField2.setLayout(new GridLayout(1, 0));
		button.setLayout(new GridLayout(1, 0));
		radioPanel.setLayout(new GridLayout(1, 6));
		super.setLayout(new GridLayout(5, 0));

		// set specification
		display.setBackground(Color.green);
		display.setDisabledTextColor(Color.blue);
		display.setEditable(false);
		button.setBackground(Color.white);

		// add to panels
		textField1.add(firstNumberField);
		textField2.add(secondNumberField);
		displayPanel.add(display);
		button.add(start);
		radioPanel.add(placeholder1);
		radioPanel.add(add);
		radioPanel.add(sub);
		radioPanel.add(mul);
		radioPanel.add(div);
		radioPanel.add(placeholder2);

		// add to mainframe
		super.add(displayPanel);
		super.add(radioPanel);
		super.add(textField1);
		super.add(textField2);
		super.add(button);
		super.setSize(400, 250);
		super.setVisible(true);

		add.setSelected(true);

		start.addActionListener(new MyButtonListener());
		firstNumberField.addActionListener(new MyButtonListener());
		secondNumberField.addActionListener(new MyButtonListener());
		add.addActionListener(new MyButtonListener());
		sub.addActionListener(new MyButtonListener());
		mul.addActionListener(new MyButtonListener());
		div.addActionListener(new MyButtonListener());

	}

	class MyButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == start) {
				if (add.isSelected() == true) {
					int result = Integer.parseInt(firstNumberField.getText())
							+ Integer.parseInt(secondNumberField.getText());
					String result1 = String.valueOf(result);
					display.setText(result1);
				} else if (sub.isSelected() == true) {
					int result2 = Integer.parseInt(firstNumberField.getText())
							- Integer.parseInt(secondNumberField.getText());
					String result3 = String.valueOf(result2);
					display.setText(result3);
				}
			}
		}
	}

	public static void main(String args[]) {
		EinfacherRechnerV2 rechner = new EinfacherRechnerV2();
		// rechner.giuInitialisation();
	}
}
