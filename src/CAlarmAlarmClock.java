import java.util.ArrayList;

public class CAlarmAlarmClock extends CAlarmClock{
	
	//Utilisation des réveils à travers CAlarmTrigger
	
	/*............ATTRIBUTS..............*/
	private String end; //string dans lequel est stockée l'heure à laquel le réveil doit sonner
	private int nbOfAlarmChoised = 0; //choix de l'alarme par l'utilisateur dans la version application
	
	String[] alarms = {"Sonnerie 1", "Sonnerie 2", "Sonnerie 3", "Sonnerie 4"}; //tableau représentant le choix d'alarmes possibles
	
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
