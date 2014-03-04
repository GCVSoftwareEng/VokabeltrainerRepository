package ch.gcv.vokabeltrainer.model;

import java.util.ArrayList;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface IProfile {
 
	public ITopic addTopic(ITopic topic);
	public ITopic deleteTopic(ITopic topic);
	public ArrayList<ITopic> getTopics();
	public ITopic getTopic(String name);
  
}
 
