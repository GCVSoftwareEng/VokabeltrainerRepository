package ch.gcv.vokabeltrainer.presenter;


import ch.gcv.vokabeltrainer.interfaces.Profile;
import ch.gcv.vokabeltrainer.interfaces.Topic;
import ch.gcv.vokabeltrainer.interfaces.TopicEditView;
import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.interfaces.Translatable;
import ch.gcv.vokabeltrainer.model.ProfileManager;
import ch.gcv.vokabeltrainer.view.TopicEditViewImpl;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicCreatePresenter  implements ITopicCreatePresenter, Presentable {

    private Presentable onConfirm;
    private Topic model;
    private Presentable onCancel;
    private TopicEditView view;
    

	public TopicCreatePresenter(){
		super();
		this.onConfirm = null; // TODO
		this.model = null; // TODO
		this.onCancel = null; // TODO
		this.view = new TopicEditViewImpl();
		
	}
 


    /** 
     * getModel implements ITopicEditPresenter.getModel
	 * @return ITopic  // TODO
	 */
	@Override
	public Topic getModel() {
		return this.model;
    }

    /** 
     * setModel implements ITopicEditPresenter.setModel
	 * @param topic // TODO 
	 *
	 */
	@Override
	public void setModel(Topic topic) {
		this.model = topic;
    }

    /** 
     * getView implements ITopicEditPresenter.getView
	 * @return ITopicEditView  // TODO
	 */
	@Override
	public TopicEditView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setView implements ITopicEditPresenter.setView
	 * @param view // TODO 
	 *
	 */
	@Override
	public void setView(TopicEditView view) {
		this.view = view;
    }

    /** 
     * setOnConfirm implements ITopicEditPresenter.setOnConfirm
	 * @param onConfirm // TODO 
	 *
	 */
	@Override
	public void setOnConfirm(Presentable onConfirm) {
		this.onConfirm = onConfirm;
    }

    /** 
     * setOnCancel implements ITopicEditPresenter.setOnCancel
	 * @param onCancel // TODO 
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
		Profile profile =  ProfileManager.getInstance().getProfile();
		profile.addTopic(this.model);	
		this.onConfirm.run();
		
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


}
 
