package ch.gcv.vokabeltrainer.interfaces;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface CardChallengeView {
 
	public CardChallengePresenter getPresenter();
	public void setPresenter(CardChallengePresenter presenter);
	public void updateModelFromView();
	public void updateViewFromModel();
	public void open();
	public void close();
	public void answerWrong();
	public void answerRightFast();
	public void answerRightSlow();
	public void cardChanged();
  
}
 
