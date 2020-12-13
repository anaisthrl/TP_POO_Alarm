public class CCoffeeTrigger extends CCoffee implements ITrigger<CCoffeeTrigger>{
	
	//classe utilisant l'h�ritage mutiple, elle r�cup�re l'interface ITRigger qui permet de d�clencher une action et CAlarm
	
		//constructeur
		CCoffeeTrigger(String end, String typeCoffee){
			super(typeCoffee);
		}
		
		/*.........METHODES..........*/
		//lance l'alarme dans la console � l'aide de l'interface
		public CCoffeeTrigger trigger() {
	        return this;
		}
		
		//active l'alarme 
		public void activeAlarm()
		{
			this.trigger();
		}
}
