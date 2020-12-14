import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CWindow extends JFrame{
	
	/*.............ATTRIBUTS.............*/
	
	 JPanel mainPanel = new JPanel();
	 JPanel interactionPanel = new JPanel();
	 JPanel bigChoisePanel = new JPanel();
	 JPanel timePanel = new JPanel();
	 JPanel bigObjectPanel = new JPanel();
	
	public JLabel resultLabel = new JLabel();
	
	 JTextField inputHourTime, inputMinuteTime, inputSecondTime;
	
	public JButton goButton = new JButton("Valider");
	private JButton alarmClockButton = new JButton("Reveil");
	private JButton radioButton = new JButton("Radio");
	private JButton coffeeButton = new JButton("Machine a cafe");
	
	 boolean isChoiseAlarmClock, isChoiseRadio, isChoiseCoffee, isReload = false;
	
	public CRingingAlarmClock alarmAlarmClock;
	public CRadioAlarmClock radioAlarmClock;
	public CCoffeeAlarmClock coffeeAlarmClock;
	
	//constructeur
	CWindow(){
		
		this.setTitle("TP_POO_Alarm Menu");
		this.setSize(500,700);
		this.setLocationRelativeTo(null); //se placer au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//cr�ation du panel principal de la fen�tre
		mainPanel.setLayout(new BorderLayout()); //valeurs aux points cardinaux + centre
		creationMainPanel();
		mainPanel.setBackground(Color.black);
		
		this.setContentPane(mainPanel);
	    this.setVisible(true);
	}
	
	public void creationMainPanel() {
		
		//ajout de la partie NORD (Bienvenue)
		JLabel welcomeLabel = new JLabel("Bienvenue",SwingConstants.CENTER);
		welcomeLabel.setFont(new Font("Verdana", Font.BOLD, 50));
		welcomeLabel.setForeground(Color.white);
		mainPanel.add(welcomeLabel, BorderLayout.NORTH); //ajout du welcomePanel au mainPanel à la partie nord
				
		//creation du panel d'interaction avec l'utilisateur
		interactionPanel.setLayout(new GridLayout(4,1));
		creationInteractionPanel();
		interactionPanel.setBackground(Color.black);
		mainPanel.add(interactionPanel,BorderLayout.CENTER);
		
		//ajout de la partie sud (indication formulaire)
		resultLabel.setText("Le formulaire doit etre rempli avec des nombres");
		resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resultLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		resultLabel.setForeground(Color.white);

		mainPanel.add(resultLabel, BorderLayout.SOUTH);
	}
	
	private void creationInteractionPanel() {
		interactionPanel.add(timePanel);
		interactionPanel.add(bigObjectPanel);
		//Ajout du panel time
		choiseTime();
		timePanel.setBackground(Color.black);
		//Ajout du Panel objet
		choiseObject();
		bigObjectPanel.setBackground(Color.black);
	}
	
	private void choiseTime() {
		
		//creation d'un panel time
		timePanel.setLayout(new GridLayout(2,1));
		
		//Ajout du titre du Panel Time
		JLabel choiseTimeLabel = new JLabel("Choisissez l'horaire de votre alarme",SwingConstants.CENTER);
		choiseTimeLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		choiseTimeLabel.setForeground(Color.orange);
		timePanel.add(choiseTimeLabel);
		
		//creation d'un panel pour le formulaire où définir l'horaire de l'alarme
		JPanel panelForm = new JPanel();
		panelForm.setLayout(new GridLayout(1,6));

		//Heure
		inputHourTime = new JTextField("0", 10);
		panelForm.add(inputHourTime);
		JLabel hourLabel = new JLabel(": h");
		hourLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		hourLabel.setForeground(Color.white);
		panelForm.add(hourLabel);

		//Minute
		inputMinuteTime = new JTextField("0", 10);
		panelForm.add(inputMinuteTime);
		JLabel minuteLabel = new JLabel(": m");
		minuteLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		minuteLabel.setForeground(Color.white);
		panelForm.add(minuteLabel);

		//Secondes
		inputSecondTime = new JTextField("1", 10);
		panelForm.add(inputSecondTime);
		JLabel secondLabel = new JLabel(": s");
		secondLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		secondLabel.setForeground(Color.white);
		panelForm.add(secondLabel);
		
		panelForm.setBackground(Color.black);
		timePanel.add(panelForm);
	}
	
	private void choiseObject() {
		
		//creation d'un panel avec trois boutons pour choisir quel objet nous voulons utiliser
		JPanel objectPanel = new JPanel();
		objectPanel.setLayout(new GridLayout(1,3));
		
		alarmClockButton.addActionListener(new ButtonAlarmClockListener());
		alarmClockButton.setBackground(Color.gray);
		alarmClockButton.setForeground(Color.black);

		radioButton.addActionListener(new ButtonRadioListener());
		radioButton.setBackground(Color.gray);
		radioButton.setForeground(Color.black);

		coffeeButton.addActionListener(new ButtonCoffeeListener());
		coffeeButton.setBackground(Color.gray);
		coffeeButton.setForeground(Color.black);
		
		objectPanel.add(alarmClockButton);
		objectPanel.add(radioButton);
		objectPanel.add(coffeeButton);
		
		//Ajout du label du panel objet
		JLabel label = new JLabel("Choisissez l'objet sur lequel va porter l'alarme",SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 15));
		label.setForeground(Color.orange);
		
		//regroupement des deux panel precedents
		bigObjectPanel.setLayout(new GridLayout(2,1));
		bigObjectPanel.add(label);
		bigObjectPanel.add(objectPanel);
		
	}
	
	private void go() {
		goButton.setBackground(Color.gray);
		goButton.setForeground(Color.black);
		goButton.addActionListener(new ButtonGoListener());
	
	}
	
	public void createAlarmsPanel() {
		
		//on va creer ici la section pour choisir quelle sonnerie nous voulons
		
		//creation des boutons
		JPanel choiseAlarmPanel = new JPanel();
		choiseAlarmPanel.setLayout(new GridLayout(1,alarmAlarmClock.getAlarmsLength()));
		
		for(int i=0; i<alarmAlarmClock.getAlarmsLength(); i++) {
			JButton buttonAlarm = new JButton(alarmAlarmClock.getAlarms()[i]);
			buttonAlarm.setBackground(Color.gray);
			buttonAlarm.setForeground(Color.black);
			buttonAlarm.addActionListener(new ButtonAlarmsListener(i));
			choiseAlarmPanel.add(buttonAlarm);
		}
		//creation de l'explication de la zone
		JLabel label = new JLabel("Vous pouvez choisir votre alarme (par defaut la premiere)",SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 15));
		label.setForeground(Color.orange);
		
		//regroupement des deux 
		bigChoisePanel.setLayout(new GridLayout(2,1));
		bigChoisePanel.add(label);
		bigChoisePanel.add(choiseAlarmPanel);
		
		bigChoisePanel.setBackground(Color.black);
		interactionPanel.add(bigChoisePanel);	
		
	}
	
	public void createCoffeePanel() {
		
		//on va cr�er ici la section pour choisir quelle sonnerie nous voulons
		
		//cr�ation des boutons
		JPanel choiseCoffeePanel = new JPanel();
		choiseCoffeePanel.setLayout(new GridLayout(1,coffeeAlarmClock.getCoffeeLength()));
		
		for(int i=0; i<coffeeAlarmClock.getCoffeeLength(); i++) {
			JButton buttonCoffee = new JButton(coffeeAlarmClock.getCoffees()[i]);
			buttonCoffee.setBackground(Color.gray);
			buttonCoffee.setForeground(Color.black);
			buttonCoffee.addActionListener(new ButtonCoffeesListener(i));
			choiseCoffeePanel.add(buttonCoffee);
		}
		//cr�ation de l'explication de la zone
		JLabel label = new JLabel("Vous pouvez choisir votre cafe (par defaut le premier)",SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 15));
		label.setForeground(Color.orange);
		
		//regroupement des deux 
		bigChoisePanel.setLayout(new GridLayout(2,1));
		bigChoisePanel.add(label);
		bigChoisePanel.add(choiseCoffeePanel);
		bigChoisePanel.setBackground(Color.black);
		interactionPanel.add(bigChoisePanel);	
		
	}
	
	public void createRadioPanel() {
		
		//on va cr�er ici la section pour choisir quelle sonnerie nous voulons
		
		//cr�ation des boutons
		JPanel choiseRadioPanel = new JPanel();
		choiseRadioPanel.setLayout(new GridLayout(1,radioAlarmClock.getRadiosLength()));
		
		for(int i=0; i<radioAlarmClock.getRadiosLength(); i++) {
			JButton buttonRadio = new JButton(radioAlarmClock.getRadios()[i]);
			buttonRadio.addActionListener(new ButtonRadiosListener(i));
			buttonRadio.setBackground(Color.gray);
			buttonRadio.setForeground(Color.black);
			choiseRadioPanel.add(buttonRadio);
		}
		//cr�ation de l'explication de la zone
		JLabel label = new JLabel("Vous pouvez choisir votre radio (par defaut la premiere)",SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 15));
		label.setForeground(Color.orange);
		
		//regroupement des deux 
		bigChoisePanel.setLayout(new GridLayout(2,1));
		bigChoisePanel.add(label);
		bigChoisePanel.add(choiseRadioPanel);
		bigChoisePanel.setBackground(Color.black);
		interactionPanel.add(bigChoisePanel);	
		
	}
	
	
	class ButtonGoListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if(Integer.parseInt(inputMinuteTime.getText())<0 || Integer.parseInt(inputMinuteTime.getText())>59) {
				resultLabel.setText("Entrez un nombre de minute valide (>= à 0 ou < à 59)");
				
			}
			
			else if((Integer.parseInt(inputSecondTime.getText())<=0 && Integer.parseInt(inputMinuteTime.getText())<=0)|| Integer.parseInt(inputSecondTime.getText())>59) {
				resultLabel.setText("Entrez un nombre de seconde valide (> à 0 et < à 59)");
			}
			
			else {
				
				if(isChoiseAlarmClock) {
					alarmAlarmClock.rool();
				}
				
				else if(isChoiseRadio) {
					radioAlarmClock.rool();
				}
				
				else if(isChoiseCoffee) {
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
			alarmClockButton.setEnabled(false);
			
			resultLabel.setText("Valider et votre reveil sonnera : " + inputHourTime.getText() + " heure(s), "+ inputMinuteTime.getText() +" minute(s) et "+ inputSecondTime.getText()+ " secondes apr�s.");
			alarmAlarmClock = new CRingingAlarmClock(inputHourTime.getText() + ":" + inputMinuteTime.getText() + ":" + inputSecondTime.getText(),0);

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
			radioButton.setEnabled(false);
			
			resultLabel.setText("Validez et votre radio se mettra en route : " + inputHourTime.getText() + " heure(s), "+ inputMinuteTime.getText() +" minute(s) et "+ inputSecondTime.getText()+ " secondes apr�s.");
			radioAlarmClock = new CRadioAlarmClock(inputHourTime.getText() + ":" + inputMinuteTime.getText() + ":" + inputSecondTime.getText(), 0);
			createRadioPanel();
			
			interactionPanel.add(goButton);
			go();
		}
	}
	
	class ButtonCoffeeListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			isChoiseCoffee = true;
			alarmClockButton.setEnabled(false);
			radioButton.setEnabled(false);
			coffeeButton.setEnabled(false);
			
			resultLabel.setText("Validez et vous pourrez boire votre cafe : " + inputHourTime.getText() + " heure(s), "+ inputMinuteTime.getText() +" minute(s) et "+ inputSecondTime.getText()+ " secondes apr�s.");
			coffeeAlarmClock = new CCoffeeAlarmClock(inputHourTime.getText() + ":" + inputMinuteTime.getText() + ":" + inputSecondTime.getText(), 0);
			createCoffeePanel();
			
			interactionPanel.add(goButton);
			go();
		}
	}
	
	class ButtonAlarmsListener implements ActionListener{
		
		private int nbChoised = 0;
		
		public ButtonAlarmsListener(int nbChoised) {
			this.nbChoised = nbChoised;
		}
		
		public void actionPerformed(ActionEvent e) {
			alarmAlarmClock.setTypeOfAlarmChoised(this.nbChoised);
			resultLabel.setText("Votre choix de sonnerie est : " + alarmAlarmClock.getAlarms()[this.nbChoised] + (" ( " + inputHourTime.getText() + ":" + inputMinuteTime.getText() + ":" + inputSecondTime.getText()) + " )");
		}
		
	}
	
	class ButtonCoffeesListener implements ActionListener{
	
		private int nbChoised = 0;
		
		public ButtonCoffeesListener(int nbChoised) {
			this.nbChoised = nbChoised;
		}
		
		public void actionPerformed(ActionEvent e) {
			coffeeAlarmClock.setNbOfCoffeeChoised(this.nbChoised);
			resultLabel.setText("Votre choix de cafe est : " + coffeeAlarmClock.getCoffees()[this.nbChoised] + (" ( " + inputHourTime.getText() + ":" + inputMinuteTime.getText() + ":" + inputSecondTime.getText()) + " )");
		}
	}
	
	class ButtonRadiosListener implements ActionListener{
		
		private int nbChoised = 0;
		
		public ButtonRadiosListener(int nbChoised) {
			this.nbChoised = nbChoised;
		}
		
		public void actionPerformed(ActionEvent e) {
			radioAlarmClock.setTypeOfRadioChoised(this.nbChoised);
			resultLabel.setText("Votre choix de radio est : " + radioAlarmClock.getRadios()[this.nbChoised] + (" ( " + inputHourTime.getText() + ":" + inputMinuteTime.getText() + ":" + inputSecondTime.getText()) + " )");
		}
	}
}

