package ch.gcv.vokabeltrainer.view;

import java.awt.Color;
import java.awt.event.KeyEvent;

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

import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.model.Translatable;
import ch.gcv.vokabeltrainer.model.Topic;
import ch.gcv.vokabeltrainer.model.TranslationManager;
import ch.gcv.vokabeltrainer.presenter.ICardPresenter;
import ch.gcv.vokabeltrainer.presenter.ITopicPresenter;
import ch.gcv.vokabeltrainer.presenter.TopicPresenter;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardView extends javax.swing.JFrame implements ICardView,
		Translatable {

	private ICardPresenter presenter;

	private JTextPane topicname;
	private JTextPane boxnumber;
	private JTextPane boxname;
	private JButton next;
	private JButton check;

	private JLabel question;
	private JLabel answer;
	private JLabel questionWord;
	private JLabel lastLearn;
	private JLabel date;

	private JTextField answerField;

	// private JPanel cardPanel;

	public CardView() {
		super("CardView");
		this.initComponents();
	}

	/**
	 * initComponents
	 * 
	 */
	private void initComponents() {

		// JFrame defination
		super.setBackground(Color.WHITE);
		super.setResizable(false);
		super.setSize(800, 500);
		super.setVisible(true);
		super.setLayout(null);

		this.answerField = new JTextField(); // CHF
		this.answerField.addKeyListener(new java.awt.event.KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				jTextFieldCheckKeyPerformed(e);
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		// this.cardPanel = new JPanel();

		this.check = new JButton(new ImageIcon(getClass().getResource(
				"check.png")));

		this.check.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCheckActionPerformed(evt);
			}
		});

		this.next = new JButton(new ImageIcon(getClass()
				.getResource("next.png")));
		this.next.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonNextActionPerformed(evt);
			}
		});

		this.question = new JLabel();
		this.questionWord = new JLabel();
		this.answer = new JLabel();
		this.lastLearn = new JLabel();
		this.date = new JLabel();

		this.topicname = new JTextPane();
		this.boxnumber = new JTextPane();
		this.boxname = new JTextPane();

		// cardPanel.setBackground(Color.LIGHT_GRAY);
		// cardPanel.setBounds(25, 120, 750, 300);
		// cardPanel.setVisible(true);
		// cardPanel.setLayout(null);

		// questionlabel
		question.setVisible(true);
		question.setFont(question.getFont().deriveFont(20f));
		question.setBounds(15, 150, 150, 50);
		question.setOpaque(true);

		// question word
		questionWord.setVisible(true);
		questionWord.setEnabled(false);
		questionWord.setFont(questionWord.getFont().deriveFont(20f));
		questionWord.setBounds(170, 150, 575, 50);
		questionWord.setOpaque(true);

		// answerlabel
		answer.setVisible(true);
		answer.setFont(answer.getFont().deriveFont(20f));
		answer.setBounds(15, 250, 150, 50);
		answer.setOpaque(true);
		// textfiel
		answerField.setEditable(true);
		answerField.setVisible(true);
		answerField.setFont(answerField.getFont().deriveFont(20f));
		answerField.setBounds(170, 250, 575, 50);

		// lastlearn label
		lastLearn.setVisible(true);
		lastLearn.setFont(lastLearn.getFont().deriveFont(10));
		lastLearn.setBounds(550, 320, 150, 20);
		lastLearn.setOpaque(true);

		// date label
		date.setVisible(true);
		date.setFont(date.getFont().deriveFont(10));
		date.setBounds(710, 320, 80, 20);
		date.setOpaque(true);

		// buttons
		next.setBounds(175, 380, 145, 48);
		check.setBounds(475, 380, 53, 53);

		topicname.setEditable(false);
		SimpleAttributeSet set1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(set1, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set1, "Times New Roman");
		StyleConstants.setFontSize(set1, 30);
		StyleConstants.setItalic(set1, true);
		StyleConstants.setBold(set1, true);
		topicname.setParagraphAttributes(set1, true);
		topicname.setOpaque(true);
		topicname.setBounds(20, 20, 500, 40);

		boxnumber.setEditable(false);
		SimpleAttributeSet set2 = new SimpleAttributeSet();
		StyleConstants.setAlignment(set2, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set2, "Times New Roman");
		StyleConstants.setFontSize(set2, 23);
		StyleConstants.setItalic(set2, true);
		StyleConstants.setBold(set2, true);
		boxnumber.setParagraphAttributes(set2, true);
		boxnumber.setOpaque(true);
		boxnumber.setBounds(95, 75, 30, 40);

		boxname.setEditable(false);
		SimpleAttributeSet set3 = new SimpleAttributeSet();
		StyleConstants.setAlignment(set3, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set3, "Times New Roman");
		StyleConstants.setFontSize(set3, 23);
		StyleConstants.setItalic(set3, true);
		StyleConstants.setBold(set3, true);
		boxname.setParagraphAttributes(set3, true);
		boxname.setOpaque(true);
		boxname.setBounds(20, 75, 75, 40);

		super.add(topicname);
		super.add(boxnumber);
		super.add(boxname);
		super.add(question);
		super.add(questionWord);
		super.add(answer);
		super.add(answerField);
		super.add(next);
		super.add(check);
		super.add(lastLearn);
		super.add(date);

	}

	/**
	 * getPresenter implements ICardView.getPresenter
	 * 
	 * @return ICardPresenter // TODO
	 */
	@Override
	public ICardPresenter getPresenter() {
		return this.presenter;
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
		this.presenter = presenter;
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
		this.topicname.setText(this.presenter.getModel().getTopic().getName());
		this.boxnumber.setText(Integer.toString(this.presenter.getModel()
				.getBox()));
		this.questionWord.setText(this.presenter.getModel().getQuestion());
		
		long temp = this.presenter.getModel().getStatisticDateLastLerned();
		this.date.setText(Long.toString(this.presenter.getModel().getStatisticDateLastLerned()));
		
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
		super.setBackground(Color.RED);
		answerField.setEditable(false);
		topicname.setBackground(Color.RED);
		boxname.setBackground(Color.RED);
		boxnumber.setBackground(Color.RED);
		answerField.setBackground(Color.RED);
		this.resetBackground();
	}

	/**
	 * answerRight implements ICardView.answerRight
	 * 
	 */
	@Override
	public void answerRight() {
		super.setBackground(Color.GREEN);
		answerField.setEditable(false);
		topicname.setBackground(Color.GREEN);
		boxname.setBackground(Color.GREEN);
		boxnumber.setBackground(Color.GREEN);
		answerField.setBackground(Color.GREEN);
		this.resetBackground();
	}

	
	private void resetBackground(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.setBackground(Color.WHITE);
		answerField.setEditable(true);
		topicname.setBackground(Color.WHITE);
		boxname.setBackground(Color.WHITE);
		boxnumber.setBackground(Color.WHITE);
		answerField.setBackground(Color.WHITE);
		
		// Todo: temp
		this.answerField.setText("");
	}
	
	/**
	 * languageChanged implements ILanguageChangedListener.languageChanged
	 * 
	 */
	@Override
	public void translate() {
		this.question.setText(TranslationManager.getinstance().getText(
				"question"));
		this.answer
				.setText(TranslationManager.getinstance().getText("answer"));
		this.boxname.setText(TranslationManager.getinstance().getText("boxname"));
		
		this.lastLearn.setText(TranslationManager.getinstance().getText("lastLearn"));
	}

	private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().checkAnswer(this.answerField.getText());
	}

	private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {
		
		////////////////////////// next card iibaue
	}

	private void jTextFieldCheckKeyPerformed(java.awt.event.KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {

			getPresenter().checkAnswer(this.answerField.getText());
		}
	}

}
