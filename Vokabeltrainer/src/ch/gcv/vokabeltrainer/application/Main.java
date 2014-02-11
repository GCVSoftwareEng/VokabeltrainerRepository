package ch.gcv.vokabeltrainer.application;


import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import ch.gcv.vokabeltrainer.translation.TranslationManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TranslationManager tm = TranslationManager.getInstance();
		tm.setLanguage("en");
		System.out.println(tm.getString("Test.0"));
		
	}

}
