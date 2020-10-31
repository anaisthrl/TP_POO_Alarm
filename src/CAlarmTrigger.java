public class CAlarmTrigger extends CAlarm implements ITrigger<CAlarmTrigger>{
	
	//attributs
	private CAlarmClock alarmClock;
	private String sound;
	
	public CAlarmTrigger(String end, String sound){
		super(sound);
		alarmClock = new CAlarmClock();
		this.sound = sound;
	}
	
	public CAlarmTrigger trigger() {
		System.out.println(this.sound);
        return this;
	}
	
	public void activeAlarm()
	{
		this.trigger();
	}

}
