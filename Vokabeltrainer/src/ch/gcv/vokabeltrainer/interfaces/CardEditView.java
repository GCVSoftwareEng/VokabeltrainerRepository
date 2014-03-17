package ch.gcv.vokabeltrainer.interfaces;

import ch.gcv.vokabeltrainer.presenter.ICardCreatePresenter;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface CardEditView {
 
	public ICardCreatePresenter getPresenter();
	public void setPresenter(ICardCreatePresenter presenter);
	public void updateModelFromView();
	public void updateViewFromModel();
	public void open();
	public void close();
  
}
 
