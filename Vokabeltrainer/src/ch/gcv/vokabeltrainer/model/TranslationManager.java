package ch.gcv.vokabeltrainer.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import ch.gcv.vokabeltrainer.interfaces.Translatable;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TranslationManager {

	private static final String defaultLanguage = "en";
	private static TranslationManager instance;
	private ArrayList<Translatable> languageChangedListeners;
	private ArrayList<String> languages;
	private ResourceBundle bundle;

	public TranslationManager() {
		super();
		this.languageChangedListeners = new ArrayList<Translatable>();
		this.languages = new ArrayList<String>();
		this.languages.add("de");
		this.languages.add("en");
		this.languages.add("fr");
		this.languages.add("it");
		this.setLanguage(defaultLanguage);
	}

	/**
	 * languageChanged
	 * 
	 */
	private void languageChanged() {
		for (Translatable translatable : this.languageChangedListeners) {
			translatable.translate();
		}
	}

	/**
	 * getText implements ITranslationManager.getText This method give you a
	 * text.
	 * 
	 * @param key
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
	 * 
	 */
	public void setLanguage(String language) {

		String baseName = "ch.gcv.vokabeltrainer.model.messages"; //$NON-NLS-1$
		Locale.setDefault(new Locale(language)); //$NON-NLS-1$ //$NON-NLS-2$
		try {
			bundle = ResourceBundle.getBundle(baseName);
		} catch (MissingResourceException e) {
			System.err.println(e); 
		}
		this.languageChanged();
	}

	/**
	 * getLanguages implements ITranslationManager.getLanguages
	 * 
	 * @return ArrayList<String> 
	 */
	public ArrayList<String> getLanguages() {
		return this.languages;
	}

	/**
	 * getInstance implements ITranslationManager.getInstance
	 * 
	 * @return ITranslationManager
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
	 * @return boolean
	 */
	public boolean addListener(Translatable listener) {
		return this.languageChangedListeners.add(listener);
	}

	/**
	 * removeListener implements ITranslationManager.removeListener
	 * 
	 * @param listener
	 * @return boolean
	 */
	public boolean removeListener(Translatable listener) {
		Iterator<Translatable> it = languageChangedListeners
				.iterator();
		while (it.hasNext()) {
			Translatable langListener = it.next();
			if (listener == langListener) {
				it.remove();
				return true;
			}
		}
		return false;
	}

}
