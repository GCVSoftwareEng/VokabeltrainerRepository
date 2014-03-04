package ch.gcv.vokabeltrainer.model;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ICardPresenter {
 
	public ICard getModel();
	public void setModel(ICard model);
	public ICardView getView();
	public void setView(ICardView view);
	public void checkAnswer();
  
}
 