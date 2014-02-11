package ch.gcv.vokabeltrainer.translation;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class TranslationManager {

	private static TranslationManager instance;

	// Verhindere die Erzeugung des Objektes �ber andere Methoden
	private TranslationManager() {

	}

	// Eine Zugriffsmethode auf Klassenebene, welches dir '''einmal''' ein
	// konkretes
	// Objekt erzeugt und dieses zur�ckliefert.
	public static synchronized TranslationManager getInstance() {
		if (TranslationManager.instance == null) {
			TranslationManager.instance = new TranslationManager();
		}
		return TranslationManager.instance;
	}

	
	
	
	
	
	
	
	
	
}
