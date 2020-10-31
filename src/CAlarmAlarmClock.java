public class CAlarmAlarmClock extends CAlarmClock{
	
	//Classe repr�sentant l'objet r�veil
	
	/*............ATTRIBUTS..............*/
	//string dans lequel est stock�e l'heure � laquel le r�veil doit sonner
	private String end;
	
	//constructeur
	CAlarmAlarmClock(String end) {
		super();
		this.end = end;
	}
	
    //verifie si on doit faire sonner le reveil
	@Override
    public void checkAlarm(){
        if(super.toString().equals(end)){
        	//activation du r�veil
        	new CAlarmTrigger(end, "DRIIIING");
        	//arr�t du compteur
        	super.stopWatch();
        }
    }
}
