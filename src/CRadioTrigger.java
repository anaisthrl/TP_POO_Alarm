public class CRadioTrigger extends CRadio implements ITrigger<CRadioTrigger>{
	
	//classe utilisant l'héritage mutiple, elle récupère l'interface ITRigger qui permet de déclencher une action et CAlarm
	/*..........ATTRIBUTS..........*/
	//son de l'alarme
	private String radiostation;
	
	//constructeur
	CRadioTrigger(String end, String radiostation){
		super(radiostation);
		this.radiostation = radiostation;
	}
	
	/*.........METHODES..........*/
	//lance l'alarme dans la console à l'aide de l'interface
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
