package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.interfaces.Card;
import ch.gcv.vokabeltrainer.interfaces.CardView;
import ch.gcv.vokabeltrainer.interfaces.Topic;
import ch.gcv.vokabeltrainer.interfaces.Presentable;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ICardPresenter {
 
	public Card getModel();
	public void setModel(Card model);
	public CardView getView();
	public void setView(CardView view);
	public void checkAnswer(String answer);
	public void setOnCheckCard(Presentable presenter);

}
 
