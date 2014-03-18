package ch.gcv.vokabeltrainer.interfaces;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface TopicPresenter {
 
	public Topic getModel();
	public void setModel(Topic model);
	public TopicView getView();
	public void setView(TopicView view);
	public void setOnCreateCard(Presentable onCreateCard);
	public void setOnOpenCard(Presentable onOpenCard);
	public void setOnDeleteCard(Presentable onDeleteCard);
	public void createCard();
	public void openCard(Card card);
	public void deleteCard();
	public void learnTopic();
	void learnTopic(Topic topic); //CHF
	void learnTopic(Card card); //CHF
	void deleteTopic(Topic topic); // CHF
	
  
}
 
