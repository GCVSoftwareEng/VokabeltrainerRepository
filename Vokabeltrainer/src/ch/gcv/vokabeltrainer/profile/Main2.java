package ch.gcv.vokabeltrainer.profile;

public class Main2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProfileManager pm = ProfileManager.getInstance();
		Context con = pm.getContext();
		UserProfile user = new UserProfile();
		con.addUser("asd", user);
		
		pm.save();
		
		
		
	}

}


