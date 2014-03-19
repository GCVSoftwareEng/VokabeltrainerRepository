package ch.gcv.vokabeltrainer.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ch.gcv.vokabeltrainer.interfaces.Profile;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class ProfileManager {

	private ProfileImpl profile;
	private static ProfileManager instance;
	private String profilePath;

	public ProfileManager() {
		super();
		this.profile = new ProfileImpl(); // init with an empty profile
		this.profilePath = "";
	}

	/**
	 * loadProfile implements IProfileManager.loadProfile
	 * 
	 * @param path
	 * @return IProfile
	 */
	public Profile loadProfile(String path) {
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream is = new ObjectInputStream(fis);
			this.profile = (ProfileImpl) is.readObject();
			is.close();
			this.profilePath = path;
		} catch (Exception ex) {
			System.out.println("Problem serializing: " + ex);
		}
		return this.profile;
	}


	/**
	 * saveProfile implements IProfileManager.saveProfile
	 * 
	 * @param path
	 * @return boolean
	 */
	public boolean saveProfile(String path) {
		try {
			FileOutputStream out = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(this.profile);
			oos.flush();
			this.profilePath = path;
			return true;
		} catch (Exception e) {
			System.out.println("Problem serializing: " + e);
			return false;
		}
	}
	/**
	 * saveProfile implements IProfileManager.saveProfile
	 * 
	 * @param path
	 * @return boolean
	 */
	public boolean saveProfile() {
		return this.saveProfile(this.profilePath);
	}


	/**
	 * getInstance implements IProfileManager.getInstance
	 * 
	 * @return IProfileManager 
	 */
	public static ProfileManager getInstance() {
		if (ProfileManager.instance == null) {
			ProfileManager.instance = new ProfileManager();
		}
		return ProfileManager.instance;
	}

	/**
	 * createProfile implements IProfileManager.createProfile
	 * 
	 * @return IProfile 
	 */
	public Profile createProfile() {
		this.profilePath = "";
		return this.profile = new ProfileImpl();
	}

	/**
	 * getProfile implements IProfileManager.getProfile
	 * 
	 * @return IProfile 
	 */
	public Profile getProfile() {
		return this.profile;	
	}

}




