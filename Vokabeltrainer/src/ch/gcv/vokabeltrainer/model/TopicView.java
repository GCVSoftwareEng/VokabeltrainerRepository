package ch.gcv.vokabeltrainer.model;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;


/**
 * GCV Software Engineering
 * Product: Vokabeltrainer
 * Copyright: 2014 GCV Software Engineering 
 *
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicView extends javax.swing.JFrame implements ITopicView {

    private ITopicPresenter presenter;
    
    private JMenuBar menuBar;
	private JMenu file;
	private JMenu language;
	private JMenuItem newPro;
	private JMenuItem loadPro;
	private JMenuItem newTopic;
	private JMenuItem addCard;
	private JMenuItem editCard;
	private JMenuItem removeCard;
	private JMenuItem exit;
	
	private JLabel topicname;
	
	private JButton boxButton1;
	private JButton boxButton2;
	private JButton boxButton3; 
	private JButton boxButton4;
	private JButton boxButton5;
	private JButton back;
	
	private JLabel boxLabel1;
	private JLabel boxLabel2;
	private JLabel boxLabel3;
	private JLabel boxLabel4;
	private JLabel boxLabel5;

	public TopicView(){
		super();
		this.presenter = null; // TODO
		throw new UnsupportedOperationException("Not implemented");
	}
 
    /** 
     * initComponents
	 *
	 */
	private void initComponents() {
		
		this.menuBar = new JMenuBar();
		this.file = new JMenu("File");
		this.language = new JMenu("Language", true);
		this.newPro = new JMenuItem("New Profile");
		this.loadPro = new JMenuItem("Load Profile");
		this.newTopic = new JMenuItem("New Topic");
		this.addCard = new JMenuItem("Add Card");
		this.editCard = new JMenuItem("Edit Card");
		this.removeCard = new JMenuItem("Remove Card");
		this.exit = new JMenuItem("Exit");
		
		this.back = new JButton(new ImageIcon(getClass().getResource("back.png")));
		this.boxButton1 = new JButton(new ImageIcon(getClass().getResource("box.png")));
		this.boxButton2 = new JButton(new ImageIcon(getClass().getResource("box.png")));
		this.boxButton3 = new JButton(new ImageIcon(getClass().getResource("box.png")));
		this.boxButton4 = new JButton(new ImageIcon(getClass().getResource("box.png")));
		this.boxButton5 = new JButton(new ImageIcon(getClass().getResource("box.png")));
		
		this.topicname = new JLabel()
		this.boxLabel1 = new JLabel("Box: 1");
		this.boxLabel2 = new JLabel("Box: 2");
		this.boxLabel3 = new JLabel("Box: 3");
		this.boxLabel4 = new JLabel("Box: 4");
		this.boxLabel5 = new JLabel("Box: 5");
		
		
    }

    /** 
     * getPresenter implements ITopicView.getPresenter
	 * @return ITopicPresenter  // TODO
	 */
	@Override
	public ITopicPresenter getPresenter() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * setPresenter implements ITopicView.setPresenter
	 * @param presenter // TODO 
	 *
	 */
	@Override
	public void setPresenter(ITopicPresenter presenter) {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * updateModelFromView implements ITopicView.updateModelFromView
	 *
	 */
	@Override
	public void updateModelFromView() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * updateViewFromModel implements ITopicView.updateViewFromModel
	 *
	 */
	@Override
	public void updateViewFromModel() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * open implements ITopicView.open
	 *
	 */
	@Override
	public void open() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

    /** 
     * close implements ITopicView.close
	 *
	 */
	@Override
	public void close() {
		// TODO should be implemented
		throw new UnsupportedOperationException("Not implemented");
    }

}
 
