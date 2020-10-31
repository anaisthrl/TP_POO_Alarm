public class CAlarmAlarmClock extends CAlarmClock{
	
	//Classe représentant l'objet réveil
	
	/*............ATTRIBUTS..............*/
	//string dans lequel est stockée l'heure à laquel le réveil doit sonner
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
        	//activation du réveil
        	new CAlarmTrigger(end, "DRIIIING");
        	//arrêt du compteur
        	super.stopWatch();
        }
    }
}
