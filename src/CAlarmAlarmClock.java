public class CAlarmAlarmClock extends CAlarmClock{
	
	//attributs
	private String end;
	
	//constructeur
	public CAlarmAlarmClock(String end) {
		super();
		this.end = end;
	}
	
	 
    //verifie si on doit faire sonner le reveil
	@Override
    public void checkAlarm(){
        if(super.toString().equals(end)){
        	new CAlarmTrigger(end, "DRIIIING"); //activation du réveil 
        	super.stopWatch();
        }
    }
}
