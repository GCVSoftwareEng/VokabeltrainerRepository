package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.model.IProfile;
import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.view.IProfileView;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface IProfilePresenter {
 
	public IProfile getModel();
	public void setModel(IProfile model);
	public IProfileView getView();
	public void setView(IProfileView view);
	public void setOnCreateTopic(Runnable onCreateTopic);
	public void setOnOpenTopic(Runnable onOpenTopic);
	public void setOnDeleteTopic();
	public void createTopic();
	public void saveProfile(String path);
	public void openTopic(ITopic topic);
	public void deleteTopic(ITopic topic);
  
}
 
