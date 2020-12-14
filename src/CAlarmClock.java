public class CAlarmClock extends CWatch{

	//Classe m�re de CAlarmAlarmClock, CCoffeeAlarmClock et CRadioAlarmClock
	
    //constructeur
    CAlarmClock() {
        super();
    }

   /*.........METHODES........*/
    
    //verifie si on doit faire sonner le reveil
    //Red�finie dans CRingingAlarmClock.java/ CCoffeeAlarmClock / CRadioAlarmClock
    public void checkAlarm() {}

    //incrementer le reveil (via montre - chaine de compteur)
    public void increment() {
        super.increment();
        checkAlarm();
    }
}
