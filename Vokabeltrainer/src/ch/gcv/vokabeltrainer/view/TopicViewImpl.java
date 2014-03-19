package ch.gcv.vokabeltrainer.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TopicPresenter presenter;
	private JTextPane topicname;
	private JMenuBar menuBar;
	private JMenu cardsMenu;
	private JMenu statisticMenu;
	private JMenuItem moveAllCardsToFirstBox;
	private JMenuItem createCards;
	private JMenuItem showCards;
	private JMenuItem openStatistic;	
	private JButton boxButton1;
	private JButton boxButton2;
	private JButton boxButton3;
	private JButton boxButton4;
	private JButton boxButton5;
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
		
		this.menuBar = new JMenuBar();
		this.cardsMenu = new JMenu();
		this.statisticMenu = new JMenu();
		

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
		
		this.moveAllCardsToFirstBox = new JMenuItem();
		this.moveAllCardsToFirstBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuMoveAllCardsToFirstBoxActionPerformed(evt);
			}
		});
		this.createCards = new JMenuItem();
		this.createCards.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuCreateCardActionPerformed(evt);
			}
		});
		this.showCards = new JMenuItem();
		this.showCards.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuEditBoxActionPerformed(evt);
			}
		});
		this.openStatistic = new JMenuItem();
		this.openStatistic.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuOpenStatisticActionPerformed(evt);
			}
		});
		
		// build menubar
		menuBar.add(cardsMenu);
		cardsMenu.add(createCards);
		cardsMenu.add(showCards);
		cardsMenu.add(moveAllCardsToFirstBox);
		menuBar.add(statisticMenu);
		statisticMenu.add(openStatistic);
		
		this.beatTheClockCheckBox = new JCheckBox("challengeMode");

		this.topicname = new JTextPane();
		this.boxLabel1 = new JLabel();
		this.boxLabel2 = new JLabel();
		this.boxLabel3 = new JLabel();
		this.boxLabel4 = new JLabel();
		this.boxLabel5 = new JLabel();
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
		boxButton1.setBounds(25, 215, 70, 70);
		boxButton2.setBounds(120, 215, 70, 70);
		boxButton3.setBounds(215, 215, 70, 70);
		boxButton4.setBounds(310, 215, 70, 70);
		boxButton5.setBounds(405, 215, 70, 70);

		// layout definition		
		boxLabel1.setVisible(true);
		boxLabel1.setFont(boxLabel1.getFont().deriveFont(20f));
		boxLabel1.setBounds(30, 140, 70, 20);
		boxLabel1.setBackground(Color.WHITE);

		boxLabel2.setVisible(true);
		boxLabel2.setFont(boxLabel2.getFont().deriveFont(20f));
		boxLabel2.setBounds(125, 140, 70, 20);
		boxLabel2.setBackground(Color.WHITE);

		boxLabel3.setVisible(true);
		boxLabel3.setFont(boxLabel3.getFont().deriveFont(20f));
		boxLabel3.setBounds(220, 140, 70, 20);
		boxLabel3.setBackground(Color.WHITE);

		boxLabel4.setVisible(true);
		boxLabel4.setFont(boxLabel4.getFont().deriveFont(20f));
		boxLabel4.setBounds(315, 140, 70, 20);
		boxLabel4.setBackground(Color.WHITE);

		boxLabel5.setVisible(true);
		boxLabel5.setFont(boxLabel5.getFont().deriveFont(20f));
		boxLabel5.setBounds(410, 140, 70, 20);
		boxLabel5.setBackground(Color.WHITE);

		cardCount1.setVisible(true);
		cardCount1.setFont(cardCount1.getFont().deriveFont(14));
		cardCount1.setBounds(30, 165, 70, 20);
		cardCount1.setBackground(Color.WHITE);

		cardCount2.setVisible(true);
		cardCount2.setFont(cardCount2.getFont().deriveFont(14));
		cardCount2.setBounds(125, 165, 70, 20);
		cardCount2.setBackground(Color.WHITE);

		cardCount3.setVisible(true);
		cardCount3.setFont(cardCount3.getFont().deriveFont(14));
		cardCount3.setBounds(220, 165, 70, 20);
		cardCount3.setBackground(Color.WHITE);

		cardCount4.setVisible(true);
		cardCount4.setFont(cardCount4.getFont().deriveFont(14));
		cardCount4.setBounds(315, 165, 70, 20);
		cardCount4.setBackground(Color.WHITE);

		cardCount5.setVisible(true);
		cardCount5.setFont(cardCount5.getFont().deriveFont(14));
		cardCount5.setBounds(410, 165, 70, 20);
		cardCount5.setBackground(Color.WHITE);

		cardnummber1.setVisible(true);
		cardnummber1.setFont(cardnummber1.getFont().deriveFont(14));
		cardnummber1.setBounds(45, 190, 70, 20);
		cardnummber1.setBackground(Color.WHITE);

		cardnummber2.setVisible(true);
		cardnummber2.setFont(cardnummber2.getFont().deriveFont(14));
		cardnummber2.setBounds(140, 190, 70, 20);
		cardnummber2.setBackground(Color.WHITE);

		cardnummber3.setVisible(true);
		cardnummber3.setFont(cardnummber3.getFont().deriveFont(14));
		cardnummber3.setBounds(235, 190, 70, 20);
		cardnummber3.setBackground(Color.WHITE);

		cardnummber4.setVisible(true);
		cardnummber4.setFont(cardnummber4.getFont().deriveFont(14));
		cardnummber4.setBounds(330, 190, 70, 20);
		cardnummber4.setBackground(Color.WHITE);

		cardnummber5.setVisible(true);
		cardnummber5.setFont(cardnummber5.getFont().deriveFont(14));
		cardnummber5.setBounds(425, 190, 70, 20);
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
		beatTheClockCheckBox.setVisible(true);
		beatTheClockCheckBox.setBounds(0, 0, 200, 20);
		beatTheClockCheckBox.setBackground(Color.WHITE);
		
		// add to JFrame
		super.setJMenuBar(menuBar);
		super.add(topicname);
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
		super.add(beatTheClockCheckBox);

	}

	/**
	 * getPresenter implements ITopicView.getPresenter
	 * 
	 * @return ITopicPresenter 
	 */
	@Override
	public TopicPresenter getPresenter() {

		return this.presenter;

	}

	/**
	 * setPresenter implements ITopicView.setPresenter
	 * 
	 * @param presenter
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
		this.setTitle(TranslationManager.getinstance().getText("topic"));
		
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
		this.cardsMenu.setText(TranslationManager.getinstance().getText(
				"cards"));
		this.createCards.setText(TranslationManager.getinstance().getText(
				"create"));
		this.showCards.setText(TranslationManager.getinstance().getText(
				"show"));
		this.moveAllCardsToFirstBox.setText(TranslationManager.getinstance().getText(
				"moveAllCardsToFirstBox"));
		
		this.statisticMenu.setText(TranslationManager.getinstance().getText("statistic"));
		this.openStatistic.setText(TranslationManager.getinstance().getText("open"));
		
	
		this.boxLabel1.setText(TranslationManager.getinstance().getText("box")+" 1");
		this.boxLabel2.setText(TranslationManager.getinstance().getText("box")+" 2");
		this.boxLabel3.setText(TranslationManager.getinstance().getText("box")+" 3");
		this.boxLabel4.setText(TranslationManager.getinstance().getText("box")+" 4");
		this.boxLabel5.setText(TranslationManager.getinstance().getText("box")+" 5");
		
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
	private void jMenuCreateCardActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().createCard();
	}
	
	/**
	 * 
	 * @param evt
	 */
	private void jMenuEditBoxActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().editCards();
	}
	
	/**
	 * 
	 * @param evt
	 */
	private void jMenuMoveAllCardsToFirstBoxActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().moveAllCardsToFirstBox();
	}
	
	/**
	 * 
	 * @param evt
	 */
	private void jMenuOpenStatisticActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().openStatistic();
	}
	
	
	

}
