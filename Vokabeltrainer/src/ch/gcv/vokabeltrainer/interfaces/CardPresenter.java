package ch.gcv.vokabeltrainer.interfaces;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface CardPresenter {
 
	public Card getModel();
	public void setModel(Card model);
	public CardView getView();
	public void setView(CardView view);
	public void checkAnswer(String answer);
	public void setOnCheckCard(Presentable presenter);

}
 
