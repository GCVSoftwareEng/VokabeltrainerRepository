package ch.gcv.vokabeltrainer.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class Topic implements ITopic {

	private ArrayList<Card> cards;
	private int statisticMinutesLearned;
	private Date statisticDateCreated;
	private String name;

	public Topic() {
		super();
		this.cards = new ArrayList<Card>();
		this.statisticMinutesLearned = 0; // TODO
		this.statisticDateCreated = null; // TODO
		this.name = ""; // TODO

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
			cards.add(card);
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
	 *            // TODO
	 * @return Card // TODO
	 */
	@Override
	public Card getRandomCard(int box) {
		Card theCard = null;
		ArrayList<Card> cardsForBox = new ArrayList<Card>();
		cardsForBox = getCards(box);

		Random random = new Random();
		int min = 1;
		int max = cardsForBox.size();
		int rndNumb = random.nextInt(max - min + 1) + min;

		for (int i = 0; i <= rndNumb; i++) {
			if (i == rndNumb) {
				theCard = cardsForBox.get(i - 1);
			}
		}
		theCard.setStatisticDateLastLerned();
		return theCard;
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
	public boolean deleteCard(Card card) {
		Iterator<Card> it = cards.iterator();
		while (it.hasNext()) {
			Card theCard = it.next();
			if (theCard == card) {
				it.remove();
				return true;
			}
			System.out.println("Card not found, next");
		}
		return false;
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
		return this.getCards(box).size();
	}

	/**
	 * getCards implements ITopic.getCards
	 * 
	 * @return ArrayList<Card> // TODO
	 */
	@Override
	public ArrayList<Card> getCards() {
		return this.cards;
	}

	/**
	 * getCards implements ITopic.getCards
	 * 
	 * @param box
	 *            // TODO
	 * @return ArrayList<Card> // TODO
	 */
	@Override
	public ArrayList<Card> getCards(int box) {
		ArrayList<Card> tempCards = new ArrayList<Card>();
		for (Card curCard : cards) {
			if (curCard.getBox() == box) {
				tempCards.add(curCard);
			}
		}
		System.out.println("Box:" + box + " Count: " + tempCards.size());
		return tempCards;
	}

	/**
	 * getStatisticMinutesLearned implements ITopic.getStatisticMinutesLearned
	 * 
	 * @return int // TODO
	 */
	@Override
	public int getStatisticMinutesLearned() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * getStatisticDateCreated implements ITopic.getStatisticDateCreated
	 * 
	 * @return Date // TODO
	 */
	@Override
	public Date getStatisticDateCreated() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * setTopic implements ITopic.setTopic
	 * 
	 * @param name
	 *            // TODO
	 * 
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	// TEST

	public static void main(String[] args) {
		Topic top = new Topic();
		top.setName("Test");

		Card card = new Card();

		Card card1 = new Card();
		card1.setBox(1);
		card1.setQuestion("Welche Fabe hat das Wasser?");
		card1.setAnswer("blau");
		// 1 in 1

		Card card2 = new Card();
		card2.setBox(2);
		card2.setQuestion("Welche Farbe hat die Sonne?");
		card2.setAnswer("gelb");
		Card card22 = new Card();
		card22.setBox(2);
		card22.setQuestion("Welche Farbe hat der Himmel?");
		card22.setAnswer("hellblau");
		// 2 in 2

		top.addCard(card22);
		top.addCard(card2);
		top.addCard(card1);
		top.deleteCard(card);

		Card curCard = top.getRandomCard(2);
		System.out.println(curCard.getQuestion());
		// top.getCardCount(1);

		curCard.setMyAnswer("helllau");
		curCard.check(card22.getAnswer());
		curCard.getStatisticDateCreated();
		curCard.getStatisticDateLastLerned();

		Card curCard2 = top.getRandomCard(2);
		System.out.println(curCard2.getQuestion());
		curCard2.setMyAnswer("hellblau");
		curCard2.check(card22.getAnswer());
		curCard2.getStatisticDateCreated();
		curCard2.getStatisticDateLastLerned();

	}

}
