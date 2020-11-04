public class CCoffeeTrigger extends CCoffee implements ITrigger<CCoffeeTrigger>{
	
	//classe utilisant l'héritage mutiple, elle récupère l'interface ITRigger qui permet de déclencher une action et CAlarm
		/*..........ATTRIBUTS..........*/
		//son de l'alarme
		private String soundOfMachine;
		
		//constructeur
		CCoffeeTrigger(String end, String soundOfMachine){
			super(soundOfMachine);
			this.soundOfMachine = soundOfMachine;
		}
		
		/*.........METHODES..........*/
		//lance l'alarme dans la console à l'aide de l'interface
		public CCoffeeTrigger trigger() {
			System.out.println(this.soundOfMachine);
	        return this;
		}
		
		//active l'alarme 
		public void activeAlarm()
		{
			this.trigger();
		}
}
