package ch.gcv.vokabeltrainer.view;

import ch.gcv.vokabeltrainer.presenter.ITopicEditPresenter;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ITopicEditView {
 
	public ITopicEditPresenter getPresenter();
	public void setPresenter(ITopicEditPresenter presenter);
	public void updateModelFromView();
	public void updateViewFromModel();
	public void open();
	public void close();
  
}
 
