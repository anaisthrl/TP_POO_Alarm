public class CAlarmClock extends CWatch{

	//Classe mère de CAlarmAlarmClock, CCoffeeAlarmClock et CRadioAlarmClock
	
    //constructeur
    CAlarmClock() {
        super();
    }

   /*.........METHODES........*/
    
    //verifie si on doit faire sonner le reveil
    //Redéfinie dans CAlarmAlarmClock.java/ CCoffeeAlarmClock / CRadioAlarmClock
    public void checkAlarm() {}

    //incrementer le reveil (via montre - chaine de compteur)
    public void increment() {
        super.increment();
        checkAlarm();
    }
}
