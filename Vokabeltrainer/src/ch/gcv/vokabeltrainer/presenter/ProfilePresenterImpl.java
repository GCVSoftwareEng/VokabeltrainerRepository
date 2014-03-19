package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.interfaces.Profile;
import ch.gcv.vokabeltrainer.interfaces.ProfilePresenter;
import ch.gcv.vokabeltrainer.interfaces.ProfileView;
import ch.gcv.vokabeltrainer.interfaces.Topic;
import ch.gcv.vokabeltrainer.model.ImportExportManager;
import ch.gcv.vokabeltrainer.model.PresenterManager;
import ch.gcv.vokabeltrainer.model.ProfileManager;
import ch.gcv.vokabeltrainer.model.TopicImpl;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class ProfilePresenterImpl implements ProfilePresenter, Presentable {

	private ProfileView view;
	private Profile model;

	public ProfilePresenterImpl() {
		super();
	}

	/**
	 * getModel implements IProfilePresenter.getModel
	 * 
	 * @return IProfile
	 */
	@Override
	public Profile getModel() {
		return this.model;
	}

	/**
	 * setModel implements IProfilePresenter.setModel
	 * 
	 * @param model
	 * 
	 */
	@Override
	public void setModel(Profile model) {
		this.model = model;
	}

	/**
	 * getView implements IProfilePresenter.getView
	 * 
	 * @return IProfileView
	 */
	@Override
	public ProfileView getView() {
		return this.view;
	}

	/**
	 * setView implements IProfilePresenter.setView
	 * 
	 * @param view
	 * 
	 */
	@Override
	public void setView(ProfileView view) {
		this.view = view;
	}

	/**
	 * setOnCreateTopic implements IProfilePresenter.setOnCreateTopic
	 * 
	 * @param onCreateTopic
	 * 
	 */
	@Override
	public void setOnCreateTopic(Presentable onCreateTopic) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setOnOpenTopic implements IProfilePresenter.setOnOpenTopic
	 * 
	 * @param onOpenTopic
	 * 
	 */
	@Override
	public void setOnOpenTopic(Presentable onOpenTopic) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setOnDeleteTopic implements IProfilePresenter.setOnDeleteTopic
	 * 
	 */
	@Override
	public void setOnDeleteTopic() {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * createTopic implements IProfilePresenter.createTopic
	 * 
	 */
	@Override
	public void createTopic() {
		TopicCreatePresenterImpl tep = new TopicCreatePresenterImpl();
		tep.setOnConfirm(this);
		tep.setModel(new TopicImpl());
		tep.run();
	}

	/**
	 * saveProfile implements IProfilePresenter.saveProfile
	 * 
	 */
	@Override
	public boolean saveProfile(String path) {
		return ProfileManager.getInstance().saveProfile(path);
	}

	@Override
	public boolean saveProfile() {
		return ProfileManager.getInstance().saveProfile();
	}

	/**
	 * loadProfile implements IProfilePresenter.loadProfile
	 */
	@Override
	public void loadProfile(String path) {
		PresenterManager.getInstance().stopAll();
		this.model = ProfileManager.getInstance().loadProfile(path);
	}

	/**
	 * openTopic implements IProfilePresenter.openTopic
	 * 
	 * @param topic
	 * 
	 */
	@Override
	public void openTopic(Topic topic) {
		TopicPresenterImpl tp = new TopicPresenterImpl();
		tp.setModel(topic);
		tp.run();
	}

	/**
	 * deleteTopic implements IProfilePresenter.deleteTopic
	 * 
	 * @param topic
	 * 
	 */
	@Override
	public void deleteTopic(Topic topic) {
		this.model.deleteTopic(topic);
	}

	/**
	 * run implements java.lang.Runnable.run
	 * 
	 */
	@Override
	public void run() {
		view.setPresenter(this);
		view.open();
		view.updateViewFromModel();
	}

	@Override
	public void createNewProfile() {
		PresenterManager.getInstance().stopAll();
		this.model = ProfileManager.getInstance().createProfile();
	}

	@Override
	public void refresh() {
		this.view.updateViewFromModel();
	}

	@Override
	public void exportTopic(String name, String path) {
		Topic topic = this.model.getTopic(name);
		ImportExportManager.getInstance().exportTopic(topic, path);
	}

	@Override
	public void importTopic(String path) {
		Topic topic = ImportExportManager.getInstance().importTopic(path);
		this.model.addTopic(topic);
	}

	@Override
	public void stop() {
		this.view.close();
	}

}
