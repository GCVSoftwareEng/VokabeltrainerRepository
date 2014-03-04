package ch.gcv.vokabeltrainer.model;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicEditPresenter  implements ILanguageChangedListener, ITopicEditPresenter, java.lang.Runnable {

    private Runnable onConfirm;
    private ITopic model;
    private Runnable onCancel;
    private ITopicEditView view;

	public TopicEditPresenter(){
		super();
		this.onConfirm = null; // TODO
		this.model = null; // TODO
		this.onCancel = null; // TODO
		this.view = null; // TODO
		throw new UnsupportedOperationException("Not implemented");
	}
 

    /** 
     * languageChanged implements ILanguageChangedListener.languageChanged
	 *
	 */
	@Override
	public void languageChanged() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getModel implements ITopicEditPresenter.getModel
	 * @return ITopic  // TODO
	 */
	@Override
	public ITopic getModel() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setModel implements ITopicEditPresenter.setModel
	 * @param topic // TODO 
	 *
	 */
	@Override
	public void setModel(ITopic topic) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
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
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setOnConfirm implements ITopicEditPresenter.setOnConfirm
	 * @param onConfirm // TODO 
	 *
	 */
	@Override
	public void setOnConfirm(Runnable onConfirm) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setOnCancel implements ITopicEditPresenter.setOnCancel
	 * @param onCancel // TODO 
	 *
	 */
	@Override
	public void setOnCancel(Runnable onCancel) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * confirm implements ITopicEditPresenter.confirm
	 *
	 */
	@Override
	public void confirm() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
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
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

}
 
