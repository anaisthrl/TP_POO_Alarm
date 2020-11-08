public class CRadioAlarmClock extends CAlarmClock{

	//Classe représentant l'objet radio
	/*............ATTRIBUTS..............*/
	//string dans lequel est stockée l'heure à laquel le réveil doit sonner
	private String end;
	private int nbOfRadioChoised = 0;
	
	String[] radios = {"NRJ", "France Culture", "Radio Scoop", "France inter"};
	
	//constructeur
	CRadioAlarmClock(String end, int nbOfRadioChoised) {
		super();
		this.end = end;
		this.nbOfRadioChoised = nbOfRadioChoised;	
	}
	
    //verifie si on doit faire sonner le reveil
	@Override
    public void checkAlarm(){
        if(super.toString().equals(end)){
        	//activation de la radio
        	new CRadioTrigger(end, radios[this.nbOfRadioChoised]);
        	//arrêt du compteur
        	super.stopWatch();
        }
    }
	
	public int getRadiosLength() {
		return radios.length;
	}
	
	public String[] getRadios() {
		return radios;
	}
	
	public void setNbOfRadioChoised(int nb) {
		this.nbOfRadioChoised = nb;
	}
}
