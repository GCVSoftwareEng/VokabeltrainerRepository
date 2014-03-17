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

import ch.gcv.vokabeltrainer.model.ITranslatable;
import ch.gcv.vokabeltrainer.model.TranslationManager;
import ch.gcv.vokabeltrainer.presenter.ICardCreatePresenter;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardEditView extends javax.swing.JFrame implements ICardEditView, ITranslatable {

	private ICardCreatePresenter presenter;

	private JTextPane topicname;
	private JTextPane boxnumber;
	private JTextPane boxname;

	private JButton addCard;
	

	private JLabel question;
	private JLabel answer;

	private JTextField answerField;
	private JTextField questionWord;

	
	public CardEditView() {
		super("CardEditView");
		initComponents();		
	}

	/**
	 * initComponents
	 * 
	 */
	private void initComponents() {

		this.addCard = new JButton(new ImageIcon(getClass().getResource(
				"plus.png")));
		this.addCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButtonAddCardActionPerformed(evt);
            }
        });
		
		
		
		this.topicname = new JTextPane();
		this.boxnumber = new JTextPane();
		this.boxname = new JTextPane();
		this.question = new JLabel();
		this.answer = new JLabel();
		this.questionWord = new JTextField();
		this.answerField = new JTextField();
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

		// JFrame defination
		super.setBackground(Color.WHITE);
		super.setResizable(false);
		super.setSize(800, 380);
		super.setVisible(true);
		super.setLayout(null);


		// questionlabel
		question.setVisible(true);
		question.setFont(question.getFont().deriveFont(20f));
		question.setBounds(15, 150, 150, 50);
		question.setOpaque(true);

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

		questionWord.setEditable(true);
		questionWord.setVisible(true);
		questionWord.setFont(questionWord.getFont().deriveFont(20f));
		questionWord.setBounds(170, 150, 575, 50);

		
		addCard.setBounds(755, 260, 31, 30);
		

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
		boxnumber.setText("1");
		
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
		super.add(addCard);

	}

	/**
	 * getPresenter implements ICardEditView.getPresenter
	 * 
	 * @return ICardEditPresenter // TODO
	 */
	@Override
	public ICardCreatePresenter getPresenter() {
		return this.presenter;
	}

	/**
	 * setPresenter implements ICardEditView.setPresenter
	 * 
	 * @param presenter
	 *            // TODO
	 * 
	 */
	@Override
	public void setPresenter(ICardCreatePresenter presenter) {
		this.presenter = presenter;
	}

	/**
	 * updateModelFromView implements ICardEditView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {
		this.presenter.getModel().setQuestion(this.questionWord.getText());
		this.presenter.getModel().setAnswer(this.answerField.getText());
	}

	/**
	 * updateViewFromModel implements ICardEditView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {
		 this.topicname.setText(this.presenter.getModel().getTopic().getName());
		 this.questionWord.setText(this.presenter.getModel().getQuestion());
		 this.answerField.setText(this.presenter.getModel().getAnswer());
	}

	/**
	 * open implements ICardEditView.open
	 * 
	 */
	@Override
	public void open() {
		TranslationManager.getinstance().addListener(this);
		translate();
		setVisible(true);
	}

	/**
	 * close implements ICardEditView.close
	 * 
	 */
	@Override
	public void close() {
		TranslationManager.getinstance().removeListener(this);
		dispose();
	}
	

    /** 
     * languageChanged implements ILanguageChangedListener.languageChanged
	 *
	 */
	@Override
	public void translate() {
		// TODO should be implemented
		this.question.setText(TranslationManager.getinstance().getText(
				"question"));
		this.answer.setText(TranslationManager.getinstance().getText(
				"answer"));
		this.boxname.setText(TranslationManager.getinstance().getText("boxname"));
    }
	
	private void jButtonAddCardActionPerformed(java.awt.event.ActionEvent evt) {
        this.updateModelFromView();
        this.presenter.confirm();
        this.close();
        
    }
	private void jTextFieldCheckKeyPerformed(java.awt.event.KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			this.updateModelFromView();
	        this.presenter.confirm();
	        this.close();
		}
	}

}
