package ch.gcv.vokabeltrainer.model;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardEditView extends javax.swing.JFrame implements ICardEditView {

	private ICardEditPresenter presenter;

	// menubar and menus
	private JMenuBar menuBar;
	private JMenu file;
	private JMenu language;
	private JMenuItem newPro;
	private JMenuItem loadPro;
	private JMenuItem newtopicname;
	private JMenuItem addCard;
	private JMenuItem editCard;
	private JMenuItem removeCard;
	private JMenuItem exit;
	private JMenuItem german;
	private JMenuItem english;
	private JMenuItem italian;
	private JMenuItem french;

	private JTextPane topicname;
	private JTextPane boxnumber;

	private JButton back;
	private JButton delete;
	private JButton check;

	private JLabel question;
	private JLabel answer;

	private JTextField answerField;
	private JTextField questionWord;

	JPanel cardPanel;

	public CardEditView() {
		super();
		this.presenter = null; // TODO
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * initComponents
	 * 
	 */
	private void initComponents() {

		this.menuBar = new JMenuBar();
		this.file = new JMenu("File");
		this.language = new JMenu("Language", true);
		this.newPro = new JMenuItem("New Profile");
		this.loadPro = new JMenuItem("Load Profile");
		this.addCard = new JMenuItem("Add Card");
		this.editCard = new JMenuItem("Edit Card");
		this.removeCard = new JMenuItem("Remove Card");
		this.exit = new JMenuItem("Exit");
		this.back = new JButton(new ImageIcon(getClass()
				.getResource("plus.png")));
		this.check = new JButton(new ImageIcon(getClass().getResource(
				"check.png")));
		this.delete = new JButton(new ImageIcon(getClass().getResource(
				"delete.png")));
		this.topicname = new JTextPane();
		this.boxnumber = new JTextPane();
		this.question = new JLabel();
		this.answer = new JLabel();
		this.questionWord = new JTextField();
		this.answerField = new JTextField();
		this.cardPanel = new JPanel();

		// JFrame defination
		super.setBackground(Color.WHITE);
		super.setResizable(false);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(800, 500);
		super.setVisible(true);
		super.setLayout(null);

		// build menubar
		menuBar.add(file);
		menuBar.add(language);
		file.add(newPro);
		file.add(loadPro);
		file.add(addCard);
		file.add(editCard);
		file.add(removeCard);
		file.add(exit);
		menuBar.setBackground(Color.LIGHT_GRAY);

		cardPanel.setBackground(Color.WHITE);
		cardPanel.setBounds(25, 120, 750, 300);
		cardPanel.setVisible(true);
		cardPanel.setLayout(null);

		// questionlabel
		question.setVisible(true);
		question.setFont(question.getFont().deriveFont(20f));
		question.setBounds(15, 15, 150, 50);
		question.setBackground(Color.LIGHT_GRAY);

		// answerlabel
		answer.setVisible(true);
		answer.setFont(answer.getFont().deriveFont(20f));
		answer.setBounds(15, 100, 150, 50);
		answer.setBackground(Color.LIGHT_GRAY);

		// textfiel
		answerField.setEditable(true);
		answerField.setVisible(true);
		answerField.setFont(answerField.getFont().deriveFont(20f));
		answerField.setBounds(170, 100, 575, 50);

		questionWord.setEditable(true);
		questionWord.setVisible(true);
		questionWord.setFont(questionWord.getFont().deriveFont(20f));
		questionWord.setBounds(170, 15, 575, 50);

		back.setBounds(20, 10, 51, 50);
		check.setBounds(475, 220, 53, 53);
		delete.setBounds(275, 220, 53, 53);

		topicname.setEditable(false);
		SimpleAttributeSet set1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(set1, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set1, "Times New Roman");
		StyleConstants.setFontSize(set1, 30);
		StyleConstants.setItalic(set1, true);
		StyleConstants.setBold(set1, true);
		topicname.setParagraphAttributes(set1, true);
		topicname.setBackground(Color.WHITE);
		topicname.setBounds(90, 20, 500, 40);
		topicname.setText("Topicname");

		boxnumber.setEditable(false);
		SimpleAttributeSet set2 = new SimpleAttributeSet();
		StyleConstants.setAlignment(set2, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set2, "Times New Roman");
		StyleConstants.setFontSize(set2, 23);
		StyleConstants.setItalic(set2, true);
		StyleConstants.setBold(set2, true);
		boxnumber.setParagraphAttributes(set2, true);
		boxnumber.setBackground(Color.WHITE);
		boxnumber.setBounds(90, 75, 200, 40);
		boxnumber.setText("Box: 1");

		super.setJMenuBar(menuBar);
		super.add(back);
		super.add(topicname);
		super.add(boxnumber);
		super.add(cardPanel);
		cardPanel.add(question);
		cardPanel.add(questionWord);
		cardPanel.add(answer);
		cardPanel.add(answerField);
		cardPanel.add(check);
		cardPanel.add(delete);

	}

	/**
	 * getPresenter implements ICardEditView.getPresenter
	 * 
	 * @return ICardEditPresenter // TODO
	 */
	@Override
	public ICardEditPresenter getPresenter() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setPresenter implements ICardEditView.setPresenter
	 * 
	 * @param presenter
	 *            // TODO
	 * 
	 */
	@Override
	public void setPresenter(ICardEditPresenter presenter) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * updateModelFromView implements ICardEditView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * updateViewFromModel implements ICardEditView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * open implements ICardEditView.open
	 * 
	 */
	@Override
	public void open() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * close implements ICardEditView.close
	 * 
	 */
	@Override
	public void close() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

}
