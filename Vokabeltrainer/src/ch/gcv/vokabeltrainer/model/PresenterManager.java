package ch.gcv.vokabeltrainer.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import ch.gcv.vokabeltrainer.interfaces.Presentable;
import ch.gcv.vokabeltrainer.interfaces.Profile;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class PresenterManager {

	private ArrayList<Presentable> presentables;
	private static PresenterManager instance;

	public PresenterManager() {
		super();
		presentables = new ArrayList<Presentable>();
	}

	
	public static PresenterManager getInstance() {
		if (PresenterManager.instance == null) {
			PresenterManager.instance = new PresenterManager();
		}
		return PresenterManager.instance;
	}

	public void add(Presentable obj){
		this.presentables.add(obj);
	}
	
	public void remove(Presentable obj){
		this.presentables.remove(obj);
	}
	
	public void stopAll(){
		
		for (Presentable obj : this.presentables) {
			obj.stop();
		}
		
	}
	
	
}




