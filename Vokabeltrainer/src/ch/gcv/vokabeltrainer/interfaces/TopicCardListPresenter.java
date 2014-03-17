package ch.gcv.vokabeltrainer.interfaces;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface TopicCardListPresenter {
 
	public Topic getModel();
	public void setModel(Topic model);
	public TopicCardListView getView();
	public void setView(TopicCardListView view);
	public boolean deleteCard(Card card);
	public boolean editCard(Card card);

}
 
