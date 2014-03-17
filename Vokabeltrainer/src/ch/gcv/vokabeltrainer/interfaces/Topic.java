package ch.gcv.vokabeltrainer.interfaces;

import java.util.ArrayList;
import java.util.Date;

import ch.gcv.vokabeltrainer.model.CardImpl;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface Topic {
 
	public boolean addCard(Card model); // change Card model to ICard model
	public CardImpl getRandomCard(int box);
	public boolean deleteCard(CardImpl card);
	public String getCardCount(int box);   // change int to String
	public ArrayList<CardImpl> getCards();
	public ArrayList<CardImpl> getCards(int box);
	public int getStatisticMinutesLearned();
	public Date getStatisticDateCreated();
	public void setName(String name);
	public String getName();

  
}
 
