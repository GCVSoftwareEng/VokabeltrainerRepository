package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.interfaces.Card;
import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.interfaces.Topic;
import ch.gcv.vokabeltrainer.interfaces.TopicCardListPresenter;
import ch.gcv.vokabeltrainer.interfaces.TopicCardListView;
import ch.gcv.vokabeltrainer.interfaces.TopicStatisticListPresenter;
import ch.gcv.vokabeltrainer.interfaces.TopicStatisticListView;
import ch.gcv.vokabeltrainer.model.PresenterManager;
import ch.gcv.vokabeltrainer.view.TopicCardListViewImpl;
import ch.gcv.vokabeltrainer.view.TopicStatisticListViewImpl;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicStatisticListPresenterImpl implements Presentable, TopicStatisticListPresenter {

	private Presentable onConfirm;
	private TopicStatisticListView view;
	private Presentable onCancel;
	private Topic model;

	public TopicStatisticListPresenterImpl() {
		super();
		this.onConfirm = null; // TODO
		this.model = null; // TODO
		this.onCancel = null; // TODO
		this.view = new TopicStatisticListViewImpl();
		PresenterManager.getInstance().add(this);
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
	public Topic getModel() {
		
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
	public void setModel(Topic model) {
		this.model = model;
	}

	/**
	 * getView implements ICardEditPresenter.getView
	 * 
	 * @return ICardEditView // TODO
	 */
	@Override
	public TopicStatisticListView getView() {
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
	public void setView(TopicStatisticListView view) {
		this.view = view;
	}

	@Override
	public boolean deleteCard(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editCard(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		this.view.close();
	}

	@Override
	public void setOnConfirm(Presentable presenter) {
		this.onConfirm = presenter;
	}

}
