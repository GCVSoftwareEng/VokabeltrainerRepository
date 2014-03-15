package ch.gcv.vokabeltrainer.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import ch.gcv.vokabeltrainer.model.ITranslatable;
import ch.gcv.vokabeltrainer.model.TranslationManager;
import ch.gcv.vokabeltrainer.presenter.ITopicCreatePresenter;

/**
 * GCV Software Engineering Product: Vokabeltrainer Copyright: 2014 GCV Software
 * Engineering
 * 
 * @author Vincenzo Urbisaglia
 * @version 1.0
 */
public class TopicEditView extends javax.swing.JFrame implements ITopicEditView, ITranslatable {

	private ITopicCreatePresenter presenter;

	private JButton back;
	private JButton edit;

	private JTextField topicnameField;
	private JLabel topicname;

	private JTextPane topic;

	public TopicEditView() {
		super();
		this.initComponents();
	}

	/**
	 * initComponents
	 * 
	 */
	private void initComponents() {

		this.back = new JButton(new ImageIcon(getClass()
				.getResource("plus.png")));
		this.edit = new JButton(new ImageIcon(getClass()
				.getResource("edit.png")));
		
		this.edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButtonEditTopicActionPerformed(evt);
            }
        });
	
		this.topic = new JTextPane();
		this.topicname = new JLabel();
		this.topicnameField = new JTextField();

		// JFrame defination
		super.setBackground(Color.WHITE);
		super.setResizable(true);
		
		super.setSize(600, 280);
		super.setLayout(null);

		
		// topicnamelabel
		topicname.setVisible(true);
		topicname.setFont(topicname.getFont().deriveFont(20f));
		topicname.setBounds(20, 80, 550, 30);
		topicname.setBackground(Color.LIGHT_GRAY);

		// textfiel
		topicnameField.setEditable(true);
		topicnameField.setVisible(true);
		topicnameField.setFont(topicnameField.getFont().deriveFont(20f));
		topicnameField.setBounds(20, 130, 490, 50);

		back.setBounds(20, 10, 51, 50);
		edit.setBounds(520, 130, 51, 50);

		topic.setEditable(false);
		SimpleAttributeSet set = new SimpleAttributeSet();
		StyleConstants.setAlignment(set, StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontFamily(set, "Times New Roman");
		StyleConstants.setFontSize(set, 30);
		StyleConstants.setItalic(set, true);
		StyleConstants.setBold(set, true);
		topic.setParagraphAttributes(set, true);
		topic.setBackground(Color.WHITE);
		topic.setBounds(90, 20, 400, 40);
		topic.setText("Topic");

		super.add(back);
		super.add(edit);
		super.add(topic);
		super.add(topicname);
		super.add(topicnameField);

	}
	
	class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource() == back){
				ProfileView profileView = new ProfileView();
				profileView.initComponents();
				
			}
			else if(e.getSource() == edit){
				String text = topicnameField.getText();
				topic.setText(text);
			}
		}

		}

	/**
	 * getPresenter implements ITopicEditView.getPresenter
	 * 
	 * @return TopicEditPresenter // TODO
	 */
	@Override
	public ITopicCreatePresenter getPresenter() {
		
		throw new UnsupportedOperationException("Not implemented");
		
	}

	/**
	 * setPresenter implements ITopicEditView.setPresenter
	 * 
	 * @param presenter
	 *            // TODO
	 * 
	 */
	@Override
	public void setPresenter(ITopicCreatePresenter presenter) {
		
		this.presenter = presenter;
		
	}

	/**
	 * updateModelFromView implements ITopicEditView.updateModelFromView
	 * 
	 */
	@Override
	public void updateModelFromView() {
		this.presenter.getModel().setName(this.topicnameField.getText());
	}

	/**
	 * updateViewFromModel implements ITopicEditView.updateViewFromModel
	 * 
	 */
	@Override
	public void updateViewFromModel() {
		// TODO should be implemented
		// TODO topic.setText();
		// TODO topicname.setText(text);
		
	}

	/**
	 * open implements ITopicEditView.open
	 * 
	 */
	@Override
	public void open() {
		TranslationManager.getinstance().addListener(this);
		translate();
		setVisible(true);
		
	}

	/**
	 * close implements ITopicEditView.close
	 * 
	 */
	@Override
	public void close() {
		TranslationManager.getinstance().removeListener(this);
		dispose();
	}

	
	private void jButtonEditTopicActionPerformed(java.awt.event.ActionEvent evt) {
        this.updateModelFromView();
        this.presenter.confirm();
        this.close();
    }
	

    /** 
     * languageChanged implements ILanguageChangedListener.languageChanged
	 *
	 */
	@Override
	public void translate() {
		this.topic.setText(TranslationManager.getinstance().getText("topic"));
    }
	

}
