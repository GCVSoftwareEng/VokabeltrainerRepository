package ch.gcv.vokabeltrainer.model;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class Application {

	public static final int boxCount = 5;

	public Application() {
		super();
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * main
	 * 
	 * @param args
	 *            // TODO
	 * 
	 */
	public static void main(String[] args) {

		// setup translation manager
		TranslationManager tm = TranslationManager.getinstance();
		// setup profile manager
		ProfileManager pm = ProfileManager.getInstance();
		
		// setup and run the profile presenter
		ProfilePresenter ps = new ProfilePresenter();
		ProfileView pv = new ProfileView();
		ps.setModel(pm.getProfile());
		ps.setView(pv);
		ps.run();

	}

}
