import java.util.ArrayList;

public class CAlarmAlarmClock extends CAlarmClock{
	
	//Utilisation des réveil à travers CAlarmTrigger
	
	/*............ATTRIBUTS..............*/
	private String end; //string dans lequel est stockée l'heure à laquel le réveil doit sonner
	private int nbOfAlarmChoised = 0; //choix de l'alarme dans la version application
	
	String[] alarms = {"DRIIIING", "EH OHHHHH"}; //tableau représentant le choix d'alarmes possibles
	
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
        	//activation du réveil
        	new CAlarmTrigger(end, alarms[this.nbOfAlarmChoised]);
        	//arrêt du compteur
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
