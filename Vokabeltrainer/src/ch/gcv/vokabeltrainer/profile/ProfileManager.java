package ch.gcv.vokabeltrainer.profile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProfileManager {

	private static ProfileManager instance = null;
	private static final String defaultContextFileName = "userList.context.sav";
	private Profile profile;

	public ProfileManager() {
		this.profile = new Profile();
	}

	/**
	 * new
	 * Singleton for ContextManager.
	 * 
	 * @return instance.
	 */
	public static ProfileManager getInstance() {
		if (instance == null) {
			instance = new ProfileManager();
			return instance;
		} else {
			return instance;
		}
	}

	/**
	 * Return context save medium.
	 */
	public Profile getContext() {

		return this.profile;

	}

	/**
	 * Load the context save file.
	 */
	public Profile load() {

		try {

			FileInputStream fis = new FileInputStream(
					this.defaultContextFileName);
			ObjectInputStream is = new ObjectInputStream(fis);
			this.profile = (Profile) is.readObject();

			is.close();

		} catch (Exception ex) {

		}
		return this.profile;

	}

	/**
	 * Save the context file.
	 */
	public void save() {

		try {
			FileOutputStream out = new FileOutputStream(
					this.defaultContextFileName);
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(this.profile);
			oos.flush();
		} catch (Exception e) {
			System.out.println("Problem serializing: " + e);
		}

	}
}
