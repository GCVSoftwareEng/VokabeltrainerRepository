package ch.gcv.vokabeltrainer.presenter;


import ch.gcv.vokabeltrainer.model.Translatable;
import ch.gcv.vokabeltrainer.model.IProfile;
import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.model.Presentable;
import ch.gcv.vokabeltrainer.model.ProfileManager;
import ch.gcv.vokabeltrainer.view.ITopicEditView;
import ch.gcv.vokabeltrainer.view.TopicEditView;


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
    private ITopic model;
    private Presentable onCancel;
    private ITopicEditView view;
    

	public TopicCreatePresenter(){
		super();
		this.onConfirm = null; // TODO
		this.model = null; // TODO
		this.onCancel = null; // TODO
		this.view = new TopicEditView();
		
	}
 


    /** 
     * getModel implements ITopicEditPresenter.getModel
	 * @return ITopic  // TODO
	 */
	@Override
	public ITopic getModel() {
		return this.model;
    }

    /** 
     * setModel implements ITopicEditPresenter.setModel
	 * @param topic // TODO 
	 *
	 */
	@Override
	public void setModel(ITopic topic) {
		this.model = topic;
    }

    /** 
     * getView implements ITopicEditPresenter.getView
	 * @return ITopicEditView  // TODO
	 */
	@Override
	public ITopicEditView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setView implements ITopicEditPresenter.setView
	 * @param view // TODO 
	 *
	 */
	@Override
	public void setView(ITopicEditView view) {
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
		IProfile profile =  ProfileManager.getInstance().getProfile();
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
 
