package ch.gcv.vokabeltrainer.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class Profile implements IProfile {

	private HashMap<String, ITopic> topics; // CHF

	public Profile() {
		super();
		this.topics = new HashMap<String, ITopic>(); // CHF
	
	}

	/**
	 * addTopic implements IProfile.addTopic
	 * This method adds topic
	 * @param topic The topic to add
	 *            
	 * 
	 */
	@Override
	public ITopic addTopic(ITopic topic) {
		return topics.put(topic.getName(), topic); // CHF

	}

	/**
	 * deleteTopic implements IProfile.deleteTopic
	 * 
	 * @param topic
	 *            // TODO
	 * 
	 */

	@Override
	public ITopic deleteTopic(ITopic topic) {
		return this.topics.remove(topic.getName()); // CHF

	}

	/**
	 * getTopics implements IProfile.getTopics
	 * This method is used to retrive a list of topics
	 * The topics will be displayed in a list
	 * @return ArrayList<ITopic> 
	 */
	@Override
	public ArrayList<ITopic> getTopics() {
		return (ArrayList<ITopic>) this.topics.values(); //CHF
	}

	/**
	 * getTopic implements IProfile.getTopic
	 * This method is used to get a topic
	 * @param name
	 *            // TODO
	 * @return ITopic // TODO
	 */
	@Override
	public ITopic getTopic(String name) {
		return this.topics.get(name);  // CHF
		
	}

}