package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.interfaces.Profile;
import ch.gcv.vokabeltrainer.interfaces.Topic;
import ch.gcv.vokabeltrainer.interfaces.TopicCreatePresenter;
import ch.gcv.vokabeltrainer.interfaces.TopicCreateView;
import ch.gcv.vokabeltrainer.model.PresenterManager;
import ch.gcv.vokabeltrainer.model.ProfileManager;
import ch.gcv.vokabeltrainer.view.TopicCreateViewImpl;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicCreatePresenterImpl implements TopicCreatePresenter,
		Presentable {

	private Presentable onConfirm;
	private Topic model;
	private Presentable onCancel;
	private TopicCreateView view;

	public TopicCreatePresenterImpl() {
		super();
		this.onConfirm = null; // TODO
		this.model = null; // TODO
		this.onCancel = null; // TODO
		this.view = new TopicCreateViewImpl();
		PresenterManager.getInstance().add(this);
	}

	/**
	 * getModel implements ITopicEditPresenter.getModel
	 * 
	 * @return ITopic // TODO
	 */
	@Override
	public Topic getModel() {
		return this.model;
	}

	/**
	 * setModel implements ITopicEditPresenter.setModel
	 * 
	 * @param topic
	 *            // TODO
	 * 
	 */
	@Override
	public void setModel(Topic topic) {
		this.model = topic;
	}

	/**
	 * getView implements ITopicEditPresenter.getView
	 * 
	 * @return ITopicEditView // TODO
	 */
	@Override
	public TopicCreateView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setView implements ITopicEditPresenter.setView
	 * 
	 * @param view
	 *            // TODO
	 * 
	 */
	@Override
	public void setView(TopicCreateView view) {
		this.view = view;
	}

	/**
	 * setOnConfirm implements ITopicEditPresenter.setOnConfirm
	 * 
	 * @param onConfirm
	 *            // TODO
	 * 
	 */
	@Override
	public void setOnConfirm(Presentable onConfirm) {
		this.onConfirm = onConfirm;
	}

	/**
	 * setOnCancel implements ITopicEditPresenter.setOnCancel
	 * 
	 * @param onCancel
	 *            // TODO
	 * 
	 */
	@Override
	public void setOnCancel(Presentable onCancel) {
		this.onCancel = onCancel;
	}

	/**
	 * confirm implements ITopicEditPresenter.confirm
	 * 
	 */
	@Override
	public void confirm() {
		// TODO should be implemented
		Profile profile = ProfileManager.getInstance().getProfile();

		if (this.model.getName().equals("")) {
			this.view.fieldsNotSet();
		} else {
			if (profile.getTopic(this.model.getName()) == null) {
				profile.addTopic(this.model);
				this.view.close();
				this.onConfirm.run();
			} else {
				this.view.duplicateTopic();
			}
		}

	}

	/**
	 * cancel implements ITopicEditPresenter.cancel
	 * 
	 */
	@Override
	public void cancel() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
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
	public void refresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		this.view.close();
	}

}
