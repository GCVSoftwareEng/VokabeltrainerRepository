package ch.gcv.vokabeltrainer.model;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class Topic  implements ITopic {

    private ArrayList<Card> cards;
    private int statisticMinutesLearned;
    private Date statisticDateCreated;
    private String name;

	public Topic(){
		super();
		this.cards = null; // TODO
		this.statisticMinutesLearned = 0; // TODO
		this.statisticDateCreated = null; // TODO
		this.name = ""; // TODO
		throw new UnsupportedOperationException("Not implemented");
	}
 

    /** 
     * addCard implements ITopic.addCard
	 * @param card // TODO 
	 * @return boolean  // TODO
	 */
	@Override
	public boolean addCard(Card card) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getRandomCard implements ITopic.getRandomCard
	 * @param box // TODO 
	 * @return Card  // TODO
	 */
	@Override
	public Card getRandomCard(int box) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * deleteCard implements ITopic.deleteCard
	 * @param card // TODO 
	 * @return boolean  // TODO
	 */
	@Override
	public boolean deleteCard(Card card) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getName implements ITopic.getName
	 * @return String  // TODO
	 */
	@Override
	public String getName() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getCardCount implements ITopic.getCardCount
	 * @param box // TODO 
	 * @return int  // TODO
	 */
	@Override
	public int getCardCount(int box) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getCards implements ITopic.getCards
	 * @return ArrayList<Card>  // TODO
	 */
	@Override
	public ArrayList<Card> getCards() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getCards implements ITopic.getCards
	 * @param box // TODO 
	 * @return ArrayList<Card>  // TODO
	 */
	@Override
	public ArrayList<Card> getCards(int box) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getStatisticMinutesLearned implements ITopic.getStatisticMinutesLearned
	 * @return int  // TODO
	 */
	@Override
	public int getStatisticMinutesLearned() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * getStatisticDateCreated implements ITopic.getStatisticDateCreated
	 * @return Date  // TODO
	 */
	@Override
	public Date getStatisticDateCreated() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setName implements ITopic.setName
	 * @param name // TODO 
	 *
	 */
	@Override
	public void setName(String name) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

}
 
