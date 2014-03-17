package ch.gcv.vokabeltrainer.interfaces;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface TopicCreatePresenter {
 
	public Topic getModel();
	public void setModel(Topic topic);
	public TopicEditView getView();
	public void setView(TopicEditView view);
	public void setOnConfirm(Presentable onConfirm);
	public void setOnCancel(Presentable onCancel);
	public void confirm();
	public void cancel();
  
}
 
