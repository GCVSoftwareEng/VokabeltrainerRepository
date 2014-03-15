package ch.gcv.vokabeltrainer.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import ch.gcv.vokabeltrainer.model.ITranslatable;
import ch.gcv.vokabeltrainer.model.TranslationManager;
import ch.gcv.vokabeltrainer.presenter.IProfilePresenter;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class ProfileView extends javax.swing.JFrame implements IProfileView,
		ITranslatable {

	private IProfilePresenter presenter;

	private JMenuBar menuBar;
	private JMenu file;
	private JMenu language;
	private JMenuItem newPro;
	private JMenuItem loadPro;
	private JMenuItem savePro;
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
	public void initComponents() {

		this.menuBar = new JMenuBar();
		this.file = new JMenu("File");
		this.language = new JMenu("Language", true);
		this.newPro = new JMenuItem("New Profile");
		this.newPro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemNewProfileActionPerformed(evt);
			}
		});
		this.savePro = new JMenuItem("Save Profile");
		this.savePro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemSaveProfileActionPerformed(evt);
			}
		});
		this.loadPro = new JMenuItem("Load Profile");
		this.loadPro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemLoadProfileActionPerformed(evt);
			}
		});
		this.exit = new JMenuItem("Exit");
		this.exit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemExitProfileActionPerformed(evt);
			}
		});
		this.plus = new JButton(new ImageIcon(getClass()
				.getResource("plus.png")));

		this.plus.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCreateTopicActionPerformed(evt);
			}
		});

		this.topic = new JTextPane();
		this.liste = new JList();
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
		file.add(savePro);
		file.add(exit);

		menuBar.setBackground(Color.LIGHT_GRAY);

		scrollPane.setBounds(50, 80, 400, 350);

		plus.setBounds(400, 10, 51, 50);

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
		
	}

	/**
	 * updateViewFromModel implements IProfileView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {
		// TODO should be implemented

		this.language.removeAll();
		// update language menu bar
		ArrayList<String> languages = TranslationManager.getinstance()
				.getLanguages();
		Iterator<String> it = languages.iterator(); // iterator
		while (it.hasNext()) {
			JMenuItem lm = new JMenuItem(it.next());

			lm.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jMenuChooseLanguageActionPerformed(evt);
				}
			});

			this.language.add(lm);
		}

		// update the topic list
		this.liste.setListData(presenter.getModel().getTopics().toArray());

	}

	/**
	 * open implements IProfileView.open
	 * 
	 */
	@Override
	public void open() {
		TranslationManager.getinstance().addListener(this);
		translate();
		setVisible(true);
	}

	/**
	 * close implements IProfileView.close
	 * 
	 */
	@Override
	public void close() {
		TranslationManager.getinstance().removeListener(this);
		throw new UnsupportedOperationException("Not implemented");
	}

	private void jMenuItemLoadProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Vokabeltrainer profile", "profile");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String path = chooser.getSelectedFile().getAbsolutePath();
			getPresenter().loadProfile(path);
			updateModelFromView();

		}
	}

	
	
	private void jMenuItemNewProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

		
			ProfileView newPro = new ProfileView();
			this.dispose();

	}



	
	private void jMenuItemSaveProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Vokabeltrainer profile", "profile");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showSaveDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String path = chooser.getSelectedFile().getAbsolutePath();
			getPresenter().saveProfile(path);

		}

	}
	
	private void jMenuItemExitProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

		this.dispose();;

	}

	private void jButtonCreateTopicActionPerformed(
			java.awt.event.ActionEvent evt) {
		getPresenter().createTopic();
	}

	private void jMenuChooseLanguageActionPerformed(
			java.awt.event.ActionEvent evt) {
		TranslationManager.getinstance().setLanguage(evt.getActionCommand());
	}

	@Override
	public void translate() {
		// TODO Auto-generated method stub
		this.language.setText(TranslationManager.getinstance().getText(
				"language"));
		this.file.setText(TranslationManager.getinstance().getText("file"));
		this.topic.setText(TranslationManager.getinstance().getText("topics"));
	}

}
