package ch.gcv.vokabeltrainer.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ch.gcv.vokabeltrainer.interfaces.Topic;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class ImportExportManager {

	private static ImportExportManager instance;

	public ImportExportManager() {
		super();
	}

	/**
	 * exportTopic
	 * 
	 * @param topic2
	 *            // TODO
	 * @param path
	 *            // TODO
	 * 
	 */
	public boolean exportTopic(Topic topic, String path) {
		try {
			FileOutputStream out = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(topic);
			oos.flush();
			return true;
		} catch (Exception e) {
			System.out.println("Problem serializing: " + e);
			return false;
		}
	}

	/**
	 * importTopic
	 * 
	 * @param path
	 *            // TODO
	 * @return boolean // TODO
	 */
	public Topic importTopic(String path) {
		Topic tmp = null;
		try {

			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream is = new ObjectInputStream(fis);
			tmp = (Topic) is.readObject();
			is.close();
		} catch (Exception ex) {
			System.out.println("Problem serializing: " + ex);
		}
		return tmp;
	}

	/**
	 * getInstance
	 * 
	 * @return ImportExportManager // TODO
	 */
	public static ImportExportManager getInstance() {
		if (ImportExportManager.instance == null) {
			ImportExportManager.instance = new ImportExportManager();
		}
		return ImportExportManager.instance;
	}

}
