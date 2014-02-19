package ch.gcv.vokabeltrainer.application;

import javax.naming.Context;

import ch.gcv.vokabeltrainer.profile.ProfileManager;
import ch.gcv.vokabeltrainer.profile.Profile;
import ch.gcv.vokabeltrainer.translation.TranslationManager;

public class Main {

	// new
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TranslationManager tm = TranslationManager.getInstance();
		tm.setLanguage("de");
		System.out.println(tm.getString("Test.0"));
		ProfileManager pm = ProfileManager.getInstance();
		
		
	}

}
