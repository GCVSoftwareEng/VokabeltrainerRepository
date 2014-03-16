package ch.gcv.vokabeltrainer.view;

import java.awt.Color;
import java.awt.event.KeyEvent;

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

import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.model.ITranslatable;
import ch.gcv.vokabeltrainer.model.Topic;
import ch.gcv.vokabeltrainer.model.TranslationManager;
import ch.gcv.vokabeltrainer.presenter.ITopicCardListPresenter;
import ch.gcv.vokabeltrainer.presenter.ICardPresenter;
import ch.gcv.vokabeltrainer.presenter.ITopicPresenter;
import ch.gcv.vokabeltrainer.presenter.TopicPresenter;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicCardListView extends javax.swing.JFrame implements ITopicCardListView,
		ITranslatable {

	private ITopicCardListPresenter presenter;


	// private JPanel cardPanel;
	public TopicCardListView() {
		super("CardListView");
		this.initComponents();
	}

	/**
	 * initComponents
	 * 
	 */
	private void initComponents() {

	}

	/**
	 * getPresenter implements ICardListView.getPresenter
	 * 
	 * @return ICardPresenter // TODO
	 */
	@Override
	public ITopicCardListPresenter getPresenter() {
		return this.presenter;
	}

	/**
	 * setPresenter implements ICardListView.setPresenter
	 * 
	 * @param presenter
	 *            // TODO
	 * 
	 */
	@Override
	public void setPresenter(ITopicCardListPresenter presenter) {
		this.presenter = presenter;
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
		throw new UnsupportedOperationException("Not implemented");
	}

	

	/**
	 * languageChanged implements ILanguageChangedListener.languageChanged
	 * 
	 */
	@Override
	public void translate() {

	}


}
