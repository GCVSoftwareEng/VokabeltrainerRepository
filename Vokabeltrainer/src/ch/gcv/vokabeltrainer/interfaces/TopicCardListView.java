package ch.gcv.vokabeltrainer.interfaces;

import ch.gcv.vokabeltrainer.presenter.ITopicCardListPresenter;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface TopicCardListView {
 
	public ITopicCardListPresenter getPresenter();
	public void setPresenter(ITopicCardListPresenter presenter);
	public void updateModelFromView();
	public void updateViewFromModel();
	public void open();
	public void close();
  
}
 
