package ch.gcv.vokabeltrainer.model;

import java.util.ArrayList;
import java.util.HashSet;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class Profile  implements IProfile {

    private HashSet<String, Topic> topics;

	public Profile(){
		super();
		this.topics = null; // TODO
		throw new UnsupportedOperationException("Not implemented");
	}
 

    /** 
     * addTopic implements IProfile.addTopic
	 * @param topic // TODO 
	 *
	 */
	@Override
	public void addTopic(ITopic topic) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * deleteTopic implements IProfile.deleteTopic
	 * @param topic // TODO 
	 *
	 */
	@Override
	public void deleteTopic(ITopic topic) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getTopics implements IProfile.getTopics
	 * @return ArrayList<ITopic>  // TODO
	 */
	@Override
	public ArrayList<ITopic> getTopics() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getTopic implements IProfile.getTopic
	 * @param name // TODO 
	 * @return ITopic  // TODO
	 */
	@Override
	public ITopic getTopic(String name) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

}
 
