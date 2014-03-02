package ch.gcv.vokabeltrainer.model;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class ProfilePresenter  implements IProfilePresenter, java.lang.Runnable, ILanguageChangedListener {

    private Runnable onOpenTopic;
    private IProfileView view;
    private IProfile model;
    private Runnable onCreateTopic;
    private Runnable onDeleteTopic;

	public ProfilePresenter(){
		super();
		this.onOpenTopic = null; // TODO
		this.view = null; // TODO
		this.model = null; // TODO
		this.onCreateTopic = null; // TODO
		this.onDeleteTopic = null; // TODO
		throw new UnsupportedOperationException("Not implemented");
	}
 

    /** 
     * getModel implements IProfilePresenter.getModel
	 * @return IProfile  // TODO
	 */
	@Override
	public IProfile getModel() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setModel implements IProfilePresenter.setModel
	 * @param model // TODO 
	 *
	 */
	@Override
	public void setModel(IProfile model) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getView implements IProfilePresenter.getView
	 * @return IProfileView  // TODO
	 */
	@Override
	public IProfileView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setView implements IProfilePresenter.setView
	 * @param view // TODO 
	 *
	 */
	@Override
	public void setView(IProfileView view) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setOnCreateTopic implements IProfilePresenter.setOnCreateTopic
	 * @param onCreateTopic // TODO 
	 *
	 */
	@Override
	public void setOnCreateTopic(Runnable onCreateTopic) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setOnOpenTopic implements IProfilePresenter.setOnOpenTopic
	 * @param onOpenTopic // TODO 
	 *
	 */
	@Override
	public void setOnOpenTopic(Runnable onOpenTopic) {
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
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * openTopic implements IProfilePresenter.openTopic
	 * @param topic // TODO 
	 *
	 */
	@Override
	public void openTopic(ITopic topic) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * deleteTopic implements IProfilePresenter.deleteTopic
	 * @param topic // TODO 
	 *
	 */
	@Override
	public void deleteTopic(ITopic topic) {
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

    /** 
     * languageChanged implements ILanguageChangedListener.languageChanged
	 *
	 */
	@Override
	public void languageChanged() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

}
 
