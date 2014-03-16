package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.model.ICard;
import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.view.ITopicCardListView;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ITopicCardListPresenter {
 
	public ITopic getModel();
	public void setModel(ITopic model);
	public ITopicCardListView getView();
	public void setView(ITopicCardListView view);
	public boolean deleteCard(ICard card);
	public boolean editCard(ICard card);

}
 
