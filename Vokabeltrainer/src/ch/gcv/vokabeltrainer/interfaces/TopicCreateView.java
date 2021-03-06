package ch.gcv.vokabeltrainer.interfaces;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface TopicCreateView {
 
	public TopicCreatePresenter getPresenter();
	public void setPresenter(TopicCreatePresenter presenter);
	public void updateModelFromView();
	public void updateViewFromModel();
	public void open();
	public void close();
	public void duplicateTopic();
	public void fieldsNotSet();
  
}
 
