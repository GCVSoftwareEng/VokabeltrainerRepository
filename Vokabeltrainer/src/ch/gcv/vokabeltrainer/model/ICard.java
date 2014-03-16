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
	public long getStatisticDateLastLerned();
	public long getStatisticDateCreated();
	public int getStatisticCountWrong();
	public int getStatisticCountRight();
	public void setBox(int box);
	public int getBox();
	public void setTopic(Topic topic);
	public Topic getTopic();
	public boolean check(String answer);
	public void setStatisticDateLastLerned();
	public void setStatisticCountWrong();
	public void setStatisticCountRight();
	public void setName(String text);

  
}
 
