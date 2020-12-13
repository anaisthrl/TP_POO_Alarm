public class CRadioTrigger extends CRadio implements ITrigger<CRadioTrigger>{
	
	//classe utilisant l'h�ritage mutiple, elle r�cup�re l'interface ITRigger qui permet de d�clencher une action et CAlarm
	
	//constructeur
	CRadioTrigger(String end, String radiostation){
		super(radiostation);
	}
	
	/*.........METHODES..........*/
	//lance l'alarme dans la console � l'aide de l'interface
	public CRadioTrigger trigger() {
        return this;
	}
	
	//active l'alarme 
	public void activeAlarm()
	{
		this.trigger();
	}
}
