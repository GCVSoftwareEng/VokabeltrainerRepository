package ch.gcv.vokabeltrainer.interfaces;

import ch.gcv.vokabeltrainer.model.TopicImpl;

/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public interface Card {
 
	public void setQuestion(String question);
	public void setAnswer(String answer);
	public String getQuestion();
	public String getAnswer();
	public long getStatisticDateLastLerned();
	public long getStatisticDateCreated();
	public int getStatisticCountWrong();
	public int getStatisticCountRight();
	public void setBox(int box);
	public void moveUp();
	public int getBox();
	public void setTopic(TopicImpl topic);
	public TopicImpl getTopic();
	public boolean check(String answer);
	public void setSpentTime(long time);
	public long getSpentTime();

  
}
 
