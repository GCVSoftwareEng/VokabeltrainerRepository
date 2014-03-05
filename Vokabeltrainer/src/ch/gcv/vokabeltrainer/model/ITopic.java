package ch.gcv.vokabeltrainer.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ITopic {
 
	public boolean addCard(Card card);
	public Card getRandomCard(int box);
	public boolean deleteCard(Card card);
	public int getCardCount(int box);
	public ArrayList<Card> getCards();
	public ArrayList<Card> getCards(int box);
	public int getStatisticMinutesLearned();
	public Date getStatisticDateCreated();
	public void setName(String name);
	public String getName();
  
}
 
