package ch.gcv.vokabeltrainer.model;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface IProfileManager {
 
	public IProfile loadProfile(String path);
	public boolean saveProfile(String path);
	public IProfileManager getInstance();
	public IProfile createProfile();
	public IProfile getProfile();
  
}
 
