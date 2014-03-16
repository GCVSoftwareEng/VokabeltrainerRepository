package ch.gcv.vokabeltrainer.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import ch.gcv.vokabeltrainer.model.ITranslatable;
import ch.gcv.vokabeltrainer.presenter.ITopicPresenter;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicView extends JFrame implements ITopicView, ITranslatable {

	private ITopicPresenter presenter;

	private JTextPane topicname;

	private JButton boxButton1;
	private JButton boxButton2;
	private JButton boxButton3;
	private JButton boxButton4;
	private JButton boxButton5;
	private JButton addCard;

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

	private JLabel card1ummber1;
	private JLabel card1ummber2;
	private JLabel card1ummber3;
	private JLabel card1ummber4;
	private JLabel card1ummber5;

	public TopicView() {
		super("TopicView");
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
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(500, 500);
		super.setVisible(true);
		super.setLayout(null);

		this.boxButton1 = new JButton(new ImageIcon(getClass().getResource(
				"box.png")));
		this.boxButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBox1ActionPerformed(evt);
			}
		});
		this.boxButton2 = new JButton(new ImageIcon(getClass().getResource(
				"box.png")));
		this.boxButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBox2ActionPerformed(evt);
			}
		});
		this.boxButton3 = new JButton(new ImageIcon(getClass().getResource(
				"box.png")));
		this.boxButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBox3ActionPerformed(evt);
			}
		});
		this.boxButton4 = new JButton(new ImageIcon(getClass().getResource(
				"box.png")));
		this.boxButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBox4ActionPerformed(evt);
			}
		});
		this.boxButton5 = new JButton(new ImageIcon(getClass().getResource(
				"box.png")));
		this.boxButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBox5ActionPerformed(evt);
			}
		});
		this.addCard = new JButton(new ImageIcon(getClass().getResource(
				"plus.png")));
		this.addCard.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCreateCardActionPerformed(evt);
			}
		});

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
		this.card1ummber1 = new JLabel();
		this.card1ummber2 = new JLabel();
		this.card1ummber3 = new JLabel();
		this.card1ummber4 = new JLabel();
		this.card1ummber5 = new JLabel();

		// button definition
		boxButton1.setBounds(25, 240, 70, 70);
		boxButton2.setBounds(120, 240, 70, 70);
		boxButton3.setBounds(215, 240, 70, 70);
		boxButton4.setBounds(310, 240, 70, 70);
		boxButton5.setBounds(405, 240, 70, 70);
		addCard.setBounds(425, 50, 53, 50);

		// layout definition
		boxLabel1.setVisible(true);
		boxLabel1.setFont(boxLabel1.getFont().deriveFont(20f));
		boxLabel1.setBounds(30, 170, 70, 20);

		boxLabel2.setVisible(true);
		boxLabel2.setFont(boxLabel2.getFont().deriveFont(20f));
		boxLabel2.setBounds(125, 170, 70, 20);

		boxLabel3.setVisible(true);
		boxLabel3.setFont(boxLabel3.getFont().deriveFont(20f));
		boxLabel3.setBounds(220, 170, 70, 20);

		boxLabel4.setVisible(true);
		boxLabel4.setFont(boxLabel4.getFont().deriveFont(20f));
		boxLabel4.setBounds(315, 170, 70, 20);

		boxLabel5.setVisible(true);
		boxLabel5.setFont(boxLabel5.getFont().deriveFont(20f));
		boxLabel5.setBounds(410, 170, 70, 20);

		cardCount1.setVisible(true);
		cardCount1.setFont(cardCount1.getFont().deriveFont(14));
		cardCount1.setBounds(30, 195, 70, 20);

		cardCount2.setVisible(true);
		cardCount2.setFont(cardCount2.getFont().deriveFont(14));
		cardCount2.setBounds(125, 195, 70, 20);

		cardCount3.setVisible(true);
		cardCount3.setFont(cardCount3.getFont().deriveFont(14));
		cardCount3.setBounds(220, 195, 70, 20);

		cardCount4.setVisible(true);
		cardCount4.setFont(cardCount4.getFont().deriveFont(14));
		cardCount4.setBounds(315, 195, 70, 20);

		cardCount5.setVisible(true);
		cardCount5.setFont(cardCount5.getFont().deriveFont(14));
		cardCount5.setBounds(410, 195, 70, 20);

		card1ummber1.setVisible(true);
		card1ummber1.setFont(card1ummber1.getFont().deriveFont(14));
		card1ummber1.setBounds(45, 325, 70, 30);

		card1ummber2.setVisible(true);
		card1ummber2.setFont(card1ummber2.getFont().deriveFont(14));
		card1ummber2.setBounds(140, 325, 70, 30);

		card1ummber3.setVisible(true);
		card1ummber3.setFont(card1ummber3.getFont().deriveFont(14));
		card1ummber3.setBounds(235, 325, 70, 30);

		card1ummber4.setVisible(true);
		card1ummber4.setFont(card1ummber4.getFont().deriveFont(14));
		card1ummber4.setBounds(330, 325, 70, 30);

		card1ummber5.setVisible(true);
		card1ummber5.setFont(card1ummber5.getFont().deriveFont(14));
		card1ummber5.setBounds(425, 325, 70, 30);

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
		super.add(card1ummber1);
		super.add(card1ummber2);
		super.add(card1ummber3);
		super.add(card1ummber4);
		super.add(card1ummber5);

	}

	/**
	 * getPresenter implements ITopicView.getPresenter
	 * 
	 * @return ITopicPresenter // TODO
	 */
	@Override
	public ITopicPresenter getPresenter() {

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
	public void setPresenter(ITopicPresenter presenter) {

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

	}

	/**
	 * open implements ITopicView.open
	 * 
	 */
	@Override
	public void open() {

		setVisible(true);
	}

	/**
	 * close implements ITopicView.close
	 * 
	 */
	@Override
	public void close() {
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
	
	/**
	 * 
	 * @param evt
	 */
	private void jButtonBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().learnTopic(presenter.getModel());
	}

	
	/**
	 * 
	 * @param evt
	 */
	private void jButtonBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().learnTopic(presenter.getModel());
	}

	
	
	/**
	 * 
	 * @param evt
	 */
	private void jButtonBox3ActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().learnTopic();
	}

	
	
	/**
	 * 
	 * @param evt
	 */
	private void jButtonBox4ActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().learnTopic();
	}
	
	
	/**
	 * 
	 * @param evt
	 */
	private void jButtonBox5ActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().learnTopic();
	}

	

	/**
	 * 
	 * @param evt
	 */
	private void jButtonCreateCardActionPerformed(java.awt.event.ActionEvent evt) {
		getPresenter().createCard();
	}

}
