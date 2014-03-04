package ch.gcv.vokabeltrainer.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import ch.gcv.vokabeltrainer.gui.Mainwindow;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class ProfileView extends javax.swing.JFrame implements IProfileView {

	private IProfilePresenter presenter;

	private JMenuBar menuBar;
	private JMenu file;
	private JMenu language;
	private JMenuItem newPro;
	private JMenuItem loadPro;
	private JMenuItem newTopic;
	private JMenuItem addCard;
	private JMenuItem editCard;
	private JMenuItem removeCard;
	private JMenuItem exit;
	private JList liste;
	private JButton plus;
	private JTextPane topic;
	private JScrollPane scrollPane;

	public ProfileView() {
		super();
		this.initComponents();
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
		this.newTopic = new JMenuItem("New Topic");
		this.addCard = new JMenuItem("Add Card");
		this.editCard = new JMenuItem("Edit Card");
		this.removeCard = new JMenuItem("Remove Card");
		this.exit = new JMenuItem("Exit");
		this.plus = new JButton(new ImageIcon(getClass()
				.getResource("plus.png")));
		this.topic = new JTextPane();
		String inhalte[] = {"1","2","2","2","2","2","2","2","2","2","2","2","2","2","2","2","3","3","3","3","3","3","3"};
		this.liste = new JList(inhalte);
		
		this.scrollPane = new JScrollPane(liste);

		// JFrame defination
		super.setBackground(Color.WHITE);
		super.setResizable(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(500, 500);
		super.setVisible(true);
		super.setLayout(null);

		// build menubar
		menuBar.add(file);
		menuBar.add(language);
		file.add(newPro);
		file.add(loadPro);
		file.add(newTopic);
		file.add(addCard);
		file.add(editCard);
		file.add(removeCard);
		file.add(exit);

		menuBar.setBackground(Color.LIGHT_GRAY);
		
		
		
		scrollPane.setBounds(50, 80, 400, 350);

		plus.setBounds(400, 10, 51, 50);
		// topic.setBounds(50, 10, 200, 50);
		// topic.setVisible(true);

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

		
		super.setJMenuBar(menuBar);
		super.add(scrollPane);
		super.add(plus);
		super.add(topic);

	}

	/**
	 * getPresenter implements IProfileView.getPresenter
	 * 
	 */
	@Override
	public IProfilePresenter getPresenter() {
		return this.presenter;
	}

	/**
	 * setPresenter implements IProfileView.setPresenter
	 * 
	 */
	@Override
	public void setPresenter(IProfilePresenter presenter) {
		this.presenter = presenter;
	}

	/**
	 * updateModelFromView implements IProfileView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * updateViewFromModel implements IProfileView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {
		// TODO should be implemented

		// update language menu bar
		ArrayList<String> languages = TranslationManager.getinstance()
				.getLanguages();
		Iterator<String> it = languages.iterator(); // iterator
		while (it.hasNext()) {
			JMenuItem lm = new JMenuItem(it.next());
			this.language.add(lm);
		}

		// update the topic list
//		this.liste.setListData(presenter.getModel().getTopics().toArray());
		
		
		
	}

	/**
	 * open implements IProfileView.open
	 * 
	 */
	@Override
	public void open() {
		setVisible(true);
	}

	/**
	 * close implements IProfileView.close
	 * 
	 */
	@Override
	public void close() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

}
