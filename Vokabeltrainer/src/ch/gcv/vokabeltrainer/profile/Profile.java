package ch.gcv.vokabeltrainer.profile;

public class Profile implements java.io.Serializable{

	
	/**
	 * new
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String lastName;
	
	
	public Profile(){
		
		this.name = "chris";
		this.lastName = "Frueh";
		
	}
	
	public Profile(String name, String lastName){
		this.name = name;
		this.lastName = lastName;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void removeUser(String name){
		
		
	}
}
