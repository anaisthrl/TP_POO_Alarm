public class CAlarmClock extends CWatch{

	//Classe m�re de CAlarmAlarmClock, CCoffeeAlarmClock et CRadioAlarmClock
	
    //constructeur
    CAlarmClock() {
        super();
    }

   /*.........METHODES........*/
    
    //verifie si on doit faire sonner le reveil
    //Red�fini dans CAlarmAlarmClock.java
    public void checkAlarm() {}

    //incrementer le reveil (via montre - chaine de compteur)
    public void increment() {
        super.increment();
        checkAlarm();
    }
}
