package ch.gcv.vokabeltrainer.model;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface IImportExportManager {
 
	public void exportTopic(ITopic topic,String path);
	public boolean importTopic(String path);
  
}
 
