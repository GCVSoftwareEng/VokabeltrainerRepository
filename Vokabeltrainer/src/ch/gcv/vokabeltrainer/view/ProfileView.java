package ch.gcv.vokabeltrainer.view;

import java.awt.Color;
import java.awt.event.MouseEvent;
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

import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.model.ITranslatable;
import ch.gcv.vokabeltrainer.model.ProfileManager;
import ch.gcv.vokabeltrainer.model.TranslationManager;
import ch.gcv.vokabeltrainer.presenter.IProfilePresenter;
import ch.gcv.vokabeltrainer.presenter.ITopicPresenter;

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
	private JMenuItem exportCards;
	private JMenuItem importCards;
	private JMenuItem exit;
	private JList liste;
	private JButton plus;
	private JButton delete;
	private JTextPane topic;
	private JScrollPane scrollPane;

	public ProfileView() {
		super("ProfileView");
		this.initComponents();
	}

	/**
	 * initComponents
	 * 
	 */
	public void initComponents() {

		this.menuBar = new JMenuBar();
		this.file = new JMenu();
		this.language = new JMenu("Language", true);
		this.newPro = new JMenuItem();
		this.newPro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemNewProfileActionPerformed(evt);
			}
		});
		this.savePro = new JMenuItem();
		this.savePro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemSaveProfileActionPerformed(evt);
			}
		});
		this.loadPro = new JMenuItem();
		this.loadPro.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemLoadProfileActionPerformed(evt);
			}
		});
		this.importCards = new JMenuItem();
		this.importCards.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemImportProfileActionPerformed(evt);
			}
		});
		this.exportCards = new JMenuItem();
		this.exportCards.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemExportProfileActionPerformed(evt);
			}
		});
		this.exit = new JMenuItem();
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

		this.delete = new JButton(new ImageIcon(getClass()
				.getResource("delete.png")));

		this.delete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonDeleteTopicActionPerformed(evt);
			}
		});
		
		this.topic = new JTextPane();
		this.liste = new JList();
		this.liste.addMouseListener(new java.awt.event.MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2){
					String name = liste.getSelectedValue().toString();
					ITopic topic = getPresenter().getModel().getTopic(name);
					getPresenter().openTopic(topic);
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
		this.scrollPane = new JScrollPane(liste);

		// JFrame defination
		super.setBackground(Color.WHITE);
		super.setResizable(false);
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
		file.add(importCards);
		file.add(exportCards);
		file.add(exit);

		menuBar.setBackground(Color.LIGHT_GRAY);

		scrollPane.setBounds(50, 80, 400, 350);

		plus.setBounds(400, 20, 31, 30);
		delete.setBounds(440, 20, 30, 30);

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
		super.add(delete);
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
	}
	
/**
 * This method load .profile data.
 * 
 * @param evt need a action event.
 */
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
			updateViewFromModel();

		}
	}

	/**
	 * This method creates a new Profile
	 * 
	 */
	private void jMenuItemNewProfileActionPerformed(
			java.awt.event.ActionEvent evt) {
		this.getPresenter().createNewProfile();
		updateViewFromModel();
	}

	/**
	 * This method save local a profile. You must enter a name.
	 * 
	 * @param evt needs a action event.
	 *            
	 */
	private void jMenuItemSaveProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Vokabeltrainer profile", "profile");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showSaveDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String path = chooser.getSelectedFile().getAbsolutePath();
			if (!path.toLowerCase().endsWith(".profile")) {
				path = path + ".profile";
			}
			getPresenter().saveProfile(path);

		}

	}

	/**
	 * With this method, you can close the program.
	 * 
	 * @param evt needs a action event.
	 */
	private void jMenuItemExitProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

		this.dispose();

	}

	private void jButtonCreateTopicActionPerformed(
			java.awt.event.ActionEvent evt) {
		getPresenter().createTopic();
	}

	private void jMenuChooseLanguageActionPerformed(
			java.awt.event.ActionEvent evt) {
		TranslationManager.getinstance().setLanguage(evt.getActionCommand());
	}
	
	private void jButtonDeleteTopicActionPerformed(
			java.awt.event.ActionEvent evt) {
		String name = liste.getSelectedValue().toString();
		ITopic topic = getPresenter().getModel().getTopic(name);
		getPresenter().deleteTopic(topic);
		
	}

	private void jMenuItemImportProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

	}
	
	private void jMenuItemExportProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

	}
	
	/**
	 * This method choose the language.
	 */
	@Override
	public void translate() {
		// TODO Auto-generated method stub
		this.language.setText(TranslationManager.getinstance().getText(
				"language"));
		this.file.setText(TranslationManager.getinstance().getText("file"));
		this.topic.setText(TranslationManager.getinstance().getText("topics"));
		this.newPro.setText(TranslationManager.getinstance().getText("newPro"));
		this.loadPro.setText(TranslationManager.getinstance().getText("loadPro"));
		this.savePro.setText(TranslationManager.getinstance().getText("savePro"));
		this.exit.setText(TranslationManager.getinstance().getText("exit"));
		this.importCards.setText(TranslationManager.getinstance().getText("importCard"));
		this.exportCards.setText(TranslationManager.getinstance().getText("exportCard"));
	}

}
