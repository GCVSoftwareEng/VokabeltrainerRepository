package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.interfaces.Card;
import ch.gcv.vokabeltrainer.interfaces.CardCreatePresenter;
import ch.gcv.vokabeltrainer.interfaces.CardCreateView;
import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.model.CardImpl;
import ch.gcv.vokabeltrainer.model.PresenterManager;
import ch.gcv.vokabeltrainer.view.CardCreateViewImpl;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardCreatePresenterImpl implements Presentable,
		CardCreatePresenter {

	private Presentable onConfirm;
	private CardCreateView view;
	private Card model;

	public CardCreatePresenterImpl() {
		super();
		this.onConfirm = null;
		this.model = null;
		this.view = new CardCreateViewImpl();
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
	 * @return ICard
	 */
	@Override
	public Card getModel() {
		return this.model;
	}

	/**
	 * setModel implements ICardEditPresenter.setModel
	 * 
	 * @param model
	 * 
	 */
	@Override
	public void setModel(Card model) {
		this.model = model;
	}

	/**
	 * getView implements ICardEditPresenter.getView
	 * 
	 * @return ICardEditView
	 */
	@Override
	public CardCreateView getView() {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setView implements ICardEditPresenter.setView
	 * 
	 * @param view
	 * 
	 */
	@Override
	public void setView(CardCreateView view) {
		this.view = view;
	}

	/**
	 * setOnConfirm implements ICardEditPresenter.setOnConfirm
	 * 
	 * @param onConfirm
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
	 * 
	 */
	@Override
	public void setOnCancel(Presentable onCancel) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * confirm implements ICardEditPresenter.confirm
	 * 
	 */
	@Override
	public void confirm() {

		if (this.model.getAnswer().equals("")
				|| this.model.getQuestion().equals("")) {
			this.view.fieldsNotSet();
		} else {
			this.model.getTopic().addCard(this.model);
			Card card = new CardImpl();
			card.setTopic(this.model.getTopic());
			this.model = card;
			this.view.updateViewFromModel();
			this.onConfirm.refresh();
		}

	}

	/**
	 * cancel implements ICardEditPresenter.cancel
	 * 
	 */
	@Override
	public void cancel() {
		throw new UnsupportedOperationException("Not implemented");
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
