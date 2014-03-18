package ch.gcv.vokabeltrainer.presenter;

import javax.swing.JTextPane;

import ch.gcv.vokabeltrainer.interfaces.ProfilePresenter;
import ch.gcv.vokabeltrainer.interfaces.Profile;
import ch.gcv.vokabeltrainer.interfaces.ProfileView;
import ch.gcv.vokabeltrainer.interfaces.Topic;
import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.model.ImportExportManager;
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

	private Presentable onOpenTopic;
	private ProfileView view;
	private Profile model;
	private Presentable onCreateTopic;
	private Presentable onDeleteTopic;

	public ProfilePresenterImpl() {
		super();
	}

	/**
	 * getModel implements IProfilePresenter.getModel
	 * 
	 * @return IProfile // TODO
	 */
	@Override
	public Profile getModel() {
		return this.model;
	}

	/**
	 * setModel implements IProfilePresenter.setModel
	 * 
	 * @param model
	 *            // TODO
	 * 
	 */
	@Override
	public void setModel(Profile model) {
		this.model = model;
	}

	/**
	 * getView implements IProfilePresenter.getView
	 * 
	 * @return IProfileView // TODO
	 */
	@Override
	public ProfileView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setView implements IProfilePresenter.setView
	 * 
	 * @param view
	 *            // TODO
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
	 *            // TODO
	 * 
	 */
	@Override
	public void setOnCreateTopic(Presentable onCreateTopic) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setOnOpenTopic implements IProfilePresenter.setOnOpenTopic
	 * 
	 * @param onOpenTopic
	 *            // TODO
	 * 
	 */
	@Override
	public void setOnOpenTopic(Presentable onOpenTopic) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setOnDeleteTopic implements IProfilePresenter.setOnDeleteTopic
	 * 
	 */
	@Override
	public void setOnDeleteTopic() {
		// TODO should be implemented
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
	public void saveProfile(String path) {
		ProfileManager.getInstance().saveProfile(path);
	}

	/**
	 * loadProfile implements IProfilePresenter.loadProfile
	 */
	@Override
	public void loadProfile(String path) {
		this.model = ProfileManager.getInstance().loadProfile(path);
	}



	/**
	 * openTopic implements IProfilePresenter.openTopic
	 * 
	 * @param topic
	 *            // TODO
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
	 *            // TODO
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
		this.model = ProfileManager.getInstance().createProfile();
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

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

}
