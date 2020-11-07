import java.util.ArrayList;

public class CAlarmAlarmClock extends CAlarmClock{
	
	//Classe représentant l'objet réveil
	
	/*............ATTRIBUTS..............*/
	//string dans lequel est stockée l'heure à laquel le réveil doit sonner
	private String end;
	private int nbOfAlarmChoised = 0;
	
	ArrayList<String> playlist = new ArrayList();
	
	String[] alarms = {"DRIIIING", "EH OHHHHH"};
	
	//constructeur
	CAlarmAlarmClock(String end, int nbOfAlarmChoised) {
		super();
		this.end = end;
		this.nbOfAlarmChoised = nbOfAlarmChoised;
		
		for(int i=0; i<alarms.length; i++) {
			playlist.add(alarms[i]);
		}
	}
	
    //verifie si on doit faire sonner le reveil
	@Override
    public void checkAlarm(){
        if(super.toString().equals(end)){
        	//activation du réveil
        	new CAlarmTrigger(end, playlist.get(nbOfAlarmChoised));
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
