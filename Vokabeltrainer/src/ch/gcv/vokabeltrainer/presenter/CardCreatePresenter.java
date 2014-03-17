package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.model.ICard;
import ch.gcv.vokabeltrainer.model.IProfile;
import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.model.Translatable;
import ch.gcv.vokabeltrainer.model.Presentable;
import ch.gcv.vokabeltrainer.model.ProfileManager;
import ch.gcv.vokabeltrainer.view.CardEditView;
import ch.gcv.vokabeltrainer.view.ICardEditView;
import ch.gcv.vokabeltrainer.view.TopicEditView;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardCreatePresenter implements Presentable, ICardCreatePresenter {

	private Presentable onConfirm;
	private ICardEditView view;
	private Presentable onCancel;
	private ICard model;

	public CardCreatePresenter() {
		super();
		this.onConfirm = null; // TODO
		this.model = null; // TODO
		this.onCancel = null; // TODO
		this.view = new CardEditView();

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
	public ICard getModel() {
		
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
	public void setModel(ICard model) {
		this.model = model;
	}

	/**
	 * getView implements ICardEditPresenter.getView
	 * 
	 * @return ICardEditView // TODO
	 */
	@Override
	public ICardEditView getView() {
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
	public void setView(ICardEditView view) {
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

}
