package ch.gcv.vokabeltrainer.view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

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

import ch.gcv.vokabeltrainer.interfaces.ProfilePresenter;
import ch.gcv.vokabeltrainer.interfaces.ProfileView;
import ch.gcv.vokabeltrainer.interfaces.Topic;
import ch.gcv.vokabeltrainer.interfaces.Translatable;
import ch.gcv.vokabeltrainer.model.TranslationManager;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class ProfileViewImpl extends javax.swing.JFrame implements ProfileView,
		Translatable {

	private ProfilePresenter presenter;

	private JMenuBar menuBar;
	private JMenu profileMenu;
	private JMenu language;
	private JMenu topics;
	private JMenuItem newPro;
	private JMenuItem loadPro;
	private JMenuItem savePro;
	private JMenuItem saveProAs;
	private JMenuItem exportCards;
	private JMenuItem importCards;
	private JMenuItem createTopic;
	private JMenuItem deleteTopic;
	private JMenuItem exit;
	private JList liste;
	private JButton plus;
	private JButton delete;
	private JTextPane topic;
	private JScrollPane scrollPane;

	public ProfileViewImpl() {
		super("ProfileView");
		this.initComponents();
	}

	/**
	 * initComponents
	 * 
	 */
	public void initComponents() {

		this.getContentPane().setBackground(Color.WHITE);
		this.menuBar = new JMenuBar();
		this.profileMenu = new JMenu();
		this.language = new JMenu("Language", true);
		this.topics = new JMenu("Topics", true);
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
		this.saveProAs = new JMenuItem();
		this.saveProAs.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemSaveProfileAsActionPerformed(evt);
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

		this.createTopic = new JMenuItem();
		this.createTopic.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCreateTopicActionPerformed(evt);
			}
		});

		this.deleteTopic = new JMenuItem();
		this.deleteTopic.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonDeleteTopicActionPerformed(evt);
			}
		});

		this.exit = new JMenuItem();
		this.exit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemExitProfileActionPerformed(evt);
			}
		});

		this.topic = new JTextPane();
		this.liste = new JList();

		this.liste.addMouseListener(new java.awt.event.MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					String name = liste.getSelectedValue().toString();
					Topic topic = getPresenter().getModel().getTopic(name);
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
		menuBar.add(profileMenu);
		menuBar.add(topics);
		menuBar.add(language);

		profileMenu.add(newPro);
		profileMenu.add(loadPro);
		profileMenu.add(savePro);
		profileMenu.add(saveProAs);
		profileMenu.add(exit);

		topics.add(importCards);
		topics.add(exportCards);
		topics.add(createTopic);
		topics.add(deleteTopic);

		menuBar.setBackground(Color.LIGHT_GRAY);

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
		setBackground(Color.WHITE);

		super.setJMenuBar(menuBar);
		super.add(scrollPane);
		super.add(topic);

	}

	/**
	 * getPresenter implements IProfileView.getPresenter
	 * 
	 */
	@Override
	public ProfilePresenter getPresenter() {
		return this.presenter;
	}

	/**
	 * setPresenter implements IProfileView.setPresenter
	 * 
	 */
	@Override
	public void setPresenter(ProfilePresenter presenter) {
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

		for (String language : languages) {
			JMenuItem lm = new JMenuItem(TranslationManager.getinstance()
					.getText(language));
			lm.setActionCommand(language);

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
	 * @param evt
	 *            need a action event.
	 */
	private void jMenuItemLoadProfileActionPerformed(
			java.awt.event.ActionEvent evt) {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
<<<<<<< HEAD
		// Beschreibung der Datei Endung der Datei
				"Vokabeltrainer profile", "profile");
		// Filter wird dem JFileChooser hinzugefuegt.
		chooser.setFileFilter(filter);
		// Dialog zum Oeffnen von Dateien Anzeigen. // anstatt null parameter
		// koennte man anzeige von pics implementieren.
		int returnVal = chooser.showOpenDialog(null); // open gleich öffen sonst
														// save = speichern
		// Abfrage ob auf oeffen geklickt wurde
		if (returnVal == JFileChooser.APPROVE_OPTION) { // bei "Abbrechen"
														// CANCEL_OPTION
			// Profil gem pfad laden.
=======
		"Vokabeltrainer profile", "profile");

		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
>>>>>>> FETCH_HEAD
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
	 * @param evt
	 *            needs a action event.
	 * 
	 */
	private void jMenuItemSaveProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

		if (getPresenter().saveProfile() == false) {
			this.jMenuItemSaveProfileAsActionPerformed(null);
			;
		}
		;

	}

	/**
	 * This method save local a profile. You must enter a name.
	 * 
	 * @param evt
	 *            needs a action event.
	 * 
	 */
	private void jMenuItemSaveProfileAsActionPerformed(
			java.awt.event.ActionEvent evt) {

		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Vokabeltrainer profile", "profile");
		chooser.setFileFilter(filter);
		// Dialog abgeändert mit showDialog anstatt showSaveDialog
		int returnVal = chooser.showDialog(null, "Speichere Profil");
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
	 * @param evt
	 *            needs a action event.
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
		if (liste.getSelectedValue() != null) {
			String name = liste.getSelectedValue().toString();
			Topic topic = getPresenter().getModel().getTopic(name);
			getPresenter().deleteTopic(topic);
			this.updateViewFromModel();
		}

	}

	private void jMenuItemImportProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Vokabeltrainer topic", "topic");
		chooser.setFileFilter(filter);

		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String path = chooser.getSelectedFile().getAbsolutePath();
			getPresenter().importTopic(path);
			updateViewFromModel();

		}

	}

	private void jMenuItemExportProfileActionPerformed(
			java.awt.event.ActionEvent evt) {

		String name = liste.getSelectedValue().toString();
		if (name != "" && name != null) {

			JFileChooser chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"Vokabeltrainer topic", "topic");
			chooser.setFileFilter(filter);
			int returnVal = chooser.showSaveDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				String path = chooser.getSelectedFile().getAbsolutePath();
				if (!path.toLowerCase().endsWith(".topic")) {
					path = path + ".topic";
				}

				getPresenter().exportTopic(name, path);

			}

		}

	}

	/**
	 * This method choose the language.
	 */
	@Override
	public void translate() {
		// TODO Auto-generated method stub
		this.language.setText(TranslationManager.getinstance().getText(
				"language"));
		this.profileMenu.setText(TranslationManager.getinstance().getText(
				"profile"));
		this.topic.setText(TranslationManager.getinstance().getText("topics"));
		this.newPro.setText(TranslationManager.getinstance().getText("new"));
		this.loadPro.setText(TranslationManager.getinstance().getText("load"));
		this.savePro.setText(TranslationManager.getinstance().getText("save"));
		this.saveProAs.setText(TranslationManager.getinstance().getText(
				"saveAs"));
		this.exit.setText(TranslationManager.getinstance().getText("exit"));
		this.importCards.setText(TranslationManager.getinstance().getText(
				"import"));
		this.exportCards.setText(TranslationManager.getinstance().getText(
				"export"));
		this.topics.setText(TranslationManager.getinstance().getText("topic"));

		this.createTopic.setText(TranslationManager.getinstance().getText(
				"create"));
		this.deleteTopic.setText(TranslationManager.getinstance().getText(
				"delete"));
	}

}
