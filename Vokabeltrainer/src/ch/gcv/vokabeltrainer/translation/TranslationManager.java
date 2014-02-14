package ch.gcv.vokabeltrainer.translation;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class TranslationManager {

	private static TranslationManager instance;
	private ResourceBundle bundle;

	private TranslationManager() {

	}

	public static synchronized TranslationManager getInstance() {
		if (TranslationManager.instance == null) {
			TranslationManager.instance = new TranslationManager();
		}
		return TranslationManager.instance;
	}

	public void setLanguage(String lng) {

		String baseName = "ch.gcv.vokabeltrainer.translation.messages"; //$NON-NLS-1$
		Locale.setDefault(new Locale(lng, lng)); //$NON-NLS-1$ //$NON-NLS-2$
		try {
			bundle = ResourceBundle.getBundle(baseName);

		} catch (MissingResourceException e) {
			System.err.println(e);
		}

	}

	public String getString(String key) {

		return bundle.getString(key);

	}

}
