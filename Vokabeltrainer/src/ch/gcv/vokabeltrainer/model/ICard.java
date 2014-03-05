package ch.gcv.vokabeltrainer.model;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface ICard {
 
	public void setQuestion(String question);
	public void setAnswer(String answer);
	public String getQuestion();
	public String getAnswer();
	public Date getStatisticDateLastLerned();
	public Date getStatisticDateCreated();
	public int getStatisticCountWrong();
	public int getStatisticCountRight();
	public void setBox(int box);
	public int getBox();
	public void setTopic(Topic topic);
	public Topic getTopic();
	public boolean check(String answer);
  
}
 
