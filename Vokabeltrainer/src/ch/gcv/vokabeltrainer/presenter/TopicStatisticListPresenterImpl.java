package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.interfaces.Topic;
import ch.gcv.vokabeltrainer.interfaces.TopicStatisticListPresenter;
import ch.gcv.vokabeltrainer.interfaces.TopicStatisticListView;
import ch.gcv.vokabeltrainer.model.PresenterManager;
import ch.gcv.vokabeltrainer.view.TopicStatisticListViewImpl;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicStatisticListPresenterImpl implements Presentable, TopicStatisticListPresenter {

	private TopicStatisticListView view;
	private Topic model;

	public TopicStatisticListPresenterImpl() {
		super();
		this.model = null;
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
	 * @return ICard 
	 */
	@Override
	public Topic getModel() {
		return this.model;
	}

	/**
	 * setModel implements ICardEditPresenter.setModel
	 * 
	 * @param model
	 * 
	 */
	@Override
	public void setModel(Topic model) {
		this.model = model;
	}

	/**
	 * getView implements ICardEditPresenter.getView
	 * 
	 * @return ICardEditView 
	 */
	@Override
	public TopicStatisticListView getView() {
		return this.view;
	}

	/**
	 * setView implements ICardEditPresenter.setView
	 * 
	 * @param view
	 * 
	 */
	@Override
	public void setView(TopicStatisticListView view) {
		this.view = view;
	}

	@Override
	public void refresh() {
		this.view.updateViewFromModel();
	}

	@Override
	public void stop() {
		this.view.close();
	}

}
