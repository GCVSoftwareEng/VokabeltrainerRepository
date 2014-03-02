package ch.gcv.vokabeltrainer.model;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ITopicView {
 
	public ITopicPresenter getPresenter();
	public void setPresenter(ITopicPresenter presenter);
	public void updateModelFromView();
	public void updateViewFromModel();
	public void open();
	public void close();
  
}
 
