package ch.gcv.vokabeltrainer.model;

import java.text.DateFormat;
import java.util.Date;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class Card implements ICard {

	private int statisticCountWrong;
	private long statisticDateCreated;
	private long statisticDateLastLearned;
	private String question;
	private int statisticCountRight;
	private int box;
	private String answer;
	private Topic topic;

	String myAnswer;

	public Card() {
		super();
		this.statisticDateCreated = new java.util.Date().getTime();

		this.statisticCountWrong = 0; // TODO
		this.question = ""; // TODO
		// this.statisticDateLastLearned = null; // TODO
		this.statisticCountRight = 0; // TODO
		this.box = 0; // TODO
		this.topic = null; // TODO
		this.answer = ""; // TODO

		this.myAnswer = "";

	}

	/**
	 * setQuestion implements ICard.setQuestion This method sets a question
	 * 
	 * @param question
	 * 
	 */
	@Override
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * setAnswer implements ICard.setAnswer This method set an answer This
	 * method sets a answer.
	 * 
	 * @param answer
	 * 
	 */
	@Override
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * getQuestion implements ICard.getQuestion This method give you a question
	 * This method give you a question.
	 * 
	 * @return String question
	 */
	@Override
	public String getQuestion() {
		return this.question;
	}

	/**
	 * getAnswer implements ICard.getAnswer This method give you an answer.
	 * 
	 * @return String answer
	 */
	@Override
	public String getAnswer() {
		return this.answer;
	}

	/**
	 * getStatisticDateLastLerned implements ICard.setStatisticDateLastLerned
	 * This method sets the current date.
	 * 
	 * // ???????
	 */
	@Override
	public void setStatisticDateLastLerned() {
		this.statisticDateLastLearned = new java.util.Date().getTime();

	}

	/**
	 * getStatisticDateLastLerned implements ICard.getStatisticDateLastLerned
	 * 
	 * @return long // TODO
	 */

	public long getStatisticDateLastLerned() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat dfM = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		System.out.println("Last lerned: "
				+ df.format(statisticDateLastLearned) + " "
				+ dfM.format(statisticDateLastLearned) + " Uhr");
		return this.statisticDateLastLearned;

	}

	/**
	 * getStatisticDateCreated implements ICard.getStatisticDateCreated
	 * 
	 * @return Date // TODO
	 */
	@Override
	public long getStatisticDateCreated() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat dfM = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		System.out.println("Created : " + df.format(statisticDateCreated) + " "
				+ dfM.format(statisticDateCreated) + " Uhr");
		return this.statisticDateCreated;
	}

	/**
	 * getStatisticCountWrong implements ICard.setStatisticCountWrong. This
	 * method set the count wrong +1.
	 * 
	 */
	@Override
	public void setStatisticCountWrong() {
		this.statisticCountWrong += 1;
	}

	/**
	 * getStatisticCountWrong implements ICard.getStatisticCountWrong This
	 * method give you the wrong count.
	 * 
	 * @return int wrong count
	 */
	@Override
	public int getStatisticCountWrong() {
		return statisticCountWrong;
	}

	/**
	 * getStatisticCountRight implements ICard.getStatisticCountRight This
	 * method set the right count.
	 * 
	 * 
	 */
	@Override
	public void setStatisticCountRight() {
		this.statisticCountRight += 1;
	}

	/**
	 * getStatisticCountRight implements ICard.getStatisticCountRight This
	 * method give you the right count.
	 * 
	 * @return int count right.
	 */
	@Override
	public int getStatisticCountRight() {
		return statisticCountRight;
	}

	/**
	 * setBox implements ICard.setBox This method set the box number
	 * 
	 * @param box
	 *            number
	 * 
	 */
	@Override
	public void setBox(int box) {
		this.box = box;
	}

	/**
	 * getBox implements ICard.getBox This method returns the box number
	 * 
	 * @return int box number.
	 */
	@Override
	public int getBox() {
		return this.box;
	}

	/**
	 * setTopic implements ICard.setTopic
	 * 
	 * @param topic
	 *            // TODO
	 * 
	 */

	public void setTopicName(String name) { // change to void setTopic
		topic.setName(name);
	}

	/**
	 * getTopic implements ICard.getTopic
	 * 
	 * @return Topic // TODO
	 */
	@Override
	public Topic getTopic() {
		return this.topic;
	}

	/**
	 * getTopic implements ICard.check
	 * 
	 * @return boolean // TODO
	 */
	@Override
	public boolean check(String String) {
		setStatisticDateLastLerned();
		if (myAnswer == answer) {
			System.out.println("answer true");
			setStatisticCountRight();
			System.out.println("Count right: " + statisticCountRight);
			return true;
		}
		System.out.println("answer false");
		setStatisticCountWrong();
		System.out.println("Count wrong " + statisticCountWrong);
		return false;
	}

	public void setMyAnswer(String name) {
		this.myAnswer = name;
	}

	@Override
	public void setTopic(Topic topic) {
		// TODO Auto-generated method stub

	}
}
