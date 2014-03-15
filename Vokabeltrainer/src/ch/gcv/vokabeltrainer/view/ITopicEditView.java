package ch.gcv.vokabeltrainer.view;

import ch.gcv.vokabeltrainer.presenter.ITopicCreatePresenter;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ITopicEditView {
 
	public ITopicCreatePresenter getPresenter();
	public void setPresenter(ITopicCreatePresenter presenter);
	public void updateModelFromView();
	public void updateViewFromModel();
	public void open();
	public void close();
  
}
 
