package ch.gcv.vokabeltrainer.model;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class Card  implements ICard {

    private String question;
    private Date statisticDateCreated;
    private int statisticCountRight;
    private String answer;
    private int statisticCountWrong;
    private int box;
    private Topic topic;
    private Date statisticDateLastLearned;

	public Card(){
		super();
		this.question = ""; // TODO
		this.statisticDateCreated = null; // TODO
		this.answer = ""; // TODO
		this.statisticCountRight = 0; // TODO
		this.statisticCountWrong = 0; // TODO
		this.box = 0; // TODO
		this.topic = null; // TODO
		this.statisticDateLastLearned = null; // TODO
		throw new UnsupportedOperationException("Not implemented");
	}
 

    /** 
     * setQuestion implements ICard.setQuestion
	 * @param question // TODO 
	 *
	 */
	@Override
	public void setQuestion(String question) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
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
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
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
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getBox implements ICard.getBox
	 * @return int  // TODO
	 */
	@Override
	public int getBox() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
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
 
