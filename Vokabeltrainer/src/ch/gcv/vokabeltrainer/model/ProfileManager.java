package ch.gcv.vokabeltrainer.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class ProfileManager implements IProfileManager {

	private Profile profile;
	private static ProfileManager instance;

	public ProfileManager() {
		super();
		this.profile = null; // TODO
		this.instance = null; // TODO
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * loadProfile implements IProfileManager.loadProfile
	 * 
	 * @param path
	 *            // TODO
	 * @return IProfile // TODO
	 */
	@Override
	public IProfile loadProfile(String path) {
		try {

			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream is = new ObjectInputStream(fis);
			this.profile = (Profile) is.readObject();

			is.close();

		} catch (Exception ex) {
			

		}
		return this.profile;
	}
	
	
	
	
	

	// TODO should be implemented

	/**
	 * saveProfile implements IProfileManager.saveProfile
	 * 
	 * @param path
	 *            // TODO
	 * @return boolean // TODO
	 */
	@Override
	public boolean saveProfile(String path) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * getInstance implements IProfileManager.getInstance
	 * 
	 * @return IProfileManager // TODO
	 */
	@Override
	public IProfileManager getInstance() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * createProfile implements IProfileManager.createProfile
	 * 
	 * @return IProfile // TODO
	 */
	@Override
	public IProfile createProfile() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * getProfile implements IProfileManager.getProfile
	 * 
	 * @return IProfile // TODO
	 */
	@Override
	public IProfile getProfile() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

}
