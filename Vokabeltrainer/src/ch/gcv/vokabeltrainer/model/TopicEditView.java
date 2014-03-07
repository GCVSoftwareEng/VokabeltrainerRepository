package ch.gcv.vokabeltrainer.model;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicEditView extends javax.swing.JFrame implements ITopicEditView {

	private ITopicEditPresenter presenter;

	// menubar and menus
	private JMenuBar menuBar;
	private JMenu file;
	private JMenu language;
	private JMenuItem newPro;
	private JMenuItem loadPro;
	private JMenuItem addCard;
	private JMenuItem editCard;
	private JMenuItem removeCard;
	private JMenuItem exit;

	private JButton back;
	private JButton edit;

	private JTextField topicnameField;
	private JLabel topicname;

	private JTextPane topic;

	public TopicEditView() {
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
		this.addCard = new JMenuItem("Add Card");
		this.editCard = new JMenuItem("Edit Card");
		this.removeCard = new JMenuItem("Remove Card");
		this.exit = new JMenuItem("Exit");
		this.back = new JButton(new ImageIcon(getClass()
				.getResource("plus.png")));
		this.edit = new JButton(new ImageIcon(getClass()
				.getResource("edit.png")));
		this.topic = new JTextPane();
		this.topicname = new JLabel();
		this.topicnameField = new JTextField();

		// JFrame defination
		super.setBackground(Color.WHITE);
		super.setResizable(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(600, 280);
		super.setVisible(true);
		super.setLayout(null);

		// build menubar
		menuBar.add(file);
		menuBar.add(language);
		file.add(newPro);
		file.add(loadPro);
		file.add(addCard);
		file.add(editCard);
		file.add(removeCard);
		file.add(exit);
		menuBar.setBackground(Color.LIGHT_GRAY);

		// topicnamelabel
		topicname.setVisible(true);
		topicname.setFont(topicname.getFont().deriveFont(20f));
		topicname.setBounds(20, 80, 550, 30);
		topicname.setBackground(Color.LIGHT_GRAY);

		// textfiel
		topicnameField.setEditable(true);
		topicnameField.setVisible(true);
		topicnameField.setFont(topicnameField.getFont().deriveFont(20f));
		topicnameField.setBounds(20, 130, 490, 50);

		back.setBounds(20, 10, 51, 50);
		edit.setBounds(520, 130, 51, 50);

		topic.setEditable(false);
		SimpleAttributeSet set = new SimpleAttributeSet();
		StyleConstants.setAlignment(set, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set, "Times New Roman");
		StyleConstants.setFontSize(set, 30);
		StyleConstants.setItalic(set, true);
		StyleConstants.setBold(set, true);
		topic.setParagraphAttributes(set, true);
		topic.setBackground(Color.WHITE);
		topic.setBounds(90, 20, 400, 40);
		topic.setText("Topic");

		super.setJMenuBar(menuBar);
		super.add(back);
		super.add(edit);
		super.add(topic);
		super.add(topicname);
		super.add(topicnameField);

	}

	/**
	 * getPresenter implements ITopicEditView.getPresenter
	 * 
	 * @return TopicEditPresenter // TODO
	 */
	@Override
	public TopicEditPresenter getPresenter() {
		
		return this.presenter;
		
	}

	/**
	 * setPresenter implements ITopicEditView.setPresenter
	 * 
	 * @param presenter
	 *            // TODO
	 * 
	 */
	@Override
	public void setPresenter(TopicEditPresenter presenter) {
		
		this.presenter = presenter;
		
	}

	/**
	 * updateModelFromView implements ITopicEditView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * updateViewFromModel implements ITopicEditView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * open implements ITopicEditView.open
	 * 
	 */
	@Override
	public void open() {
		
		setVisible(true);
		
	}

	/**
	 * close implements ITopicEditView.close
	 * 
	 */
	@Override
	public void close() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

}
