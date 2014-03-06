package ch.gcv.vokabeltrainer.model;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardEditPresenter  implements ILanguageChangedListener, java.lang.Runnable, ICardEditPresenter {

    private Runnable onConfirm;
    private ICardEditView view;
    private Runnable onCancel;
    private ICard model;

	public CardEditPresenter(){
		super();
		this.onConfirm = null; // TODO
		this.view = null; // TODO
		this.onCancel = null; // TODO
		this.model = null; // TODO
	
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
     * run implements java.lang.Runnable.run
	 *
	 */
	@Override
	public void run() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getModel implements ICardEditPresenter.getModel
	 * @return ICard  // TODO
	 */
	@Override
	public ICard getModel() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setModel implements ICardEditPresenter.setModel
	 * @param model // TODO 
	 *
	 */
	@Override
	public void setModel(ICard model) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getView implements ICardEditPresenter.getView
	 * @return ICardEditView  // TODO
	 */
	@Override
	public ICardEditView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setView implements ICardEditPresenter.setView
	 * @param view // TODO 
	 *
	 */
	@Override
	public void setView(ICardEditView view) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setOnConfirm implements ICardEditPresenter.setOnConfirm
	 * @param onConfirm // TODO 
	 *
	 */
	@Override
	public void setOnConfirm(Runnable onConfirm) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setOnCancel implements ICardEditPresenter.setOnCancel
	 * @param onCancel // TODO 
	 *
	 */
	@Override
	public void setOnCancel(Runnable onCancel) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * confirm implements ICardEditPresenter.confirm
	 *
	 */
	@Override
	public void confirm() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * cancel implements ICardEditPresenter.cancel
	 *
	 */
	@Override
	public void cancel() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

}
 
