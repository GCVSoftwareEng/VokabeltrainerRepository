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

	private JButton addCard;

	private JLabel question;
	private JLabel answer;

	private JTextField answerField;
	private JTextField questionWord;

	JPanel cardPanel;

	public CardEditView() {
		super("CardEditView");
		initComponents();
		updateModelFromView();
		
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
		this.question = new JLabel();
		this.answer = new JLabel();
		this.questionWord = new JTextField();
		this.answerField = new JTextField();
		this.cardPanel = new JPanel();

		// JFrame defination
		super.setBackground(Color.WHITE);
		super.setResizable(false);
		super.setSize(800, 450);
		super.setVisible(true);
		super.setLayout(null);


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

		
		addCard.setBounds(375, 220, 53, 53);

		topicname.setEditable(false);
		SimpleAttributeSet set1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(set1, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set1, "Times New Roman");
		StyleConstants.setFontSize(set1, 30);
		StyleConstants.setItalic(set1, true);
		StyleConstants.setBold(set1, true);
		topicname.setParagraphAttributes(set1, true);
		topicname.setBackground(Color.WHITE);
		topicname.setBounds(20, 20, 500, 40);
		

		boxnumber.setEditable(false);
		SimpleAttributeSet set2 = new SimpleAttributeSet();
		StyleConstants.setAlignment(set2, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set2, "Times New Roman");
		StyleConstants.setFontSize(set2, 23);
		StyleConstants.setItalic(set2, true);
		StyleConstants.setBold(set2, true);
		boxnumber.setParagraphAttributes(set2, true);
		boxnumber.setBackground(Color.WHITE);
		boxnumber.setBounds(20, 75, 200, 40);
		boxnumber.setText("Box: 1");

		super.add(topicname);
		super.add(boxnumber);
		super.add(cardPanel);
		cardPanel.add(question);
		cardPanel.add(questionWord);
		cardPanel.add(answer);
		cardPanel.add(answerField);
		cardPanel.add(addCard);

	}

	/**
	 * getPresenter implements ICardEditView.getPresenter
	 * 
	 * @return ICardEditPresenter // TODO
	 */
	@Override
	public ICardCreatePresenter getPresenter() {
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
	public void setPresenter(ICardCreatePresenter presenter) {
		this.presenter = presenter;
	}

	/**
	 * updateModelFromView implements ICardEditView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {
//		this.presenter.getModel().setName(this.topicname.getText());
//		this.topicname.setText(this.presenter.getModel().getTopic().getName());
		topicname.setText("schwul");
	}

	/**
	 * updateViewFromModel implements ICardEditView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {
		// TODO should be implemented
		// TODO question.setText(text);
		// TODO answer.setText(text);
	}

	/**
	 * open implements ICardEditView.open
	 * 
	 */
	@Override
	public void open() {
		TranslationManager.getinstance().addListener(this);
		//translate();
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
		//throw new UnsupportedOperationException("Not implemented");
    }
	
	private void jButtonAddCardActionPerformed(java.awt.event.ActionEvent evt) {
        this.updateModelFromView();
        this.presenter.confirm();
        this.close();
    }

}
