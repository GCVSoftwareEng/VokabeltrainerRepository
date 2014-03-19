package ch.gcv.vokabeltrainer.presenter;

import java.util.Date;

import ch.gcv.vokabeltrainer.application.Application;
import ch.gcv.vokabeltrainer.interfaces.Card;
import ch.gcv.vokabeltrainer.interfaces.CardChallengePresenter;
import ch.gcv.vokabeltrainer.interfaces.CardChallengeView;
import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.model.CardImpl;
import ch.gcv.vokabeltrainer.model.PresenterManager;
import ch.gcv.vokabeltrainer.view.CardChallengeViewImpl;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class CardChallengePresenterImpl implements CardChallengePresenter, Presentable{

	private CardChallengeView view;
	private Card model;
	private Presentable onCheckCard;
	private int curBox;
	private long cardShown;

	public CardChallengePresenterImpl() {
		super();
		this.view = new CardChallengeViewImpl();
		PresenterManager.getInstance().add(this);
	}

	/**
	 * getModel implements ICardPresenter.getModel
	 * 
	 * @return ICard 
	 */
	@Override
	public Card getModel() {
		return this.model;
	}

	/**
	 * setModel implements ICardPresenter.setModel
	 * 
	 * @param model
	 * 
	 */
	@Override
	public void setModel(Card model) {
		this.model = model;
	}

	/**
	 * getView implements ICardPresenter.getView
	 * 
	 * @return ICardView 
	 */
	@Override
	public CardChallengeView getView() {
		return this.view;
	}

	/**
	 * setView implements ICardPresenter.setView
	 * 
	 * @param view
	 * 
	 */
	@Override
	public void setView(CardChallengeView view) {
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * checkAnswer implements ICardPresenter.checkAnswer
	 * 
	 */
	@Override
	public void checkAnswer(String answer) {
		long curTime = new Date().getTime();
		long spentTime = curTime - this.cardShown;
		curBox = this.model.getBox();
		if (this.model.check(answer)) {
			if (this.model.getSpentTime() < spentTime){
				this.view.answerRightSlow();
			} else{
				this.view.answerRightFast();
			}
			
			this.model.setSpentTime(spentTime);
			
		} else {
			this.view.answerWrong();
		}
		this.onCheckCard.refresh();
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
		view.updateViewFromModel();
	}

	@Override
	public void setOnCheckCard(Presentable presenter) {
		this.onCheckCard = presenter;
	}

	@Override
	public void nextCard(){
		CardImpl nextCard = null;
		int boxToCheck = this.curBox;
		boolean firstLoop = true;
		while (nextCard == null){
			nextCard = this.model.getTopic().getRandomCard(boxToCheck);
			if (firstLoop){
				boxToCheck = 0;
				firstLoop = false;
			} else {
				boxToCheck +=1;
			}
			if (boxToCheck > Application.boxCount){
				break;//boxToCheck = 1;
			}
		}	
		this.model = nextCard;	
		this.cardShown = new Date().getTime();
		this.view.cardChanged();
	}
	
	@Override
	public void stop() {
		this.view.close();
	}

	@Override
	public long getCardShown() {
		return this.cardShown;
	}	

}
