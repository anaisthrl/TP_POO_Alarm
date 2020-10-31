public class CAlarmClock extends CWatch{

    //constructeur
    
    public CAlarmClock() {
        super();
    }

    //methodes
    
    //verifie si on doit faire sonner le reveil
    public void checkAlarm() {}

    //incrementer le reveil (via montre - chaine de compteur)
    public void increment() {
        super.increment();
        checkAlarm();
    }
}
