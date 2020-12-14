public class CRadioAlarmClock extends CAlarmClock{

	//Classe repr�sentant l'objet radio
	/*............ATTRIBUTS..............*/
	//string dans lequel est stock�e l'heure � laquel le r�veil doit sonner
	private String end;
	private int typeOfRadioChoised = 0;
	
	String[] radios = {"NRJ", "France Culture", "Radio Scoop", "France inter"};
	
	//constructeur
	CRadioAlarmClock(String end, int typeOfRadioChoised) {
		super();
		this.end = end;
		this.typeOfRadioChoised = typeOfRadioChoised;
	}
	
    //verifie si on doit faire sonner le reveil
	@Override
    public void checkAlarm(){
        if(super.toString().equals(end)){
        	//activation de la radio
        	new CRadioTrigger(end, radios[this.typeOfRadioChoised]);
        	//arr�t du compteur
        	super.stopWatch();
        }
    }
	
	public int getRadiosLength() {
		return radios.length;
	}
	
	public String[] getRadios() {
		return radios;
	}
	
	public void setTypeOfRadioChoised(int nb) {
		this.typeOfRadioChoised = nb;
	}
}
