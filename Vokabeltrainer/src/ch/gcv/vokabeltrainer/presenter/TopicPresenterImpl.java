package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.interfaces.Card;
import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.interfaces.Topic;
import ch.gcv.vokabeltrainer.interfaces.TopicPresenter;
import ch.gcv.vokabeltrainer.interfaces.TopicView;
import ch.gcv.vokabeltrainer.model.CardImpl;
import ch.gcv.vokabeltrainer.model.PresenterManager;
import ch.gcv.vokabeltrainer.model.TopicImpl;
import ch.gcv.vokabeltrainer.view.TopicViewImpl;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicPresenterImpl implements TopicPresenter, Presentable {

	private Presentable onDeleteCard;
	private Presentable onOpenCard;
	private Presentable onEditCards;
	private Presentable onCreateCard;
	private TopicView view;
	private Topic model;
	private Presentable statisticPresenter;

	public TopicPresenterImpl() {
		super();
		this.view = new TopicViewImpl();
		PresenterManager.getInstance().add(this);
	}

	/**
	 * getModel implements ITopicPresenter.getModel
	 * 
	 * @return ITopic // TODO
	 */
	@Override
	public Topic getModel() {
		return this.model;
	}

	/**
	 * setModel implements ITopicPresenter.setModel
	 * 
	 * @param model
	 *            // TODO
	 * 
	 */
	@Override
	public void setModel(Topic model) {
		this.model = model;
	}

	/**
	 * getView implements ITopicPresenter.getView
	 * 
	 * @return ITopicView // TODO
	 */
	@Override
	public TopicView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setView implements ITopicPresenter.setView
	 * 
	 * @param view
	 *            // TODO
	 * 
	 */
	@Override
	public void setView(TopicView view) {

		this.view = view;
	}

	/**
	 * setOnCreateCard implements ITopicPresenter.setOnCreateCard
	 * 
	 * @param onCreateCard
	 *            // TODO
	 * 
	 */
	@Override
	public void setOnCreateCard(Presentable onCreateCard) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setOnOpenCard implements ITopicPresenter.setOnOpenCard
	 * 
	 * @param onOpenCard
	 *            // TODO
	 * 
	 */
	@Override
	public void setOnOpenCard(Presentable onOpenCard) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setOnDeleteCard implements ITopicPresenter.setOnDeleteCard
	 * 
	 * @param onDeleteCard
	 *            // TODO
	 * 
	 */
	@Override
	public void setOnDeleteCard(Presentable onDeleteCard) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * createCard implements ITopicPresenter.createCard
	 * 
	 */
	@Override
	public void createCard() {
		CardCreatePresenterImpl ccp = new CardCreatePresenterImpl();
		ccp.setOnConfirm(this);

		Card card = new CardImpl();
		card.setTopic((TopicImpl) this.model);
		ccp.setModel(card);
		ccp.run();

	}

	/**
	 * openCard implements ITopicPresenter.openCard
	 * 
	 */
	@Override
	public void openCard(Card card) {

		CardPresenterImpl cp = new CardPresenterImpl();
		cp.setModel(card);
		cp.setOnCheckCard(this);
		cp.run();
	}

	/**
	 * openCard implements ITopicPresenter.openCard
	 * 
	 */
	@Override
	public void startChallenge(Card card) {

		CardChallengePresenterImpl cp = new CardChallengePresenterImpl();
		cp.setModel(card);
		cp.setOnCheckCard(this);
		cp.run();
	}

	/**
	 * run implements java.lang.Runnable.run
	 * 
	 */
	@Override
	public void run() {
		// TODO should be implemented
		view.setPresenter(this);
		view.open();
		view.updateViewFromModel();
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		view.updateViewFromModel();
		if (this.statisticPresenter != null){
			this.statisticPresenter.refresh();
		}
		
	}

	@Override
	public void deleteCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		this.view.close();
	}

	@Override
	public void editCards() {

		TopicCardListPresenterImpl tclp = new TopicCardListPresenterImpl();
		tclp.setModel(this.model);
		tclp.run();

	}

	@Override
	public void moveAllCardsToFirstBox() {
		for (CardImpl card : this.model.getCards()) {
			card.setBox(1);
		}
		this.view.updateViewFromModel();
	}

	@Override
	public void openStatistic() {
		TopicStatisticListPresenterImpl tslp = new TopicStatisticListPresenterImpl();
		tslp.setModel(this.model);
		tslp.setOnConfirm(this);
		tslp.run();
		this.statisticPresenter = tslp;
	}

}
