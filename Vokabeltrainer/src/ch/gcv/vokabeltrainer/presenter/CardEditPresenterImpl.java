package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.interfaces.Card;
import ch.gcv.vokabeltrainer.interfaces.CardEditPresenter;
import ch.gcv.vokabeltrainer.interfaces.CardEditView;
import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.model.PresenterManager;
import ch.gcv.vokabeltrainer.view.CardEditViewImpl;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardEditPresenterImpl implements Presentable, CardEditPresenter {

	private Presentable onConfirm;
	private CardEditView view;
	private Presentable onCancel;
	private Card model;

	public CardEditPresenterImpl() {
		super();
		this.onConfirm = null; // TODO
		this.model = null; // TODO
		this.onCancel = null; // TODO
		this.view = new CardEditViewImpl();
		PresenterManager.getInstance().add(this);
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

	/**
	 * getModel implements ICardEditPresenter.getModel
	 * 
	 * @return ICard // TODO
	 */
	@Override
	public Card getModel() {
		
		return this.model;
	}

	/**
	 * setModel implements ICardEditPresenter.setModel
	 * 
	 * @param model
	 *            // TODO
	 * 
	 */
	@Override
	public void setModel(Card model) {
		this.model = model;
	}

	/**
	 * getView implements ICardEditPresenter.getView
	 * 
	 * @return ICardEditView // TODO
	 */
	@Override
	public CardEditView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setView implements ICardEditPresenter.setView
	 * 
	 * @param view
	 *            // TODO
	 * 
	 */
	@Override
	public void setView(CardEditView view) {
		this.view = view;
	}

	/**
	 * setOnConfirm implements ICardEditPresenter.setOnConfirm
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
	 * setOnCancel implements ICardEditPresenter.setOnCancel
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
	 * confirm implements ICardEditPresenter.confirm
	 * 
	 */
	@Override
	public void confirm() {
		this.model.getTopic().addCard(this.model);
		this.onConfirm.run();
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

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void stop() {
		this.view.close();
	}

}
