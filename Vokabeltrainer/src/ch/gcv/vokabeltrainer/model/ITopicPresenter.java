package ch.gcv.vokabeltrainer.model;

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
	public void setOnCreateCard(Runnable onCreateCard);
	public void setOnOpenCard(Runnable onOpenCard);
	public void setOnDeleteCard(Runnable onDeleteCard);
	public void createCard();
	public void openCard();
	public void deleteCard();
	public void learnTopic();
  
}
 
