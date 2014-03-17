package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.application.Application;
import ch.gcv.vokabeltrainer.interfaces.Card;
import ch.gcv.vokabeltrainer.interfaces.CardView;
import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.interfaces.Translatable;
import ch.gcv.vokabeltrainer.model.CardImpl;
import ch.gcv.vokabeltrainer.view.CardViewImpl;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardPresenter implements ICardPresenter, Presentable{

	private CardView view;
	private Card model;
	private Presentable onCheckCard;

	public CardPresenter() {
		super();
		this.view = new CardViewImpl();

	}

	/**
	 * getModel implements ICardPresenter.getModel
	 * 
	 * @return ICard // TODO
	 */
	@Override
	public Card getModel() {
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
	public void setModel(Card model) {
		this.model = model;
	}

	/**
	 * getView implements ICardPresenter.getView
	 * 
	 * @return ICardView // TODO
	 */
	@Override
	public CardView getView() {
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
	public void setView(CardView view) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * checkAnswer implements ICardPresenter.checkAnswer
	 * 
	 */
	@Override
	public void checkAnswer(String answer) {
		int curBox = this.model.getBox();
		if (this.model.check(answer)) {
			this.view.answerRight();
		} else {
			this.view.answerWrong();
		}
		
		CardImpl nextCard = null;
		int boxToCheck = curBox;
		while (nextCard == null){
			nextCard = this.model.getTopic().getRandomCard(boxToCheck);
			boxToCheck +=1;
			if (boxToCheck > Application.boxCount){
				boxToCheck = 1;
			}
		}
		
		this.model = nextCard;
		
		
		this.onCheckCard.refresh();
		this.run();
		
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
		view.updateViewFromModel();
		
	}

	@Override
	public void setOnCheckCard(Presentable presenter) {
		// TODO Auto-generated method stub
		this.onCheckCard = presenter;
	}

	

}
