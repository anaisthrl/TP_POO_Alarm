public class CCoffeeTrigger extends CCoffee implements ITrigger<CCoffeeTrigger>{
	
	//classe utilisant l'héritage mutiple, elle récupère l'interface ITRigger qui permet de déclencher une action et CAlarm
	
		//constructeur
		CCoffeeTrigger(String end, String typeCoffee){
			super(typeCoffee);
		}
		
		/*.........METHODES..........*/
		//lance l'alarme dans la console à l'aide de l'interface
		public CCoffeeTrigger trigger() {
	        return this;
		}
		
		//active l'alarme 
		public void activeAlarm()
		{
			this.trigger();
		}
}
