package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.interfaces.Profile;
import ch.gcv.vokabeltrainer.interfaces.ProfileView;
import ch.gcv.vokabeltrainer.interfaces.Topic;
import ch.gcv.vokabeltrainer.interfaces.Presentable;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface IProfilePresenter {
 
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
	public void openTopic(Topic topic);
	public void deleteTopic(Topic topic);
	public void createNewProfile();
  
}
 
