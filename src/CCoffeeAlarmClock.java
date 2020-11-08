import java.util.ArrayList;

public class CCoffeeAlarmClock extends CAlarmClock{

	//Classe représentant l'objet machine à café
	
	/*............ATTRIBUTS..............*/
	//string dans lequel est stockée l'heure à laquel le réveil doit sonner
	private String end;//string dans lequel est stockée l'heure à laquel le réveil doit sonner
	
	private int nbOfAlarmChoised = 0; //string dans lequel est stockée l'heure à laquel le réveil doit sonner
	String[] coffees = {"Expresso", "Cappuccino", "Deca", "Café au lait"};//tableau représentant le choix de café possibles
	
	//constructeur
	CCoffeeAlarmClock(String end, int nbOfAlarmChoised) {
		super();
		this.end = end;
		this.nbOfAlarmChoised = nbOfAlarmChoised;
		
		
	}
		
	//verifie si on doit faire sonner le reveil
	@Override
	   public void checkAlarm(){
	       if(super.toString().equals(end)){
	        //activation de la radio
	        new CCoffeeTrigger(end, coffees[this.nbOfAlarmChoised]);
	        //arrêt du compteur
	        super.stopWatch();
	       }
	   }
	
	public int getCoffeeLength() {
		return coffees.length;
	}
	
	public String[] getCoffees() {
		return coffees;
	}
	
	public void setNbOfCoffeeChoised(int nb) {
		this.nbOfAlarmChoised = nb;
	}
}
