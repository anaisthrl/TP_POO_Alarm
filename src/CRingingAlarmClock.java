public class CRingingAlarmClock extends CAlarmClock{
	
	//Utilisation des r�veils � travers CAlarmTrigger
	
	/*............ATTRIBUTS..............*/
	private String end; //string dans lequel est stock�e l'heure � laquel le r�veil doit sonner
	private int typeOfAlarmChoised = 0; //choix de l'alarme par l'utilisateur dans la version application
	
	String[] alarms = {"Sonnerie 1", "Sonnerie 2", "Sonnerie 3", "Sonnerie 4"}; //tableau repr�sentant le choix d'alarmes possibles
	
	//constructeur
	CRingingAlarmClock(String end, int typeOfAlarmChoised) {
		super();
		this.end = end;
		this.typeOfAlarmChoised = typeOfAlarmChoised;

	}
	
    //verifie si on doit faire sonner le reveil
	@Override
    public void checkAlarm(){
		
        if(super.toString().equals(end)){ 
        	//activation du r�veil
        	new CRingingTrigger(end, alarms[this.typeOfAlarmChoised]);
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
	
	public void setTypeOfAlarmChoised(int nb) {
		this.typeOfAlarmChoised = nb;
	}
}
