public class CRadioTrigger extends CRadio implements ITrigger<CRadioTrigger>{
	
	//classe utilisant l'h�ritage mutiple, elle r�cup�re l'interface ITRigger qui permet de d�clencher une action et CAlarm
	/*..........ATTRIBUTS..........*/
	//son de l'alarme
	private String radiostation;
	
	//constructeur
	CRadioTrigger(String end, String radiostation){
		super(radiostation);
		this.radiostation = radiostation;
	}
	
	/*.........METHODES..........*/
	//lance l'alarme dans la console � l'aide de l'interface
	public CRadioTrigger trigger() {
		System.out.println(this.radiostation);
        return this;
	}
	
	//active l'alarme 
	public void activeAlarm()
	{
		this.trigger();
	}
}
