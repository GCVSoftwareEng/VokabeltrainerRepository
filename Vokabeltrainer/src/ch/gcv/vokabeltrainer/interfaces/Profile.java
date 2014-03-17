package ch.gcv.vokabeltrainer.interfaces;

import java.util.ArrayList;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface Profile {
 
	public Topic addTopic(Topic topic);
	public Topic deleteTopic(Topic topic);
	public ArrayList<Topic> getTopics();
	public Topic getTopic(String name);
  
}
 
