import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CWindow extends JFrame{
	
	/*.............ATTRIBUTS.............*/
	
	private JPanel mainContainer = new JPanel();
	//private CHourContainer hourContainer = new CHourContainer("");
	private CAlarmClockContainer alarmClockContainer= new CAlarmClockContainer("");
	private CRadioContainer radioContainer = new CRadioContainer("");
	private CCoffeeContainer coffeeContainer = new CCoffeeContainer("");
	private String textAlarmClock;
	
	
	//constructeur
	CWindow(){
		
		this.setTitle("TP_POO_Alarm Menu");
		this.setSize(1200,800);
		this.setLocationRelativeTo(null); //se placer au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.textAlarmClock = alarmClockContainer.getText();
		mainContainer.setBackground(Color.white);
		mainContainer.setLayout(new GridLayout(1,3));

		mainContainer.add(alarmClockContainer);
		mainContainer.add(radioContainer);
		mainContainer.add(coffeeContainer);
		
		this.setContentPane(mainContainer);
	    this.setVisible(true);
	}

}
