package ch.gcv.vokabeltrainer.model;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ITranslationManager {
 
	public String getText(String key);
	public void setLanguage(String language);
	public ArrayList<String> getLanguages();
	public ITranslationManager getInstance();
	public boolean addListener(ILanguageChangedListener listener);
	public boolean removeListener(ILanguageChangedListener listener);
  
}
 
