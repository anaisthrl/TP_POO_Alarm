import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CAlarmClockContainer extends JPanel{
	
	private JButton buttonTitle;
	private JButton buttonGo;
	private CHourContainer hourContainer = new CHourContainer("Dans combien de temps voulez-vous vous r�veiller ? ");
	private JPanel bigContainer;
	private CAlarmAlarmClock alarmAlarmClock1;
	private String text = "nothing";
	
	CAlarmClockContainer(String text){
		this.text = text;
		
		System.out.println("in alarm :" + this.text);
		
		this.setLayout(new BorderLayout());
		
		makeContainer();
	}
	
	public void makeContainer() {
		System.out.println("in make :" + this.text);
		
		createButtonTitle();
		this.add(buttonTitle, BorderLayout.NORTH);
		
		bigContainer = new JPanel();
		bigContainer.setLayout(new GridLayout(3,1));
		
		bigContainer.add(hourContainer);
		bigContainer.add(new JLabel(this.text));
		
		this.add(bigContainer, BorderLayout.CENTER);
		
		createButtonGo();
		this.add(buttonGo, BorderLayout.SOUTH);
	}
	
	public String getText() {
		return this.text;
	}

	private void createButtonTitle() {
		buttonTitle = new JButton("R�veil");
		buttonTitle.setEnabled(false);
	}
	
	private void createButtonGo() {
		buttonGo = new JButton("Valider");
		buttonGo.addActionListener(new buttonGoListener());
	}

	class buttonGoListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
		
			if(Integer.parseInt(hourContainer.getInputSecondTime().getText())<0 || Integer.parseInt(hourContainer.getInputMinuteTime().getText())>59) {
				System.out.println("Erreur: Entrez un nombre de minutes inf�rieur � 60");
				CAlarmClockContainer alarmClockContainer = new CAlarmClockContainer("Erreur: Entrez un nombre de minutes inf�rieur � 60");
				
			}
			
			else if(Integer.parseInt(hourContainer.getInputSecondTime().getText())<0 || Integer.parseInt(hourContainer.getInputSecondTime().getText())>59) {
				System.out.println("Erreur: Entrez un nombre de secondes inf�rieur � 60");
				CAlarmClockContainer alarmClockContainer = new CAlarmClockContainer("Erreur: Entrez un nombre de secondes inf�rieur � 60");
			}
			
			else{
				//Cr�ation de l'alarme
				alarmAlarmClock1 = new CAlarmAlarmClock(hourContainer.getInputHourTime().getText() + ":" + hourContainer.getInputMinuteTime().getText() + ":" + hourContainer.getInputSecondTime().getText());
				//lancement de l'alarme
				alarmAlarmClock1.rool();
			}
		}
	}
}
