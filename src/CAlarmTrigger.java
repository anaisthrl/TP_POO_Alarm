public class CAlarmTrigger extends CAlarm implements ITrigger<CAlarmTrigger>{
	
	//classe utilisant l'h�ritage mutiple, elle r�cup�re l'interface ITRigger qui permet de d�clencher une action et CAlarm
	
	/*..........ATTRIBUTS..........*/
	
	//constructeur
	CAlarmTrigger(String end, String sound){
		super(sound); //CAlarm
	}
	
	/*.........METHODES..........*/
	//lance l'alarme � l'aide de l'interface
	public CAlarmTrigger trigger() {
        return this;
	}
	
	//active l'alarme 
	public void activeAlarm()
	{
		this.trigger();
	}
}
