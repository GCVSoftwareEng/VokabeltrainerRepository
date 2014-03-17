package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.interfaces.Card;
import ch.gcv.vokabeltrainer.interfaces.CardEditView;
import ch.gcv.vokabeltrainer.interfaces.Presentable;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ICardCreatePresenter {
 
	public Card getModel();
	public void setModel(Card model);
	public CardEditView getView();
	public void setView(CardEditView view);
	public void setOnConfirm(Presentable onConfirm);
	public void setOnCancel(Presentable onCancel);
	public void confirm();
	public void cancel();
  
}
 
