package ch.gcv.vokabeltrainer.interfaces;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface CardChallengePresenter {
 
	public Card getModel();
	public void setModel(Card model);
	public CardChallengeView getView();
	public void setView(CardChallengeView view);
	public void checkAnswer(String answer);
	public void setOnCheckCard(Presentable presenter);
	public void nextCard();
	public long getCardShown();

}
 
