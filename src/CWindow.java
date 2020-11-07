import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CWindow extends JFrame{
	
	/*.............ATTRIBUTS.............*/
	
	public JPanel mainPanel = new JPanel();
	public JPanel interactionPanel = new JPanel();
	public JPanel bigChoiseAlarmPanel = new JPanel();
	private JPanel timePanel = new JPanel();
	private JPanel bigObjectPanel = new JPanel();
	
	public JLabel resultLabel = new JLabel();
	public JLabel chronoLabel = new JLabel();
	
	private JTextField inputHourTime, inputMinuteTime, inputSecondTime;
	
	public JButton goButton = new JButton("Valider");
	private JButton alarmClockButton = new JButton("Réveil");
	private JButton radioButton = new JButton("Radio");
	private JButton coffeeButton = new JButton("Machine à café");
	
	public boolean isChoiseAlarmClock, isChoiseRadio, isChoiseCoffee = false;
	
	public CAlarmAlarmClock alarmAlarmClock;
	public CRadioAlarmClock radioAlarmClock;
	public CCoffeeAlarmClock coffeeAlarmClock;
	
	//constructeur
	CWindow(){
		
		System.out.println("Je suis dans ma window");
		
		this.setTitle("TP_POO_Alarm Menu");
		this.setSize(1200,800);
		this.setLocationRelativeTo(null); //se placer au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//création du panel principal de la fenêtre
		mainPanel.setLayout(new BorderLayout());
		creationMainPanel();
		
		this.setContentPane(mainPanel);
	    this.setVisible(true);
	}
	
	public void creationMainPanel() {
		
		System.out.println("Je crée un mainPanel");
		
		//ajout de la partie NORTH
		JLabel welcomeLabel = new JLabel("Bienvenue",SwingConstants.CENTER);
		welcomeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		mainPanel.add(welcomeLabel, BorderLayout.NORTH);
				
		//création du panel d'intéraction avec l'utilisateur
		interactionPanel.setLayout(new GridLayout(4,1));
		creationInteractionPanel();
		mainPanel.add(interactionPanel,BorderLayout.CENTER);
		
		//ajout de la partie SOUTH
		resultLabel.setText("Le formulaire doit être rempli avec des nombres");
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		mainPanel.add(resultLabel, BorderLayout.SOUTH);
	}
	
	private void creationInteractionPanel() {
		
		interactionPanel.add(timePanel);
		interactionPanel.add(bigObjectPanel);
		choiseTime();
		choiseObject();
	}
	
	private void choiseTime() {
		
		//création d'un panel temps
		timePanel.setLayout(new GridLayout(2,1));
		
		//création d'un label pour le titre de la section
		JLabel choiseTimeLabel = new JLabel("Choisissez un temps d'attente",SwingConstants.CENTER);
		choiseTimeLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		timePanel.add(choiseTimeLabel);
		
		//création d'un panel pour le formulaire
		JPanel panelForm = new JPanel();
		panelForm.setLayout(new GridLayout(1,3));
		
		inputHourTime = new JTextField("heures", 10);
		panelForm.add(inputHourTime);
		
		inputMinuteTime = new JTextField("minutes", 10);
		panelForm.add(inputMinuteTime);
		
		inputSecondTime = new JTextField("secondes", 10);
		panelForm.add(inputSecondTime);
		
		timePanel.add(panelForm);
	}
	
	private void choiseObject() {
		
		//création d'un panel avec trois boutons pour choisir quel objet nous voulons utiliser
		JPanel objectPanel = new JPanel();
		objectPanel.setLayout(new GridLayout(1,3));
		alarmClockButton.addActionListener(new ButtonAlarmClockListener());
		radioButton.addActionListener(new ButtonRadioListener());
		coffeeButton.addActionListener(new ButtonCoffeeListener());
		
		objectPanel.add(alarmClockButton);
		objectPanel.add(radioButton);
		objectPanel.add(coffeeButton);
		
		//création de l'explication de la zone
		JLabel label = new JLabel("Choisissez un objet à utiliser",SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		//création d'un panel regroupant les deux 
		bigObjectPanel.setLayout(new GridLayout(2,1));
		bigObjectPanel.add(label);
		bigObjectPanel.add(objectPanel);
		
	}
	
	
	private void go() {
		
		goButton.addActionListener(new ButtonGoListener());
	
	}
	
	public void createAlarmsPanel() {
		
		//on va créer ici la section pour choisir quelle sonnerie nous voulons
		
		//création des boutons
		JPanel choiseAlarmPanel = new JPanel();
		choiseAlarmPanel.setLayout(new GridLayout(1,alarmAlarmClock.getAlarmsLength()));
		
		for(int i=0; i<alarmAlarmClock.getAlarmsLength(); i++) {
			JButton buttonAlarm = new JButton(alarmAlarmClock.getAlarms()[i]);
			buttonAlarm.addActionListener(new ButtonAlarmsListener(i));
			choiseAlarmPanel.add(buttonAlarm);
		}
		//création de l'explication de la zone
		JLabel label = new JLabel("Vous pouvez choisir votre alarme (par défaut la première)",SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		//regroupement des deux 
		bigChoiseAlarmPanel.setLayout(new GridLayout(2,1));
		bigChoiseAlarmPanel.add(label);
		bigChoiseAlarmPanel.add(choiseAlarmPanel);
		
		interactionPanel.add(bigChoiseAlarmPanel);	
		
	}
	
	class ButtonGoListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if(Integer.parseInt(inputMinuteTime.getText())<0 || Integer.parseInt(inputMinuteTime.getText())>59) {
				resultLabel.setText("Entrez un nombre de minute valide (<59 ou > 0)");
			}
			
			else if(Integer.parseInt(inputSecondTime.getText())<0 || Integer.parseInt(inputSecondTime.getText())>59) {
				resultLabel.setText("Entrez un nombre de seconde valide (<59 ou > 0)");
			}
			
			else {
				if(isChoiseAlarmClock) {
					alarmAlarmClock.rool();
				}
				
				else if(isChoiseRadio) {
					radioAlarmClock = new CRadioAlarmClock(inputHourTime.getText() + ":" + inputMinuteTime.getText() + ":" + inputSecondTime.getText());
					radioAlarmClock.rool();
				}
				
				else if(isChoiseCoffee) {
					coffeeAlarmClock = new CCoffeeAlarmClock(inputHourTime.getText() + ":" + inputMinuteTime.getText() + ":" + inputSecondTime.getText());
					coffeeAlarmClock.rool();
				}
				
				else {
					resultLabel.setText("Choisissez un objet avant !");
				}
			}
		}
	}
	
	class ButtonAlarmClockListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			isChoiseAlarmClock = true;
			radioButton.setEnabled(false);
			coffeeButton.setEnabled(false);
			inputHourTime.setEnabled(false);
			inputMinuteTime.setEnabled(false);
			inputSecondTime.setEnabled(false);
			
			resultLabel.setText("Valider et votre réveil sonnera : " + inputHourTime.getText() + " heure(s), "+ inputMinuteTime.getText() +" minute(s) et "+ inputSecondTime.getText()+ " secondes après.");
			alarmAlarmClock = new CAlarmAlarmClock(inputHourTime.getText() + ":" + inputMinuteTime.getText() + ":" + inputSecondTime.getText(),0);
			createAlarmsPanel();	
			
			interactionPanel.add(goButton);
			go();
		}
	}
	
	class ButtonRadioListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			isChoiseRadio = true;
			alarmClockButton.setEnabled(false);
			coffeeButton.setEnabled(false);
			inputHourTime.setEnabled(false);
			inputMinuteTime.setEnabled(false);
			inputSecondTime.setEnabled(false);
			
			resultLabel.setText("Validez et votre radio se mettra en route : " + inputHourTime.getText() + " heure(s), "+ inputMinuteTime.getText() +" minute(s) et "+ inputSecondTime.getText()+ " secondes après.");
		}
	}
	
	class ButtonCoffeeListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			isChoiseCoffee = true;
			alarmClockButton.setEnabled(false);
			radioButton.setEnabled(false);
			inputHourTime.setEnabled(false);
			inputMinuteTime.setEnabled(false);
			inputSecondTime.setEnabled(false);
			
			resultLabel.setText("Validez et vous pourrez boire votre café : " + inputHourTime.getText() + " heure(s), "+ inputMinuteTime.getText() +" minute(s) et "+ inputSecondTime.getText()+ " secondes après.");
		}
	}
	
	class ButtonAlarmsListener implements ActionListener{
		
		private int nbChoised = 0;
		
		public ButtonAlarmsListener(int nbChoised) {
			this.nbChoised = nbChoised;
		}
		
		public void actionPerformed(ActionEvent e) {
			alarmAlarmClock.setNbOfAlarmChoised(this.nbChoised);
			resultLabel.setText("Votre choix de sonnerie est : " + alarmAlarmClock.getAlarms()[this.nbChoised] + (" ( " + inputHourTime.getText() + ":" + inputMinuteTime.getText() + ":" + inputSecondTime.getText()) + " )");
		}
		
	}
}

