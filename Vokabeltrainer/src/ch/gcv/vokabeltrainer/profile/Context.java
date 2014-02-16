package ch.gcv.vokabeltrainer.profile;

import java.util.HashMap;

public class Context implements java.io.Serializable {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 5079802664261751169L;

	private UserProfile user;
	public HashMap<String, UserProfile> userList;

	public Context() {

		userList = new HashMap<String, UserProfile>();
//		this.user = new UserProfile();
//		this.userList.put("Chris", user);

	}

	public UserProfile findUser(String name) {

		UserProfile theUser = userList.get(name);

		return theUser;

	}

	public UserProfile removeUser(String name) {

		return userList.remove(name);
	}
	
	public UserProfile addUser(String name,UserProfile user){
		
		return userList.put("1",user);
	}

}
