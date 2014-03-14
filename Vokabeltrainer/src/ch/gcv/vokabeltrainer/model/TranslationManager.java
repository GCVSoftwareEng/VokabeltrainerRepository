package ch.gcv.vokabeltrainer.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;

import ch.gcv.vokabeltrainer.model.TranslationManager;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TranslationManager {

	private static TranslationManager instance;
	private ArrayList<ITranslatable> languageChangedListeners;
	private ArrayList<String> languages;
	private ResourceBundle bundle; // CHF ADD

	public TranslationManager() {
		super();
		this.languageChangedListeners = new ArrayList<ITranslatable>();
		this.languages = new ArrayList<String>();
		// TODO load available languages
		this.languages.add("de");
		this.languages.add("it");
		this.languages.add("fr");
		this.languages.add("en");
	}

	/**
	 * languageChanged
	 * 
	 */
	private void languageChanged() {
		for (ITranslatable translatable : this.languageChangedListeners) {
			translatable.translate();
		}
	}

	/**
	 * getText implements ITranslationManager.getText This method give you a
	 * text.
	 * 
	 * @param key
	 *            // CHF
	 * @return String
	 */
	public String getText(String key) {
		try {
			return bundle.getString(key);
		} catch (Exception e) {
			return key;
		}
	}

	/**
	 * setLanguage implements ITranslationManager.setLanguage
	 * 
	 * @param language
	 *            // TODO CHF
	 * 
	 */
	public void setLanguage(String language) {

		String baseName = "ch.gcv.vokabeltrainer.model.messages"; //$NON-NLS-1$
		Locale.setDefault(new Locale(language, language)); //$NON-NLS-1$ //$NON-NLS-2$
		try {
			bundle = ResourceBundle.getBundle(baseName);
		} catch (MissingResourceException e) {
			System.err.println(e); // TODO
		}
		
		this.languageChanged();

	}

	/**
	 * getLanguages implements ITranslationManager.getLanguages
	 * 
	 * @return ArrayList<String> // TODO
	 */
	public ArrayList<String> getLanguages() {
		return this.languages;
	}

	/**
	 * getInstance implements ITranslationManager.getInstance
	 * 
	 * @return ITranslationManager // TODO
	 */
	public static TranslationManager getinstance() {
		if (TranslationManager.instance == null) {
			TranslationManager.instance = new TranslationManager();
		}
		return TranslationManager.instance;
	}

	/**
	 * addListener implements ITranslationManager.addListener
	 * 
	 * @param listener
	 *            // TODO
	 * @return boolean // TODO
	 */
	public boolean addListener(ITranslatable listener) {
		return this.languageChangedListeners.add(listener);
	}

	/**
	 * removeListener implements ITranslationManager.removeListener
	 * 
	 * @param listener
	 *            // TODO
	 * @return boolean // TODO
	 */
	public boolean removeListener(ITranslatable listener) {

		Iterator<ITranslatable> it = languageChangedListeners
				.iterator();
		while (it.hasNext()) {
			ITranslatable langListener = it.next();
			if (listener == langListener) {
				it.remove();
				return true;
			}

		}
		return false;
	}

}
