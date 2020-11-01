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
	private CHourContainer hourContainer;
	private CAlarmClockContainer alarmClockContainer;
	private CRadioContainer radioContainer;
	private CCoffeeContainer coffeeContainer;
	
	
	//constructeur
	CWindow(){
		
		this.setTitle("TP_POO_Alarm Menu");
		this.setSize(1200,800);
		this.setLocationRelativeTo(null); //se placer au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		hourContainer = new CHourContainer("");
		alarmClockContainer = new CAlarmClockContainer();
		radioContainer = new CRadioContainer();
		coffeeContainer = new CCoffeeContainer();

		mainContainer.setBackground(Color.white);
		mainContainer.setLayout(new GridLayout(1,3));

		mainContainer.add(alarmClockContainer);
		mainContainer.add(radioContainer);
		mainContainer.add(coffeeContainer);
		
		this.setContentPane(mainContainer);
	    this.setVisible(true);
	}

}
