package ch.gcv.vokabeltrainer.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import ch.gcv.vokabeltrainer.interfaces.Card;
import ch.gcv.vokabeltrainer.interfaces.Topic;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicImpl implements Topic, Serializable {

	private static final long serialVersionUID = 1211L;
	private HashMap<String,CardImpl> cards;
	private String name;

	public TopicImpl() {
		super();
		this.cards = new HashMap<String,CardImpl>();
		this.name = ""; 
	}

	/**
	 * addCard implements ITopic.addCard This method adds a card
	 * 
	 * @param card
	 *            which you want add
	 * 
	 * @return boolean true or false, if it has worked
	 */
	@Override
	public boolean addCard(Card card) {
		try {
			cards.put(card.getQuestion(),(CardImpl) card); // Cast to card
			System.out.println("Add card OK");
			return true;

		} catch (Exception e) {
			System.out.println("Add card fail");
			return false;
		}

	}

	/**
	 * getRandomCard implements ITopic.getRandomCard
	 * 
	 * @param box
	 * @return Card
	 */
	@Override
	public CardImpl getRandomCard(int box) {
		CardImpl theCard = null;
		ArrayList<CardImpl> cardsForBox = new ArrayList<CardImpl>();
		cardsForBox = getCards(box);
		if (cardsForBox.size() > 0) {
			Random random = new Random();
			int min = 1;
			int max = cardsForBox.size();
			int rndNumb = random.nextInt(max - min + 1) + min;

			for (int i = 0; i <= rndNumb; i++) {
				if (i == rndNumb) {
					theCard = cardsForBox.get(i - 1);
				}
			}
			return theCard;
		}
		return null;
		
	}

	/**
	 * deleteCard implements ITopic.deleteCard This method delete a card
	 * 
	 * @param card
	 *            if you want delete
	 * 
	 * @return boolean true or false if it has deleted
	 */
	@Override
	public Card deleteCard(String question) {
		return this.cards.remove(question); 
	}
	

	/**
	 * getName implements ITopic.getName This method give you the name of the
	 * topic
	 * 
	 * @return String name
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * getCardCount implements ITopic.getCardCount This method give you the
	 * count of the box
	 * 
	 * @param box
	 *            number if you want count
	 * 
	 * @return int total card into the box
	 */
	@Override
	public int getCardCount(int box) {
		return  getCards(box).size();	
	}

	/**
	 * getCards implements ITopic.getCards
	 * 
	 * @return ArrayList<Card> 
	 */
	@Override
	public ArrayList<CardImpl> getCards() {
		ArrayList<CardImpl> temp = new ArrayList<CardImpl>();
		for (CardImpl cardImpl : this.cards.values()) {
			temp.add(cardImpl);
		}
		return temp;
	}

	/**
	 * getCards implements ITopic.getCards
	 * 
	 * @param box
	 * @return ArrayList<Card> 
	 */
	@Override
	public ArrayList<CardImpl> getCards(int box) {
		ArrayList<CardImpl> tempCards = new ArrayList<CardImpl>();
		for (CardImpl curCard : cards.values()) {
			if (curCard.getBox() == box) {
				tempCards.add(curCard);
			}
		}
		System.out.println("Box:" + box + " Count: " + tempCards.size());
		return tempCards;
	}

	/**
	 * setTopic implements ITopic.setTopic
	 * 
	 * @param name
	 * 
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
