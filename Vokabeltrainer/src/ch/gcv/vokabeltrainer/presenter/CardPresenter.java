package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.model.Card;
import ch.gcv.vokabeltrainer.model.ICard;
import ch.gcv.vokabeltrainer.model.ITranslatable;
import ch.gcv.vokabeltrainer.view.CardView;
import ch.gcv.vokabeltrainer.view.ICardView;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardPresenter implements ICardPresenter, java.lang.Runnable {

	private ICardView view;
	private ICard model;

	public CardPresenter() {
		super();
		this.view = new CardView();

	}

	/**
	 * getModel implements ICardPresenter.getModel
	 * 
	 * @return ICard // TODO
	 */
	@Override
	public ICard getModel() {
		return this.model;
	}

	/**
	 * setModel implements ICardPresenter.setModel
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
	 * getView implements ICardPresenter.getView
	 * 
	 * @return ICardView // TODO
	 */
	@Override
	public ICardView getView() {
		return this.view;
	}

	/**
	 * setView implements ICardPresenter.setView
	 * 
	 * @param view
	 *            // TODO
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
	public void checkAnswer(String answer) {
		if (this.model.check(answer)) {
			this.view.answerRight();
		} else {
			this.view.answerWrong();
		}
		this.model = this.model.getTopic().getRandomCard(this.model.getBox());
		view.updateViewFromModel();
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

}
