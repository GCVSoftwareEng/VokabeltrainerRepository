package ch.gcv.vokabeltrainer.view;

import ch.gcv.vokabeltrainer.presenter.IProfilePresenter;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface IProfileView {
 
	public IProfilePresenter getPresenter();
	public void setPresenter(IProfilePresenter presenter);
	public void updateModelFromView();
	public void updateViewFromModel();
	public void open();
	public void close();
  
}
 
