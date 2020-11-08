import java.util.ArrayList;

public class CCoffeeAlarmClock extends CAlarmClock{

	//Classe repr�sentant l'objet machine � caf�
	
	/*............ATTRIBUTS..............*/
	//string dans lequel est stock�e l'heure � laquel le r�veil doit sonner
	private String end;//string dans lequel est stock�e l'heure � laquel le r�veil doit sonner
	
	private int nbOfAlarmChoised = 0; //string dans lequel est stock�e l'heure � laquel le r�veil doit sonner
	String[] coffees = {"Expresso", "Cappuccino", "Deca", "Caf� au lait"};//tableau repr�sentant le choix de caf� possibles
	
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
	        //arr�t du compteur
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
