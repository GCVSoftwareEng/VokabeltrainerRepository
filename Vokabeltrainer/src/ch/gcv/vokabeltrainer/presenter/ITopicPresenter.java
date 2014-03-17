package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.model.ICard;
import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.model.Presentable;
import ch.gcv.vokabeltrainer.view.ITopicView;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ITopicPresenter {
 
	public ITopic getModel();
	public void setModel(ITopic model);
	public ITopicView getView();
	public void setView(ITopicView view);
	public void setOnCreateCard(Presentable onCreateCard);
	public void setOnOpenCard(Presentable onOpenCard);
	public void setOnDeleteCard(Presentable onDeleteCard);
	public void createCard();
	public void openCard(ICard card);
	public void deleteCard();
	public void learnTopic();
	void learnTopic(ITopic topic); //CHF
	void learnTopic(ICard card); //CHF
	
  
}
 
