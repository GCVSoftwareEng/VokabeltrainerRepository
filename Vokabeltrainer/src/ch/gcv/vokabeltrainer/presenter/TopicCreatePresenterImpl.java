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
	private TopicCreateView view;

	public TopicCreatePresenterImpl() {
		super();
		this.onConfirm = null;
		this.model = null;
		this.view = new TopicCreateViewImpl();
		PresenterManager.getInstance().add(this);
	}

	/**
	 * getModel implements ITopicEditPresenter.getModel
	 * 
	 * @return ITopic
	 */
	@Override
	public Topic getModel() {
		return this.model;
	}

	/**
	 * setModel implements ITopicEditPresenter.setModel
	 * 
	 * @param topic
	 * 
	 */
	@Override
	public void setModel(Topic topic) {
		this.model = topic;
	}

	/**
	 * getView implements ITopicEditPresenter.getView
	 * 
	 * @return ITopicEditView
	 */
	@Override
	public TopicCreateView getView() {
		return this.view;
	}

	/**
	 * setView implements ITopicEditPresenter.setView
	 * 
	 * @param view
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
	 * 
	 */
	@Override
	public void setOnCancel(Presentable onCancel) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * confirm implements ITopicEditPresenter.confirm
	 * 
	 */
	@Override
	public void confirm() {
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
		this.view.updateViewFromModel();
	}

	@Override
	public void stop() {
		this.view.close();
	}

}
