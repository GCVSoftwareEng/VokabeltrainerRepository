package ch.gcv.vokabeltrainer.view;

import ch.gcv.vokabeltrainer.presenter.ICardPresenter;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ICardView {
 
	public ICardPresenter getPresenter();
	public void setPresenter(ICardPresenter presenter);
	public void updateModelFromView();
	public void updateViewFromModel();
	public void open();
	public void close();
	public void answerWrong();
	public void answerRight();
  
}
 
