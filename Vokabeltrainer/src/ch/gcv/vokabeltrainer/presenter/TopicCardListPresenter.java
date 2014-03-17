package ch.gcv.vokabeltrainer.presenter;

import java.util.ArrayList;

import ch.gcv.vokabeltrainer.model.ICard;
import ch.gcv.vokabeltrainer.model.IProfile;
import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.model.Translatable;
import ch.gcv.vokabeltrainer.model.Presentable;
import ch.gcv.vokabeltrainer.model.ProfileManager;
import ch.gcv.vokabeltrainer.view.CardEditView;
import ch.gcv.vokabeltrainer.view.TopicCardListView;
import ch.gcv.vokabeltrainer.view.ICardEditView;
import ch.gcv.vokabeltrainer.view.ITopicCardListView;
import ch.gcv.vokabeltrainer.view.TopicEditView;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicCardListPresenter implements Presentable, ITopicCardListPresenter {

	private Presentable onConfirm;
	private ITopicCardListView view;
	private Presentable onCancel;
	private ITopic model;

	public TopicCardListPresenter() {
		super();
		this.onConfirm = null; // TODO
		this.model = null; // TODO
		this.onCancel = null; // TODO
		this.view = new TopicCardListView();

	}

	/**
	 * run implements java.lang.Runnable.run
	 * 
	 */
	@Override
	public void run() {
		view.setPresenter(this);
		view.open();
		view.updateViewFromModel();
	}

	/**
	 * getModel implements ICardEditPresenter.getModel
	 * 
	 * @return ICard // TODO
	 */
	@Override
	public ITopic getModel() {
		
		return this.model;
	}

	/**
	 * setModel implements ICardEditPresenter.setModel
	 * 
	 * @param model
	 *            // TODO
	 * 
	 */
	@Override
	public void setModel(ITopic model) {
		this.model = model;
	}

	/**
	 * getView implements ICardEditPresenter.getView
	 * 
	 * @return ICardEditView // TODO
	 */
	@Override
	public ITopicCardListView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setView implements ICardEditPresenter.setView
	 * 
	 * @param view
	 *            // TODO
	 * 
	 */
	@Override
	public void setView(ITopicCardListView view) {
		this.view = view;
	}

	@Override
	public boolean deleteCard(ICard card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editCard(ICard card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}



}
