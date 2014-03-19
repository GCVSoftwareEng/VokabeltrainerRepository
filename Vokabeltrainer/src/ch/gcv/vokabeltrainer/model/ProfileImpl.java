package ch.gcv.vokabeltrainer.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import ch.gcv.vokabeltrainer.interfaces.Profile;
import ch.gcv.vokabeltrainer.interfaces.Topic;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class ProfileImpl implements Profile, Serializable{


	private static final long serialVersionUID = 133L;
	private HashMap<String, Topic> topics; // CHF

	public ProfileImpl() {
		super();
		this.topics = new HashMap<String, Topic>(); // CHF
	}

	/**
	 * addTopic implements IProfile.addTopic
	 * This method adds topic
	 * @param topic The topic to add
	 *            
	 * 
	 */
	@Override
	public Topic addTopic(Topic topic) {
		return topics.put(topic.getName(), topic); // CHF

	}

	/**
	 * deleteTopic implements IProfile.deleteTopic
	 * This method delete the topic
	 * @param topic
	 * @return topic .getName   //CHF
	 * 
	 */

	@Override
	public Topic deleteTopic(Topic topic) {
		return this.topics.remove(topic.getName()); // CHF

	}

	/**
	 * getTopics implements IProfile.getTopics
	 * This method is used to retrive a list of topics
	 * The topics will be displayed in a list
	 * @return ArrayList<ITopic> 
	 */
	@Override
	public ArrayList<Topic> getTopics() {
		ArrayList<Topic> temp = new ArrayList<Topic>();
		
		for (Topic iTopic : this.topics.values()) {
			temp.add(iTopic);
		}
		
		return temp;
	}

	/**
	 * getTopic implements IProfile.getTopic
	 * This method is used to get a topic
	 * @param name
	 *           
	 * @return ITopic return the requested topic
	 */
	@Override
	public Topic getTopic(String name) {
		return this.topics.get(name);  // CHF
		
	}

}
