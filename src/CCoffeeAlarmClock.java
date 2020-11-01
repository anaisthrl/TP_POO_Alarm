public class CCoffeeAlarmClock extends CAlarmClock{

	//Classe représentant l'objet machine à café
	
	/*............ATTRIBUTS..............*/
	//string dans lequel est stockée l'heure à laquel le réveil doit sonner
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
	        new CCoffeeTrigger(end, "Café est prêt !");
	        //arrêt du compteur
	        super.stopWatch();
	       }
	   }
}
