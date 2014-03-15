package ch.gcv.vokabeltrainer.view;

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

import ch.gcv.vokabeltrainer.model.ITranslatable;
import ch.gcv.vokabeltrainer.model.TranslationManager;
import ch.gcv.vokabeltrainer.presenter.ICardPresenter;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardView extends javax.swing.JFrame implements ICardView, ITranslatable {

	private ICardPresenter presenter;


	private JTextPane topicname;
	private JTextPane boxnumber;

	private JButton plus;
	private JButton next;
	private JButton check;

	private JLabel question;
	private JLabel answer;
	private JLabel questionWord;
	private JLabel lastLearn;
	private JLabel date;

	private JTextField answerField;

	private JPanel cardPanel;

	public CardView() {
		super();
		this.presenter = null; // TODO
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * initComponents
	 * 
	 */
	private void initComponents() {

		// JFrame defination
		super.setBackground(Color.WHITE);
		super.setResizable(false);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(800, 500);
		super.setVisible(true);
		super.setLayout(null);

		
		this.answerField = new JTextField();  //CHF
		
		this.cardPanel = new JPanel();

		this.plus = new JButton(new ImageIcon(getClass()
				.getResource("plus.png")));
		this.check = new JButton(new ImageIcon(getClass().getResource(
				"check.png")));
		this.next = new JButton(new ImageIcon(getClass()
				.getResource("next.png")));

		this.question = new JLabel();
		this.questionWord = new JLabel();
		this.answer = new JLabel();
		this.lastLearn = new JLabel();
		this.date = new JLabel();
		
		this.topicname = new JTextPane();
		this.boxnumber = new JTextPane();

		

		cardPanel.setBackground(Color.LIGHT_GRAY);
		cardPanel.setBounds(25, 120, 750, 300);
		cardPanel.setVisible(true);
		cardPanel.setLayout(null);

		// questionlabel
		question.setVisible(true);
		question.setFont(question.getFont().deriveFont(20f));
		question.setBounds(15, 15, 150, 50);
		question.setBackground(Color.LIGHT_GRAY);  			 
	

		// question word
		questionWord.setVisible(true);
		questionWord.setEnabled(false);
		questionWord.setFont(questionWord.getFont().deriveFont(20f));
		questionWord.setBounds(170, 15, 575, 50);
		questionWord.setBackground(Color.LIGHT_GRAY); 	
		

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

		// lastlearn label
		lastLearn.setVisible(true);
		lastLearn.setFont(lastLearn.getFont().deriveFont(10));
		lastLearn.setBounds(500, 270, 150, 20);
		lastLearn.setBackground(Color.LIGHT_GRAY);

		// date label
		date.setVisible(true);
		date.setFont(date.getFont().deriveFont(10));
		date.setBounds(650, 270, 80, 20);
		date.setBackground(Color.LIGHT_GRAY);
		
		// buttons
		plus.setBounds(20, 10, 51, 50);
		next.setBounds(175, 188, 145, 48);
		check.setBounds(475, 185, 53, 53);
		
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

	/**
	 * getPresenter implements ICardView.getPresenter
	 * 
	 * @return ICardPresenter // TODO
	 */
	@Override
	public ICardPresenter getPresenter() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setPresenter implements ICardView.setPresenter
	 * 
	 * @param presenter
	 *            // TODO
	 * 
	 */
	@Override
	public void setPresenter(ICardPresenter presenter) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * updateModelFromView implements ICardView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * updateViewFromModel implements ICardView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * open implements ICardView.open
	 * 
	 */
	@Override
	public void open() {
		TranslationManager.getinstance().addListener(this);
		translate();
		setVisible(true);
	}

	/**
	 * close implements ICardView.close
	 * 
	 */
	@Override
	public void close() {
	
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * answerWrong implements ICardView.answerWrong
	 * 
	 */
	@Override
	public void answerWrong() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * answerRight implements ICardView.answerRight
	 * 
	 */
	@Override
	public void answerRight() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}
	
	/**
	 * languageChanged implements ILanguageChangedListener.languageChanged
	 * 
	 */
	@Override
	public void translate() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	
}
