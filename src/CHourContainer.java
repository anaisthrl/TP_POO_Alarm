import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class CHourContainer extends JPanel{
	
	private JTextField inputHourTime;
	private JTextField inputMinuteTime;
	private JTextField inputSecondTime;
	private JPanel panelForm;
	private String sentence = "";
	
	CHourContainer(String sentence){
		this.sentence = sentence;
		createPanelFormTime();
		this.setLayout(new BorderLayout());
		this.add(panelForm, BorderLayout.SOUTH);
	}
	
	public  void paintComponent(Graphics g) {
		g.drawString(sentence, this.getWidth()/2 -150, this.getHeight()/2-50);
	}

	private void createPanelFormTime() {
		panelForm = new JPanel();
		panelForm.setLayout(new GridLayout(1,3));
		
		inputHourTime = new JTextField("heures", 10);
		panelForm.add(inputHourTime);
		
		inputMinuteTime = new JTextField("minutes", 10);
		panelForm.add(inputMinuteTime);
		
		inputSecondTime = new JTextField("secondes", 10);
		panelForm.add(inputSecondTime);
		
		this.add(panelForm);
	}
	
	public JTextField getInputHourTime() {
		return this.inputHourTime;
	}
	
	public JTextField getInputMinuteTime() {
		return this.inputMinuteTime;
	}
	
	public JTextField getInputSecondTime() {
		return this.inputSecondTime;
	}
}
