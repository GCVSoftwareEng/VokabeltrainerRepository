package ch.gcv.vokabeltrainer.view;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import ch.gcv.vokabeltrainer.interfaces.TopicCardListPresenter;
import ch.gcv.vokabeltrainer.interfaces.TopicCardListView;
import ch.gcv.vokabeltrainer.interfaces.Translatable;
import ch.gcv.vokabeltrainer.model.TranslationManager;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicCardListViewImpl extends javax.swing.JFrame implements
		TopicCardListView, Translatable {

	private TopicCardListPresenter presenter;

	private JMenuBar menuBar;
	private JMenu cardsMenu;
	private JMenuItem deleteCards;
	private JList liste;
	private JTextPane topic;
	private JScrollPane scrollPane;

	// private JPanel cardPanel;
	public TopicCardListViewImpl() {
		super("CardListView");
		this.initComponents();
	}

	/**
	 * initComponents
	 * 
	 */
	public void initComponents() {

		this.getContentPane().setBackground(Color.WHITE);
		this.topic = new JTextPane();
		this.liste = new JList();
		this.liste.addMouseListener(new java.awt.event.MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					String name = liste.getSelectedValue().toString();

				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		this.menuBar = new JMenuBar();
		this.cardsMenu = new JMenu();
		this.deleteCards = new JMenuItem();
		this.deleteCards.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuDeleteTopicActionPerformed(evt);
			}
		});
		this.scrollPane = new JScrollPane(liste);

		// build menubar
		menuBar.add(cardsMenu);
		cardsMenu.add(deleteCards);

		// JFrame defination
		super.setJMenuBar(menuBar);
		super.setBackground(Color.WHITE);
		super.setResizable(false);
		super.setSize(500, 500);
		super.setVisible(true);
		super.setLayout(null);
		scrollPane.setBounds(50, 80, 400, 350);

		topic.setEditable(false);
		SimpleAttributeSet set = new SimpleAttributeSet();
		StyleConstants.setAlignment(set, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set, "Times New Roman");
		StyleConstants.setFontSize(set, 30);
		StyleConstants.setItalic(set, true);
		StyleConstants.setBold(set, true);
		topic.setParagraphAttributes(set, true);
		topic.setBackground(Color.WHITE);
		topic.setBounds(50, 20, 200, 50);
		topic.setText("Topic");

		super.add(scrollPane);
		super.add(topic);

	}

	/**
	 * updateModelFromView implements ICardListView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {

	}

	/**
	 * updateViewFromModel implements ICardListView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {

		topic.setText(presenter.getModel().getName());

		// update the topic list
		this.liste.setListData(presenter.getModel().getCards().toArray());
	}

	/**
	 * open implements ICardListView.open
	 * 
	 */
	@Override
	public void open() {
		TranslationManager.getinstance().addListener(this);
		translate();
		setVisible(true);
	}

	/**
	 * close implements ICardListView.close
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

		this.cardsMenu.setText(TranslationManager.getinstance()
				.getText("cards"));
		this.deleteCards.setText(TranslationManager.getinstance().getText(
				"delete"));

	}

	private void jMenuDeleteTopicActionPerformed(java.awt.event.ActionEvent evt) {
		if (liste.getSelectedValue() != null) {
			String question = liste.getSelectedValue().toString();
			this.presenter.deleteCard(question);
			this.updateViewFromModel();
		}

	}

	@Override
	public TopicCardListPresenter getPresenter() {
		return this.presenter;
	}

	@Override
	public void setPresenter(TopicCardListPresenter presenter) {
		this.presenter = presenter;

	}
}
