import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CRadioContainer extends JPanel{
	
	private JButton buttonTitle;
	private JButton buttonGo;
	private CHourContainer hourContainer;
	private JPanel bigContainer;
	private CResultContainer resultContainer;
	private CRadioAlarmClock radioAlarmClock1;
	private String erreur = "";
	
	CRadioContainer(){
		this.setLayout(new BorderLayout());
		
		hourContainer = new CHourContainer("Dans combien de temps voulez-vous vous réveiller ? ");
		resultContainer = new CResultContainer("");
		
		createButtonTitle();
		this.add(buttonTitle, BorderLayout.NORTH);
		
		bigContainer = new JPanel();
		bigContainer.setLayout(new GridLayout(3,1));
		bigContainer.add(hourContainer);
		bigContainer.add(resultContainer);
		this.add(bigContainer, BorderLayout.CENTER);
		
		createButtonGo();
		this.add(buttonGo, BorderLayout.SOUTH);
	}
	
	public void paintComponent(Graphics g) {
		g.drawRect(0, 0, this.getWidth(), this.getHeight());
	}
	
	private void createButtonTitle() {
		buttonTitle = new JButton("Radio");
		buttonTitle.setEnabled(false);
	}
	
	private void createButtonGo() {
		buttonGo = new JButton("Valider");
		buttonGo.addActionListener(new buttonGoListener());
	}
	
	class buttonGoListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if(Integer.parseInt(hourContainer.getInputSecondTime().getText())<0 ||Integer.parseInt(hourContainer.getInputMinuteTime().getText())>59) {
				System.out.println("Erreur: Entrez un nombre de minutes inférieur à 60");
				erreur="Erreur: Entrez un nombre de minutes inférieur à 60";
				resultContainer = new CResultContainer(erreur);
				bigContainer.add(resultContainer);
				CAlarmClockContainer alarmClockContainer = new CAlarmClockContainer();
			}
			
			else if(Integer.parseInt(hourContainer.getInputSecondTime().getText())<0 || Integer.parseInt(hourContainer.getInputSecondTime().getText())>59) {
				System.out.println("Erreur: Entrez un nombre de secondes inférieur à 60");
				erreur = "Erreur: Entrez un nombre de secondes inférieur à 60";
				resultContainer = new CResultContainer(erreur);
				bigContainer.add(resultContainer);
				CAlarmClockContainer alarmClockContainer = new CAlarmClockContainer();
			}
			else {
				radioAlarmClock1 = new CRadioAlarmClock(hourContainer.getInputHourTime().getText() + ":" + hourContainer.getInputMinuteTime().getText() + ":" + hourContainer.getInputSecondTime().getText()); 
				radioAlarmClock1.rool();
			}
		}
	}
}
