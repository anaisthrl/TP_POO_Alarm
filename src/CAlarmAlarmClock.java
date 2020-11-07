import java.util.ArrayList;

public class CAlarmAlarmClock extends CAlarmClock{
	
	//Utilisation des r�veil � travers CAlarmTrigger
	
	/*............ATTRIBUTS..............*/
	private String end; //string dans lequel est stock�e l'heure � laquel le r�veil doit sonner
	private int nbOfAlarmChoised = 0; //choix de l'alarme dans la version application
	
	String[] alarms = {"DRIIIING", "EH OHHHHH"}; //tableau repr�sentant le choix d'alarmes possibles
	
	//constructeur
	CAlarmAlarmClock(String end, int nbOfAlarmChoised) {
		super();
		this.end = end;
		this.nbOfAlarmChoised = nbOfAlarmChoised;

	}
	
    //verifie si on doit faire sonner le reveil
	@Override
    public void checkAlarm(){
        if(super.toString().equals(end)){
        	//activation du r�veil
        	new CAlarmTrigger(end, alarms[this.nbOfAlarmChoised]);
        	//arr�t du compteur
        	super.stopWatch();
        }
    }
	
	public int getAlarmsLength() {
		return alarms.length;
	}
	
	public String[] getAlarms() {
		return alarms;
	}
	
	public void setNbOfAlarmChoised(int nb) {
		this.nbOfAlarmChoised = nb;
	}
}
