public class CRadioAlarmClock extends CAlarmClock{

	//Classe repr�sentant l'objet radio
	/*............ATTRIBUTS..............*/
	//string dans lequel est stock�e l'heure � laquel le r�veil doit sonner
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
        	//arr�t du compteur
        	super.stopWatch();
        }
    }
}
