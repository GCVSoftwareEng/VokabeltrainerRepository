package ch.gcv.vokabeltrainer.interfaces;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface CardEditPresenter {
 
	public Card getModel();
	public void setModel(Card model);
	public CardEditView getView();
	public void setView(CardEditView view);
	public void setOnConfirm(Presentable onConfirm);
	public void setOnCancel(Presentable onCancel);
	public void confirm();
	public void cancel();
  
}
 
