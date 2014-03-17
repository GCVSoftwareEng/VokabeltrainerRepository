package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.model.Presentable;
import ch.gcv.vokabeltrainer.view.ITopicEditView;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ITopicCreatePresenter {
 
	public ITopic getModel();
	public void setModel(ITopic topic);
	public ITopicEditView getView();
	public void setView(ITopicEditView view);
	public void setOnConfirm(Presentable onConfirm);
	public void setOnCancel(Presentable onCancel);
	public void confirm();
	public void cancel();
  
}
 
