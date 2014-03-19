package ch.gcv.vokabeltrainer.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import ch.gcv.vokabeltrainer.interfaces.CardChallengePresenter;
import ch.gcv.vokabeltrainer.interfaces.CardChallengeView;
import ch.gcv.vokabeltrainer.interfaces.Translatable;
import ch.gcv.vokabeltrainer.model.TranslationManager;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardChallengeViewImpl extends javax.swing.JFrame implements
		CardChallengeView, Translatable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CardChallengePresenter presenter;
	private JTextPane topicname;
	private JTextPane boxnumber;
	private JTextPane boxname;
	private JLabel lastTime;
	private JLabel curTime;
	private JLabel question;
	private JLabel answer;
	private JLabel questionWord;
	private JTextField answerField;
	private Timer timer;

	public CardChallengeViewImpl() {
		super("CardChallengeView");
		this.initComponents();
	}

	/**
	 * initComponents
	 * 
	 */
	private void initComponents() {

		// JFrame defination
		Color backgroundColor = new Color(255, 248, 168);
		this.getContentPane().setBackground(backgroundColor);
		super.setBackground(backgroundColor);
		super.setResizable(false);
		super.setSize(800, 400);
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
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
			}

		});

		this.lastTime = new JLabel("lastTime");
		this.curTime = new JLabel("curTime");

		this.question = new JLabel();
		this.questionWord = new JLabel();
		this.answer = new JLabel();

		this.topicname = new JTextPane();
		this.boxnumber = new JTextPane();
		this.boxname = new JTextPane();

		// lastTimelabel
		lastTime.setVisible(true);
		lastTime.setFont(question.getFont().deriveFont(15f));
		lastTime.setBounds(650, 20, 100, 20);
		lastTime.setBackground(backgroundColor);

		// curTimeLabel
		curTime.setVisible(true);
		curTime.setFont(question.getFont().deriveFont(20f));
		curTime.setBounds(650, 40, 100, 20);
		curTime.setBackground(backgroundColor);

		// questionlabel
		question.setVisible(true);
		question.setFont(question.getFont().deriveFont(20f));
		question.setBounds(15, 150, 150, 50);
		question.setBackground(backgroundColor);

		// question word
		questionWord.setVisible(true);
		questionWord.setFont(questionWord.getFont().deriveFont(20f));
		questionWord.setBounds(170, 150, 575, 50);
		questionWord.setBackground(backgroundColor);

		// answerlabel
		answer.setVisible(true);
		answer.setFont(answer.getFont().deriveFont(20f));
		answer.setBounds(15, 250, 150, 50);
		answer.setBackground(backgroundColor);

		// textfiel
		answerField.setEditable(true);
		answerField.setVisible(true);
		answerField.setFont(answerField.getFont().deriveFont(20f));
		answerField.setBounds(170, 250, 575, 50);
		answerField.setBackground(Color.WHITE);

		topicname.setEditable(false);
		SimpleAttributeSet set1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(set1, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set1, "Times New Roman");
		StyleConstants.setFontSize(set1, 30);
		StyleConstants.setItalic(set1, true);
		StyleConstants.setBold(set1, true);
		topicname.setParagraphAttributes(set1, true);
		topicname.setBackground(backgroundColor);
		topicname.setBounds(20, 20, 500, 40);

		boxnumber.setEditable(false);
		SimpleAttributeSet set2 = new SimpleAttributeSet();
		StyleConstants.setAlignment(set2, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set2, "Times New Roman");
		StyleConstants.setFontSize(set2, 23);
		StyleConstants.setItalic(set2, true);
		StyleConstants.setBold(set2, true);
		boxnumber.setParagraphAttributes(set2, true);
		boxnumber.setBackground(backgroundColor);
		boxnumber.setBounds(95, 75, 30, 40);

		boxname.setEditable(false);
		SimpleAttributeSet set3 = new SimpleAttributeSet();
		StyleConstants.setAlignment(set3, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set3, "Times New Roman");
		StyleConstants.setFontSize(set3, 23);
		StyleConstants.setItalic(set3, true);
		StyleConstants.setBold(set3, true);
		boxname.setParagraphAttributes(set3, true);
		boxname.setBackground(backgroundColor);
		boxname.setBounds(20, 75, 75, 40);

		super.add(lastTime);
		super.add(curTime);
		super.add(topicname);
		super.add(boxnumber);
		super.add(boxname);
		super.add(question);
		super.add(questionWord);
		super.add(answer);
		super.add(answerField);

		// timer
		this.timer = new Timer(1, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				long actTime = new Date().getTime();
				long delta = actTime - presenter.getCardShown();
				curTime.setText(Long.toString(delta) + " ms");
			}
		});

	}

	/**
	 * getPresenter implements ICardView.getPresenter
	 * 
<<<<<<< HEAD
	 * @return ICardPresenter 
=======
	 * @return ICardPresenter a presenter
>>>>>>> FETCH_HEAD
	 */
	@Override
	public CardChallengePresenter getPresenter() {
		return this.presenter;
	}

	/**
	 * setPresenter implements ICardView.setPresenter
	 * 
	 * @param presenter
<<<<<<< HEAD
	 * 
=======
	 *            needs a CardChallengePresenter
>>>>>>> FETCH_HEAD
	 */
	@Override
	public void setPresenter(CardChallengePresenter presenter) {
		this.presenter = presenter;
	}

	/**
	 * updateModelFromView implements ICardView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {
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
		
		this.lastTime.setText(Long.toString(this.presenter.getModel()
				.getSpentTime()) + " ms");
		this.curTime.setText(0 + " ms");

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

		this.answerField.setEditable(false);
		new Timer(1000, new ActionListener() {
			int count = 3;

			@Override
			public void actionPerformed(ActionEvent evt) {
				answerField.setText("Ready in: " + Integer.toString(count));
				if (count <= -1) {
					((Timer) evt.getSource()).stop();
					presenter.nextCard();
					answerField.setText("");
					answerField.setEditable(true);
					answerField.requestFocus();
					timer.start();
				}
				count -= 1;
			}
		}).start();

	}

	/**
	 * close implements ICardView.close
	 * 
	 */
	@Override
	public void close() {
		TranslationManager.getinstance().removeListener(this);
		dispose();
	}

	/**
	 * answerWrong implements ICardView.answerWrong
	 * 
	 */
	@Override
	public void answerWrong() {
		answerField.setEditable(false);
		answerField.setBackground(Color.RED);
		resetBackground();
	}

	/**
	 * answerRight implements ICardView.answerRight
	 * 
	 */
	@Override
	public void answerRightFast() {
		answerField.setEditable(false);
		answerField.setBackground(Color.GREEN);
		this.resetBackground();
	}

	/**
	 * answerRight implements ICardView.answerRight
	 * 
	 */
	@Override
	public void answerRightSlow() {
		answerField.setEditable(false);
		answerField.setBackground(Color.ORANGE);
		this.resetBackground();
	}

	/**
	 * This method reset Background
	 */
	private void resetBackground() {
		new Timer(500, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				((Timer) evt.getSource()).stop();
				answerField.setEditable(true);
				answerField.setBackground(Color.WHITE);
				answerField.setText("");
				presenter.nextCard();
			}
		}).start();
	}

	/**
	 * languageChanged implements ILanguageChangedListener.languageChanged
	 * 
	 */
	@Override
	public void translate() {
		this.setTitle(TranslationManager.getinstance().getText("card"));
		this.question.setText(TranslationManager.getinstance().getText(
				"question"));
		this.answer.setText(TranslationManager.getinstance().getText("answer"));
		this.boxname.setText(TranslationManager.getinstance()
				.getText("boxname"));

<<<<<<< HEAD
=======
		// this.lastLearn.setText(TranslationManager.getinstance().getText(
		// "lastLearn"));
	}

	/**
	 * This method check the answerField text and stop the timer.
	 * 
	 * @param evt
	 *            needs a action event.
	 */

	private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {
		timer.stop();
		getPresenter().checkAnswer(this.answerField.getText());
>>>>>>> FETCH_HEAD
	}

	/**
	 * This method implements the Enter key as a button.
	 * 
	 * @param e
	 *            needs a key event.
	 */

	private void jTextFieldCheckKeyPerformed(java.awt.event.KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			timer.stop();
			getPresenter().checkAnswer(this.answerField.getText());
		}
	}

	/**
	 * This method open the updateViewFromModel() and the timer.start()
	 */

	@Override
	public void cardChanged() {
		updateViewFromModel();
		timer.start();
	}

}
