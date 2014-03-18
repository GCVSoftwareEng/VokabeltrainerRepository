package ch.gcv.vokabeltrainer.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import ch.gcv.vokabeltrainer.interfaces.TopicPresenter;
import ch.gcv.vokabeltrainer.interfaces.TopicView;
import ch.gcv.vokabeltrainer.interfaces.Translatable;
import ch.gcv.vokabeltrainer.model.TranslationManager;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicViewImpl extends JFrame implements TopicView, Translatable {

	private TopicPresenter presenter;

	private JTextPane topicname;

	private JButton boxButton1;
	private JButton boxButton2;
	private JButton boxButton3;
	private JButton boxButton4;
	private JButton boxButton5;
	private JButton addCard;
	private JButton editBox;
	private JCheckBox beatTheClockCheckBox;

	private JLabel boxLabel1;
	private JLabel boxLabel2;
	private JLabel boxLabel3;
	private JLabel boxLabel4;
	private JLabel boxLabel5;

	private JLabel cardCount1;
	private JLabel cardCount2;
	private JLabel cardCount3;
	private JLabel cardCount4;
	private JLabel cardCount5;

	private JLabel cardnummber1;
	private JLabel cardnummber2;
	private JLabel cardnummber3;
	private JLabel cardnummber4;
	private JLabel cardnummber5;

	private String noCardsInBox;

	public TopicViewImpl() {
		super("TopicView");
		this.initComponents();
	}

	/**
	 * initComponents
	 * 
	 */
	private void initComponents() {

		// JFrame defination
		this.getContentPane().setBackground(Color.WHITE);
		super.setBackground(Color.WHITE);
		super.setResizable(false);

		super.setSize(500, 350);
		super.setVisible(true);
		super.setLayout(null);

		this.boxButton1 = new JButton(new ImageIcon(getClass().getResource(
				"box.png")));
		this.boxButton1.setActionCommand("1");
		this.boxButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBoxActionPerformed(evt);
			}
		});
		this.boxButton2 = new JButton(new ImageIcon(getClass().getResource(
				"box.png")));
		this.boxButton2.setActionCommand("2");
		this.boxButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBoxActionPerformed(evt);
			}
		});
		this.boxButton3 = new JButton(new ImageIcon(getClass().getResource(
				"box.png")));
		this.boxButton3.setActionCommand("3");
		this.boxButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBoxActionPerformed(evt);
			}
		});
		this.boxButton4 = new JButton(new ImageIcon(getClass().getResource(
				"box.png")));
		this.boxButton4.setActionCommand("4");
		this.boxButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBoxActionPerformed(evt);
			}
		});
		this.boxButton5 = new JButton(new ImageIcon(getClass().getResource(
				"box.png")));
		this.boxButton5.setActionCommand("5");
		this.boxButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBoxActionPerformed(evt);
			}
		});
		this.addCard = new JButton(new ImageIcon(getClass().getResource(
				"plus.png")));
		this.addCard.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCreateCardActionPerformed(evt);
			}
		});
		this.editBox = new JButton(new ImageIcon(getClass().getResource(
				"edit1.png")));

		this.beatTheClockCheckBox = new JCheckBox("challengeMode");

		this.topicname = new JTextPane();
		this.boxLabel1 = new JLabel("Box: 1");
		this.boxLabel2 = new JLabel("Box: 2");
		this.boxLabel3 = new JLabel("Box: 3");
		this.boxLabel4 = new JLabel("Box: 4");
		this.boxLabel5 = new JLabel("Box: 5");
		this.cardCount1 = new JLabel();
		this.cardCount2 = new JLabel();
		this.cardCount3 = new JLabel();
		this.cardCount4 = new JLabel();
		this.cardCount5 = new JLabel();
		this.cardnummber1 = new JLabel();
		this.cardnummber2 = new JLabel();
		this.cardnummber3 = new JLabel();
		this.cardnummber4 = new JLabel();
		this.cardnummber5 = new JLabel();

		this.noCardsInBox = new String();

		// button definition
		boxButton1.setBounds(25, 225, 70, 70);
		boxButton2.setBounds(120, 225, 70, 70);
		boxButton3.setBounds(215, 225, 70, 70);
		boxButton4.setBounds(310, 225, 70, 70);
		boxButton5.setBounds(405, 225, 70, 70);
		addCard.setBounds(425, 60, 31, 30);
		editBox.setBounds(460, 60, 30, 30);

		// layout definition
		boxLabel1.setVisible(true);
		boxLabel1.setFont(boxLabel1.getFont().deriveFont(20f));
		boxLabel1.setBounds(30, 150, 70, 20);
		boxLabel1.setBackground(Color.WHITE);

		boxLabel2.setVisible(true);
		boxLabel2.setFont(boxLabel2.getFont().deriveFont(20f));
		boxLabel2.setBounds(125, 150, 70, 20);
		boxLabel2.setBackground(Color.WHITE);

		boxLabel3.setVisible(true);
		boxLabel3.setFont(boxLabel3.getFont().deriveFont(20f));
		boxLabel3.setBounds(220, 150, 70, 20);
		boxLabel3.setBackground(Color.WHITE);

		boxLabel4.setVisible(true);
		boxLabel4.setFont(boxLabel4.getFont().deriveFont(20f));
		boxLabel4.setBounds(315, 150, 70, 20);
		boxLabel4.setBackground(Color.WHITE);

		boxLabel5.setVisible(true);
		boxLabel5.setFont(boxLabel5.getFont().deriveFont(20f));
		boxLabel5.setBounds(410, 150, 70, 20);
		boxLabel5.setBackground(Color.WHITE);

		cardCount1.setVisible(true);
		cardCount1.setFont(cardCount1.getFont().deriveFont(14));
		cardCount1.setBounds(30, 175, 70, 20);
		cardCount1.setBackground(Color.WHITE);

		cardCount2.setVisible(true);
		cardCount2.setFont(cardCount2.getFont().deriveFont(14));
		cardCount2.setBounds(125, 175, 70, 20);
		cardCount2.setBackground(Color.WHITE);

		cardCount3.setVisible(true);
		cardCount3.setFont(cardCount3.getFont().deriveFont(14));
		cardCount3.setBounds(220, 175, 70, 20);
		cardCount3.setBackground(Color.WHITE);

		cardCount4.setVisible(true);
		cardCount4.setFont(cardCount4.getFont().deriveFont(14));
		cardCount4.setBounds(315, 175, 70, 20);
		cardCount4.setBackground(Color.WHITE);

		cardCount5.setVisible(true);
		cardCount5.setFont(cardCount5.getFont().deriveFont(14));
		cardCount5.setBounds(410, 175, 70, 20);
		cardCount5.setBackground(Color.WHITE);

		cardnummber1.setVisible(true);
		cardnummber1.setFont(cardnummber1.getFont().deriveFont(14));
		cardnummber1.setBounds(45, 200, 70, 20);
		cardnummber1.setBackground(Color.WHITE);

		cardnummber2.setVisible(true);
		cardnummber2.setFont(cardnummber2.getFont().deriveFont(14));
		cardnummber2.setBounds(140, 200, 70, 20);
		cardnummber2.setBackground(Color.WHITE);

		cardnummber3.setVisible(true);
		cardnummber3.setFont(cardnummber3.getFont().deriveFont(14));
		cardnummber3.setBounds(235, 200, 70, 20);
		cardnummber3.setBackground(Color.WHITE);

		cardnummber4.setVisible(true);
		cardnummber4.setFont(cardnummber4.getFont().deriveFont(14));
		cardnummber4.setBounds(330, 200, 70, 20);
		cardnummber4.setBackground(Color.WHITE);

		cardnummber5.setVisible(true);
		cardnummber5.setFont(cardnummber5.getFont().deriveFont(14));
		cardnummber5.setBounds(425, 200, 70, 20);
		cardnummber5.setBackground(Color.WHITE);

		topicname.setEditable(false);
		SimpleAttributeSet set = new SimpleAttributeSet();
		StyleConstants.setAlignment(set, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set, "Times New Roman");
		StyleConstants.setFontSize(set, 35);
		StyleConstants.setItalic(set, true);
		StyleConstants.setBold(set, true);
		topicname.setParagraphAttributes(set, true);
		topicname.setBackground(Color.WHITE);
		topicname.setBounds(30, 50, 390, 50);
		topicname.setText("Topicname");

		// checkbox
		beatTheClockCheckBox.setBounds(0, 0, 200, 20);

		// add to JFrame
		super.add(topicname);
		super.add(addCard);
		super.add(boxButton1);
		super.add(boxButton2);
		super.add(boxButton3);
		super.add(boxButton4);
		super.add(boxButton5);
		super.add(boxLabel1);
		super.add(boxLabel2);
		super.add(boxLabel3);
		super.add(boxLabel4);
		super.add(boxLabel5);
		super.add(cardCount1);
		super.add(cardCount2);
		super.add(cardCount3);
		super.add(cardCount4);
		super.add(cardCount5);
		super.add(cardnummber1);
		super.add(cardnummber2);
		super.add(cardnummber3);
		super.add(cardnummber4);
		super.add(cardnummber5);
		super.add(editBox);
		super.add(beatTheClockCheckBox);

	}

	/**
	 * getPresenter implements ITopicView.getPresenter
	 * 
	 * @return ITopicPresenter // TODO
	 */
	@Override
	public TopicPresenter getPresenter() {

		return this.presenter;

	}

	/**
	 * setPresenter implements ITopicView.setPresenter
	 * 
	 * @param presenter
	 *            // TODO
	 * 
	 */
	@Override
	public void setPresenter(TopicPresenter presenter) {

		this.presenter = presenter;

	}

	/**
	 * updateModelFromView implements ITopicView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * updateViewFromModel implements ITopicView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {

		topicname.setText(presenter.getModel().getName());
		cardnummber1.setText(Integer.toString(presenter.getModel().getCardCount(1)));
		cardnummber2.setText(Integer.toString(presenter.getModel().getCardCount(2)));
		cardnummber3.setText(Integer.toString(presenter.getModel().getCardCount(3)));
		cardnummber4.setText(Integer.toString(presenter.getModel().getCardCount(4)));
		cardnummber5.setText(Integer.toString(presenter.getModel().getCardCount(5)));
	
	}

	/**
	 * open implements ITopicView.open
	 * 
	 */
	@Override
	public void open() {
		TranslationManager.getinstance().addListener(this);
		setVisible(true);
		translate();
	}

	/**
	 * close implements ITopicView.close
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
		this.cardCount1.setText(TranslationManager.getinstance().getText(
				"cards"));
		this.cardCount2.setText(TranslationManager.getinstance().getText(
				"cards"));
		this.cardCount3.setText(TranslationManager.getinstance().getText(
				"cards"));
		this.cardCount4.setText(TranslationManager.getinstance().getText(
				"cards"));
		this.cardCount5.setText(TranslationManager.getinstance().getText(
				"cards"));

		this.beatTheClockCheckBox.setText(TranslationManager.getinstance()
				.getText("beatTheClock"));

		this.noCardsInBox = TranslationManager.getinstance().getText(
				"noCardsInBox");
	}

	/**
	 * 
	 * @param evt
	 */
	private void jButtonBoxActionPerformed(java.awt.event.ActionEvent evt) {
		int box = Integer.parseInt(evt.getActionCommand());

		if (presenter.getModel().getCardCount(box) == 0) {
			JOptionPane.showMessageDialog(null, noCardsInBox);
		} else {
			if (beatTheClockCheckBox.isSelected()) {
				getPresenter().startChallenge(presenter.getModel().getRandomCard(box));
			} else {
				getPresenter()
						.openCard(presenter.getModel().getRandomCard(box));
			}

		}
	}

	/**
	 * 
	 * @param evt
	 */
	private void jButtonCreateCardActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().createCard();
	}

}
