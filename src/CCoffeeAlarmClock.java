public class CCoffeeAlarmClock extends CAlarmClock{

	//Classe repr�sentant l'objet machine � caf�
	
	/*............ATTRIBUTS..............*/
	//string dans lequel est stock�e l'heure � laquel le r�veil doit sonner
	private String end;
		
	//constructeur
	CCoffeeAlarmClock(String end) {
		super();
		this.end = end;
	}
		
	//verifie si on doit faire sonner le reveil
	@Override
	   public void checkAlarm(){
	       if(super.toString().equals(end)){
	        //activation de la radio
	        new CCoffeeTrigger(end, "Caf� est pr�t !");
	        //arr�t du compteur
	        super.stopWatch();
	       }
	   }
}
