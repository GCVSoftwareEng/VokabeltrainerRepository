package ch.gcv.vokabeltrainer.model;

import ch.gcv.vokabeltrainer.interfaces.Topic;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class ImportExportManager   {

    private static ImportExportManager instance;

	public ImportExportManager(){
		super();
		this.instance = null; // TODO
		throw new UnsupportedOperationException("Not implemented");
	}
 
    /** 
     * exportTopic
	 * @param topic // TODO 
	 * @param path // TODO 
	 *
	 */
	public void exportTopic(Topic topic,String path) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * importTopic
	 * @param path // TODO 
	 * @return boolean  // TODO
	 */
	public boolean importTopic(String path) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getInstance
	 * @return ImportExportManager  // TODO
	 */
	public static ImportExportManager getInstance() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }


}
 
