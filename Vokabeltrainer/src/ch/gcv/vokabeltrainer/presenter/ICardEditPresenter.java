package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.model.ICard;
import ch.gcv.vokabeltrainer.view.ICardEditView;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ICardEditPresenter {
 
	public ICard getModel();
	public void setModel(ICard model);
	public ICardEditView getView();
	public void setView(ICardEditView view);
	public void setOnConfirm(Runnable onConfirm);
	public void setOnCancel(Runnable onCancel);
	public void confirm();
	public void cancel();
  
}
 
