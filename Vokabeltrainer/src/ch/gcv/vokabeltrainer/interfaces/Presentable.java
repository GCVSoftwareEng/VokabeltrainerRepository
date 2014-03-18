package ch.gcv.vokabeltrainer.interfaces;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface Presentable extends Runnable {
 
	public void refresh();
	public void stop();
	
}
 
