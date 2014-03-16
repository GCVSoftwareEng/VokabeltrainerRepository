package ch.gcv.vokabeltrainer.presenter;

import ch.gcv.vokabeltrainer.model.Card;
import ch.gcv.vokabeltrainer.model.ICard;
import ch.gcv.vokabeltrainer.model.ITranslatable;
import ch.gcv.vokabeltrainer.model.ITopic;
import ch.gcv.vokabeltrainer.model.ProfileManager;
import ch.gcv.vokabeltrainer.model.Topic;
import ch.gcv.vokabeltrainer.view.ITopicView;
import ch.gcv.vokabeltrainer.view.TopicView;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicPresenter  implements ITopicPresenter, java.lang.Runnable {

    private Runnable onDeleteCard;
    private Runnable onOpenCard;
    private Runnable onCreateCard;
    private ITopicView view;
    private ITopic model;
    

	public TopicPresenter(){
		super();
		this.view = new TopicView();
	}
 

    /** 
     * getModel implements ITopicPresenter.getModel
	 * @return ITopic  // TODO
	 */
	@Override
	public ITopic getModel() {
		return this.model;
    }

    /** 
     * setModel implements ITopicPresenter.setModel
	 * @param model // TODO 
	 *
	 */
	@Override
	public void setModel(ITopic model) {
		this.model = model;
    }

    /** 
     * getView implements ITopicPresenter.getView
	 * @return ITopicView  // TODO
	 */
	@Override
	public ITopicView getView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setView implements ITopicPresenter.setView
	 * @param view // TODO 
	 *
	 */
	@Override
	public void setView(ITopicView view) {
		
		this.view = view;
    }

    /** 
     * setOnCreateCard implements ITopicPresenter.setOnCreateCard
	 * @param onCreateCard // TODO 
	 *
	 */
	@Override
	public void setOnCreateCard(Runnable onCreateCard) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setOnOpenCard implements ITopicPresenter.setOnOpenCard
	 * @param onOpenCard // TODO 
	 *
	 */
	@Override
	public void setOnOpenCard(Runnable onOpenCard) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setOnDeleteCard implements ITopicPresenter.setOnDeleteCard
	 * @param onDeleteCard // TODO 
	 *
	 */
	@Override
	public void setOnDeleteCard(Runnable onDeleteCard) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * createCard implements ITopicPresenter.createCard
	 *
	 */
	@Override
	public void createCard() {
		CardCreatePresenter ccp = new CardCreatePresenter();
		ccp.setOnConfirm(this);
		
		ICard card = new Card();
		card.setTopic((Topic) this.model);
		ccp.setModel(card);
		ccp.run();
			
		}

   

    /** 
     * openCard implements ITopicPresenter.openCard
	 *
	 */
	@Override
	public void openCard(ICard card) {
		
		CardPresenter cp = new CardPresenter();
		cp.setModel(card);
		cp.run();
    }

    /** 
     * deleteCard implements ITopicPresenter.deleteCard
	 *
	 */
	@Override
	public void deleteCard() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * learnTopic implements ITopicPresenter.learnTopic
	 *
	 */
	@Override
	public void learnTopic(ICard card) {
		
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
	public void learnTopic() {  //CHF
		// TODO Auto-generated method stub
		
	}


	@Override
	public void learnTopic(ITopic topic) {    //CHF
		CardPresenter tep = new CardPresenter();
		tep.setModel((ICard) topic);
		
		
	}



}
 
