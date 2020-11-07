public class CAlarmTrigger extends CAlarm implements ITrigger<CAlarmTrigger>{
	
	//classe utilisant l'héritage mutiple, elle récupère l'interface ITRigger qui permet de déclencher une action et CAlarm
	
	/*..........ATTRIBUTS..........*/
	
	//constructeur
	CAlarmTrigger(String end, String sound){
		super(sound);
	}
	
	/*.........METHODES..........*/
	//lance l'alarme dans la console à l'aide de l'interface
	public CAlarmTrigger trigger() {
        return this;
	}
	
	//active l'alarme 
	public void activeAlarm()
	{
		this.trigger();
	}
}
