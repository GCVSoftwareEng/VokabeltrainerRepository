package ch.gcv.vokabeltrainer.model;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TranslationManager  implements ITranslationManager {

    private TranslationManager instance;
    private ArrayList<ILanguageChangedListener> languageChangedListeners;

	public TranslationManager(){
		super();
		this.instance = null; // TODO
		this.languageChangedListeners = null; // TODO
		throw new UnsupportedOperationException("Not implemented");
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
	 * @param key // TODO 
	 * @return String  // TODO
	 */
	@Override
	public String getText(String key) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setLanguage implements ITranslationManager.setLanguage
	 * @param language // TODO 
	 *
	 */
	@Override
	public void setLanguage(String language) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getLanguages implements ITranslationManager.getLanguages
	 * @return ArrayList<String>  // TODO
	 */
	@Override
	public ArrayList<String> getLanguages() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getInstance implements ITranslationManager.getInstance
	 * @return ITranslationManager  // TODO
	 */
	@Override
	public ITranslationManager getInstance() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
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

}
 
