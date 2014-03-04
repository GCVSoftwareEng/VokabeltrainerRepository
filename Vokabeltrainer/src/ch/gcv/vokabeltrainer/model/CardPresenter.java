package ch.gcv.vokabeltrainer.model;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardPresenter  implements ILanguageChangedListener, java.lang.Runnable, ICardPresenter {

    private ICardView view;
    private ICard model;

	public CardPresenter(){
		super();
		this.view = null; // TODO
		this.model = null; // TODO
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
     * run implements java.lang.Runnable.run
	 *
	 */
	@Override
	public void run() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getModel implements ICardPresenter.getModel
	 * @return ICard  // TODO
	 */
	@Override
	public ICard getModel() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setModel implements ICardPresenter.setModel
	 * @param model // TODO 
	 *
	 */
	@Override
	public void setModel(ICard model) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getView implements ICardPresenter.getView
	 * @return ICardView  // TODO
	 */
	@Override
	public ICardView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setView implements ICardPresenter.setView
	 * @param view // TODO 
	 *
	 */
	@Override
	public void setView(ICardView view) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * checkAnswer implements ICardPresenter.checkAnswer
	 *
	 */
	@Override
	public void checkAnswer() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

}
 