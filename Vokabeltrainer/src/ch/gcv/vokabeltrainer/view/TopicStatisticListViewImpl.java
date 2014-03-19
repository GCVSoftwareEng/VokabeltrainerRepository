package ch.gcv.vokabeltrainer.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import ch.gcv.vokabeltrainer.interfaces.Card;
import ch.gcv.vokabeltrainer.interfaces.TopicCardListPresenter;
import ch.gcv.vokabeltrainer.interfaces.TopicCardListView;
import ch.gcv.vokabeltrainer.interfaces.TopicStatisticListPresenter;
import ch.gcv.vokabeltrainer.interfaces.TopicStatisticListView;
import ch.gcv.vokabeltrainer.interfaces.Translatable;
import ch.gcv.vokabeltrainer.model.TranslationManager;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicStatisticListViewImpl extends javax.swing.JFrame implements
		TopicStatisticListView, Translatable {

	private TopicStatisticListPresenter presenter;

	private JTextPane topic;
	private JScrollPane scrollPane;
	private final JTable table = new JTable() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 12345L;

		public boolean isCellEditable(int x, int y) {
			return false;
		}
	};;

	// private JPanel cardPanel;
	public TopicStatisticListViewImpl() {
		super("CardStatistikListView");
		
		this.initComponents();
	}

	/**
	 * initComponents
	 * 
	 */
	public void initComponents() {

		this.getContentPane().setBackground(Color.WHITE);
		this.topic = new JTextPane();
		// this.liste.addMouseListener(new java.awt.event.MouseListener() {
		// @Override
		// public void mouseClicked(MouseEvent e) {
		// if(e.getClickCount() == 2){
		// String name = liste.getSelectedValue().toString();
		//
		//
		// }
		// }
		//
		// @Override
		// public void mouseEntered(MouseEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void mouseExited(MouseEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void mousePressed(MouseEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void mouseReleased(MouseEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		// });
	
		

		

		this.scrollPane = new JScrollPane(table);
		table.setPreferredScrollableViewportSize(new Dimension(400, 0));

		// JFrame defination
		super.setBackground(Color.WHITE);
		super.setResizable(false);
		super.setSize(500, 500);
		super.setVisible(true);
		super.setLayout(null);

		scrollPane.setBounds(50, 80, 400, 350);

		
		topic.setEditable(false);
		SimpleAttributeSet set = new SimpleAttributeSet();
		StyleConstants.setAlignment(set, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set, "Times New Roman");
		StyleConstants.setFontSize(set, 30);
		StyleConstants.setItalic(set, true);
		StyleConstants.setBold(set, true);
		topic.setParagraphAttributes(set, true);
		topic.setBackground(Color.WHITE);
		topic.setBounds(50, 20, 200, 50);
		topic.setText("Topic");

		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		scrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane
				.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		super.add(scrollPane);
		super.add(topic);
	
	}

	/**
	 * updateModelFromView implements ICardListView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {

	}

	/**
	 * updateViewFromModel implements ICardListView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {

		topic.setText(presenter.getModel().getName());
		setTableContent();
		
	}

	/**
	 * open implements ICardListView.open
	 * 
	 */
	@Override
	public void open() {
		TranslationManager.getinstance().addListener(this);
		translate();
		setVisible(true);
	}

	/**
	 * close implements ICardListView.close
	 * 
	 */
	@Override
	public void close() {
		TranslationManager.getinstance().removeListener(this);
		dispose();
	}

	/**
	 * languageChanged implements ILanguageChangedListener.languageChanged
	 * 
	 */
	@Override
	public void translate() {
		updateViewFromModel();
	}

	@Override
	public TopicStatisticListPresenter getPresenter() {
		return this.presenter;
	}

	@Override
	public void setPresenter(TopicStatisticListPresenter presenter) {
		this.presenter = presenter;

	}	
	
	private void setTableContent(){
		
		Object[][] data = new Object[this.presenter.getModel().getCards().size()][5];
	
		int count = 0;
		for (Card card : this.presenter.getModel().getCards()) {
			data[count][0] = card.getBox();
			data[count][1] = card.getQuestion();
			data[count][2] = card.getAnswer();
			data[count][3] = card.getStatisticCountWrong();
			data[count][4] = card.getStatisticCountRight();
			count ++;
		}
	
		String box = TranslationManager.getinstance().getText("box");
		String question = TranslationManager.getinstance().getText("question");
		String answer = TranslationManager.getinstance().getText("answer");
		String countWrong = TranslationManager.getinstance().getText("countWrong");
		String countRight = TranslationManager.getinstance().getText("countRight");
		
		String[] columnNames = {box, question, answer, countWrong,
				countRight};

		TableModel model = new DefaultTableModel(data, columnNames);
		this.table.setModel(model);
		
		
	}
	

}
