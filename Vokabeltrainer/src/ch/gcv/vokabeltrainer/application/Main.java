package ch.gcv.vokabeltrainer.application;

import javax.naming.Context;

import profile.ProfileManager;
import profile.UserProfile;
import ch.gcv.vokabeltrainer.translation.TranslationManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TranslationManager tm = TranslationManager.getInstance();
		tm.setLanguage("de");
		System.out.println(tm.getString("Test.0"));
		ProfileManager pm = ProfileManager.getInstance();
		
		
	}

}
