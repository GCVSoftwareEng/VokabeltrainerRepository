package ch.gcv.vokabeltrainer.model;

import java.util.Date;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class Card  implements ICard {

    private int statisticCountWrong;
    private Date statisticDateCreated;
    private Date statisticDateLastLearned;
    private String question;
    private int statisticCountRight;
    private int box;
    private String answer;
    private Topic topic;
    

	public Card(){
		super();
		this.statisticDateCreated = null; // TODO
		this.statisticCountWrong = 0; // TODO
		this.question = ""; // TODO
		this.statisticDateLastLearned = null; // TODO
		this.statisticCountRight = 0; // TODO
		this.box = 0; // TODO
		this.topic = null; // TODO
		this.answer = ""; // TODO
		
	}
 

    /** 
     * setQuestion implements ICard.setQuestion
	 * @param question // TODO 
	 *
	 */
	@Override
	public void setQuestion(String question) {
		this.question = question;
    }

    /** 
     * setAnswer implements ICard.setAnswer
	 * @param answer // TODO 
	 *
	 */
	@Override
	public void setAnswer(String answer) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getQuestion implements ICard.getQuestion
	 * @return String  // TODO
	 */
	@Override
	public String getQuestion() {
		return this.question;
    }

    /** 
     * getAnswer implements ICard.getAnswer
	 * @return String  // TODO
	 */
	@Override
	public String getAnswer() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getStatisticDateLastLerned implements ICard.getStatisticDateLastLerned
	 * @return Date  // TODO
	 */
	@Override
	public Date getStatisticDateLastLerned() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getStatisticDateCreated implements ICard.getStatisticDateCreated
	 * @return Date  // TODO
	 */
	@Override
	public Date getStatisticDateCreated() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getStatisticCountWrong implements ICard.getStatisticCountWrong
	 * @return int  // TODO
	 */
	@Override
	public int getStatisticCountWrong() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getStatisticCountRight implements ICard.getStatisticCountRight
	 * @return int  // TODO
	 */
	@Override
	public int getStatisticCountRight() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setBox implements ICard.setBox
	 * @param box // TODO 
	 *
	 */
	@Override
	public void setBox(int box) {
		this.box = box;
    }

    /** 
     * getBox implements ICard.getBox
	 * @return int  // TODO
	 */
	@Override
	public int getBox() {
		return this.box;
    }

    /** 
     * setTopic implements ICard.setTopic
	 * @param topic // TODO 
	 *
	 */
	@Override
	public void setTopic(Topic topic) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getTopic implements ICard.getTopic
	 * @return Topic  // TODO
	 */
	@Override
	public Topic getTopic() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }
	


}
 
