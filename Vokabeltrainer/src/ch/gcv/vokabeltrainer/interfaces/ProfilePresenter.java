package ch.gcv.vokabeltrainer.interfaces;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ProfilePresenter {
 
	public Profile getModel();
	public void setModel(Profile model);
	public ProfileView getView();
	public void setView(ProfileView view);
	public void setOnCreateTopic(Presentable onCreateTopic);
	public void setOnOpenTopic(Presentable onOpenTopic);
	public void setOnDeleteTopic();
	public void createTopic();
	public void saveProfile(String path);
	public void loadProfile(String path);
	public void exportTopic(String name, String path);
	public void importTopic(String path);
	public void openTopic(Topic topic);
	public void deleteTopic(Topic topic);
	public void createNewProfile();
  
}
 
