package ch.gcv.vokabeltrainer.model;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface IProfile {
 
	public void addTopic(ITopic topic);
	public void deleteTopic(ITopic topic);
	public ArrayList<ITopic> getTopics();
	public ITopic getTopic(String name);
  
}
 
