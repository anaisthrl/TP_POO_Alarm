public class CRingingTrigger extends CRinging implements ITrigger<CRingingTrigger>{
	
	//classe utilisant l'h�ritage mutiple, elle r�cup�re l'interface ITRigger qui permet de d�clencher une action et CAlarm
	
	//constructeur
	CRingingTrigger(String end, String sound){
		super(sound); //CAlarm
	}
	
	/*.........METHODES..........*/
	//lance l'alarme � l'aide de l'interface
	public CRingingTrigger trigger() {
        return this;
	}
	
	//active l'alarme 
	public void activeAlarm()
	{
		this.trigger();
	}
}
