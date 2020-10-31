public class CRadioAlarmClock extends CAlarmClock{

	//Classe représentant l'objet radio
	/*............ATTRIBUTS..............*/
	//string dans lequel est stockée l'heure à laquel le réveil doit sonner
	private String end;
	
	//constructeur
	CRadioAlarmClock(String end) {
		super();
		this.end = end;
	}
	
    //verifie si on doit faire sonner le reveil
	@Override
    public void checkAlarm(){
        if(super.toString().equals(end)){
        	//activation de la radio
        	new CRadioTrigger(end, "NRJ");
        	//arrêt du compteur
        	super.stopWatch();
        }
    }
}
