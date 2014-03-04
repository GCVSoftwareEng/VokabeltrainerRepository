package ch.gcv.vokabeltrainer.model;

import java.util.ArrayList;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import ch.gcv.vokabeltrainer.model.TranslationManager;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TranslationManager  implements ITranslationManager {

    private static TranslationManager instance;
    private ArrayList<ILanguageChangedListener> languageChangedListeners;
    
    private ResourceBundle bundle; // CHF ADD

	public TranslationManager(){
		super();
		this.instance = null; // CHF
		this.languageChangedListeners = null; // CHF
		
	}
 
    /** 
     * languageChanged
	 *
	 */
	private void languageChanged() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getText implements ITranslationManager.getText
     * This method give you a text.
	 * @param key // CHF
	 * @return String 
	 */
	@Override
	public String getText(String key) {
		return bundle.getString(key);  // CHF
		
    }

    /** 
     * setLanguage implements ITranslationManager.setLanguage
	 * @param language // TODO    CHF
	 *
	 */
	@Override
	public void setLanguage(String language) {

		String baseName = "ch.gcv.vokabeltrainer.model.messages"; //$NON-NLS-1$
		Locale.setDefault(new Locale(language, language)); //$NON-NLS-1$ //$NON-NLS-2$
		try {
			bundle = ResourceBundle.getBundle(baseName);

		} catch (MissingResourceException e) {
			System.err.println(e);
		}
	
    }

    /** 
     * getLanguages implements ITranslationManager.getLanguages
	 * @return ArrayList<String>  // TODO
	 */
	@Override
	public ArrayList<String> getLanguages() {
		
		return (ArrayList<String>);
		
		
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getInstance implements ITranslationManager.getInstance
	 * @return ITranslationManager  // TODO
	 */
	@Override
	public ITranslationManager getInstance() {
		
			if (TranslationManager.instance == null) {
				TranslationManager.instance = new TranslationManager();
			}
			return TranslationManager.instance;
    }

    /** 
     * addListener implements ITranslationManager.addListener
	 * @param listener // TODO 
	 * @return boolean  // TODO
	 */
	@Override
	public boolean addListener(ILanguageChangedListener listener) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * removeListener implements ITranslationManager.removeListener
	 * @param listener // TODO 
	 * @return boolean  // TODO
	 */
	@Override
	public boolean removeListener(ILanguageChangedListener listener) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }
	
	
	// test
	
	public static void main(String[] args) {
		
		TranslationManager t = new TranslationManager();
		t.setLanguage("de");
		
    }
	

}
 
